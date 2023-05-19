package calculator;
import java.awt.Toolkit;
import static java.lang.Double.parseDouble;
import javax.swing.ImageIcon;

public class CalculatorFrame extends javax.swing.JFrame {
    private String TextArea =  "";
    private String action;
    private double num1, num2; 
    private ImageIcon icon = new ImageIcon("calculator.png");
    
    public CalculatorFrame() {
        initComponents();
        setResizable(false);
        setTitle("Calculator");
        setCenter();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(icon.getImage());
    }
    
    private void setCenter(){
        Toolkit tool = Toolkit.getDefaultToolkit();
        double ScreenHeight = tool.getScreenSize().getHeight();
        double ScreenWidth = tool.getScreenSize().getWidth();
        double frameHeight = this.getHeight();
        double frameWidth = this.getWidth();
        double y = (ScreenHeight - frameHeight)/2;
        double x = (ScreenWidth - frameWidth)/2;
        this.setLocation((int)x, (int)y);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        plus_btn = new javax.swing.JButton();
        minus_btn = new javax.swing.JButton();
        multiple_btn = new javax.swing.JButton();
        division_btn = new javax.swing.JButton();
        equal_btn = new javax.swing.JButton();
        radical_btn = new javax.swing.JButton();
        power_btn = new javax.swing.JButton();
        negetive_btn = new javax.swing.JButton();
        percent_btn = new javax.swing.JButton();
        pi_btn = new javax.swing.JButton();
        neper_btn = new javax.swing.JButton();
        binaryPoint_btn = new javax.swing.JButton();
        absolute_btn = new javax.swing.JButton();
        sin_btn = new javax.swing.JButton();
        cos_btn = new javax.swing.JButton();
        tan_btn = new javax.swing.JButton();
        cot_btn = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        ln_btn = new javax.swing.JButton();
        log_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        delete_btn = new javax.swing.JButton();

        jButton10.setText("jButton10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 153));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 153));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 204, 153));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 153));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 153));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 204, 153));
        jButton9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 204, 153));
        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 204, 153));
        jButton8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton0.setBackground(new java.awt.Color(0, 204, 153));
        jButton0.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        plus_btn.setBackground(new java.awt.Color(255, 153, 0));
        plus_btn.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        plus_btn.setText("+");
        plus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_btnActionPerformed(evt);
            }
        });

        minus_btn.setBackground(new java.awt.Color(255, 153, 0));
        minus_btn.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        minus_btn.setText("-");
        minus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_btnActionPerformed(evt);
            }
        });

        multiple_btn.setBackground(new java.awt.Color(255, 153, 0));
        multiple_btn.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        multiple_btn.setText("×");
        multiple_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiple_btnActionPerformed(evt);
            }
        });

        division_btn.setBackground(new java.awt.Color(255, 153, 0));
        division_btn.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        division_btn.setText("÷");
        division_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                division_btnActionPerformed(evt);
            }
        });

        equal_btn.setBackground(new java.awt.Color(242, 92, 92));
        equal_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        equal_btn.setText("=");
        equal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal_btnActionPerformed(evt);
            }
        });

        radical_btn.setBackground(new java.awt.Color(255, 204, 102));
        radical_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        radical_btn.setText("√");
        radical_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radical_btnActionPerformed(evt);
            }
        });

        power_btn.setBackground(new java.awt.Color(255, 204, 102));
        power_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        power_btn.setText("^");
        power_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                power_btnActionPerformed(evt);
            }
        });

        negetive_btn.setBackground(new java.awt.Color(0, 204, 153));
        negetive_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        negetive_btn.setText("(-)");
        negetive_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negetive_btnActionPerformed(evt);
            }
        });

        percent_btn.setBackground(new java.awt.Color(255, 204, 102));
        percent_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        percent_btn.setText("%");
        percent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percent_btnActionPerformed(evt);
            }
        });

        pi_btn.setBackground(new java.awt.Color(255, 204, 102));
        pi_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        pi_btn.setText("π");
        pi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pi_btnActionPerformed(evt);
            }
        });

        neper_btn.setBackground(new java.awt.Color(255, 204, 102));
        neper_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        neper_btn.setText("e");
        neper_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neper_btnActionPerformed(evt);
            }
        });

        binaryPoint_btn.setBackground(new java.awt.Color(0, 204, 153));
        binaryPoint_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        binaryPoint_btn.setText(".");
        binaryPoint_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryPoint_btnActionPerformed(evt);
            }
        });

        absolute_btn.setBackground(new java.awt.Color(255, 204, 102));
        absolute_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        absolute_btn.setText("|x|");
        absolute_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absolute_btnActionPerformed(evt);
            }
        });

        sin_btn.setBackground(new java.awt.Color(0, 204, 204));
        sin_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        sin_btn.setText("Sin x");
        sin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sin_btnActionPerformed(evt);
            }
        });

        cos_btn.setBackground(new java.awt.Color(0, 204, 204));
        cos_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cos_btn.setText("Cos x");
        cos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cos_btnActionPerformed(evt);
            }
        });

        tan_btn.setBackground(new java.awt.Color(0, 204, 204));
        tan_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tan_btn.setText("tan x");
        tan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tan_btnActionPerformed(evt);
            }
        });

        cot_btn.setBackground(new java.awt.Color(0, 204, 204));
        cot_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cot_btn.setText("cot x");
        cot_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cot_btnActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(242, 92, 92));
        jButton11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton11.setText("Clear");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ln_btn.setBackground(new java.awt.Color(255, 204, 102));
        ln_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ln_btn.setText("ln");
        ln_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ln_btnActionPerformed(evt);
            }
        });

        log_btn.setBackground(new java.awt.Color(255, 204, 102));
        log_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        log_btn.setText("log");
        log_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Created by Zahra Mohammadi");

        delete_btn.setBackground(new java.awt.Color(242, 92, 92));
        delete_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(negetive_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(multiple_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(binaryPoint_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(division_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(plus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(minus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(power_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(percent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(absolute_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radical_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(equal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(neper_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ln_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(log_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(cot_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(delete_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sin_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(plus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(minus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(multiple_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(percent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(division_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(negetive_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(binaryPoint_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(absolute_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(power_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(96, 96, 96))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(radical_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(neper_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(ln_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(log_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sin_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cot_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equal_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TextArea += "1";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       TextArea += "2";
        jTextField1.setText(TextArea);       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TextArea += "3";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TextArea += "4";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TextArea += "5";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        TextArea += "6";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        TextArea += "7";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        TextArea += "8";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        TextArea += "9";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        TextArea += "0";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void plus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_btnActionPerformed
        num1 = parseDouble(jTextField1.getText());
        action = "plus";
        TextArea = "";       
    }//GEN-LAST:event_plus_btnActionPerformed

    private void minus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_btnActionPerformed
        num1 = parseDouble(jTextField1.getText());
        action = "minus";
        TextArea = "";
    }//GEN-LAST:event_minus_btnActionPerformed

    private void multiple_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiple_btnActionPerformed
        num1 = parseDouble(jTextField1.getText());
        action = "multiple";
        TextArea = "";
    }//GEN-LAST:event_multiple_btnActionPerformed

    private void division_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_division_btnActionPerformed
        num1 = parseDouble(jTextField1.getText());
        action = "division";
        TextArea = "";
    }//GEN-LAST:event_division_btnActionPerformed

    private void equal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal_btnActionPerformed
        switch(action){
            case "plus" -> {
                num2 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf(num1+num2);
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }
            case "minus" -> {
                num2 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf(num1-num2);
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }
            case "multiple" -> {
                num2 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf(num1*num2);
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }
            case "division" -> {
                num2 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf((double)num1/(double)num2);
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }
            case "radical" -> {
                TextArea = String.valueOf( Math.sqrt(num1));
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }
            case "power" -> {
                num2 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf((Double) Math.pow(num1, num2));
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }
            case "percent" -> {
                num2 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf(num2*((double)num1/100));
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }
            case "sin" -> {
                num1 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf(Math.sin(num1));
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }
            case "cos" -> {
                num1 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf(Math.cos(num1));
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }
            case "tan" -> {
                num1 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf(Math.tan(num1));
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }
            case"cot" -> {
                num1 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf(1/(Math.tan(num1)));
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }      
            case"ln" -> {
                num1 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf(Math.log(num1));
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }  
            case"log" -> {
                num1 = parseDouble(jTextField1.getText());
                TextArea = String.valueOf(Math.log10(num1));
                jTextField1.setText(TextArea);
                num1 = num2 = 0;
            }  
        }
    }//GEN-LAST:event_equal_btnActionPerformed

    private void radical_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radical_btnActionPerformed
        num1 = parseDouble(jTextField1.getText());
        action = "radical";
        TextArea = "";
    }//GEN-LAST:event_radical_btnActionPerformed

    private void power_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_power_btnActionPerformed
        num1 = parseDouble(jTextField1.getText());
        action = "power";
        TextArea = "";
    }//GEN-LAST:event_power_btnActionPerformed

    private void negetive_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negetive_btnActionPerformed
        TextArea += "-";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_negetive_btnActionPerformed

    private void percent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percent_btnActionPerformed
        num1 = parseDouble(jTextField1.getText());
        action = "percent";
        TextArea = "";
    }//GEN-LAST:event_percent_btnActionPerformed

    private void pi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pi_btnActionPerformed
        jTextField1.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_pi_btnActionPerformed

    private void neper_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neper_btnActionPerformed
       jTextField1.setText(String.valueOf(Math.E));
       
    }//GEN-LAST:event_neper_btnActionPerformed

    private void binaryPoint_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryPoint_btnActionPerformed
        TextArea += ".";
        jTextField1.setText(TextArea);
    }//GEN-LAST:event_binaryPoint_btnActionPerformed

    private void absolute_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absolute_btnActionPerformed
        action = "absolute";
         num1 = parseDouble(jTextField1.getText());
            TextArea = String.valueOf(Math.abs(num1));
            jTextField1.setText(TextArea);
            num1 = num2 = 0;
        
    }//GEN-LAST:event_absolute_btnActionPerformed

    private void sin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sin_btnActionPerformed
        action = "sin";          
    }//GEN-LAST:event_sin_btnActionPerformed

    private void cos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cos_btnActionPerformed
       action = "cos";    
    }//GEN-LAST:event_cos_btnActionPerformed

    private void tan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tan_btnActionPerformed
        action = "tan";    
    }//GEN-LAST:event_tan_btnActionPerformed

    private void cot_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cot_btnActionPerformed
        action = "cot";    
    }//GEN-LAST:event_cot_btnActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jTextField1.setText("");
        TextArea = "";
    }//GEN-LAST:event_jButton11ActionPerformed

    private void ln_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ln_btnActionPerformed
        action = "ln";
    }//GEN-LAST:event_ln_btnActionPerformed

    private void log_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_btnActionPerformed
        action = "log";
    }//GEN-LAST:event_log_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
       TextArea = jTextField1.getText();
        int counter =TextArea.length();
       String result = "";
       for(int i = 0 ; i < counter - 1 ; i++){
          result += String.valueOf(TextArea.charAt(i));
       }
       TextArea = result;
       jTextField1.setText(TextArea);   
    }//GEN-LAST:event_delete_btnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absolute_btn;
    private javax.swing.JButton binaryPoint_btn;
    private javax.swing.JButton cos_btn;
    private javax.swing.JButton cot_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton division_btn;
    private javax.swing.JButton equal_btn;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton ln_btn;
    private javax.swing.JButton log_btn;
    private javax.swing.JButton minus_btn;
    private javax.swing.JButton multiple_btn;
    private javax.swing.JButton negetive_btn;
    private javax.swing.JButton neper_btn;
    private javax.swing.JButton percent_btn;
    private javax.swing.JButton pi_btn;
    private javax.swing.JButton plus_btn;
    private javax.swing.JButton power_btn;
    private javax.swing.JButton radical_btn;
    private javax.swing.JButton sin_btn;
    private javax.swing.JButton tan_btn;
    // End of variables declaration//GEN-END:variables
}