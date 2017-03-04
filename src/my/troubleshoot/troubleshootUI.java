
package my.troubleshoot;

import static java.awt.AWTEventMulticaster.add;
import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.Document;



/**
 *
 * @author joshuamalloy from JoMa Interactive
 * Network Connectivity Troubleshooting Series 0.17*/
public class troubleshootUI extends javax.swing.JFrame {
    
//Global Variables  
    private final ImageIcon image1 = new ImageIcon(getClass().getResource("image1.png"));
    private boolean switchsEnd = false;
    private int cout = 0;
    private boolean routerEnd = false;
    private boolean serverEnd = false;
    private boolean otherEnd = false;
    private boolean computerEnd = false;
    private boolean wifiEnd = false;
    private boolean references = false;
    private boolean rule = true; 
    private boolean reset = false;
    private boolean save = false;
    private boolean switchs = false;
    private boolean router = false;
    private boolean server = false;
    private boolean other = false;
    private boolean computer = false;
    private boolean wifi = false;
    private boolean train = false;
    private boolean autoDisplay = false;
    private boolean yes = false;
    private boolean no = false;
    private boolean add = false;
    private boolean saveComputer = false;
    private boolean saveSwitch = false;
    private boolean saveRouter = false;
    private boolean saveWired = false;
    private boolean saveWifi = false;
    private boolean saveServer = false;
    private boolean saveOther = false;
    private boolean firstTimeComputer = true;
    private  FileInputStream instream = null;
    private  FileOutputStream outstream = null;
    private int counterC = 2;
    private int counterR = 2;
    private int countC = 3;
    private int countR = 3;
    
    private int levelNumSwitch = 0;
    private int levelNumOther = 0;
    private int levelNumRouter = 0;
    private int levelNumServer = 0;
    private int levelNumComputer = 0;
    private int levelNumWifi = 0;
    
    private int computerSize = 0;
    private int routerSize = 0;
    private int serverSize = 0;
    private int switchSize = 0;
    private int otherSize = 0;
    private int wifiSize = 0;
    private int referenceSize = 0;
    private int theCounterC = 2;
    private int theCounterR = 2;
    private int theCounterS = 2;
    private int theCounterSw = 2;
    private int theCounterO = 2;
    private int theCounterW = 2;
    private int theCounterRef = 2;
    private final String computerShoot = "";
    private final String routerShoot = "";
    private final String otherShoot = "";
    private final String switchShoot = "";
    private final String serverShoot = "";
    private final String pcString = "";
    private final String routerString = "";
    private String userLevel = "";
    private final String hlp = " Help Desk";
    private final String tech = " Tech Support";
    private final String admin = " Administration Support";
    private final String ven = " Vendor Support";
    private String stringEnter = "";
    private String text = "";  
    private File source;
    private File dest;
    private final ArrayList<String> listRef = new ArrayList<String> ();
    private final ArrayList<String> listpc = new ArrayList<String> ();
    private final ArrayList<String> listR = new ArrayList<> ();
    private final ArrayList<String> listSw = new ArrayList<> ();
    private final ArrayList<String> listS = new ArrayList<> ();
    private final ArrayList<String> listO = new ArrayList<> ();
    private final ArrayList<String> listW = new ArrayList<> ();
    private final ArrayList<String> levelRef = new ArrayList<String> ();

    private final List<String> levelSw = new ArrayList<>(Arrays.asList("Help Desk", "IT Support", "It Support", "Admin and Up Support"));
    private final List<String> levelS = new ArrayList<>(Arrays.asList("Help Desk", "IT Support", "It Support", "Admin and Up Support"));
    private final List<String> levelO = new ArrayList<>(Arrays.asList("Help Desk", "IT Support", "It Support", "Admin and Up Support"));
    private final List<String> levelW = new ArrayList<>(Arrays.asList("Help Desk", "IT Support", "It Support", "Admin and Up Support"));    
    private final List<String> levelpc = new ArrayList<>(Arrays.asList("Help Desk", "IT Support", "It Support", "Admin and Up Support"));
    private final List<String> levelR = new ArrayList<>(Arrays.asList("Help Desk", "IT Support", "It Support", "Admin and Up Support"));
    
