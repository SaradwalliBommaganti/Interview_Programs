🔹 What is git clone?
git clone is a command used to make a copy of a Git repository from a remote source (like GitHub) to your local computer.

🧩 Think of it like this:
Imagine a project (code, files, etc.) is stored on GitHub — when you run git clone, you're downloading that entire project (along with its Git history) to your own machine so you can work on it.

🛠️ Basic Syntax:
git clone <repository-url>

📌 Example:
git clone https://github.com/username/project.

---

🌿 What is a Git Branch?
A Git branch is like a separate line of development in your project.
It lets you work on features, fixes, or experiments without affecting the main code.

📦 Why use branches?
To work on new features without breaking the main code.
To fix bugs separately.
To experiment safely.

🛠️ Common Git Branch Commands:
👉 Check current branch:
git branch

👉 Create a new branch:
git branch my-feature

👉 Switch to a branch:
git checkout my-feature

👉 Create and switch in one command:
git checkout -b my-feature

👉 Merge a branch into main:
First, switch to main:
git checkout main

Then merge:
git merge my-feature

Delete a branch (after merge):
git branch -d my-feature
