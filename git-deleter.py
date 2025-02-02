import requests

# Replace with your GitHub username and personal access token
GITHUB_USERNAME = "your username"
GITHUB_TOKEN = "Your access Token"

# List of repositories to *keep* (all others will be deleted)
repos_to_keep = ["old-repos", "myportfolio", ""]  # Add the names of the repos you want to keep

# Fetch all repositories
api_url_all_repos = f"https://api.github.com/users/{GITHUB_USERNAME}/repos"
headers = {"Authorization": f"token {GITHUB_TOKEN}"}
response = requests.get(api_url_all_repos, headers=headers)

if response.status_code == 200:
    all_repos = response.json()

    for repo in all_repos:
        repo_name = repo["name"]

        if repo_name in repos_to_keep:
            print(f"Keeping: {repo_name}")
            continue

        api_url_delete = f"https://api.github.com/repos/{GITHUB_USERNAME}/{repo_name}"

        try:
            delete_response = requests.delete(api_url_delete, headers=headers)

            if delete_response.status_code == 204:  # 204 No Content indicates success
                print(f"✅ Deleted: {repo_name}")
            elif delete_response.status_code == 404:
                print(f"❌ Not found: {repo_name} (Does it exist?)")
            else:
                print(f"❌ Failed to delete: {repo_name} (Status code: {delete_response.status_code})")
                print(delete_response.text)  # Print the error response for debugging

        except requests.exceptions.RequestException as e:
            print(f"❌ An error occurred with {repo_name}: {e}")

    print("Finished deleting repositories.")

else:
    print(f"❌ Failed to fetch repo list: {response.status_code}")
    print(response.text)