    private final Font font = new Font("Courier", Font.BOLD,14);
    //private FileInputStream instream = null;
   // private FileOutputStream outstream = null;
    public troubleshootUI() {
       initComponents();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        textArea = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        question = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        rulesTab = new javax.swing.JToolBar();
        Rules = new javax.swing.JButton();
        Switch = new javax.swing.JButton();
        Wifi = new javax.swing.JButton();
        Wired = new javax.swing.JButton();
        Router = new javax.swing.JButton();
        Server = new javax.swing.JButton();
        Other = new javax.swing.JButton();
        Training = new javax.swing.JButton();
        References = new javax.swing.JButton();
        help = new javax.swing.JButton();
        levelUp = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        addedLevel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Noteworthy", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/troubleshoot/netWorkPic.png"))); // NOI18N

        exitButton.setForeground(new java.awt.Color(0, 51, 204));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonButton(evt);
            }
        });

        addButton.setForeground(new java.awt.Color(0, 51, 255));
        addButton.setLabel("Add ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonButton(evt);
            }
        });

        textArea1.setEditable(false);
        textArea1.setColumns(20);
        textArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textArea1.setRows(5);
        textArea1.setText("Rules:\n\nHow many people will be effected by change?\n\nWill data be effected?\n\nWho needs to be involved?\n\nDoes management need to be involved?\n\nDoes other members of the team need to be involved?\n\nDoes vendor(s) need to be involved?\n\nIs it software or hardware?\n\nWhat procedure do I need to do?\n\n");
        textArea1.setLineWrap(true);
        textArea.setViewportView(textArea1);
        textArea1.setWrapStyleWord(true);

        question.setBackground(new java.awt.Color(0, 0, 0));
        question.setFont(new java.awt.Font("Monospaced", 2, 14)); // NOI18N
        question.setForeground(new java.awt.Color(255, 255, 255));
        question.setOpaque(true);

        saveButton.setForeground(new java.awt.Color(0, 51, 255));
        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonButton(evt);
            }
        });

        resetButton.setForeground(new java.awt.Color(0, 51, 204));
        resetButton.setText("Reset ");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButton(evt);
            }
        });

        yesButton.setForeground(new java.awt.Color(0, 51, 204));
        yesButton.setText("Yes");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButton(evt);
            }
        });

        noButton.setForeground(new java.awt.Color(0, 51, 204));
        noButton.setText("No");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButton(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        rulesTab.setBackground(new java.awt.Color(153, 153, 153));
        rulesTab.setFloatable(false);
        rulesTab.setRollover(true);
        rulesTab.setFont(new java.awt.Font("Luminari", 3, 13)); // NOI18N

        Rules.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        Rules.setText("Rules");
        buttonGroup1.add(Rules);
        Rules.setMaximumSize(new java.awt.Dimension(97, 19));
        Rules.setMinimumSize(new java.awt.Dimension(97, 19));
        Rules.setPreferredSize(new java.awt.Dimension(97, 19));
        Rules.setSelected(true);
        Rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RulesActionPerformed(evt);
            }
        });
        rulesTab.add(Rules);
        Rules.getAccessibleContext().setAccessibleName("rulesTab");

        Switch.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        buttonGroup1.add(Switch);
        Switch.setLabel("Switch");
        Switch.setMaximumSize(new java.awt.Dimension(97, 19));
        Switch.setMinimumSize(new java.awt.Dimension(97, 19));
        Switch.setPreferredSize(new java.awt.Dimension(97, 19));
        Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwitchActionPerformed(evt);
            }
        });
        rulesTab.add(Switch);
        Switch.getAccessibleContext().setAccessibleName("switchTab");

        Wifi.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        Wifi.setText("Wifi Computer");
        buttonGroup1.add(Wifi);
        Wifi.setMaximumSize(new java.awt.Dimension(97, 19));
        Wifi.setMinimumSize(new java.awt.Dimension(97, 19));
        Wifi.setPreferredSize(new java.awt.Dimension(97, 19));
        Wifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WifiActionPerformed(evt);
            }
        });
        rulesTab.add(Wifi);
        Wifi.getAccessibleContext().setAccessibleName("wifiTab");

        Wired.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        buttonGroup1.add(Wired);
        Wired.setLabel("Wired Computer");
        Wired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WiredActionPerformed(evt);
            }
        });
        rulesTab.add(Wired);
        Wired.getAccessibleContext().setAccessibleName("wiredTab");

        Router.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        Router.setText("Router");
        buttonGroup1.add(Router);
        Router.setMaximumSize(new java.awt.Dimension(97, 19));
        Router.setMinimumSize(new java.awt.Dimension(97, 19));
        Router.setPreferredSize(new java.awt.Dimension(97, 19));
        Router.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouterActionPerformed(evt);
            }
        });
        rulesTab.add(Router);
        Router.getAccessibleContext().setAccessibleName("routerTab");

        Server.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        Server.setText("Server");
        buttonGroup1.add(Server);
        Server.setMaximumSize(new java.awt.Dimension(97, 19));
        Server.setMinimumSize(new java.awt.Dimension(97, 19));
        Server.setPreferredSize(new java.awt.Dimension(97, 19));
        Server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerActionPerformed(evt);
            }
        });
        rulesTab.add(Server);
        Server.getAccessibleContext().setAccessibleName("serverTab");

        Other.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        buttonGroup2.add(Other);
        Other.setFocusCycleRoot(true);
        Other.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Other.setLabel("Other");
        Other.setMaximumSize(new java.awt.Dimension(97, 19));
        Other.setMinimumSize(new java.awt.Dimension(97, 19));
        Other.setPreferredSize(new java.awt.Dimension(97, 19));
        Other.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherActionPerformed(evt);
            }
        });
        rulesTab.add(Other);
        Other.getAccessibleContext().setAccessibleName("otherTab");

        Training.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        Training.setText("Training");
        buttonGroup1.add(Training);
        Training.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Training.setMaximumSize(new java.awt.Dimension(97, 19));
        Training.setMinimumSize(new java.awt.Dimension(97, 19));
        Training.setName(""); // NOI18N
        Training.setOpaque(true);
        Training.setPreferredSize(new java.awt.Dimension(97, 19));
        Training.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Training.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainingActionPerformed(evt);
            }
        });
        rulesTab.add(Training);
        Training.getAccessibleContext().setAccessibleName("trainingTab");

        References.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        References.setText("References");
        buttonGroup1.add(References);
        References.setMaximumSize(new java.awt.Dimension(97, 19));
        References.setMinimumSize(new java.awt.Dimension(97, 19));
        References.setPreferredSize(new java.awt.Dimension(97, 19));
        References.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReferencesActionPerformed(evt);
            }
        });
        rulesTab.add(References);
        References.getAccessibleContext().setAccessibleName("refTab");

        help.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        help.setText("Help");
        buttonGroup1.add(help);
        help.setFocusable(false);
        help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        help.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        rulesTab.add(help);

        levelUp.setBackground(new java.awt.Color(0, 0, 0));
        levelUp.setFont(new java.awt.Font("Monospaced", 2, 12)); // NOI18N
        levelUp.setForeground(new java.awt.Color(255, 255, 255));
        levelUp.setOpaque(true);

        jButton10.setForeground(new java.awt.Color(0, 0, 255));
        jButton10.setText("Command");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        addedLevel.setEditable(false);
        addedLevel.setBackground(new java.awt.Color(204, 204, 204));
        addedLevel.setEnabled(false);
        addedLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addedLevelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(yesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(levelUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textArea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(question, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rulesTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addedLevel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(levelUp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton)
                    .addComponent(yesButton)
                    .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton)
                    .addComponent(jButton10)
                    .addComponent(exitButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addedLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rulesTab, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jButton10.getAccessibleContext().setAccessibleName("cmdPrompt");

        pack();
    }// </editor-fold>//GEN-END:initComponents

/*This will be used to get the Command Prompt or Terminal*/    
    private void getProgram(String programName)
    {
        Runtime runtime = Runtime.getRuntime();     
        try
        {
            runtime.exec(programName);        
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }// End of Get Program
    private void exitButtonButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonButton
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonButton
// Add Button
    private void addButtonButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonButton

        add = true;
        reset = false;
        save = false;
       
        
       if(rule || train)
       {
          question.setText(" Can not edit this section! ");
          this.add = false;
       }
       else
       {
            textArea1.setText(" ");
            this.add = true;
            question.setText(" Are you sure you want to add to file? ");
       }    
    }//GEN-LAST:event_addButtonButton
// Save Button
    private void saveButtonButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonButton

        addButton.setEnabled(false);
        resetButton.setEnabled(false);
        saveButton.setEnabled(false);
        exitButton.setEnabled(true);
        question.setText(" Are you ready to save?");
        stringEnter = textArea1.getText();
        userLevel = addedLevel.getText();
        save = true;
        add = false;
        reset = false;

        
// TODO add your handling code here:
    }//GEN-LAST:event_saveButtonButton
// yes button not done
    private void yesButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButton
// if user fines what they are looking for
        no = false;
        if(!add && !train && !rule && !save && !reset && !references)
            question.setText(" Glad to be helpful.");  
/***********This is when the user is adding something***/   
        if(add)
        {
// This allows user to type in textArea
        addButton.setEnabled(false);
        resetButton.setEnabled(false);
        saveButton.setEnabled(true);
        addedLevel.setEnabled(true);
        textArea1.setEditable(true);
        addedLevel.setEditable(true);
        addedLevel.setBackground(new java.awt.Color(255,255,255));
    /***********************Reads in wired Computer information*******************/    
            if(computer)
               {
                    readIn("Computer.txt");
                    if(theCounterC <= computerSize)
                        theCounterC++;

                    else
                        theCounterC = computerSize;
               } // ends computer if
    /***********************Reads in Wifi information*******************/    
            if(wifi)
            {
                readIn("wifi.txt");
                if(theCounterW<= wifiSize)
                    theCounterW++;

                else
                    theCounterW = wifiSize;
            }
    /***********************Reads in Router information*******************/  
            if(router)
               {   
                    readIn("router.txt");
                    if(theCounterR <= routerSize)
                        theCounterR++;

                    else
                        theCounterR = routerSize;
               }
    /***********************Reads in Switch information*******************/  
               if(switchs)
               {
                    readIn("switch.txt");
                                
                    if(theCounterSw <= switchSize)
                        theCounterSw++;

                    else
                        theCounterSw = switchSize;
               }
    /***********************Reads in Server information*******************/  
           if(server)
               {
                    readIn("server.txt");
                    if(theCounterS <= serverSize)
                        theCounterS++;

                    else
                        theCounterS = serverSize;
               }
    /***********************Reads in Other information*******************/  
           if(other)
               {
                    readIn("other.txt");
                    if(theCounterO <= otherSize)
                        theCounterO++;

                    else
                        theCounterO = otherSize;
               }
    /***********************Reads in References information*******************/  
           if(references)
               {
                    readIn("references.txt");
                    if(theCounterRef <= referenceSize)
                        theCounterRef++;

                    else
                        theCounterRef = referenceSize;
               }

/************************Tells user what to do to ***************************/
         String input;
            
            input = " Type in the area below to add dont hit enter unless adding more than one step." ;
            input = input + "In box above add the level Help desk, IT, Admin and Up for level.";
            question.setFont(new java.awt.Font("Monospaced", 2, 10));
            question.setText(input);
         }
/***********************End of the adding section*/ 
/*************************If users is saving file************************/        
         if(save)
         {
/*************************Resting textArea to not editable question to nothing and save to be disabled**/
             question.setText("");
 /************************* fines which section is to be save at *************/                   
             if(switchs)
                saveSwitch = true;
             if(other)
                saveOther = true;
             if(wifi)
                saveWifi = true;
             if(router)
                saveRouter = true;
             if(server)
                saveServer = true;
             if(computer)
                saveWired = true;
/************************This calls add to file which adds the text to the file*****/

                try
                {
                    addToFile();
                } 
                catch (IOException ex)
                {
                    Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
                }
             
         }// ends save
/**************************This calls reset if user wants to set back to default settings ****/

        if(reset)
        {
            try {
                Reset();
            } catch (IOException ex) {
                Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        } // reset

        if(save)
        {
            addButton.setEnabled(true);
            saveButton.setEnabled(false);
            resetButton.setEnabled(true);
            exitButton.setEnabled(true);
        }
        if(reset)
        {
            if(switchs)
                readIn("switch.txt");
            if(wifi)
                readIn("wifi.txt");
            if(other)
                readIn("other.txt");
            if(computer)
                readIn("computer.txt");
            if(references)
                readIn("references.txt");
            if(router)
                readIn("router.txt");
            if(server)
                readIn("server.txt");            
            addButton.setEnabled(true);
            saveButton.setEnabled(false);
            resetButton.setEnabled(true);
            exitButton.setEnabled(true);
        }
    }//GEN-LAST:event_yesButton
//No button
    private void noButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButton
    // Variables ==================================
        no = true;   
        autoDisplay = false;  
    if(reset)
    {
        addButton.setEnabled(true);
        saveButton.setEnabled(false);
        resetButton.setEnabled(true);
        reset = false;
    }
/***********************Computer*******************/    
    if(computer && !computerEnd)
       {
           readIn("Computer.txt");
            if(theCounterC <= computerSize)
                theCounterC++;
            else
                theCounterC = computerSize;
            levelNumComputer++;
            readIn("Computer.txt");
       }
/***********************Computer*******************/    
    if(wifi && !wifiEnd)
       {
            readIn("wifi.txt");
            if(theCounterW <= wifiSize)
                theCounterW++;
            else
                theCounterW = wifiSize;
            levelNumWifi++;
            readIn("wifi.txt");
       }
/***********************Router*******************/  
    if(router && !routerEnd)
       {   
           readIn("router.txt");
            if(theCounterR <= routerSize)
                theCounterR++;
            else
                theCounterR = routerSize;
            levelNumRouter++;
            readIn("router.txt");
       }
/***********************Switch*******************/  
       if(switchs && !switchsEnd)
       {
            readIn("switch.txt");
            if(theCounterSw <= switchSize)
                theCounterSw++;
            else
                theCounterSw = switchSize;
            levelNumSwitch++;
            readIn("switch.txt");
       }
/***********************Server*******************/  
    if(server && !serverEnd)
       {
           readIn("server.txt");
            if(theCounterS <= serverSize)
                theCounterS++;
            else
                theCounterS = serverSize;
            levelNumServer++;
            readIn("server.txt");
       }
/***********************Other*******************/  
    else if(other && !otherEnd)
       {
           readIn("other.txt");
            if(theCounterO <= otherSize)
                theCounterO++;
            else
                theCounterO = otherSize;
            levelNumOther++;
            readIn("other.txt");
       }

    }//GEN-LAST:event_noButton
