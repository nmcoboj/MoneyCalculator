package Vista;

import Controlador.Control;

public class VentanaNumeros extends javax.swing.JFrame implements InterfazNumeros {

    public VentanaNumeros() {

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn1D = new javax.swing.JButton();
        btn5D = new javax.swing.JButton();
        btn10D = new javax.swing.JButton();
        btn20D = new javax.swing.JButton();
        btn50D = new javax.swing.JButton();
        btn100D = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn1C = new javax.swing.JButton();
        btn5C = new javax.swing.JButton();
        btn10C = new javax.swing.JButton();
        btn25C = new javax.swing.JButton();
        btn50C = new javax.swing.JButton();
        btn100C = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Billetes");

        btn1D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn1D.setText("1$");

        btn5D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn5D.setText("5$");

        btn10D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn10D.setText("10$");

        btn20D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn20D.setText("20$");

        btn50D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn50D.setText("50$");

        btn100D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn100D.setText("100$");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Monedas");

        btn1C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn1C.setText("1c");

        btn5C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn5C.setText("5c");

        btn10C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn10C.setText("10c");

        btn25C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn25C.setText("25c");

        btn50C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn50C.setText("50c");

        btn100C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn100C.setText("1D");

        btnMostrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMostrar.setText("Mostrar Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn1D)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5D)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn10D)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn20D)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn50D)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn100D))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn1C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn10C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn25C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn50C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn100C))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnMostrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1D, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5D, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10D, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20D, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn50D, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn100D, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1C, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5C, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10C, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn25C, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn50C, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn100C, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100C;
    private javax.swing.JButton btn100D;
    private javax.swing.JButton btn10C;
    private javax.swing.JButton btn10D;
    private javax.swing.JButton btn1C;
    private javax.swing.JButton btn1D;
    private javax.swing.JButton btn20D;
    private javax.swing.JButton btn25C;
    private javax.swing.JButton btn50C;
    private javax.swing.JButton btn50D;
    private javax.swing.JButton btn5C;
    private javax.swing.JButton btn5D;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setControlador(Control c) {
       this.btn1D.addActionListener(c);
       this.btn5D.addActionListener(c);
       this.btn10D.addActionListener(c);
       this.btn20D.addActionListener(c);
       this.btn50D.addActionListener(c);
       this.btn100D.addActionListener(c);
       this.btn1C.addActionListener(c);
       this.btn5C.addActionListener(c);
       this.btn10C.addActionListener(c);
       this.btn25C.addActionListener(c);
       this.btn50C.addActionListener(c);
       this.btn100C.addActionListener(c);
       this.btnMostrar.addActionListener(c);
    }

    @Override
    public void inicializar() {
        initComponents();
        setLocationRelativeTo(null);// centra la ventana en la pantalla
        setVisible(true);
    }

    @Override
    public void visualizar() {
        setVisible(true);
    }

    @Override
    public void esconder() {
        setVisible(false);
    }
}
