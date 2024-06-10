# Week 8

## Event Driven Programming

* Program responds *when called* rather than directing all the action yourself
* **Java Swing:** lightweight (doesn't rely on OS, writes it in Java) Java GUI (graphical user interface) widget toolkit that includes a rich set of widgets

### JFrame

* **JFrame:** top-level container; manages the application window
* Our GUI class needs to `extends JFrame` and `import javax.swing.JFrame;`
* When you click X on the main GUI and want to close the whole program add `setDefaultCloseOperation(EXIT_ON_CLOSE);`

<img width="306" alt="image" src="https://github.com/jacqhorizon/reading-notes/assets/97759961/cd4e9dd8-8afc-4daf-98de-6b1bd0fee577">

### Toolkit

* Import from [AWT](https://docs.oracle.com/javase/8/docs/api/java/awt/package-summary.html)

```java
import java.awt.Toolkit;
import java.awt.Dimension;

public class SwingDemo extends JFrame {
  private Toolkit toolkit; // Instantiate private variable out here

  public SwingDemo() {
    setSize(300, 200);
    setTitle("My JFrame Demo");
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    toolKit = getToolkit(); //set toolkit variable
    Dimension screenSize = toolkit.getScreenSize(); //save the screen size to dimension variable
    setLocation((screenSize.width - getWidth()) / 2,
              (screenSize.height - getHeight()) / 2); //load GUI in middle of screen
  }
}
```