// Reset button not finished yet
    private void resetButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButton
        addButton.setEnabled(false);
        resetButton.setEnabled(false);
        saveButton.setEnabled(false);
        reset = true;     
        save = false;
        add = false;
        if(switchs)
            question.setText(" Are you sure you want to reset switch section back to default? ");
        if(wifi)
            question.setText(" Are you sure you want to reset wifi section back to default? ");
        if(computer)
            question.setText(" Are you sure you want to reset wired computer section back to default? ");
        if(other)
            question.setText(" Are you sure you want to reset other section back to default? ");
        if(router)
            question.setText(" Are you sure you want to reset router section back to default? ");
        if(server)
            question.setText(" Are you sure you want to reset server section back to default? ");
    }//GEN-LAST:event_resetButton
//Switch Button
    private void SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwitchActionPerformed
        this.rule = false;
        this.switchs = true;
        this.router = false;
        this.server = false;
        this.other = false;
        this.computer = false;
        this.wifi = false;
        this.train = false;
        this.references = false;
        readIn("switch.txt"); // TODO add your handling code here:
    }//GEN-LAST:event_SwitchActionPerformed
// Rule Button
    private void RulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RulesActionPerformed
       this.rule = true;
       this.switchs = false;
       this.router = false;
       this.server = false;
       this.other = false;
       this.computer = false;
       this.wifi = false;
       this.train = false;
       this.references = false;
       //RulesActionPerformed.setBackground(Color.BLUE);
       question.setText("");
       levelUp.setText("");
       textArea1.setText("");
       textArea1.setText("\nRules:\n" 
                         + "\nHow many people will be effected by change?\n"
                         + "\nWill data be effected?\n"
                         + "\nWho needs to be involved?\n"
                         + "\nDoes management need to be involved?\n"
                         + "\nDoes other members of the team need to be involved?\n"
                         + "\nDoes vendor(s) need to be involved?\n"
                         + "\nIs it software or hardware?\n" 
                         + "\nWhat procedure do I need to do?");        // TODO add your handling code here:
    }//GEN-LAST:event_RulesActionPerformed
