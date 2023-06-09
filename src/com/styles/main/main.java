/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.styles.main;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import controlador.*;
import controlador.ctrlUtil;
import java.awt.Toolkit;
import modelo.*;
import java.awt.Insets;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EquipoDinamita
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    int aux = 1;
    int ciclo = 0;
    String codop = "vacio";
    String inst1 = "instr 1";
    String inst2 = "instr 2";
   
    public main() {

        final int move = 0000;
        final int clear = 0001;
        final int set = 0010;
        final int store = 0011;
        final int add = 0100;
        final int sub = 0101;
        final int mpy = 0110;
        final int div = 0111;
        final int negate = 1000;
        final int and = 1001;
        final int or = 1010;
        final int not = 1011;
        final int compare = 1100;

        initComponents();
        setBackground(new Color(205,200,255));
    }

    public void captacion1(String dir, String dir2, int ciclo) throws InterruptedException {
        
        if (ciclo == 1) {
            jTFuc.setText(dir);
        }
        if (ciclo == 2) {
            jTFuc.setText(dir2);
        }
    }

    public void captacion2(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            jTFuc.setText("");
            jTFpc.setText(dir);
        }
        if (ciclo == 2) {
            jTFuc.setText("");
            jTFpc.setText(dir2);
        }
    }

    public void captacion3(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            jTFpc.setText("");
            jTFmar.setText(dir);
        }
        if (ciclo == 2) {
            jTFpc.setText("");
            jTFmar.setText(dir2);
        }
    }

    public void captacion4(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            JTARegistros.append(dir +"\n");
            jTFmar.setText("");
            jTFbIntr.setText(dir);
        }
        if (ciclo == 2) {
            jTFac.setText(dir);
            JTARegistros.append(dir2+"\n");
            jTFmar.setText("");
            jTFbIntr.setText(dir2);
            //jTFbIntr.setText(dir2);
        }
    }

    public void captacion5(String dir, String dir2, int ciclo) throws InterruptedException {


        if (ciclo == 1) {
            jTFbDatos.setText("");
            jTAalu.setText("Orden: \nmover dato de memoria a bus de datos \n" + dir);//move 
        }
        if (ciclo == 2) {
            jTFbDatos.setText("");
            jTAalu.setText("Orden: \nmover dato de memoria a bus de datos \n" + dir2);
        }

    }

    public void captacion6(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            jTFuc.setText("");
            jTFbControl.setText(dir);
        }
        if (ciclo == 2) {
            jTFuc.setText("");
            jTFbControl.setText(dir2);
        }
    }

    public void captacion7(String dir, String dir2, int ciclo) throws InterruptedException {

        //bctrl > mme (en memoria no se pone nada solo le llega la señal
        //jTFuc.setText("");
        //jTFbControl.setText("");
        //mme > bdatos
        //jTFmemoria.setText("");
        //jTFbDatos.setText(dir);
        //TimeUnit.SECONDS.sleep(3);
        if (ciclo == 1) {
            jTFuc.setText("");
            jTFbControl.setText("");
            //mme > bdatos
            jTFmemoria.setText("");
            jTFbDatos.setText(dir);
        }
        if (ciclo == 2) {
            jTFuc.setText("");
            jTFbControl.setText("");
            //mme > bdatos
            jTFmemoria.setText("");
            jTFbDatos.setText(dir2);
        }

    }

    public void captacion8(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            jTFbDatos.setText("");
            jTFmbr.setText(dir);
        }
        if (ciclo == 2) {
            jTFbDatos.setText("");
            jTFmbr.setText(dir2);
        }

    }

    public void captacion9(String dir, String dir2, int ciclo) {

        // mbr > ir
        //jTFmbr.setText("");
        //jTFir.setText(dir);
        if (ciclo == 1) {
            jTFmbr.setText("");
            jTFir.setText(dir);
            jTFmemoria.setText(JTARegistros.getText()+"\n");
        }
        if (ciclo == 2) {
            jTFmbr.setText("");
            jTFmemoria.setText(JTARegistros.getText()+"\n");
            jTFir.setText(dir2);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelFondo = new javax.swing.JPanel();
        listRegistros = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFbDatos = new javax.swing.JTextField();
        jTFbControl = new javax.swing.JTextField();
        jTFbIntr = new javax.swing.JTextField();
        jTFpc = new javax.swing.JTextField();
        jTFuc = new javax.swing.JTextField();
        jTFmbr = new javax.swing.JTextField();
        jTFmar = new javax.swing.JTextField();
        jTFir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAalu = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jBtnSalir = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jTFintrucComp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTARegistros = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jTFac = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnExe = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnMostrarCod = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTFmemoria = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTFResultado = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jButtonReinicar = new javax.swing.JButton();
        jButtonTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listRegistros.setVisible(false);

        jLabel1.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel1.setText("Bus de Datos");

        jLabel2.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel2.setText("Bus de Control");

        jLabel3.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel3.setText("Bus de Intrucción");

        jTFbDatos.setEditable(false);
        jTFbDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFbDatosActionPerformed(evt);
            }
        });

        jTFbControl.setEditable(false);

        jTFbIntr.setEditable(false);
        jTFbIntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFbIntrActionPerformed(evt);
            }
        });

        jTFpc.setEditable(false);
        jTFpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFpcActionPerformed(evt);
            }
        });

        jTFuc.setEditable(false);
        jTFuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFucActionPerformed(evt);
            }
        });

        jTFmbr.setEditable(false);
        jTFmbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFmbrActionPerformed(evt);
            }
        });

        jTFmar.setEditable(false);
        jTFmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFmarActionPerformed(evt);
            }
        });

        jTFir.setEditable(false);
        jTFir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel4.setText("PC");

        jLabel5.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel5.setText("UC");

        jLabel6.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel6.setText("IR");

        jLabel7.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel7.setText("MAR");

        jLabel8.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel8.setText("MBR");

        jTAalu.setEditable(false);
        jTAalu.setColumns(20);
        jTAalu.setRows(5);
        jScrollPane1.setViewportView(jTAalu);

        jLabel9.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 12)); // NOI18N
        jLabel9.setText("ALU");

        jBtnSalir.setText("x");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel12.setText("Resultado");

        JTARegistros.setEditable(false);
        JTARegistros.setColumns(20);
        JTARegistros.setRows(10);
        JTARegistros.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createCompoundBorder()));
        JTARegistros.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(JTARegistros);

        jLabel13.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel13.setText("Regristros");

        jTFac.setEditable(false);
        jTFac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFacActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel14.setText("Acumulador");

        btnExe.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        btnExe.setText("Ejecutar");
        btnExe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel10.setText("Captación:");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnMostrarCod.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        btnMostrarCod.setText("Mostrar codops");
        btnMostrarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCodActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Source Serif Pro Semibold", 1, 14)); // NOI18N
        jLabel11.setText("Memoria:");

        jTFmemoria.setEditable(false);
        jTFmemoria.setColumns(20);
        jTFmemoria.setRows(5);
        jScrollPane3.setViewportView(jTFmemoria);

        jTFResultado.setEditable(false);
        jTFResultado.setColumns(20);
        jTFResultado.setRows(5);
        jScrollPane4.setViewportView(jTFResultado);

        jLabel15.setFont(new java.awt.Font("Source Serif Pro Semibold", 1, 14)); // NOI18N
        jLabel15.setText("Ingrese la Instruccion a Ejecutar:");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonReinicar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonReinicar.setText("Reiniciar");
        jButtonReinicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReinicarActionPerformed(evt);
            }
        });

        jButtonTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonTodo.setText("Paso a Paso");
        jButtonTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTodoMouseClicked(evt);
            }
        });
        jButtonTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFac, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(jTFmbr)
                                .addComponent(jTFmar)
                                .addGroup(jPanelFondoLayout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28)))
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFuc, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(97, 97, 97))
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jTFbIntr, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTFbControl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFbDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jTFintrucComp, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExe))
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(358, 358, 358)
                                .addComponent(listRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(19, 19, 19))))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(508, 508, 508)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jTFpc, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jTFir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jButtonTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostrarCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonReinicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jBtnSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(listRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(516, 516, 516))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addComponent(btnExe)
                                        .addGap(93, 93, 93))
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(68, 68, 68)))
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addComponent(jTFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFmbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jTFintrucComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMostrarCod)
                                    .addComponent(jButtonTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jButtonReinicar))
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel1)
                                        .addGap(7, 7, 7)
                                        .addComponent(jTFbDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFbControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFbIntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3)))
                                .addGap(5, 5, 5)))
                        .addGap(18, 18, 18)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCodActionPerformed
        // TODO add your handling code here:

        JFrame fr = new JFrame("Mostrar codops");
        fr.setAlwaysOnTop(true);

        JOptionPane.showMessageDialog(fr,
            "0000 - move\n"
            + "0001 - clear\n"
            + "0010 - set\n"
            + "0011 - store	\n"
            + "\n"
            + " -- Aritméticas:\n"
            + "\n"
            + "0100 - add\n"
            + "0101 - sub\n"
            + "0110 - mpy\n"
            + "0111 - div\n"
            + "1000 - negate\n"
            + "\n"
            + "-- Lógicas:\n"
            + "\n"
            + "1001 - and\n"
            + "1010 - or\n"
            + "1011 - not\n"
            + "1100 - compare",
            "Mostrar codops", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_btnMostrarCodActionPerformed

    private void btnExeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExeActionPerformed
        // TODO add your handling code here:
        int opcion = Integer.parseInt(codop);
        System.out.println(opcion);
        switch (opcion) {
            case 0000: //move
            jTFResultado.setText("la dirección " + inst1 + "se ha movido a la direción " + inst2);
            jTFmemoria.setText("[" + inst2 + "]: " + inst1);
            break;

            case 0001: //clear
            jTFResultado.setText("las direcciones " + inst1 + " y " + inst2 + "se han reemplazado por palabras 0 ");
            String clear = "";
            clear += "[" + inst1 + "]: 000000\n";

            clear += "[" + inst2 + "]: 000000\n";

            jTFmemoria.setText(clear);
            break;

            case 10: //set
            jTFResultado.setText("las direcciones " + inst1 + " y " + inst2 + "se han reemplazado por palabras 1 ");
            String set = "";
            set += "[" + inst1 + "]: 111111\n" + "";
            set += "[" + inst2 + "]: 111111\n";
            jTFmemoria.setText(set);
            break;

            case 11: //store
            jTFResultado.setText("las direcciones " + inst1 + " y " + inst2 + "se ha movido a la memoria ");
            jTFmemoria.setText("[" + inst2 + "]: " + inst1);
            break;

            case 100: //add

            String input0 = inst1;
            String input1 = inst2;

            int number0 = Integer.parseInt(input0, 2);
            int number1 = Integer.parseInt(input1, 2);

            int sum = number0 + number1;
            String resultado = Integer.toBinaryString(sum);
            jTFResultado.setText(String.valueOf(resultado));
            break;

            case 101: //sub

            String nst = "",
            max = "";
            char b = '0';
            boolean tf = (inst1.length() >= inst2.length());
            int l1 = inst1.length(),
            l2 = inst2.length();
            if (l1 < l2) {
                for (int a = 1; a <= l2 - l1; a++) {
                    inst1 = '0' + inst1;
                }
            } else if (l2 < l1) {
                for (int a = 1; a <= l1 - l2; a++) {
                    inst2 = "0" + inst2;
                }
            }
            if (!tf) {
                for (int a = l1 - 1; a >= 0; a--) {
                    if (inst1.charAt(a) != inst2.charAt(a)) {
                        if (inst2.charAt(a) == '1') {
                            max = inst2;
                            inst2 = inst1;
                            inst1 = max;
                            break;
                        }
                    }
                }
            }

            for (int a = inst1.length() - 1; a >= 0; a--) {
                if (inst1.charAt(a) == '1' && inst2.charAt(a) == '0') {
                    if (b == '1') {
                        nst = '0' + nst;
                        b = '0';
                    } else {
                        nst = '1' + nst;
                    }
                } else if (inst1.charAt(a) == inst2.charAt(a) && inst2.charAt(a) == '1') {
                    if (b == '1') {
                        nst = '1' + nst;
                        b = '1';
                    } else {
                        nst = '0' + nst;
                    }
                } else if (inst1.charAt(a) == '0' && inst2.charAt(a) == '1') {
                    if (b == '1') {
                        nst = '0' + nst;
                    } else {
                        nst = '1' + nst;
                        b = '1';
                    }
                } else {
                    if (b == '1') {
                        nst = '1' + nst;
                    } else {
                        nst = '0' + nst;
                    }
                }
            }
            jTFResultado.setText(nst);

            break;

            case 110: //mpy
            int prim = Integer.parseInt(inst1, 2);
            int sec = Integer.parseInt(inst2, 2);

            int r = prim * sec;

            String rBin = Integer.toBinaryString(r);
            jTFResultado.setText(rBin);
            break;

            case 111:// div
            int primero = Integer.parseInt(inst1, 2);
            int segundo = Integer.parseInt(inst2, 2);

            int div = primero / segundo;

            String division = Integer.toBinaryString(div);
            jTFResultado.setText(division);
            break;

            case 1000: //negate
            String negate = "";

            for (int i = 0; i < inst1.length(); i++) {
                char n= inst1.charAt(i);
                if (String.valueOf(n).equals("1")) {
                    negate += "0";
                }
                if (String.valueOf(n).equals("0")) {
                    negate += "1";
                }
            }
            negate += "-";
            for (int i = 0; i < inst2.length(); i++) {
                char nn=inst2.charAt(i);
                if (String.valueOf(nn).equals("1")) {
                    negate += "0";
                }
                if (String.valueOf(nn).equals("0")) {
                    negate += "1";
                }
            }
            jTFResultado.setText(negate);

            break;

            case 1001: //and
            String and = "";
            for(int i=0; i<inst1.length(); i++){
                for (int j=0; j<inst2.length(); j++){
                    char ii = inst1.charAt(i);
                    char jj = inst2.charAt(j);
                    if (Character.valueOf(ii).equals(Character.valueOf(jj))){
                        and +=1;
                    }else{
                        and +=0;
                    }

                }
            }
            jTFResultado.setText(and);

            break;

            case 1010: //Or
            String or ="";
            for(int i=0; i<inst1.length(); i++){
                for (int j=0; j<inst2.length(); j++){
                    char ii = inst1.charAt(i);
                    char jj = inst2.charAt(j);
                    if(Character.valueOf(ii).equals("1")|Character.valueOf(jj).equals("1")){
                        or+=1;
                    }else{
                        or+=0;
                    }

                }
            }
            jTFResultado.setText(or);
            break;

            case 1011: //not
            String not = "";

            for (int i = 0; i < inst1.length(); i++) {
                char n= inst1.charAt(i);
                if (String.valueOf(n).equals("1")) {
                    not += "0";
                }
                if (String.valueOf(n).equals("0")) {
                    not += "1";
                }
            }
            not += "-";
            for (int i = 0; i < inst2.length(); i++) {
                char nn=inst2.charAt(i);
                if (String.valueOf(nn).equals("1")) {
                    not += "0";
                }
                if (String.valueOf(nn).equals("0")) {
                    not += "1";
                }
            }

            jTFResultado.setText(not);

            break;

            case 1100: //compare
            String compare = "";

            if (inst1 == inst2) {
                compare = "número igual";
            }
            jTFResultado.setText(compare);
            break;

            default:
            System.out.println("switch default case");

        }
    }//GEN-LAST:event_btnExeActionPerformed

    private void jTFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFacActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        // TODO add your handling code here:

        //System.exit(0);

        JFrame frame = new JFrame("Salir");

        if (JOptionPane.showConfirmDialog(frame, "¿Desea cerrar el programa?",
            "SALIR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        System.exit(0);
        }
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jTFirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFirActionPerformed

    private void jTFmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFmarActionPerformed

    private void jTFmbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFmbrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFmbrActionPerformed

    private void jTFucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFucActionPerformed

    private void jTFpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFpcActionPerformed

    private void jTFbIntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFbIntrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbIntrActionPerformed

    private void jTFbDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFbDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbDatosActionPerformed

    private void jButtonReinicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReinicarActionPerformed
        // TODO add your handling code here:
        String dir = "";
        jTFuc.setText("");
        jTFmemoria.setText("");
        jTFbDatos.setText("");
        jTFbControl.setText("");
        jTFbIntr.setText("");
        jTFResultado.setText("");
        jTFir.setText("");
        jTFpc.setText("");
        jTAalu.setText("");
        jTFac.setText("");
        jTFmar.setText("");
        jTFmbr.setText("");
        jTFintrucComp.setText("");
        JTARegistros.setText("");
        ciclo = 0;
        aux = 1; 
    }//GEN-LAST:event_jButtonReinicarActionPerformed

    private void jButtonTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTodoActionPerformed
        
        System.out.println("Marlon in" + aux);
        switch (aux) {
            case 1:
                        // TODO add your handling code here:

        String dir = jTFintrucComp.getText();

        while (dir.equals("") | dir.length() == 0) {
            JFrame fram = new JFrame("Entrada nula");
            fram.setAlwaysOnTop(true);
            dir = dir.valueOf(JOptionPane.showInputDialog(fram,
                "La entrada no puede estar vacia", "INVALID ENTRY", JOptionPane.INFORMATION_MESSAGE));
        jTFintrucComp.setText(dir);
        if (dir.equals("") | dir.length() == 0) {
            break;
        }
        }

        if (dir.length() > 16) {
            JFrame frame = new JFrame("Es mayor a 16");
            frame.setAlwaysOnTop(true);
            dir = dir.valueOf(JOptionPane.showInputDialog(frame,
                "La entrada no puede ser mayor a 16", "INVALID ENTRY", JOptionPane.INFORMATION_MESSAGE));
        jTFintrucComp.setText(dir);
        // b16=true;
        }
        if (dir.length() < 16 & !dir.equals("")) {
            JFrame frames = new JFrame("Es menor a 16 bits");
            frames.setAlwaysOnTop(true);
            dir = dir.valueOf(JOptionPane.showInputDialog(frames,
                "La entrada no puede ser menor a 16 bits", "INVALID ENTRY", JOptionPane.INFORMATION_MESSAGE));
        jTFintrucComp.setText(dir);
        //bm16=true;
        }

        ciclo += 1;

        //String[] fullinst;
        //fullinst = jTFintrucComp.getText().split("/n");
        codop = "";
        for (int i = 0; i < 4; i++) {
            String a = String.valueOf(dir.charAt(i));
            codop += a;
            //codop.concat(a);
        }
        inst1 = "";
        for (int i = 4; i > 3 & i < 10; i++) {
            String b = String.valueOf(dir.charAt(i));
            inst1 += b;
            //inst1.concat(b);
        }
        inst2 = "";
        for (int i = 10; i > 9 & i < 16; i++) {
            String c = String.valueOf(dir.charAt(i));
            inst2 += c;
            //inst2.concat(c);
        }
        System.out.println(codop);
        System.out.println(inst1);
        System.out.println(inst2);

        try {
            captacion1(inst1, inst2, ciclo);
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        aux= aux + 1;
        System.out.println("Marlon aux: "+ aux);
                break;
                
            case 2:
                 try {
            captacion2(inst1, inst2, ciclo);
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
                 aux= aux + 1;
                 System.out.println("Marlon aux: "+ aux);
                break;
            case 3:
                try {
            captacion3(inst1, inst2, ciclo);
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
                 aux= aux + 1;
                 System.out.println("Marlon aux: "+ aux);
                break; 
            case 4:
                try {
            captacion4(inst1, inst2, ciclo);
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
                 aux= aux + 1;
                 System.out.println("Marlon aux: "+ aux);
                break;
            case 5:
                try {
            captacion5(inst1, inst2, ciclo);
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
                 aux= aux + 1;
                 System.out.println("Marlon aux: "+ aux);
                break;
            case 6:
                try {
            captacion6(inst1, inst2, ciclo);
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
                 aux= aux + 1;
                 System.out.println("Marlon aux: "+ aux);
                break;
            case 7:
                try {
            captacion7(inst1, inst2, ciclo);
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
                 aux= aux + 1;
                 System.out.println("Marlon aux: "+ aux);
                break;    
            case 8:
                try {
            captacion8(inst1, inst2, ciclo);
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
                 aux= aux + 1;
                 System.out.println("Marlon aux: "+ aux);
                break;
            case 9:
                captacion9(inst1, inst2, ciclo);

        JFrame fr = new JFrame(" Fin captación");
        //fr.setAlwaysOnTop(true);

        if (ciclo == 2) {
            JOptionPane.showMessageDialog(fr,
                "Fin del ciclo de captación\n",
                "Fincap", JOptionPane.OK_OPTION);
            jTFintrucComp.setText("");
            ciclo = 0;
        }
        
                 aux= 1;
                 System.out.println("Marlon aux: "+ aux);
                break;    
            default:
                throw new AssertionError();
        }
        
    }//GEN-LAST:event_jButtonTodoActionPerformed

    private void jButtonTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTodoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTodoMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
                jPanelFondo.setBackground(new Color (237,187,153));
                jPanel1.setBackground(new Color (237,187,153));
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JTARegistros;
    private javax.swing.JButton btnExe;
    private javax.swing.JButton btnMostrarCod;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jButtonReinicar;
    private javax.swing.JButton jButtonTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTAalu;
    private javax.swing.JTextArea jTFResultado;
    private javax.swing.JTextField jTFac;
    private javax.swing.JTextField jTFbControl;
    private javax.swing.JTextField jTFbDatos;
    private javax.swing.JTextField jTFbIntr;
    private javax.swing.JTextField jTFintrucComp;
    private javax.swing.JTextField jTFir;
    private javax.swing.JTextField jTFmar;
    private javax.swing.JTextField jTFmbr;
    private javax.swing.JTextArea jTFmemoria;
    private javax.swing.JTextField jTFpc;
    private javax.swing.JTextField jTFuc;
    private java.awt.List listRegistros;
    // End of variables declaration//GEN-END:variables
    

}
