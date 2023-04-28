import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreditCardGUI extends JFrame {

    BankGUI bankGUI=new BankGUI();

    private JTextField creditCardIssuerBank;
    private JTextField creditCardClientName;
    private JTextField creditCardCardId;
    private JTextField creditCardBankAccount;
    private JTextField creditCardCvcNumber;
    private JTextField creditCardBalanceAmount;
    private JTextField creditCardInterestRate;

    public CreditCardGUI() {
        JFrame creditCardFrame = new JFrame();
        creditCardFrame.setSize(700, 700);
        creditCardFrame.setTitle("Add Credit Card");
        creditCardFrame.setVisible(true);
        creditCardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        creditCardFrame.setLayout(new GridBagLayout());

        JPanel creditCardUpperPanel = new JPanel();
        creditCardUpperPanel.setLayout(new GridBagLayout());

        JPanel creditCardLowerPanel = new JPanel();
        creditCardLowerPanel.setBackground(Color.LIGHT_GRAY);
        creditCardLowerPanel.setLayout(new GridBagLayout());

        JPanel creditCardExpirationDateComboBoxPanel = new JPanel();
        creditCardExpirationDateComboBoxPanel.setBackground(Color.LIGHT_GRAY);
        creditCardExpirationDateComboBoxPanel.setLayout(new GridBagLayout());

        GridBagConstraints creditCardConstraints = new GridBagConstraints();

        JLabel creditCardBankNameLabel = new JLabel("XYZ Bank Limited");
        creditCardBankNameLabel.setFont(new Font("Serif", Font.BOLD, 70));

        JLabel creditCardLabel = new JLabel("Add Credit Card");
        creditCardLabel.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel creditCardIssuerBankLabel = new JLabel("Issuer Bank");
        creditCardIssuerBankLabel.setFont(new Font("Serif", Font.BOLD, 30));

        JLabel creditCardClientNameLabel = new JLabel("Client Name");
        creditCardClientNameLabel.setFont(new Font("Serif", Font.BOLD, 30));

        JLabel creditCardCardIdLabel = new JLabel("Card ID");
        creditCardCardIdLabel.setFont(new Font("Serif", Font.BOLD, 30));

        JLabel creditCardBankAccountLabel = new JLabel("Bank Account");
        creditCardBankAccountLabel.setFont(new Font("Serif", Font.BOLD, 30));

        JLabel creditCardCvcNumberLabel = new JLabel("CVC Number");
        creditCardCvcNumberLabel.setFont(new Font("Serif", Font.BOLD, 30));

        JLabel creditCardBalanceAmountLabel = new JLabel("Balance Amount");
        creditCardBalanceAmountLabel.setFont(new Font("Serif", Font.BOLD, 30));

        JLabel creditCardInterestRateLabel = new JLabel("Interest Rate");
        creditCardInterestRateLabel.setFont(new Font("Serif", Font.BOLD, 30));

        JLabel creditCardExpirationDateLabel = new JLabel("Expiration Date");
        creditCardExpirationDateLabel.setFont(new Font("Serif", Font.BOLD, 30));

        JTextField creditCardIssuerBankTextField = new JTextField(20);
        creditCardIssuerBankTextField.setPreferredSize(new Dimension(0, 30));

        JTextField creditCardClientNameTextField = new JTextField(20);
        creditCardClientNameTextField.setPreferredSize(new Dimension(0, 30));

        JTextField creditCardCardIdTextField = new JTextField(20);
        creditCardCardIdTextField.setPreferredSize(new Dimension(0, 30));

        JTextField creditCardBankAccountTextField = new JTextField(20);
        creditCardBankAccountTextField.setPreferredSize(new Dimension(0, 30));

        JTextField creditCardCvcNumberTextField = new JTextField(20);
        creditCardCvcNumberTextField.setPreferredSize(new Dimension(0, 30));

        JTextField creditCardBalanceAmountTextField = new JTextField(20);
        creditCardBalanceAmountTextField.setPreferredSize(new Dimension(0, 30));

        JTextField creditCardInterestRateTextField = new JTextField(20);
        creditCardInterestRateTextField.setPreferredSize(new Dimension(0, 30));

        String years[] = {"Select Year", "2022", "2023", "2024", "2025", "2026"};
        String months[] = {"Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
                "27", "28", "29", "30", "31"};
        JComboBox creditCardYearsComboBox = new JComboBox(years);
        //                creditCardYearsComboBox.setPreferredSize(new Dimension(80,25));
        JComboBox creditCardMonthsComboBox = new JComboBox(months);
        JComboBox creditCardDaysComboBox = new JComboBox(days);

        JButton creditCardSubmitButton = new JButton("Submit");
        creditCardSubmitButton.setPreferredSize(new Dimension(100, 40));

        JButton creditCardClearButton = new JButton("Clear");
        creditCardClearButton.setPreferredSize(new Dimension(100, 40));

        JButton creditCardDisplayButton = new JButton("Display");
        creditCardDisplayButton.setPreferredSize(new Dimension(100, 40));

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 0;
        creditCardUpperPanel.add(creditCardBankNameLabel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 0;
        creditCardConstraints.gridwidth = 1;
        creditCardConstraints.insets = new Insets(0, 0, 20, 0);
        creditCardLowerPanel.add(creditCardLabel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 1;
        creditCardConstraints.gridwidth = 1;
        creditCardLowerPanel.add(creditCardIssuerBankLabel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 2;
        creditCardConstraints.gridwidth = 1;
        creditCardLowerPanel.add(creditCardClientNameLabel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 3;
        creditCardConstraints.gridwidth = 1;
        creditCardLowerPanel.add(creditCardCardIdLabel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 4;
        creditCardConstraints.gridwidth = 1;
        creditCardLowerPanel.add(creditCardBankAccountLabel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 5;
        creditCardConstraints.gridwidth = 1;
        creditCardLowerPanel.add(creditCardCvcNumberLabel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 6;
        creditCardConstraints.gridwidth = 1;
        creditCardLowerPanel.add(creditCardBalanceAmountLabel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 7;
        creditCardConstraints.gridwidth = 1;
        creditCardLowerPanel.add(creditCardInterestRateLabel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 8;
        creditCardConstraints.gridwidth = 1;
        creditCardLowerPanel.add(creditCardExpirationDateLabel, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 1;
        creditCardConstraints.gridwidth = 3;
        creditCardLowerPanel.add(creditCardIssuerBankTextField, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 2;
        creditCardConstraints.gridwidth = 3;
        creditCardLowerPanel.add(creditCardClientNameTextField, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 3;
        creditCardConstraints.gridwidth = 3;
        creditCardLowerPanel.add(creditCardCardIdTextField, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 4;
        creditCardConstraints.gridwidth = 3;
        creditCardLowerPanel.add(creditCardBankAccountTextField, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 5;
        creditCardConstraints.gridwidth = 3;
        creditCardLowerPanel.add(creditCardCvcNumberTextField, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 6;
        creditCardConstraints.gridwidth = 3;
        creditCardLowerPanel.add(creditCardBalanceAmountTextField, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 7;
        creditCardConstraints.gridwidth = 3;
        creditCardLowerPanel.add(creditCardInterestRateTextField, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 0;
        creditCardConstraints.gridwidth = 1;
//                creditCardYearsComboBox
        creditCardExpirationDateComboBoxPanel.add(creditCardYearsComboBox, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 0;
        creditCardConstraints.gridwidth = 1;
        creditCardExpirationDateComboBoxPanel.add(creditCardMonthsComboBox, creditCardConstraints);

        creditCardConstraints.gridx = 2;
        creditCardConstraints.gridy = 0;
        creditCardConstraints.gridwidth = 1;
        creditCardExpirationDateComboBoxPanel.add(creditCardDaysComboBox, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 9;
        creditCardConstraints.gridwidth = 1;
        creditCardConstraints.insets = new Insets(10, 0, 0, 0);
        creditCardLowerPanel.add(creditCardSubmitButton, creditCardConstraints);

        creditCardConstraints.gridx = 3;
        creditCardConstraints.gridy = 9;
        creditCardConstraints.gridwidth = 1;
        creditCardConstraints.insets = new Insets(10, 0, 0, 0);
        creditCardLowerPanel.add(creditCardClearButton, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 11;
        creditCardConstraints.gridwidth = 3;
        creditCardConstraints.insets = new Insets(10, 0, 0, 0);
        creditCardLowerPanel.add(creditCardDisplayButton, creditCardConstraints);

        creditCardConstraints.gridx = 1;
        creditCardConstraints.gridy = 8;
        creditCardLowerPanel.add(creditCardExpirationDateComboBoxPanel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 0;
        creditCardConstraints.fill = GridBagConstraints.BOTH;
        creditCardConstraints.weightx = 1;
        creditCardConstraints.weighty = 1;
        creditCardFrame.add(creditCardUpperPanel, creditCardConstraints);

        creditCardConstraints.gridx = 0;
        creditCardConstraints.gridy = 1;
        creditCardConstraints.fill = GridBagConstraints.BOTH;
        creditCardConstraints.weightx = 1;
        creditCardConstraints.weighty = 20;
        creditCardFrame.add(creditCardLowerPanel, creditCardConstraints);

        creditCardClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                creditCardIssuerBankTextField.setText("");
                creditCardClientNameTextField.setText("");
                creditCardCardIdTextField.setText("");
                creditCardBankAccountTextField.setText("");
                creditCardCvcNumberTextField.setText("");
                creditCardBalanceAmountTextField.setText("");
                creditCardInterestRateTextField.setText("");

            }
        });

        creditCardSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (){
//                } else {
//
//                }
                if (creditCardYearsComboBox.getSelectedIndex() == 0 || creditCardMonthsComboBox.getSelectedIndex() == 0
                        || creditCardDaysComboBox.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(creditCardFrame,"Select Date");


                } else {
                    String issuerBank = creditCardIssuerBankTextField.getText();
                    String clientName = creditCardClientNameTextField.getText();
                    int cardID = Integer.parseInt(creditCardCardIdTextField.getText());
                    String bankAccount = creditCardBankAccountTextField.getText();
                    int cvcNumber = Integer.parseInt(creditCardCvcNumberTextField.getText());
                    int balanceAmount = Integer.parseInt(creditCardBalanceAmountTextField.getText());
                    int interestRate = Integer.parseInt(creditCardInterestRateTextField.getText());
                    String expirationDate = creditCardDaysComboBox.getSelectedItem() + "" + creditCardMonthsComboBox.getSelectedItem() + "" + creditCardYearsComboBox.getSelectedItem();

                    CreditCard creditCardData = new CreditCard(cardID, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expirationDate);
                    bankGUI.addCreditCard(creditCardData);
                }
            }
        });

        creditCardDisplayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreditCardData(bankGUI.getCreditCards());
            }
        });
    }
}
