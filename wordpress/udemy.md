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

## Posts & Pages

Update the index file to load up the posts

This is the famous "Loop"

```php
<?php 

while (have_posts()) {
   the_post(); ?>
   <h2><a href="<?php the_permalink(); ?>">
         <?php the_title(); ?>
      </a>
   </h2>
   <?php the_content(); ?>
   <hr>
   <?php
}

?>
```

Create new file for viewing single posts `single.php`

```php
<?php get_header();

while (have_posts()) { //"The Loop"
    the_post(); ?>
    <h2>
        <?php the_title(); ?>
    </h2>
    <?php the_content(); ?>
    <hr>
    <?php
}
get_footer();
?>
```

We will use this same code for our page template `page.php`

## Header & Footer

Add the `get_header();` and `get_footer()` to the index, page, and single files

Make some new files

`header.php`

```html
<!DOCTYPE html>
   <html>
      <head>
         <?php wp_head(); ?> <!--This lets WP manage the head-->
      </head>
   <body>
      <h1>Fictional University</h1>
   <!--Move these closing tags to the footer
      </body>
</html>
-->
```

* `wp_head()` lets WP handle the header - like loading CSS

`footer.php`

```html
<?php wp_footer(); ?> 
</body>
</html>
```

* `wp_footer()` lets WP handle the footer - loading JS files, etc

### Functions File

* `functions.php` is a functions file instead of "template" file (like all the previous)
* We are going to make a function and add it to our WP header

```php
<?php

//function name can be anything
function university_files() { 
   //Point WP function towards the css we want to load into the head
   wp_enqueue_style('university_main_styles', get_stylesheet_uri());
}

//first arg - moment to call the action
//second arg - function to call on moment
add_action('wp_enqueue_scripts', 'university_files');

?>
```

[Wordpress add_action Docs](https://developer.wordpress.org/reference/functions/add_action/)

## Convert Static HTML to WP

* Use [this repo](https://github.com/LearnWebCode/university-static)
* Copy and paste header and footer HTML
* Move build, css, images, and src folder into your theme folder

### Tell WP to use those folders

* We don't need to actually put any css in style.css besides the commented info

Update the functions file

```php
//Load custom fonts
wp_enqueue_style(
   'custom-google-fonts',
   '//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i|Roboto:100,300,400,400i,700,700i'
);
//Load font-awesome
wp_enqueue_style('font-awesome', '//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css');
//Load two different CSS
wp_enqueue_style('university_main_styles', get_theme_file_uri('/build/style-index.css'));
wp_enqueue_style('university_extra_styles', get_theme_file_uri('/build/index.css'));
```

### Customizing the index.php

* Copy and paste the content from the Github repo
* To fix the images we need to update the paths

Our image is at:

`wp-content/themes/fictional-university-theme/images/library-hero.jpg`

But this is really long, so instead we can use:

`<?php echo get_theme_file_uri('/images/library-hero.jpg') ?>`

* Update all the images
* Upload some js to get the slideshow working

Update functions.php

```php
wp_enqueue_script('main-university-js', get_theme_file_uri('/build/index.js'), array('jquery'), '1.0', true);
```

* first arg - name for the js
* second arg - where it's located
* third arg - dependencies, `NULL` if none
* fourth arg - version number
* fifth arg - put in footer? t or f

## Interior Page Template

* Do all the copy and pasting stuff again

Tell WP to automatically generate title tag

```php
function university_features() {
    add_theme_support('title-tag');
}

add_action('after_setup_theme', 'university_features');
```

Dynamically Generate Link URL

`<?php echo site_url('/about-us') ?>`

## Parent & Child Pags

* Page > Page Attributes > Parent
* Access the child page like: url/parent/child
* Every post has a unique number, it will be in the URL like: post.php?post=14

Set up a dynamic navigation box

```html
<?php
$theParent = wp_get_post_parent_id(get_the_ID());
if ($theParent) {
   ?>
   <div class="metabox metabox--position-up metabox--with-home-link">
         <p>
            <a class="metabox__blog-home-link" href="<?php echo get_permalink($theParent); ?>">
               <i class="fa fa-home" aria-hidden="true"></i>
               Back to <?php echo get_the_title($theParent) ?>
            </a> 
            <span class="metabox__main">
               <?php the_title() ?>
            </span>
         </p>
   </div>
   <?php
}
?>
```

## To Echo or Not to Echo

Most functions **return** values so they can be flexible

For example:

```php
   function doubleMe($x) {
      return $x * 2;
   }
```

* `echo doubleMe(4);`
* `$magicalNumber = doubleMe(4);`
* `if (doubleMe(4) == 8) {}`

In WP, a function that starts with "get" will not echo for you. If a function starts with "the" it will echo.

## Creating Page Links Menu

Associative Array

```php
$animalSounds = array(
   'cat' = 'meow',
   'dog' = 'bark'
);

echo $animalSounds['dog']; //Outputs 'bark'
```

Put this where you want the menu:

```php
<?php wp_nav_menu(
         array(
               'theme_location' => 'footerLocationOne'
         )
      ); ?>
```

And make sure you register a nav menu in the functions file:

```php
register_nav_menu('footerLocationOne', 'Footer Location One');
```

## Quick Improvments

In the header:

Dynamically show language settings

```html
<html <?php language_attributes() ?>>
   <head>
```

Dynamically show charset

```html
   <meta charset="<?php bloginfo('charset'); ?>">
```

Tells device to use it's native size. This connects with existing CSS

```html
   <meta name="viewport" content="width=device-width, initial-scale=1">`
   <?php wp_head(); ?>
</head>
```

Dynamically creates class names for the body based on what page you are on

```html
<body <?php body_class();?>>
```

## Creating the Blog

* In wp-admin, click Settings and select which page should be home and which should be blog
* `index.php` is going to be the blog page
* `front-page.php` is going to be the home page