// Other Button
    private void OtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherActionPerformed
       this.rule = false;
       this.switchs = false;
       this.router = false;
       this.server = false;
       this.other = true;
       this.computer = false;
       this.wifi = false;
       this.train = false;
       this.references = false;
       readIn("other.txt");        // TODO add your handling code here:
    }//GEN-LAST:event_OtherActionPerformed
//Wifi Button
    private void WifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WifiActionPerformed
       this.rule = false;
       this.switchs = false;
       this.router = false;
       this.server = false;
       this.other = false;
       this.wifi = true;
       this.computer = false;
       this.train = false;
       this.references = false;
       readIn("wifi.txt");         // TODO add your handling code here:
    }//GEN-LAST:event_WifiActionPerformed
// Wired Button
    private void WiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WiredActionPerformed
    //Variables      
       this.rule = false;
       this.switchs = false;
       this.router = false;
       this.server = false;
       this.other = false;
       this.wifi = false;
       this.computer = true;
       this.train = false;
       this.add = false;
       this.references = false;
       readIn("Computer.txt");           // TODO add your handling code here:
    }//GEN-LAST:event_WiredActionPerformed
// Router button
    private void RouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouterActionPerformed
       this.rule = false;
       this.switchs = false;
       this.router = true;
       this.server = false;
       this.other = false;
       this.computer = false; 
       this.wifi = false;
       this.train = false;
       this.references = false;
       readIn("router.txt");        // TODO add your handling code here:
    }//GEN-LAST:event_RouterActionPerformed
