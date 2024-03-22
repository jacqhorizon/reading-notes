# Wordpress

## Dev Environment

| Dev Environment | Production Environment |
| --------------- | ---------------------- |
| Wordpress lives locally on our computer | Wordpress lives remotely on the server |

WordPress needs an environment with:

* PHP
* Apache (NGINX)
* MySQL (MariaDB)

To get this environment set up we are going to use [Local by Flywheel](https://localwp.com/).

* Follow installation instructions
* Create site

### Files

* `app > public` is where all the WP files are

* `wp-content > themes` is where we are going to create a new theme

* I am assuming these are the folders we would want to sync to Github? Something to look into...

## Intro to Php

Error: “Cannot validate since a PHP installation could not be found. Use the setting ‘php.validate.executablePath’ to configure the PHP executable.”

* [Thread](https://community.localwp.com/t/local-provides-a-version-of-php-correct-please-help-me/38875/4)

* [Thread](https://community.localwp.com/t/sudden-php-configuration-error-on-vs-code/38779/4)

`<?php` starts php mode

`?>` ends php mode

`<?php echo 2 + 2?>` will output 4 because php has a brain!

php is server side code, so public cannot see it

`$myname = 'Brad';` will make a variable

`<h1>My name is <?php echo $myname ?></h1>` will output the variables value

## Creating a New Theme

Disable graphics acceleration on Chrome for Udemy videos

Add a folder in `app/public/wp-content/themes` and add the following files:

* `index.php`
* `style.css`
* `screenshot.png` that is a 1200x900px photo

In `style.css` add a comment with this info. It will show this info on the wp-admin screen.

```css
/*
 Theme Name: Fictional University
 Author: Jacq
 Version: 1.0
*/
```

## Functions

Create functions

```php
<?php 
 function myFirstFunction() { //recipe
    echo 2 + 2;
 }
 myFirstFunction(); //run it
?>
```
Functions with variables

```php
<?php 
 function greet($name, $color) {
    echo "<p>My name is ${name} and I like ${color}</p>";
 }
 greet('Jacq', 'pink');
?>
```

Wordpress has functions that we can leverage like:

```php
<h1><?php bloginfo('name'); ?></h1>
<p><?php bloginfo('description'); ?></p>
```