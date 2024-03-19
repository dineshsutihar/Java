package JavaLearning.Ravi;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.event.ActionListener;

class TRAIN {
    @SuppressWarnings("unused")
    public static void main(String args[]) {
        JFrame f = new JFrame("railway");
        // f.getContentPane().setBackground(Color.PINK);
        JLabel l = new JLabel("INDIAN RAILWAY");
        l.setBounds(200, 10, 700, 200);
        l.setForeground(Color.blue);
        l.setFont(new Font("impact", Font.BOLD, 80));
        f.add(l);

        JLabel l1 = new JLabel("LOGIN");
        l1.setBounds(350, 220, 250, 80);
        l1.setBackground(Color.black);
        l1.setForeground(Color.red);
        l1.setFont(new Font("algerian", Font.BOLD, 40));
        f.add(l1);

        JLabel l2 = new JLabel("USER NAME");
        l2.setBounds(180, 300, 250, 70);
        l2.setForeground(Color.black);
        l2.setBackground(Color.black);
        l2.setFont(new Font("impact", Font.BOLD, 40));
        f.add(l2);

        TextField t2 = new TextField();
        t2.setBounds(440, 300, 300, 60);
        t2.setBackground(Color.white);
        t2.setFont(new Font("serif", Font.BOLD, 28));
        t2.getText();
        f.add(t2);

        JLabel l3 = new JLabel("PASSWORD");
        l3.setBounds(180, 380, 300, 70);
        l3.setForeground(Color.black);
        l3.setFont(new Font("impact", Font.BOLD, 40));
        f.add(l3);

        JPasswordField p1 = new JPasswordField(10);
        p1.setBounds(440, 380, 300, 60);
        p1.setBackground(Color.white);
        p1.setFont(new Font("serif", Font.BOLD, 28));
        f.add(p1);
        /*
         * TextField t3=new TextField();
         * t3.setBounds(440,380,300,60);
         * t3.setBackground(Color.gray);
         * t3.setFont(new Font ("serif",Font.BOLD,28));
         * t3.getText();
         * f.add(t3);
         */

        JButton b = new JButton("OK");
        // b.setBackground(Color.red);
        b.setFont(new Font("impact", Font.BOLD, 30));
        b.setBounds(250, 480, 90, 70);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @SuppressWarnings("unused")
            public void actionPerformed(ActionEvent e) {
                JFrame fb = new JFrame("menu");
                fb.setSize(600, 600);
                fb.setVisible(true);
                fb.setLayout(null);

                // fb.getContentPane().setBackground(Color.PINK);
                /*
                 * JLabel l=new JLabel("INDIAN RAILWAY");
                 * l.setBounds(400,35,500,300);
                 * l.setForeground(Color.red);
                 * l.setFont(new Font ("algerian",Font.BOLD,50));
                 * fb.add(l);
                 */
                JMenuBar m = new JMenuBar();
                fb.setJMenuBar(m);
                m.setBackground(Color.blue);
                JMenu m1 = new JMenu("BOOK TICKET");
                m.add(m1);
                m1.setForeground(Color.yellow);
                m1.setFont(new Font("impact", Font.PLAIN, 30));

                JMenuItem t = new JMenuItem("TRAIN SEARCH");
                m1.add(t);
                t.setForeground(Color.green);
                t.setFont(new Font("impact", Font.BOLD, 25));

                t.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame f = new JFrame("search train");
                        JLabel l0 = new JLabel("Please! Fill the following details...");
                        l0.setBounds(150, 20, 500, 50);
                        l0.setFont(new Font("impact", Font.BOLD, 30));
                        l0.setForeground(Color.red);
                        f.add(l0);

                        f.setSize(800, 800);
                        f.setVisible(true);
                        f.setLayout(null);
                    }
                });

                
                /* JMenu i=new JMenu("QUOTA");
                 * t.add(i);
                 * i.setForeground(Color.green);
                 * i.setFont(new Font ("impact",Font.BOLD,25));
                 * 
                 * JMenuItem iz=new JMenuItem("SLEEPER");
                 * i.add(iz);
                 * iz.setForeground(Color.green);
                 * iz.setFont(new Font ("impact",Font.PLAIN,25));
                 */
                  /* i.addActionListener(new ActionListener(){
                 * public void actionPerformed(ActionEvent e){
                 * JFrame f1=new JFrame("");
                 * f1.getContentPane().setBackground(Color.CYAN);
                 * JLabel l1=new JLabel("SLEEPER");
                 * l1.setBounds(100,120,130,30);
                 * l1.setForeground(Color.red);
                 * l1.setFont(new Font ("impact",Font.BOLD,25));
                 * JLabel l2=new JLabel("2S");
                 * l2.setBounds(100,160,130,30);
                 * l2.setForeground(Color.red);
                 * l2.setFont(new Font ("impact",Font.BOLD,25));
                 * JLabel l3=new JLabel("FIRST CLASS");
                 * l3.setBounds(100,200,130,30);
                 * l3.setForeground(Color.red);
                 * l3.setFont(new Font ("algerian",Font.BOLD,25));
                 * f1.add(l1);
                 * f1.add(l2);
                 * f1.add(l3);
                 * JTextField t1=new JTextField();
                 * t1.setBounds(250,120,150,30);
                 * JTextField t2=new JTextField();
                 * t2.setBounds(250,160,150,30);
                 * JTextField t3=new JTextField();
                 * t3.setBounds(250,200,150,30);
                 * f1.add(t1);
                 * f1.add(t2);
                 * f1.add(t3);
                 * JButton b = new JButton("OK");
                 * b.setBounds(200,260,70,30);
                 * b.setBackground(Color.green);
                 * f1.add(b);
                 * 
                 * f1.setSize(600,600);
                 * f1.setLayout(null);
                 * }});
                 * f1.setVisible(true);
                
                /*
                 * JMenuItem iz1=new JMenuItem("2 S");
                 * i.add(iz1);
                 * iz1.setForeground(Color.green);
                 * iz1.setFont(new Font ("serif",Font.BOLD,25));
                 * 
                 * JMenuItem iz2=new JMenuItem("CC");
                 * i.add(iz2);
                 * iz2.setForeground(Color.green);
                 * iz2.setFont(new Font ("serif",Font.BOLD,25));
                 * 
                 * JMenuItem i4=new JMenuItem("1 A");
                 * i.add(i4);
                 * i4.setForeground(Color.green);
                 * i4.setFont(new Font ("serif",Font.BOLD,25));
                 * 
                 * JMenuItem i5=new JMenuItem("2 A");
                 * i.add(i5);
                 * i5.setForeground(Color.green);
                 * i5.setFont(new Font ("serif",Font.BOLD,25));
                 * 
                 * JMenuItem i6=new JMenuItem("3 A");
                 * i.add(i6);
                 * i6.setForeground(Color.green);
                 * i6.setFont(new Font ("serif",Font.BOLD,25));
                 */

                JMenu m2 = new JMenu("   PNR ENQUIRY");
                m.add(m2);
                m2.setForeground(Color.yellow);
                m2.setFont(new Font("impact", Font.PLAIN, 30));

                JMenuItem a = new JMenuItem("Confirm");
                m2.add(a);
                a.setForeground(Color.green);
                a.setFont(new Font("serif", Font.BOLD, 25));

                JMenuItem a1 = new JMenuItem("Booking");
                m2.add(a1);
                a1.setForeground(Color.green);
                a1.setFont(new Font("serif", Font.BOLD, 25));

                JMenuItem a2 = new JMenuItem("Reference");
                m2.add(a2);
                a2.setForeground(Color.green);
                a2.setFont(new Font("serif", Font.BOLD, 25));

                JMenu m3 = new JMenu("   CANCEL TICKET");
                m.add(m3);
                m3.setForeground(Color.yellow);
                m3.setFont(new Font("impact", Font.PLAIN, 30));

                m3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame f = new JFrame("cancel Ticket");
                        f.setSize(600, 600);
                        f.setVisible(true);
                        f.setLayout(null);
                    }
                });

                JMenu m4 = new JMenu("         HELPLINE");
                m.add(m4);
                m4.setForeground(Color.yellow);
                m4.setFont(new Font("impact", Font.PLAIN, 30));

                JMenuItem c1 = new JMenuItem("e-mail");
                m4.add(c1);
                c1.setForeground(Color.green);
                c1.setFont(new Font("serif", Font.BOLD, 25));

                c1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame f = new JFrame("e mail");
                        JLabel l = new JLabel("irtc.@gmail.com");
                        l.setBounds(50, 10, 250, 50);
                        f.add(l);

                        JLabel l1 = new JLabel("indianrailway.@gmail.com");
                        l1.setBounds(50, 70, 250, 50);
                        f.add(l1);

                        JLabel l2 = new JLabel("bhartiyarailway@gmail.com");
                        l2.setBounds(50, 130, 250, 50);
                        f.add(l2);

                        f.setSize(500, 400);
                        f.setVisible(true);
                        f.setLayout(null);

                    }
                });

                JMenuItem c2 = new JMenuItem("CONTACT");
                m4.add(c2);
                c2.setForeground(Color.green);
                c2.setFont(new Font("serif", Font.BOLD, 25));

                c2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame f = new JFrame("e mail");
                        JLabel l = new JLabel("+91 999 8888 999");
                        l.setBounds(50, 10, 250, 50);
                        f.add(l);

                        JLabel l1 = new JLabel("+91 999 8888 777");
                        l1.setBounds(50, 70, 250, 50);
                        f.add(l1);

                        JLabel l2 = new JLabel("+91 999 7777 666");
                        l2.setBounds(50, 130, 250, 50);
                        f.add(l2);

                        f.setSize(500, 400);
                        f.setVisible(true);
                        f.setLayout(null);

                    }
                });

                JMenuItem c3 = new JMenuItem("Ph_Number");
                m4.add(c3);
                c3.setForeground(Color.green);
                c3.setFont(new Font("serif", Font.BOLD, 25));

                c3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame f = new JFrame("ph n");
                        JLabel l = new JLabel("+ 1111 2222 3333");
                        l.setBounds(50, 10, 250, 50);
                        f.add(l);

                        JLabel l1 = new JLabel("+ 4444 5555 6666");
                        l1.setBounds(50, 70, 250, 50);
                        f.add(l1);

                        JLabel l2 = new JLabel("+ 7777 8888 9999");
                        l2.setBounds(50, 130, 250, 50);
                        f.add(l2);

                        f.setSize(500, 400);
                        f.setVisible(true);
                        f.setLayout(null);

                    }
                });

                Container c = f.getContentPane();

                JLabel label = new JLabel();
                label.setIcon(new ImageIcon("D:\\Images\\axd.jpg"));
                Dimension size = label.getPreferredSize();
                // label.setBounds(1,1,size.width,size.height);
                label.setBounds(10, 0, 1600, 1100);
                fb.add(label);

            }
        });

        JButton b1 = new JButton("CREATE ACCOUNT");
        // b1.setBackground(Color.red);
        b1.setFont(new Font("impact", Font.BOLD, 30));
        b1.setBounds(450, 480, 290, 70);
        f.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //if(b.isSelected())
                JFrame f3 = new JFrame();
                JLabel l = new JLabel("Please! Fill the following details...");
                l.setBounds(450, 0, 800, 40);
                l.setFont(new Font("impact", Font.BOLD, 50));
                l.setForeground(Color.red);
                f3.add(l);

                JLabel lz = new JLabel("NAME");
                lz.setBounds(430, 90, 100, 50);
                lz.setFont(new Font("impact", Font.BOLD, 30));
                lz.setForeground(Color.black);
                f3.add(lz);

                TextField t2 = new TextField();
                t2.setBounds(590, 90, 390, 50);
                t2.setBackground(Color.pink);
                t2.setFont(new Font("serif", Font.BOLD, 28));
                t2.getText();
                f3.add(t2);

                JLabel lz1 = new JLabel("F_NAME");
                lz1.setBounds(430, 150, 100, 50);
                lz1.setFont(new Font("impact", Font.BOLD, 30));
                lz1.setForeground(Color.black);
                f3.add(lz1);

                TextField t3 = new TextField();
                t3.setBounds(590, 150, 390, 50);
                t3.setBackground(Color.pink);
                t3.setFont(new Font("serif", Font.BOLD, 28));
                t3.getText();
                f3.add(t3);

                JLabel lz2 = new JLabel("ADDRESS");
                lz2.setBounds(430, 210, 150, 50);
                lz2.setFont(new Font("impact", Font.BOLD, 30));
                lz2.setForeground(Color.black);
                f3.add(lz2);

                TextField t4 = new TextField();
                t4.setBounds(590, 210, 390, 50);
                t4.setBackground(Color.pink);
                t4.setFont(new Font("serif", Font.BOLD, 28));
                t4.getText();
                f3.add(t4);

                JLabel lz3 = new JLabel("P.O");
                lz3.setBounds(430, 270, 50, 50);
                lz3.setFont(new Font("impact", Font.BOLD, 30));
                lz3.setForeground(Color.black);
                f3.add(lz3);

                TextField t5 = new TextField();
                t5.setBounds(560, 270, 150, 50);
                t5.setBackground(Color.pink);
                t5.setFont(new Font("serif", Font.BOLD, 28));
                t5.getText();
                f3.add(t5);

                JLabel lz4 = new JLabel("P.S");
                lz4.setBounds(750, 270, 50, 50);
                lz4.setFont(new Font("impact", Font.BOLD, 30));
                lz4.setForeground(Color.black);
                f3.add(lz4);

                TextField t6 = new TextField();
                t6.setBounds(830, 270, 150, 50);
                t6.setBackground(Color.pink);
                t6.setFont(new Font("serif", Font.BOLD, 28));
                t6.getText();
                f3.add(t6);

                JLabel lz5 = new JLabel("DISTRIC");
                lz5.setBounds(430, 330, 120, 50);
                lz5.setFont(new Font("impact", Font.BOLD, 30));
                lz5.setForeground(Color.black);
                f3.add(lz5);

                TextField t7 = new TextField();
                t7.setBounds(560, 330, 150, 50);
                t7.setBackground(Color.pink);
                t7.setFont(new Font("serif", Font.BOLD, 28));
                t7.getText();
                f3.add(t7);

                JLabel lz6 = new JLabel("STATE");
                lz6.setBounds(720, 330, 100, 50);
                lz6.setFont(new Font("impact", Font.BOLD, 30));
                lz6.setForeground(Color.black);
                f3.add(lz6);

                /*
                 * TextField t8=new TextField();
                 * t8.setBounds(830,330,150,50);
                 * t8.setBackground(Color.pink);
                 * t8.setFont(new Font ("serif",Font.BOLD,28));
                 * t8.getText();
                 * f3.add(t8);
                 */

                Choice c = new Choice();
                c.setBounds(830, 340, 200, 150);
                c.setFont(new Font("Arial", Font.BOLD, 20));
                c.add("ASSAM");
                c.add("ARUNACHAL PRADESH");
                c.add("BIHAR");
                c.add("GOA");
                c.add("HIMACHAL PRADESH");
                c.add("JHARKHAND");
                c.add("KERALA");
                c.add("MANIPUR");
                c.add("MEGHALAY");
                c.add("MADHYA PRADESH");
                c.add("ODISHA");
                c.add("PUNJAB");
                c.add("TAMILNADU");
                c.add("TRIPURA");
                c.add("UTTAR PRADESH");
                c.add("UTTRANCHAL");
                c.add("WEST BENGAL");
                f3.add(c);

                JLabel lz7 = new JLabel("D.O.B");
                lz7.setBounds(430, 390, 150, 50);
                lz7.setFont(new Font("impact", Font.BOLD, 30));
                lz7.setForeground(Color.black);
                f3.add(lz7);

                TextField t9 = new TextField();
                t9.setBounds(590, 390, 250, 50);
                t9.setBackground(Color.pink);
                t9.setFont(new Font("serif", Font.BOLD, 28));
                t9.getText();
                f3.add(t9);

                JLabel lz9 = new JLabel("Gender");
                lz9.setFont(new Font("impact", Font.BOLD, 30));
                lz9.setForeground(Color.black);
                lz9.setBounds(430, 450, 150, 50);

                JRadioButton rb1 = new JRadioButton("Male");
                rb1.setFont(new Font("Arial", Font.BOLD, 25));
                JRadioButton rb2 = new JRadioButton("Female");
                rb2.setFont(new Font("Arial", Font.BOLD, 25));
                rb1.setBounds(610, 450, 150, 50);
                rb2.setBounds(770, 450, 150, 50);
                ButtonGroup bg1 = new ButtonGroup();
                bg1.add(rb1);
                bg1.add(rb2);
                f3.add(lz9);
                f3.add(rb1);
                f3.add(rb2);

                JLabel lz8 = new JLabel("CONTACT");
                lz8.setBounds(430, 510, 150, 50);
                lz8.setFont(new Font("impact", Font.BOLD, 30));
                lz8.setForeground(Color.black);
                f3.add(lz8);

                TextField t10 = new TextField();
                t10.setBounds(590, 510, 390, 50);
                t10.setBackground(Color.pink);
                t10.setFont(new Font("serif", Font.BOLD, 28));
                t10.getText();
                f3.add(t10);

                JButton bz = new JButton("SUBMIT");
                bz.setBounds(600, 670, 250, 50);
                bz.setFont(new Font("impact", Font.BOLD, 38));
                f3.add(bz);

                bz.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        JFrame fz = new JFrame("CREATE YOUR PASSWORD");
                        fz.setBackground(Color.yellow);

                        JLabel lz = new JLabel("CREATE YOUR PASSWORD");
                        lz.setBounds(450, 10, 500, 100);
                        lz.setFont(new Font("IMPACT", Font.BOLD, 45));
                        lz.setForeground(Color.black);
                        lz.setBackground(Color.yellow);
                        fz.add(lz);

                        JLabel lz7 = new JLabel("PASSWORD");
                        lz7.setBounds(400, 190, 300, 100);
                        lz7.setFont(new Font("impact", Font.BOLD, 50));
                        lz7.setForeground(Color.black);
                        fz.add(lz7);

                        TextField t9 = new TextField();
                        t9.setBounds(720, 220, 300, 50);
                        t9.setBackground(Color.pink);
                        t9.setFont(new Font("serif", Font.BOLD, 28));
                        t9.getText();
                        fz.add(t9);

                        JLabel lz8 = new JLabel("CONFIRM");
                        lz8.setBounds(400, 290, 300, 100);
                        lz8.setFont(new Font("impact", Font.BOLD, 50));
                        lz8.setForeground(Color.black);
                        fz.add(lz8);

                        JPasswordField p = new JPasswordField(10);
                        p.setBounds(720, 310, 300, 50);
                        p.setBackground(Color.pink);
                        fz.add(p);

                        /*
                         * TextField t10=new TextField();
                         * t10.setBounds(720,310,300,50);
                         * t10.setBackground(Color.pink);
                         * t10.setFont(new Font ("serif",Font.BOLD,28));
                         * t10.getText();
                         * fz.add(t10);
                         */

                        JButton bz = new JButton("SUBMIT");
                        bz.setBounds(600, 450, 250, 50);
                        bz.setFont(new Font("impact", Font.BOLD, 38));
                        fz.add(bz);

                        fz.setSize(600, 600);
                        fz.setLayout(null);
                        fz.setVisible(true);

                        bz.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(f, "You Have Completed Your Registration Successfully.");
                                // System.exit(0);
                            }
                        });
                        fz.setSize(600, 600);
                        fz.setLayout(null);
                        fz.setVisible(true);

                    }
                });

                f3.setSize(800, 800);
                f3.setLayout(null);
                f3.setVisible(true);
            }
        });

        JLabel label = new JLabel();
        Container c = f.getContentPane();
        label.setIcon(new ImageIcon("D:\\Images\\a.jpg"));
        Dimension size = label.getPreferredSize();
        label.setBounds(1, 0, 1600, 880);

        f.add(label);
        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);

    }
}