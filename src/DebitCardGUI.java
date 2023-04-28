import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DebitCardGUI extends JFrame{

    BankGUI bankGUI=new BankGUI();

    private JTextField debitCardCardId;
    private JTextField debitCardIssuerBank;
    private JTextField debitCardClientName;
    private JTextField debitCardBankAccount;
    private JTextField debitCardPin;
    private JTextField debitCardBalanceAmount;

    public DebitCardGUI(){
        JFrame debitCardFrame=new JFrame();
        debitCardFrame.setTitle("Add Debit Card");
        debitCardFrame.setSize(700,700);
        debitCardFrame.setVisible(true);
        debitCardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        debitCardFrame.setLayout(new GridBagLayout());

        GridBagConstraints debitCardConstraints=new GridBagConstraints();

        JPanel debitCardUpperPanel=new JPanel();
        debitCardUpperPanel.setLayout(new GridBagLayout());

        JPanel debitCardLowerPanel=new JPanel();
        debitCardLowerPanel.setLayout(new GridBagLayout());
        debitCardLowerPanel.setBackground(Color.LIGHT_GRAY);

        JLabel debitCardBankNameLabel=new JLabel("XYZ Bank Limited");
        debitCardBankNameLabel.setFont(new Font("Serif",Font.BOLD,70));
        debitCardBankNameLabel.setOpaque(true);

        JLabel debitCardLabel=new JLabel("Add Debit Card");
        debitCardLabel.setFont(new Font("Serif",Font.BOLD,50));


        JLabel debitCardIssuerBankLabel=new JLabel("Issuer Bank");
        debitCardIssuerBankLabel.setFont(new Font("Serif",Font.BOLD,30));


        JLabel debitCardClientNameLabel=new JLabel("Client Name");
        debitCardClientNameLabel.setFont(new Font("Serif",Font.BOLD,30));


        JLabel debitCardCardIdLabel=new JLabel("Card ID");
        debitCardCardIdLabel.setFont(new Font("Serif",Font.BOLD,30));


        JLabel debitCardCardBankAccountLabel=new JLabel("Bank Account");
        debitCardCardBankAccountLabel.setFont(new Font("Serif",Font.BOLD,30));


        JLabel debitCardCardPinLabel=new JLabel("Pin");
        debitCardCardPinLabel.setFont(new Font("Serif",Font.BOLD,30));


        JLabel debitCardCardBalanceAmountLabel=new JLabel("Balance Amount");
        debitCardCardBalanceAmountLabel.setFont(new Font("Serif",Font.BOLD,30));


        JTextField debitCardIssuerBankTextField=new JTextField(20);
        debitCardIssuerBankTextField.setPreferredSize(new Dimension(0,30));

        JTextField debitCardClientNameTextField=new JTextField(20);
        debitCardClientNameTextField.setPreferredSize(new Dimension(0,30));

        JTextField debitCardCardIdTextField=new JTextField(20);
        debitCardCardIdTextField.setPreferredSize(new Dimension(0,30));

        JTextField debitCardBankAccountTextField=new JTextField(20);
        debitCardBankAccountTextField.setPreferredSize(new Dimension(0,30));

        JTextField debitCardPinTextField=new JTextField(20);
        debitCardPinTextField.setPreferredSize(new Dimension(0,30));

        JTextField debitCardBalanceAmountTextField=new JTextField(20);
        debitCardBalanceAmountTextField.setPreferredSize(new Dimension(0,30));

        JButton debitCardCardSubmitButton=new JButton("Submit");
//                debitCardCardSubmitButton.setFont(new Font("Serif",Font.BOLD,20));
        debitCardCardSubmitButton.setPreferredSize(new Dimension(100,40));

        JButton debitCardCardDisplayButton=new JButton("Display");
//                debitCardCardDisplayButton.setFont(new Font("Serif",Font.BOLD,20));
        debitCardCardDisplayButton.setPreferredSize(new Dimension(100,40));

        JButton debitCardCardClearButton=new JButton("Clear");
//                debitCardCardClearButton.setFont(new Font("Serif",Font.BOLD,20));
        debitCardCardClearButton.setPreferredSize(new Dimension(100,40));

        debitCardConstraints.gridx=0;
        debitCardConstraints.gridy=0;
        debitCardUpperPanel.add(debitCardBankNameLabel,debitCardConstraints);

        debitCardConstraints.gridx=0;
        debitCardConstraints.gridy=0;
        debitCardConstraints.insets=new Insets(0,0,20,0);
        debitCardLowerPanel.add(debitCardLabel,debitCardConstraints);

        debitCardConstraints.gridx=0;
        debitCardConstraints.gridy=1;
        debitCardLowerPanel.add(debitCardIssuerBankLabel,debitCardConstraints);

        debitCardConstraints.gridx=0;
        debitCardConstraints.gridy=2;
        debitCardLowerPanel.add(debitCardClientNameLabel,debitCardConstraints);

        debitCardConstraints.gridx=0;
        debitCardConstraints.gridy=3;
        debitCardLowerPanel.add(debitCardCardIdLabel,debitCardConstraints);

        debitCardConstraints.gridx=0;
        debitCardConstraints.gridy=4;
        debitCardLowerPanel.add(debitCardCardBankAccountLabel,debitCardConstraints);

        debitCardConstraints.gridx=0;
        debitCardConstraints.gridy=5;
        debitCardLowerPanel.add(debitCardCardPinLabel,debitCardConstraints);

        debitCardConstraints.gridx=0;
        debitCardConstraints.gridy=6;
        debitCardLowerPanel.add(debitCardCardBalanceAmountLabel,debitCardConstraints);

        debitCardConstraints.gridx=1;
        debitCardConstraints.gridy=1;
        debitCardConstraints.gridwidth=2;
        debitCardLowerPanel.add(debitCardIssuerBankTextField,debitCardConstraints);

        debitCardConstraints.gridx=1;
        debitCardConstraints.gridy=2;
        debitCardConstraints.gridwidth=2;
        debitCardLowerPanel.add(debitCardClientNameTextField,debitCardConstraints);

        debitCardConstraints.gridx=1;
        debitCardConstraints.gridy=3;
        debitCardConstraints.gridwidth=2;
        debitCardLowerPanel.add(debitCardCardIdTextField,debitCardConstraints);

        debitCardConstraints.gridx=1;
        debitCardConstraints.gridy=4;
        debitCardConstraints.gridwidth=2;
        debitCardLowerPanel.add(debitCardBankAccountTextField,debitCardConstraints);

        debitCardConstraints.gridx=1;
        debitCardConstraints.gridy=5;
        debitCardConstraints.gridwidth=2;
        debitCardLowerPanel.add(debitCardPinTextField,debitCardConstraints);

        debitCardConstraints.gridx=1;
        debitCardConstraints.gridy=6;
        debitCardConstraints.gridwidth=2;
        debitCardLowerPanel.add(debitCardBalanceAmountTextField,debitCardConstraints);

        debitCardConstraints.gridx=1;
        debitCardConstraints.gridy=7;
        debitCardConstraints.gridwidth=1;
        debitCardConstraints.insets=new Insets(10,0,0,0);
        debitCardLowerPanel.add(debitCardCardSubmitButton,debitCardConstraints);

        debitCardConstraints.gridx=2;
        debitCardConstraints.gridy=7;
        debitCardConstraints.gridwidth=1;
        debitCardConstraints.insets=new Insets(10,0,0,0);
        debitCardLowerPanel.add(debitCardCardClearButton,debitCardConstraints);

        debitCardConstraints.gridx=1;
        debitCardConstraints.gridy=8;
        debitCardConstraints.gridwidth=2;
        debitCardConstraints.insets=new Insets(10,0,0,0);
        debitCardLowerPanel.add(debitCardCardDisplayButton,debitCardConstraints);

        debitCardConstraints.gridx=0;
        debitCardConstraints.gridy=0;
        debitCardConstraints.fill=GridBagConstraints.BOTH;
        debitCardConstraints.weightx=1;
        debitCardConstraints.weighty=1;
        debitCardFrame.add(debitCardUpperPanel,debitCardConstraints);

        debitCardConstraints.gridx=0;
        debitCardConstraints.gridy=1;
        debitCardConstraints.fill=GridBagConstraints.BOTH;
        debitCardConstraints.weightx=1;
        debitCardConstraints.weighty=200;
        debitCardFrame.add(debitCardLowerPanel,debitCardConstraints);

        debitCardCardSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String issuerBank = debitCardIssuerBankTextField.getText();
                String clientName=debitCardClientNameTextField.getText();
                int cardID=Integer.parseInt(debitCardCardIdTextField.getText());
                String bankAccount=debitCardBankAccountTextField.getText();
                int pin=Integer.parseInt(debitCardPinTextField.getText());
                int balanceAmount=Integer.parseInt(debitCardBalanceAmountTextField.getText());

                DebitCard debitCardData=new DebitCard(balanceAmount,cardID,bankAccount,issuerBank,clientName,pin);
                debitCardData.getWithdrawalAmount();
                bankGUI.addDebitCard(debitCardData);


//                String debitCardIssuerBank=debitCardIssuerBankTextField.getText();
//                String debitCardClientName=debitCardClientNameTextField.getText();
//                String debitCardCardId=debitCardCardIdTextField.getText();
//                String debitCardBankAccount=debitCardBankAccountTextField.getText();
//                int debitCardPin=Integer.parseInt(debitCardPinTextField.getText());
//                String debitCardBalanceAmount=debitCardBalanceAmountTextField.getText();

//                        DataClass debitCardData=new DataClass(debitCardIssuerBank,debitCardClientName,debitCardCardId,debitCardBankAccount,debitCardPin,debitCardBalanceAmount);
            }
        });

        debitCardCardClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                debitCardIssuerBankTextField.setText("");
                debitCardClientNameTextField.setText("");
                debitCardCardIdTextField.setText("");
                debitCardBankAccountTextField.setText("");
                debitCardPinTextField.setText("");
                debitCardBalanceAmountTextField.setText("");
            }
        });

        debitCardCardDisplayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new DebitCardData(bankGUI.getDebitCards());
            }
        });


    }
    }

