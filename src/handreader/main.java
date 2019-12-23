/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handreader;

import handreader.charts.ChartBTN1013;
import handreader.charts.ChartBTN1417;
import handreader.charts.ChartBTN1825;
import handreader.charts.ChartBTN9less;
import handreader.charts.ChartSBBTNl1825;
import handreader.charts.ChartSBBTNr1013;
import handreader.charts.ChartSBBTNr1417;
import handreader.charts.ChartSBBTNr1825;
import handreader.charts.ChartSBBTNr9less;
import handreader.charts.ChartSBBTNshove9less;
import handreader.charts.ChartStrategy;
import handreader.hand.CardButton;
import java.awt.CardLayout;
import java.io.File;
import java.io.RandomAccessFile;
import javax.swing.SwingUtilities;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author berendfuchs
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    
    String filePath = "/Users/berendfuchs/Library/Logs/PokerStars/PokerStars.log.0";
    String searchPhrase = "CocosTableState:";
    
    
    public main() {
        setAlwaysOnTop(true);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cardframe = new javax.swing.JPanel();
        setFilePath = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chooseFilePathComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        chooseFilePathTextField = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        cardDisplay = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        deckPanel1 = new handreader.deck.DeckPanel();
        handCardPanel1 = new handreader.hand.HandCardPanel();
        handCommunityCardPanel = new handreader.hand.HandCardPanel("Community Cards", 0, 5);
        rangeChartPanel1 = new handreader.RangeChartPanel();
        btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnPosition = new javax.swing.JRadioButton();
        smallBlindPosition = new javax.swing.JRadioButton();
        bigBlindPosition = new javax.swing.JRadioButton();
        limpAction = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        raiseAction = new javax.swing.JRadioButton();
        shoveAction = new javax.swing.JRadioButton();
        stack1825 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        stack1417 = new javax.swing.JRadioButton();
        stack1013 = new javax.swing.JRadioButton();
        stack9 = new javax.swing.JRadioButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cardframe.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Choose file location");

        chooseFilePathComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/Users/berendfuchs/Library/Logs/PokerStars/PokerStars.log.0", "C:\\\\Users\\\\masin\\\\AppData\\\\Local\\\\PokerStars\\\\PokerStars.log.0", "/Users/berendfuchs/Library/Logs/PokerStars", "/Users/berendfuchs/Library/Logs/PokerStars/PokerStars.log.0", "/Users/berendfuchs/Library/Logs/PokerStars/PokerStars.log.0", "/Users/berendfuchs/Library/Logs/PokerStars/PokerStars.log.0copy" }));
        chooseFilePathComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                chooseFilePathComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel2.setText("Or enter manually");

        goButton.setText("GO");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("<html>example : C:\\\\Users\\\\User\\\\AppData\\\\Local\\\\PokerStars\\\\PokerStars.log.0</html>");

        jLabel4.setText("Choose search phrase");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"CocosTableState:\"", "CocosTableState:", "UpdateMyCard", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setFilePathLayout = new javax.swing.GroupLayout(setFilePath);
        setFilePath.setLayout(setFilePathLayout);
        setFilePathLayout.setHorizontalGroup(
            setFilePathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setFilePathLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setFilePathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setFilePathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(chooseFilePathTextField)
                        .addComponent(chooseFilePathComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        setFilePathLayout.setVerticalGroup(
            setFilePathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setFilePathLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseFilePathComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseFilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goButton)
                .addContainerGap(666, Short.MAX_VALUE))
        );

        cardframe.add(setFilePath, "card1");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Position");

        btnPosition.setText("BTN");
        btnPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPositionActionPerformed(evt);
            }
        });

        smallBlindPosition.setText("Small Blind");
        smallBlindPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallBlindPositionActionPerformed(evt);
            }
        });

        bigBlindPosition.setText("Big Blind");
        bigBlindPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigBlindPositionActionPerformed(evt);
            }
        });

        limpAction.setText("Limp");

        jLabel6.setText("Action");

        raiseAction.setText("Raise");

        shoveAction.setText("Shove");

        stack1825.setText("18-25");
        stack1825.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stack1825ActionPerformed(evt);
            }
        });

        jLabel10.setText("Effective Stack");

        stack1417.setText("14-17");
        stack1417.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stack1417ActionPerformed(evt);
            }
        });

        stack1013.setText("10-13");
        stack1013.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stack1013ActionPerformed(evt);
            }
        });

        stack9.setText(">9");
        stack9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stack9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(handCardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(323, 323, 323)
                            .addComponent(btn))
                        .addComponent(deckPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(handCommunityCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rangeChartPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPosition)
                            .addComponent(smallBlindPosition)
                            .addComponent(bigBlindPosition))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limpAction)
                            .addComponent(raiseAction)
                            .addComponent(shoveAction)
                            .addComponent(jLabel6))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(stack1825)
                            .addComponent(stack1417)
                            .addComponent(stack1013)
                            .addComponent(stack9))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(deckPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(handCommunityCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(handCardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rangeChartPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPosition)
                    .addComponent(limpAction)
                    .addComponent(stack1825))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smallBlindPosition)
                    .addComponent(raiseAction)
                    .addComponent(stack1417))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bigBlindPosition)
                    .addComponent(shoveAction)
                    .addComponent(stack1013))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stack9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout cardDisplayLayout = new javax.swing.GroupLayout(cardDisplay);
        cardDisplay.setLayout(cardDisplayLayout);
        cardDisplayLayout.setHorizontalGroup(
            cardDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDisplayLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cardDisplayLayout.setVerticalGroup(
            cardDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDisplayLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardframe.add(cardDisplay, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardframe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void chooseFilePathComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_chooseFilePathComboBoxPopupMenuWillBecomeInvisible
        filePath = chooseFilePathComboBox.getSelectedItem().toString();
        chooseFilePathTextField.setText(filePath);
    }//GEN-LAST:event_chooseFilePathComboBoxPopupMenuWillBecomeInvisible

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        CardLayout c = (CardLayout)(cardframe.getLayout());
        c.show(cardframe, "card2");
        filePath = chooseFilePathTextField.getText();
        btn.doClick();
        btn.hide();
        
        /*btn.setText("clicked");
        ExecutorService executor = Executors.newFixedThreadPool(4);
        
        LogFileReader tailF = new LogFileReader(filePath, 2000, searchPhrase);
        
        executor.execute(tailF)*/;
    }//GEN-LAST:event_goButtonActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed

        System.out.println("Button performed.......");
        // We're going to do something that takes a long time, so we
        // spin off a thread and update the display when we're done.
        Thread worker = new Thread() {
        private boolean debug = false;
        private int runEveryNSeconds = 1000;
        private long lastKnownPosition = 0;
        private boolean shouldIRun = true;
        private String searchedText = "CocosTableState:";
        private File file = new File(filePath); //new File("/home/soufiane/workspace/logfile");
        private void printLine(String message) {
            System.out.println(message);
        }

        private void printLineIfContains(String message) {
            //btn.setText("AAAgAAA");
            if (message.contains(searchedText)) {
                String handCommunity = message.substring(message.indexOf("["), message.indexOf("]"));
                List<String> handCommunityCards = Arrays.asList(handCommunity.split(" ")).subList(1, 6);
                List<CardButton> cards = handCommunityCardPanel.getCardButtons();
                int p = 0;
                for (String card : handCommunityCards) {
                    cards.get(p).setCard(card.replace("np", "")); p++;
                }
              
                System.out.println(message);
                // Hand binding - always two cards in hand
                List<CardButton> handCards = handCardPanel1.getCardButtons();
                int i = 0;
                List<String> hand = Arrays.asList(message.substring(message.indexOf("players: ")).split(" "));
                for (String card : hand) {
                    if (i>=2) {
                        break;
                    }
                    if (card.contains("dnp") || card.contains("cnp") || card.contains("snp") || card.contains("hnp")) {
                        handCards.get(i).setCard(card.replace("np", "")); i++;
                    } else if ("-".equals(card)) {
                        handCards.get(i).setCard(card); i++;
                    }
                }
                // TODO : handle this part in case there is a problem
                
                List<String> cardsOrder = Arrays.asList("A", "K", "Q", "J", "T", "9", "8", "7", "6", "5", "4", "3", "2");
                
                List<RangeButton> rangeButtons = rangeChartPanel1.getRangeButtons();
                rangeChartPanel1.updateButtons();
                char f = handCards.get(0).getCard().charAt(0);
                char s = handCards.get(1).getCard().charAt(0); 
                
                int fPosition = cardsOrder.indexOf(f + "");
                int sPosition = cardsOrder.indexOf(s + "");
                
                String value = (sPosition < fPosition)? (char)s + "" + (char)f : (char)f + "" + (char)s;
                
                System.out.println("Button to light up = " + value);
                
                if (!value.contains("-")) {
                if (f == s) {
                    // Suited case
                    rangeButtons
                            .stream()
                            .filter(x -> x.getCard().contains(value))
                            .findFirst()
                            .get().lightUp();
                } else if(handCards.get(0).getCard().charAt(1) == handCards.get(1).getCard().charAt(1)) {
                    // Offsuited case
                    rangeButtons
                            .stream()
                            .filter(x -> x.getCard().contains(value + "s"))
                            .findFirst()
                            .get().lightUp();
                } else {
                    // Offsuited case
                    rangeButtons
                            .stream()
                            .filter(x -> x.getCard().contains(value + "o"))
                            .findFirst()
                            .get().lightUp();
                }
                }
                //System.out.println(message);
            }
        }
        public void stopRunning() {
            shouldIRun = false;
        }
        public void run() {
            try {
            while (shouldIRun) {
                Thread.sleep(runEveryNSeconds);
                long fileLength = file.length();
                if (fileLength > lastKnownPosition) {
                    //System.out.println("The file has been updated...");

                    // Reading and writing file
                    RandomAccessFile readWriteFileAccess = new RandomAccessFile(file, "rw");
                    readWriteFileAccess.seek(lastKnownPosition);
                    String line = null;
                    while ((line = readWriteFileAccess.readLine()) != null) {
                        this.printLineIfContains(line);
                    }
                    lastKnownPosition = readWriteFileAccess.getFilePointer();
                    readWriteFileAccess.close();
                } else {
                    if (debug)
                        this.printLine("Hmm.. Couldn't found new line after line # ");
                }
            }
            } catch (Exception e) {
                stopRunning();
                e.printStackTrace();
            }
            
            SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                setEnabled(true);
              }
            });
          }
        };

        worker.start(); // So we don't hold up the dispatch thread.
    }//GEN-LAST:event_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout c = (CardLayout)(cardframe.getLayout());
        c.show(cardframe, "card1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPositionActionPerformed


        smallBlindPosition.setSelected(false);
        bigBlindPosition.setSelected(false);        
    }//GEN-LAST:event_btnPositionActionPerformed

    private void stack1825ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stack1825ActionPerformed
        stack1417.setSelected(false);
        stack1013.setSelected(false);
        stack9.setSelected(false);
        
        if (smallBlindPosition.isSelected() && raiseAction.isSelected()) {
            displayStrategy(new ChartSBBTNr1825());
        } else if (smallBlindPosition.isSelected() && limpAction.isSelected()) {
            displayStrategy(new ChartSBBTNl1825());
        } else if (btnPosition.isSelected()) {
            displayStrategy(new ChartBTN1825());
        }
    }//GEN-LAST:event_stack1825ActionPerformed

    private void displayStrategy(ChartStrategy chart) {
        List<RangeButton> chartButtons = rangeChartPanel1.getRangeButtons();
            int i = 0;
            String[][] chartColors = chart.getChart();
            for (int j = 0; j < 13; j++) {
                for (int k = 0; k < 13; k++) {
                    chartButtons.get(i++).lightStrategy(chartColors[j][k]);
                }
            }
    }
    
    private void stack1417ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stack1417ActionPerformed

        stack1825.setSelected(false);
        stack1013.setSelected(false);
        stack9.setSelected(false);
        
        if (smallBlindPosition.isSelected() && raiseAction.isSelected()) {
            displayStrategy(new ChartSBBTNr1417());
        } else if (btnPosition.isSelected()) {
            displayStrategy(new ChartBTN1417());
        }
    }//GEN-LAST:event_stack1417ActionPerformed

    private void stack1013ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stack1013ActionPerformed
        stack1825.setSelected(false);
        stack1417.setSelected(false);
        stack9.setSelected(false);
        
        if (smallBlindPosition.isSelected() && raiseAction.isSelected()) {
            displayStrategy(new ChartSBBTNr1013());
        } else if (btnPosition.isSelected()) {
            displayStrategy(new ChartBTN1013());
        }
    }//GEN-LAST:event_stack1013ActionPerformed

    private void stack9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stack9ActionPerformed
        stack1825.setSelected(false);
        stack1417.setSelected(false);
        stack1013.setSelected(false);
        
        if (smallBlindPosition.isSelected() && raiseAction.isSelected()) {
            displayStrategy(new ChartSBBTNr9less());
        } else if (btnPosition.isSelected()) {
            displayStrategy(new ChartBTN9less());
        }
    }//GEN-LAST:event_stack9ActionPerformed

    private void smallBlindPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallBlindPositionActionPerformed
        btnPosition.setSelected(false);
        bigBlindPosition.setSelected(false);
    }//GEN-LAST:event_smallBlindPositionActionPerformed

    private void bigBlindPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigBlindPositionActionPerformed
        btnPosition.setSelected(false);
        smallBlindPosition.setSelected(false);
    }//GEN-LAST:event_bigBlindPositionActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bigBlindPosition;
    private javax.swing.JButton btn;
    private javax.swing.JRadioButton btnPosition;
    private javax.swing.JPanel cardDisplay;
    private javax.swing.JPanel cardframe;
    private javax.swing.JComboBox<String> chooseFilePathComboBox;
    private javax.swing.JTextField chooseFilePathTextField;
    private handreader.deck.DeckPanel deckPanel1;
    private javax.swing.JButton goButton;
    private handreader.hand.HandCardPanel handCardPanel1;
    private handreader.hand.HandCardPanel handCommunityCardPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton limpAction;
    private javax.swing.JRadioButton raiseAction;
    private handreader.RangeChartPanel rangeChartPanel1;
    private javax.swing.JPanel setFilePath;
    private javax.swing.JRadioButton shoveAction;
    private javax.swing.JRadioButton smallBlindPosition;
    private javax.swing.JRadioButton stack1013;
    private javax.swing.JRadioButton stack1417;
    private javax.swing.JRadioButton stack1825;
    private javax.swing.JRadioButton stack9;
    // End of variables declaration//GEN-END:variables
}

//  cd /Users/berendfuchs/Library/Logs/PokerStars
//  java -jar extractor-1.0.jar PokerStars.log.0 "CocosTableState:"
//  /Users/berendfuchs/Library/Logs/PokerStars/PokerStars.log.0
//