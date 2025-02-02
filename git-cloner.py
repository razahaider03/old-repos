import requests
import os
import subprocess

# Replace with your GitHub username and personal access token
GITHUB_USERNAME = "razahaider03"
GITHUB_TOKEN = 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"  # Required for private repos

# GitHub API URL
url = f"https://api.github.com/users/{GITHUB_USERNAME}/repos"
headers = {"Authorization": f"token {GITHUB_TOKEN}"}

# Fetch repositories
response = requests.get(url, headers=headers)
repos = response.json()

# Create a folder to save repositories
output_dir = "github_repos"
os.makedirs(output_dir, exist_ok=True)

for repo in repos:
    repo_name = repo["name"]
    clone_url = repo["clone_url"]

    repo_dir = os.path.join(output_dir, repo_name)
    if os.path.exists(repo_dir):
        print(f"Repo {repo_name} already exists, skipping...")
        continue

    try:
        # Clone the repository with authentication embedded in the URL
        authenticated_clone_url = clone_url.replace("https://", f"https://{GITHUB_USERNAME}:{GITHUB_TOKEN}@")

        subprocess.run(["git", "clone", authenticated_clone_url, repo_dir], check=True)
        print(f"✅ Cloned: {repo_name}")

    except subprocess.CalledProcessError as e:
        print(f"❌ Failed to clone {repo_name}: {e}")
        # Print the error stream for debugging:
        print(e.stderr.decode())  # Decode the error message
    except Exception as e:
        print(f"❌ An error occurred with {repo_name}: {e}")

print("\nFinished processing repositories.")
