import javax.swing.*;
import java.awt.*;

public class LoShuGridGenerator {

    JFrame frame;
    JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8,
            textField9, textField10;
    JButton button1, button2;
    ImageIcon image;
    JPanel panel1, panel2, panel3;
    JLabel label1, label2, label3, label4, label5, label6;
    JComboBox comboBox1, comboBox2, comboBox3;

    Font font = new Font("Lato", Font.PLAIN, 20);
    static int gd[][] = new int[3][3], d, m, y;
    Integer[] date = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
            27, 28, 29, 30, 31 },
            month = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
            year = { 1950, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1961, 1962, 1963, 1964, 1965,
                    1966, 1967, 1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980, 1981,
                    1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997,
                    1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013,
                    2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023 };

    public static void calculate(int n) {
        if (n == 1)
            gd[2][1] = (gd[2][1] * 10) + n;
        else if (n == 2)
            gd[0][2] = (gd[0][2] * 10) + n;
        else if (n == 3)
            gd[1][0] = (gd[1][0] * 10) + n;
        else if (n == 4)
            gd[0][0] = (gd[0][0] * 10) + n;
        else if (n == 5)
            gd[1][1] = (gd[1][1] * 10) + n;
        else if (n == 6)
            gd[2][2] = (gd[2][2] * 10) + n;
        else if (n == 7)
            gd[1][2] = (gd[1][2] * 10) + n;
        else if (n == 8)
            gd[2][0] = (gd[2][0] * 10) + n;
        else
            gd[0][1] = (gd[0][1] * 10) + n;
    }

    LoShuGridGenerator() {
        frame = new JFrame("Lo Shu Grid Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null);

        image = new ImageIcon("D:/Projects/Lo_shu_grid.png");
        frame.setIconImage(image.getImage());

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel1.setBackground(Color.orange);
        panel2.setBackground(Color.orange);
        panel3.setBackground(Color.yellow);
        panel1.setPreferredSize(new Dimension(400, 100));
        panel2.setPreferredSize(new Dimension(400, 250));
        panel3.setPreferredSize(new Dimension(400, 120));

        label1 = new JLabel();
        label1 = new JLabel("Enter your name:");
        label1.setFont(new Font("Lato", Font.PLAIN, 25));
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setHorizontalAlignment(JLabel.LEFT);

        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(250, 40));
        textField1.setHorizontalAlignment(JLabel.CENTER);
        textField1.setFont(font);

        label2 = new JLabel();
        label2 = new JLabel("Enter your Date of Birth:                   ");
        label2.setFont(new Font("Lato", Font.PLAIN, 25));
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.LEFT);

        label3 = new JLabel();
        label3 = new JLabel("Date:");
        label3.setFont(new Font("Lato", Font.PLAIN, 25));
        label3.setVerticalAlignment(JLabel.TOP);
        label3.setHorizontalAlignment(JLabel.LEFT);

        label4 = new JLabel();
        label4 = new JLabel("Month:");
        label4.setFont(new Font("Lato", Font.PLAIN, 25));
        label4.setVerticalAlignment(JLabel.TOP);
        label4.setHorizontalAlignment(JLabel.LEFT);

        label5 = new JLabel();
        label5 = new JLabel("Year:");
        label5.setFont(new Font("Lato", Font.PLAIN, 25));
        label5.setVerticalAlignment(JLabel.TOP);
        label5.setHorizontalAlignment(JLabel.LEFT);

        comboBox1 = new JComboBox(date);
        comboBox2 = new JComboBox(month);
        comboBox3 = new JComboBox(year);

        button1 = new JButton("Calculate");
        button1.setFont(new Font("Lato", Font.PLAIN, 20));
        button1.setFocusable(false);

        label6 = new JLabel("           Your Lo Shu Grid is:            ");
        label6.setFont(new Font("Lato", Font.PLAIN, 25));
        label6.setVerticalAlignment(JLabel.TOP);
        label6.setHorizontalAlignment(JLabel.LEFT);

        button2 = new JButton("Reset");
        button2.setFont(new Font("Lato", Font.PLAIN, 20));
        button2.setFocusable(false);
        button2.setVisible(false);

        textField2 = new JTextField();
        textField2.setPreferredSize(new Dimension(120, 40));
        textField2.setHorizontalAlignment(JLabel.CENTER);
        textField2.setFont(font);

        textField3 = new JTextField();
        textField3.setPreferredSize(new Dimension(120, 40));
        textField3.setHorizontalAlignment(JLabel.CENTER);
        textField3.setFont(font);

        textField4 = new JTextField();
        textField4.setPreferredSize(new Dimension(120, 40));
        textField4.setHorizontalAlignment(JLabel.CENTER);
        textField4.setFont(font);

        textField5 = new JTextField();
        textField5.setPreferredSize(new Dimension(120, 40));
        textField5.setHorizontalAlignment(JLabel.CENTER);
        textField5.setFont(font);

        textField6 = new JTextField();
        textField6.setPreferredSize(new Dimension(120, 40));
        textField6.setHorizontalAlignment(JLabel.CENTER);
        textField6.setFont(font);

        textField7 = new JTextField();
        textField7.setPreferredSize(new Dimension(120, 40));
        textField7.setHorizontalAlignment(JLabel.CENTER);
        textField7.setFont(font);

        textField8 = new JTextField();
        textField8.setPreferredSize(new Dimension(120, 40));
        textField8.setHorizontalAlignment(JLabel.CENTER);
        textField8.setFont(font);

        textField9 = new JTextField();
        textField9.setPreferredSize(new Dimension(120, 40));
        textField9.setHorizontalAlignment(JLabel.CENTER);
        textField9.setFont(font);

        textField10 = new JTextField();
        textField10.setPreferredSize(new Dimension(120, 40));
        textField10.setHorizontalAlignment(JLabel.CENTER);
        textField10.setFont(font);

        label6.setVisible(false);
        textField2.setVisible(false);
        textField3.setVisible(false);
        textField4.setVisible(false);
        textField5.setVisible(false);
        textField6.setVisible(false);
        textField7.setVisible(false);
        textField8.setVisible(false);
        textField9.setVisible(false);
        textField10.setVisible(false);

        textField2.setEditable(false);
        textField3.setEditable(false);
        textField4.setEditable(false);
        textField5.setEditable(false);
        textField6.setEditable(false);
        textField7.setEditable(false);
        textField8.setEditable(false);
        textField9.setEditable(false);
        textField10.setEditable(false);

        panel1.add(label1);
        panel1.add(textField1);
        panel3.add(label2);
        panel3.add(label3);
        panel3.add(comboBox1);
        panel3.add(label4);
        panel3.add(comboBox2);
        panel3.add(label5);
        panel3.add(comboBox3);
        panel3.add(button1);
        panel2.add(label6);
        panel2.add(textField2);
        panel2.add(textField3);
        panel2.add(textField4);
        panel2.add(textField5);
        panel2.add(textField6);
        panel2.add(textField7);
        panel2.add(textField8);
        panel2.add(textField9);
        panel2.add(textField10);
        panel2.add(button2);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel3, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

        comboBox1.addActionListener(e -> {
            String text = comboBox1.getSelectedItem().toString();
            d = Integer.parseInt(text);
        });
        comboBox2.addActionListener(e -> {
            String text = comboBox2.getSelectedItem().toString();
            m = Integer.parseInt(text);
        });
        comboBox3.addActionListener(e -> {
            String text = comboBox3.getSelectedItem().toString();
            y = Integer.parseInt(text);
        });

        button1.addActionListener(e -> {

            String name = textField1.getText();
            if (name.length() == 0)
                JOptionPane.showMessageDialog(null, "Enter Name", "Error", JOptionPane.ERROR_MESSAGE);
            else if (d == 0 && m == 0 && y == 0)
                JOptionPane.showMessageDialog(null, "Enter Date, Month and Year", "Error", JOptionPane.ERROR_MESSAGE);
            else if (d == 0 && m == 0)
                JOptionPane.showMessageDialog(null, "Enter Date and Month", "Error", JOptionPane.ERROR_MESSAGE);
            else if (d == 0 && y == 0)
                JOptionPane.showMessageDialog(null, "Enter Date and Year", "Error", JOptionPane.ERROR_MESSAGE);
            else if (m == 0 && y == 0)
                JOptionPane.showMessageDialog(null, "Enter Month and Year", "Error", JOptionPane.ERROR_MESSAGE);
            else if (d == 0)
                JOptionPane.showMessageDialog(null, "Enter Date", "Error", JOptionPane.ERROR_MESSAGE);
            else if (m == 0)
                JOptionPane.showMessageDialog(null, "Enter Month", "Error", JOptionPane.ERROR_MESSAGE);
            else if (y == 0)
                JOptionPane.showMessageDialog(null, "Enter Year", "Error", JOptionPane.ERROR_MESSAGE);
            else {
                int D = d, M = m, Y = y, dd = 0, mm = 0, yy = 0, dmy, ddmmyy = 0, NN = 0, nn = 0;
                String S = Integer.toString(d) + m + y;

                name = name.replaceAll("\\s", "");

                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i) == 'A' || name.charAt(i) == 'a' || name.charAt(i) == 'I' || name.charAt(i) == 'i'
                            || name.charAt(i) == 'J' || name.charAt(i) == 'j' || name.charAt(i) == 'Q'
                            || name.charAt(i) == 'q' || name.charAt(i) == 'Y' || name.charAt(i) == 'y')
                        NN += 1;
                    else if (name.charAt(i) == 'B' || name.charAt(i) == 'b' || name.charAt(i) == 'K'
                            || name.charAt(i) == 'k' || name.charAt(i) == 'R' || name.charAt(i) == 'r')
                        NN += 2;
                    else if (name.charAt(i) == 'C' || name.charAt(i) == 'c' || name.charAt(i) == 'G'
                            || name.charAt(i) == 'g' || name.charAt(i) == 'L' || name.charAt(i) == 'l'
                            || name.charAt(i) == 'S' || name.charAt(i) == 's')
                        NN += 3;
                    else if (name.charAt(i) == 'D' || name.charAt(i) == 'd' || name.charAt(i) == 'M'
                            || name.charAt(i) == 'm' || name.charAt(i) == 'T' || name.charAt(i) == 't')
                        NN += 4;
                    else if (name.charAt(i) == 'E' || name.charAt(i) == 'e' || name.charAt(i) == 'H'
                            || name.charAt(i) == 'h' || name.charAt(i) == 'N' || name.charAt(i) == 'n'
                            || name.charAt(i) == 'X' || name.charAt(i) == 'x')
                        NN += 5;
                    else if (name.charAt(i) == 'U' || name.charAt(i) == 'u' || name.charAt(i) == 'V'
                            || name.charAt(i) == 'v' || name.charAt(i) == 'W' || name.charAt(i) == 'w')
                        NN += 6;
                    else if (name.charAt(i) == 'O' || name.charAt(i) == 'o' || name.charAt(i) == 'Z'
                            || name.charAt(i) == 'z')
                        NN += 7;
                    else
                        NN += 8;
                }

                while (D > 0 || M > 0 || Y > 0 || NN > 0) {
                    if (D > 0) {
                        while (D > 0) {
                            dd += (D % 10);
                            D /= 10;
                        }
                        if (dd > 9) {
                            D = dd;
                            dd = 0;
                        }
                    }
                    if (M > 0) {
                        while (M > 0) {
                            mm += (M % 10);
                            M /= 10;
                        }
                        if (mm > 9) {
                            M = mm;
                            mm = 0;
                        }
                    }
                    if (Y > 0) {
                        while (Y > 0) {
                            yy += (Y % 10);
                            Y /= 10;
                        }
                        if (yy > 9) {
                            Y = yy;
                            yy = 0;
                        }
                    }
                    if (NN > 0) {
                        while (NN > 0) {
                            nn += (NN % 10);
                            NN /= 10;
                        }
                        if (nn > 9) {
                            NN = nn;
                            nn = 0;
                        }
                    }
                }

                dmy = dd + mm + yy;
                while (dmy > 0) {
                    while (dmy > 0) {
                        ddmmyy += (dmy % 10);
                        dmy /= 10;
                    }
                    if (ddmmyy > 9) {
                        dmy = ddmmyy;
                        ddmmyy = 0;
                    }
                }

                for (int i = 0; i < S.length(); i++)
                    if (Character.getNumericValue(S.charAt(i)) != 0)
                        calculate(Character.getNumericValue(S.charAt(i)));

                if (d > 10 && d != 20 && d != 30)
                    calculate(dd);

                calculate(ddmmyy);
                calculate(nn);

                label6.setVisible(true);
                textField2.setVisible(true);
                textField3.setVisible(true);
                textField4.setVisible(true);
                textField5.setVisible(true);
                textField6.setVisible(true);
                textField7.setVisible(true);
                textField8.setVisible(true);
                textField9.setVisible(true);
                textField10.setVisible(true);
                button2.setVisible(true);

                textField2.setText(Integer.toString(gd[0][0]));
                textField3.setText(Integer.toString(gd[0][1]));
                textField4.setText(Integer.toString(gd[0][2]));
                textField5.setText(Integer.toString(gd[1][0]));
                textField6.setText(Integer.toString(gd[1][1]));
                textField7.setText(Integer.toString(gd[1][2]));
                textField8.setText(Integer.toString(gd[2][0]));
                textField9.setText(Integer.toString(gd[2][1]));
                textField10.setText(Integer.toString(gd[2][2]));
            }
        });
        button2.addActionListener(e -> {
            label6.setVisible(false);
            textField2.setVisible(false);
            textField3.setVisible(false);
            textField4.setVisible(false);
            textField5.setVisible(false);
            textField6.setVisible(false);
            textField7.setVisible(false);
            textField8.setVisible(false);
            textField9.setVisible(false);
            textField10.setVisible(false);
            button2.setVisible(false);
            textField1.setText("");
            textField1.requestFocus();
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    gd[i][j] = 0;
        });
    }

    public static void main(String[] args) {
        LoShuGridGenerator loshu = new LoShuGridGenerator();
    }
}