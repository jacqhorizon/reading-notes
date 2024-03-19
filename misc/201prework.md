# Reading Notes

## 201 Prework

### Linux Tutorial ([Link](https://ryanstutorials.net/linuxtutorial/))

* **\<something\>** indicates replace everything **\<n\>**
* **\[something\]** indicates something you can replace or leave out, it's optional

### The Command Line

* **Command line, or terminal:** text based interface to the system
* **Shell:** within the terminal. Command line interpreter. Part of the operating system that defines how the terminal will behave and looks after running commands for you. 
  * **Bash:** most common shell. Stands for Bourne again shell
  * `echo $SHELL`: will display your default shell
  * `echo`: displays text
  * `$SHELL`: variable that contains path of default shell
    * If you put it in single quotes, you will just get a string
  * `echo $0`: will display current shell
* My default shell is zsh. To open bash type `bash`. To get out of bash type `exit`.

### Basic Navigation

* `pwd`: stands for Print Working Directory.
* `ls`: stands for list.
  * `ls [option] [location]`
  * `-l`: indicates we want a long listing
  * `ls /other-directory`: list some other directory
* Two types of paths
  * File system is hierarchical 
  * **Root:** the very top directory denoted by a single slash (/)
  * **Absolute paths:** specify a location in relation to the root directory. Identified by a forward slash
  *  **Relative paths:** specify location in relation to where we currently. Do not begin with a slash
* More on paths
  * **~ (tilde):** shortcut for home directory
  * **. (dot):** reference to current directory
  * **.. (dotdot):** reference to the parent directory

* Running `cd` without any arguments takes you back home
* Tab completion... is not working?

### More About Files

* `file [path]`: tells you what type of file a path is
* Linux is case sensitive
* To work around spaces in names
  * Quotes: `cd 'Holiday Photos`
  * Escape Characters: `cd Holiday\ Photos`
  * Tab completion automatically escapes spaces
* `ls -a`: Lists all contents of directory, including hidden files


