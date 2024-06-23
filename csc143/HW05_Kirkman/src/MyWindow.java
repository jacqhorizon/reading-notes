import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    JPanel cont;
    boolean flag;
    MyPanel panel;
    Color color;
    JSlider slider;
    JButton btnDraw;
    JButton buttonColor;

    TextField p1x;
    TextField p1y;
    TextField p2x;
    TextField p2y;
    TextField p3x;
    TextField p3y;

    public MyWindow() {
        super();
        cont = new JPanel();
        cont.setBounds(5,0,600,200);
        cont.setOpaque(true);
        cont.setLayout(null);
        cont.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setTitle("Fractal");
        this.setSize(1800,1400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(100, 50);
        flag = false;

        color = new Color(150,150,200,200);

        panel = new MyPanel();

        panel.setLayout(null);
        panel.setVisible(true);
        this.add(panel);
        panel.add(cont);

        slider = new JSlider();
        slider.setBounds(250,40,300,50);
        slider.setOrientation(0);
        slider.setMinimum(2);
        slider.setMaximum(6);
        slider.setValue(2);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        cont.add(slider);

        btnDraw = new JButton("Draw");
        btnDraw.setBounds(50,10,100,30);
        btnDraw.addActionListener(e -> {
            flag = true;
            panel.repaint();
        });
        cont.add(btnDraw);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(180,10,100,30);
        btnClear.addActionListener(e -> {
            flag = false;
            panel.repaint();
        });
        cont.add(btnClear);

        buttonColor = new JButton("Choose Color");
        buttonColor.setBounds(310,10,200,30);
        buttonColor.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(panel, "Choose a color", panel.getBackground());
            if (selectedColor != null) {
                color = selectedColor;
            }
        });
        cont.add(buttonColor);

        JLabel xLabel = new JLabel("X");
        xLabel.setBounds(70,40,50,20);
        cont.add(xLabel);

        JLabel yLabel = new JLabel("Y");
        yLabel.setBounds(140,40,50,20);
        cont.add(yLabel);

        p1x = new TextField();
        p1x.setBounds(50,70, 50, 20);
        p1x.setText("450");
        cont.add(p1x);

        p1y = new TextField();
        p1y.setBounds(120,70, 50, 20);
        p1y.setText("200");
        cont.add(p1y);

        p2x = new TextField();
        p2x.setBounds(50,100, 50, 20);
        p2x.setText("50");
        cont.add(p2x);

        p2y = new TextField();
        p2y.setBounds(120,100, 50, 20);
        p2y.setText("750");
        cont.add(p2y);

        p3x = new TextField();
        p3x.setBounds(50,130, 50, 20);
        p3x.setText("850");
        cont.add(p3x);

        p3y = new TextField();
        p3y.setBounds(120,130, 50, 20);
        p3y.setText("750");
        cont.add(p3y);


        this.validate();
        this.setVisible(true);
        this.toFront();
    }

    private void draw(Graphics g, Triangle triangle, int level) {
        level--;
        g.setColor(color);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        if (level == 0) {
            Point v1= triangle.v1;
            Point v2 = triangle.v2;
            Point v3 = triangle.v3;
            g2.drawLine((int) v1.getX(), (int) v1.getY(), (int) v2.getX(),(int) v2.getY());
            g2.drawLine((int) v2.getX(), (int) v2.getY(), (int) v3.getX(), (int) v3.getY());
            g2.drawLine((int) v3.getX(), (int) v3.getY(), (int) v1.getX(), (int) v1.getY());
        } else {
            draw(g, new Triangle(triangle.v1, triangle.m1, triangle.m3), level);
            draw(g, new Triangle(triangle.m1, triangle.v2, triangle.m2), level);
            draw(g, new Triangle(triangle.m3, triangle.m2, triangle.v3), level);
        }
    }


    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(flag) {
                Point v1 = new Point(Integer.parseInt(p1x.getText()), Integer.parseInt(p1y.getText()));
                Point v2 = new Point(Integer.parseInt(p2x.getText()), Integer.parseInt(p2y.getText()));
                Point v3 = new Point(Integer.parseInt(p3x.getText()), Integer.parseInt(p3y.getText()));
                Triangle triangle = new Triangle(v1, v2, v3);
                draw(g, triangle, slider.getValue());
                cont.repaint();
            }
        }
    }
}