// server
    private void ServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServerActionPerformed
       this.rule = false;
       this.switchs = false;
       this.router = false;
       this.server = true;
       this.other = false;
       this.computer = false;
       this.wifi = false;
       this.train = false;
      readIn("server.txt");        // TODO add your handling code here:
    }//GEN-LAST:event_ServerActionPerformed
// traing Button
    private void TrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainingActionPerformed
       this.rule = false;
       this.switchs = false;
       this.router = false;
       this.server = false;
       this.other = false;
       this.computer = false;
       this.wifi = false;
       this.train = true;
       this.references = false;
        question.setText(" ");
        textArea1.setText("\nTraining Process:\n" 
                         + "\nRead and take a quiz on confidentiality.\n"
                         + "\nBe introduced to the fellow workers if you haven't already met.\n"
                         + "\nUnderstanding of the working enviroment, such as proper outfit.\n"
                         + "\nSitting in on a weekly conference call.\n"
                         + "\nLearn the proper protocol that needs to be done before doing major changes.\n"
                         + "\nLearn how to fill out the paper that is needed.\n"
                         + "\nLearning the software that is being used: Orion, Prime, and Putty.\n"
                         + "\nCreate a small network in lab to show your understand of how a network works with WLAN.\n"
                         + "\nIncrease knowledge of other parts of IT that you might not normal have to do.\n"
                         + "\nLearn the steps to do an audit on servers.\n" 
                         + "\nBeing able to resolve application issues.\n"
                         + "\n");        // TODO add your handling code here:
    }//GEN-LAST:event_TrainingActionPerformed
