import express from "express";
import axios from "axios";

const app = express();
const port = 3000;
const API_URL = "https://v2.jokeapi.dev/joke/Programming?type=twopart&idRange=1369-1370"
app.use(express.static("public"));

app.get("/", async (req, res) => {
    try {
        const result = await axios.get(API_URL)
        if (result.data.error) {
            res.render("index.ejs", {
                response: result.data.message,
                cause: result.data.causedBy,
                moreInfo: result.data.additionalInfo,
            })
        } else {
            res.render("index.ejs", {
                joke: result.data.setup,
                delivery: result.data.delivery,
            })
        }
        // console.log(result.data)

    } catch (error) {
        // console.log(error)
        console.log(error)
        res.status(500)
    }

})

app.listen(port, () => {
    console.log(`Server is running on port ${port}`)
})