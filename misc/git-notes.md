# Git Notes

## Clone a repo

* Get the clone repo HTTPS
* Paste it in terminal in the right directory
* Put in username
* Put in personal access token

## Switch from HTTPS to SSH

* Check the current remote repo using `git remote -v`
* Change the origin `git remote set-url origin ssh://git@github.com/username/reponame`
* Make sure you change the colon
* [Stack overflow](https://stackoverflow.com/questions/17580261/authentication-failure-on-github-even-after-adding-ssh-key)

* [Generate a personal access token on github](https://docs.catalyst.zoho.com/en/tutorials/githubbot/java/generate-personal-access-token/)
* [Clone a repo](https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository)
* [Check for existing SSH keys](2. https://docs.github.com/en/authentication/connecting-to-github-with-ssh/checking-for-existing-ssh-keys)
* [Generate a new key](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)
* [Add a new SSH key to Github Account](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account)

## Creating a New Repo

* Create a new repo from the website
  * Don't auto generate a readme
* Copy the ssh link and use `git clone` to copy it into a folder on your local
* In terminal, `touch README.md` and `touch .gitignore`
* Generate a git ignore with [gitignore.io](https://www.toptal.com/developers/gitignore?templates=macos)
* Add > Commit > Push