// References Button
    private void ReferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReferencesActionPerformed
        this.rule = false;
        this.switchs = false;
        this.router = false;
        this.server = false;
        this.other = false;
        this.computer = false;
        this.wifi = false;
        this.train = false;
        this.references = true;
        question.setText("");
        levelUp.setText("");
        readIn("references.txt");
        
    }//GEN-LAST:event_ReferencesActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

            // TODO Auto-generated catch block
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
       this.rule = true;
       this.switchs = false;
       this.router = false;
       this.server = false;
       this.other = false;
       this.computer = false;
       this.wifi = false;
       this.train = false;
       this.references = false;
       levelUp.setText("");
       question.setText(" ");
       

    }//GEN-LAST:event_helpActionPerformed

    private void addedLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addedLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addedLevelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new troubleshootUI().setVisible(true);
                
            }
        });
    }
 // This Section reads in whatever file that the user is looking at 
    private void readIn(String filename)
    {
/**************Variables ****************/

       textArea1.setText("");    
       String input = "";
       String textFieldReadable = "";
       String tfr = "";
       computerSize = 0;
       routerSize = 0;
       serverSize = 0;
       otherSize = 0;
       switchSize = 0;
       wifiSize = 0;
       referenceSize = 0;
       listSw.clear();
       listW.clear();
       listO.clear();
       listR.clear();
       listRef.clear();
       listS.clear();
       listpc.clear();
      // if(switchs)
           // levelUp.setText(levelSw.get(levelNumSwitch));

/***************Try to catch the file trying to open**************/
       try {
            FileReader fileReader = new FileReader(new File(filename).getAbsolutePath());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            textFieldReadable = bufferedReader.readLine();
            while (textFieldReadable != null){
                textFieldReadable = bufferedReader.readLine();
                
                if(!(textFieldReadable == (null)))
                {  
/****************************Puts file in the proper list...******************/
                    tfr = textFieldReadable;
                    if(computer)
                        listpc.add(tfr); 
                    if(router)
                        listR.add(tfr);
                    if(server)
                        listS.add(tfr);
                    if(switchs)
                    {
                        listSw.add(tfr);
                    }
                    if(other)
                        listO.add(tfr);
                    if(wifi)
                        listW.add(tfr);
                    if(references)
                        listRef.add(tfr);
                }
                
/***********************Gets how big the file is...*************************/
                if(computer)
                    computerSize++;
                if(router)
                    routerSize++;
                if(server)
                    serverSize++;
                if(switchs)
                    switchSize++;
                if(other)
                    otherSize++;
                if(wifi)
                    wifiSize++;
                if(references)
                    referenceSize++;
                
            }// ends while
            
        }// ends try
      
        catch (FileNotFoundException ex) {
             System.out.println("no such file exists");
             textArea1.setText("no such file exists");
        } // ends catch 
        catch (IOException ex) {
            System.out.println("unkownerror");
        } // ends catch

       if(!add)
       {
         printOut();
       }

       
    }//ends ReadIn
 
    
    /******************************This adds new data to files*/
    private void addToFile() throws IOException
    {   
      String temp = "";
       int sizeOf = 0;
      String nameOfFile = "";
      /********* This puts data into variables depending on which Section the users is in.***/
            if(computer)
            {
                sizeOf = computerSize - 1;
                nameOfFile = "Computer.txt";
            }
            if(switchs)
            {
                sizeOf = switchSize - 1;
                nameOfFile = "switch.txt";
            }
             if(wifi)
            {
                sizeOf = wifiSize - 1;
                nameOfFile = "wifi.txt";
            }
            if(router)
            {
                sizeOf = routerSize - 1;
                nameOfFile = "router.txt";
            }
            if(server)
            {
                sizeOf = serverSize - 1;
                nameOfFile = "server.txt";
            }
             if(other)
            {
                sizeOf = otherSize - 1;
                nameOfFile = "other.txt";
            }
            if(references)
            {
                sizeOf = referenceSize - 1;
                nameOfFile = "references.txt";
            }

/**********************This writes to that file**********************/
            FileWriter writer = new FileWriter(nameOfFile); 
            for(int j = 0; j < sizeOf; j ++)
            {
                    if( j < sizeOf)
                    {
/***********************This puts the data into the right file.******/
                        if(computer)
                            temp = listpc.get(j);
                        if(switchs)
                            temp = listSw.get(j);
                        if(wifi)
                            temp = listW.get(j);
                        if(router)
                            temp = listR.get(j);
                        if(other)
                            temp = listO.get(j);
                        if(server)
                            temp = listS.get(j);
                        if(references)
                            temp = listRef.get(j);
                         writer.write("\n" + temp);
                    }
            }
           
            writer.write("\n" + stringEnter);      
            writer.close();
/**********************This clears only the list that is being read in by the text.***/
            if (computer)
            {
                listpc.clear();
                readIn("Computer.txt");
            }
            if (switchs)
            {
                listSw.clear();
                readIn("switch.txt");
            }
             if (wifi)
            {
                listW.clear();
                readIn("wifi.txt");
            }
            if (server)
            {
                listS.clear();
                readIn("server.txt");
            }   
            if (router)
            {
                listR.clear();
                readIn("router.txt");
            }
            if (other)
            {
                listO.clear();
                readIn("other.txt");
            }
              if (references)
            {
                listRef.clear();
                readIn("references.txt");
            }    
 
        stringEnter = "";
    }
 /********************************Prints to text area**********/
    private void printOut()
    {     
/******************Variables*************************************/
        //int size = 0; 
        boolean noMore = false;
        int printCount = 0;
        int listSize = 0;
        String tempData = "";
        boolean saving = false;
        text = "";
        if(switchs)
        {
            listSize = listSw.size();
            saving = saveSwitch;
            printCount = theCounterSw; 
 System.out.println("i");
        }
        if(computer)
        {
            listSize = listpc.size();
            saving = saveWired;
            printCount = theCounterC; 
        }
        if(wifi)
        {
            listSize = listW.size();
            saving = saveWifi;
            printCount = theCounterW; 
        }
        if(router)
        {
            listSize = listR.size();
            saving = saveRouter;
            printCount = theCounterR; 
        }
        if(other)
        {
            listSize = listO.size();
            saving = saveOther;
            printCount = theCounterO; 
        }
        if(server)
        {
            listSize = listS.size();
            saving = saveServer;
            printCount = theCounterS; 
        }
        if(references)
        {
            listSize = listS.size();
            saving = saveServer;
            printCount = theCounterRef; 
        }
        if(printCount == listSize)
            {
                printCount--;
                noMore = true;
            }// ends if
               
                for(int i = 0; i < listSize; i ++)
                {
                    if(printCount > i)    
                    {
/*******************************This puts what is in the list into a temp***/             
                        if(computer)
                            tempData = listpc.get(i);
                        if(switchs)
                            tempData = listSw.get(i);
                        if(wifi)
                            tempData = listW.get(i);
                        if(other)
                            tempData = listO.get(i);
                        if(server)
                            tempData = listS.get(i);
                        if(router)
                            tempData = listR.get(i);
                        if(references)
                            tempData = listRef.get(i);
                        if(i < 1)
                            text = text + "\n" + tempData + "\n";  
                        else
                            text = text + "\n" + (i) +") " + tempData + "\n"; 

                      if(!saving)  
                       {
                          if(printCount > i)
                              question.setText(" Did Step " + (i) + " work?");

                          if(noMore)
                          {
                              question.setText(" I used all my resources.");
                              if(computer)
                                    computerEnd = true;
                              if(wifi)
                                    wifiEnd = true;
                              if(switchs)
                                    switchsEnd = true;
                              if(router)
                                    routerEnd = true;
                              if(server)
                                    serverEnd = true;
                              if(other)
                                    otherEnd = true;
                              //if(references)
                                 //   referencesEnd = true;
                          }// ends if
                       }   // ends if

                      if(saving)
                      {
                         if(save)
                            question.setText(" Your file was saved!");
                         else
                             question.setText(" All resources used up!");
                       
                      }   
                   }
                   
                textArea1.setText(text);
                }// ends for loop 
     
//************************displays which level should be involved****************************/ 
        if(switchs && levelNumSwitch < levelSw.size())
            levelUp.setText(levelSw.get(levelNumSwitch));
        if(other && levelNumOther < levelO.size())
            levelUp.setText(levelO.get(levelNumOther));
        if(router && levelNumRouter < levelR.size())
            levelUp.setText(levelR.get(levelNumRouter));
        if(server && levelNumServer < levelS.size())
            levelUp.setText(levelO.get(levelNumOther));
        if(wifi && levelNumWifi < levelW.size())
            levelUp.setText(levelW.get(levelNumWifi));
        if(computer && levelNumComputer < levelpc.size())
            levelUp.setText(levelpc.get(levelNumComputer));
        textArea1.setText(text);
    }
    /*This is the Reset Section that puts everything back to default */
    private void Reset() throws FileNotFoundException, IOException
    {
        FileInputStream instream = null;
        FileOutputStream outstream = null;
        String inFileName = "";
        String outFileName="";
System.out.println("reset1367");
        if(computer)
        {
            outFileName = "computer.txt";
            inFileName = "defaultComputer.txt";
        }
        if(wifi)
        {
            outFileName = "wifi.txt";
            inFileName = "defaultWifi.txt";
        }
        if(switchs)
        {
            outFileName = "switch.txt";
            inFileName = "defaultSwitch.txt";
        }
        if(router)
        {
            outFileName = "router.txt";
            inFileName = "defaultRouter.txt";
        }
        if(server)
        {
            outFileName = "server.txt";
            inFileName = "defaultServer.txt";
        }
        if(other)
        {
            outFileName = "other.txt";
            inFileName = "defaultOther.txt";
        }
        if(references)
        {
            outFileName = "references.txt";
            inFileName = "defaultReferences.txt";
        }

                    try{
   
                        File infile = new File(inFileName);
                        File outFile = new File(outFileName);

                        instream = new FileInputStream(infile);
                        outstream = new FileOutputStream(outFile);

                        byte [] buffer = new byte [1024];
                        int length;

                        while( (length = instream.read(buffer)) > 0) {
                            outstream.write(buffer, 0, length);

                        }
                        instream.close();
                        outstream.close();             
                    } // ends try
                    catch(IOException ioe)
                    {
                        
                    }// ends catch

/***********This Section calls readIn to redisplay sections*******/
        if(switchs)
        {
            readIn("switch.txt");
        }// ends if
        if(other)
        {
            readIn("other.txt");
        }// ends if
        if(computer)
        {
            readIn("computer.txt");
        }// ends if
        if(wifi)
        {
            readIn("wifi.txt");
        }// ends if
        if(server)
        {
            readIn("server.txt");
        }// ends if
        if(references)
        {
            readIn("references.txt");
        }// ends if
        if(router)
        {
            readIn("router.txt");
        }// ends if
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Other;
    private javax.swing.JButton References;
    private javax.swing.JButton Router;
    private javax.swing.JButton Rules;
    private javax.swing.JButton Server;
    private javax.swing.JButton Switch;
    private javax.swing.JButton Training;
    private javax.swing.JButton Wifi;
    private javax.swing.JButton Wired;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addedLevel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton help;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel levelUp;
    private javax.swing.JButton noButton;
    private javax.swing.JLabel question;
    private javax.swing.JButton resetButton;
    private javax.swing.JToolBar rulesTab;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane textArea;
    private javax.swing.JTextArea textArea1;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
