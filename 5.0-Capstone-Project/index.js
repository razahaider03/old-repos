import express from "express";
import bodyParser from "body-parser";
import * as fs from "node:fs";
import { dirname } from "path";
import { fileURLToPath } from "url";
import * as util from "util";

const __dirname = dirname(fileURLToPath(import.meta.url));

const app = express();
const port = 3000;
app.use(express.static("public"));
app.use(bodyParser.urlencoded({ extended: true }));

app.get("/", (req, res) => {
  res.render("index.ejs");
});

app.get("/news", (req, res) => {
  res.render("news.ejs");
});

app.get("/contact", (req, res) => {
  res.render("contact.ejs");
});

app.get("/about", (req, res) => {
  res.render("about.ejs");
});

//To Do
app.post("/create", (req, res) => {
  const name = req.body["name"];
  const posts = req.body["post"];
  console.log(`${name} ${posts}`);
  fs.writeFile(`usersPosts/${name}.txt`, posts, (err) => {
    if (err) throw err;
    console.log("The file has been saved!");
  });
  res.render("index.ejs");
});

function postView(name, callback) {
  fs.readFile(`usersPosts/${name}.txt`, "utf8", (err, data) => {
    if (err) throw err;
    const s = data;
    callback(null, s);
  });
}

app.post("/view", (req, res) => {
  const name = req.body["name"];
  postView(name, (err, b) => {
    if (err) {
      res.status(500).send("Error reading file");
      return;
    }
    res.render("post.ejs", { data1: b });
  });
});

app.listen(port, () => {
  console.log(`app is running on ${port}`);
});
