import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithdrawMoneyGUI {
    public WithdrawMoneyGUI(){
        JFrame withdrawMoneyFrame=new JFrame();
        withdrawMoneyFrame.setTitle("Add Withdraw Money");
        withdrawMoneyFrame.setSize(700,700);
        withdrawMoneyFrame.setVisible(true);
        withdrawMoneyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        withdrawMoneyFrame.setLayout(new GridBagLayout());

        JPanel withdrawMoneyUpperPanel=new JPanel();
//                                withdrawMoneyUpperPanel.setBackground(Color.PINK);
        withdrawMoneyUpperPanel.setLayout(new GridBagLayout());

        JPanel withdrawMoneyLowerPanel=new JPanel();
        withdrawMoneyLowerPanel.setBackground(Color.LIGHT_GRAY);
        withdrawMoneyLowerPanel.setLayout(new GridBagLayout());

        JPanel withdrawMoneyComboBoxPanel=new JPanel();
        withdrawMoneyComboBoxPanel.setBackground(Color.LIGHT_GRAY);
        withdrawMoneyComboBoxPanel.setLayout(new GridBagLayout());

        GridBagConstraints withdrawMoneyConstraints=new GridBagConstraints();

        JLabel withdrawMoneyBankNameLabel=new JLabel("XYZ Bank Limited");
        withdrawMoneyBankNameLabel.setFont(new Font("Serif",Font.BOLD,70));

        JLabel withdrawMoneyLabel=new JLabel("Withdraw Money");
        withdrawMoneyLabel.setFont(new Font("Serif",Font.BOLD,50));

        JLabel withdrawMoneyCardIdLabel=new JLabel("Card Id");
        withdrawMoneyCardIdLabel.setFont(new Font("Serif",Font.BOLD,30));

        JLabel withdrawMoneyPinLabel=new JLabel("Pin Number");
        withdrawMoneyPinLabel.setFont(new Font("Serif",Font.BOLD,30));

        JLabel withdrawMoneyWithdrawAmountLabel=new JLabel("Withdrawal Amount");
        withdrawMoneyWithdrawAmountLabel.setFont(new Font("Serif",Font.BOLD,30));

        JLabel withdrawMoneyDateOfWithdrawLabel=new JLabel("Date Of Withdraw");
        withdrawMoneyDateOfWithdrawLabel.setFont(new Font("Serif",Font.BOLD,30));

        String years[] = {"Select Year", "2022", "2023", "2024", "2025", "2026"};
        String months[] = {"Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
                "27", "28", "29", "30", "31"};
        JComboBox yearsComboBox = new JComboBox(years);
        JComboBox monthsComboBox = new JComboBox(months);
        JComboBox daysComboBox = new JComboBox(days);

        JTextField withdrawMoneyCardIdTextField=new JTextField(20);
        withdrawMoneyCardIdTextField.setPreferredSize(new Dimension(0,30));

        JTextField withdrawMoneyPinTextField=new JTextField(20);
        withdrawMoneyPinTextField.setPreferredSize(new Dimension(0,30));

        JTextField withdrawMoneyWithdrawAmountTextField=new JTextField(20);
        withdrawMoneyWithdrawAmountTextField.setPreferredSize(new Dimension(0,30));


//                withDrawMoneyDateOfWithdrawTextField.setPreferredSize(new Dimension(0,30));


        JButton withdrawMoneySubmitButton=new JButton("Submit");
        withdrawMoneySubmitButton.setPreferredSize(new Dimension(100,40));

        JButton withdrawMoneyClearButton=new JButton("Clear");
        withdrawMoneyClearButton.setPreferredSize(new Dimension(100,40));

        JButton withdrawMoneyDisplayButton=new JButton("Display");
        withdrawMoneyDisplayButton.setPreferredSize(new Dimension(100,40));

        withdrawMoneyConstraints.gridx=0;
        withdrawMoneyConstraints.gridy=0;
        withdrawMoneyUpperPanel.add(withdrawMoneyBankNameLabel,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=0;
        withdrawMoneyConstraints.gridy=0;
        withdrawMoneyConstraints.gridwidth = 1;
        withdrawMoneyConstraints.insets=new Insets(0,0,20,0);
        withdrawMoneyLowerPanel.add(withdrawMoneyLabel,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=0;
        withdrawMoneyConstraints.gridy=1;
        withdrawMoneyConstraints.gridwidth = 1;
        withdrawMoneyLowerPanel.add(withdrawMoneyCardIdLabel,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=0;
        withdrawMoneyConstraints.gridy=2;
        withdrawMoneyConstraints.gridwidth = 1;
        withdrawMoneyLowerPanel.add(withdrawMoneyPinLabel,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=0;
        withdrawMoneyConstraints.gridy=3;
        withdrawMoneyConstraints.gridwidth = 1;
        withdrawMoneyLowerPanel.add(withdrawMoneyWithdrawAmountLabel,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=0;
        withdrawMoneyConstraints.gridy=4;
        withdrawMoneyConstraints.gridwidth = 1;
        withdrawMoneyLowerPanel.add(withdrawMoneyDateOfWithdrawLabel,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=1;
        withdrawMoneyConstraints.gridy=1;
        withdrawMoneyConstraints.gridwidth = 3;
        withdrawMoneyLowerPanel.add(withdrawMoneyCardIdTextField,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=1;
        withdrawMoneyConstraints.gridy=2;
        withdrawMoneyConstraints.gridwidth = 3;
        withdrawMoneyLowerPanel.add(withdrawMoneyPinTextField,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=1;
        withdrawMoneyConstraints.gridy=3;
        withdrawMoneyConstraints.gridwidth = 3;
        withdrawMoneyLowerPanel.add(withdrawMoneyWithdrawAmountTextField,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=0;
        withdrawMoneyConstraints.gridy=0;
        withdrawMoneyConstraints.gridwidth = 1;
        withdrawMoneyComboBoxPanel.add(yearsComboBox,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=1;
        withdrawMoneyConstraints.gridy=0;
        withdrawMoneyConstraints.gridwidth = 1;
        withdrawMoneyComboBoxPanel.add(monthsComboBox,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=2;
        withdrawMoneyConstraints.gridy=0;
        withdrawMoneyConstraints.gridwidth = 1;
        withdrawMoneyComboBoxPanel.add(daysComboBox,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=1;
        withdrawMoneyConstraints.gridy=5;
        withdrawMoneyConstraints.gridwidth = 1;
        withdrawMoneyConstraints.insets=new Insets(10,0,0,0);
        withdrawMoneyLowerPanel.add(withdrawMoneySubmitButton,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=2;
        withdrawMoneyConstraints.gridy=5;
        withdrawMoneyConstraints.gridwidth = 1;
        withdrawMoneyConstraints.insets=new Insets(10,0,0,0);
        withdrawMoneyLowerPanel.add(withdrawMoneyClearButton,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=1;
        withdrawMoneyConstraints.gridy=6;
        withdrawMoneyConstraints.gridwidth = 3;
        withdrawMoneyConstraints.insets=new Insets(10,0,0,0);
        withdrawMoneyLowerPanel.add(withdrawMoneyDisplayButton,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=1;
        withdrawMoneyConstraints.gridy=4;
        withdrawMoneyLowerPanel.add(withdrawMoneyComboBoxPanel,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=0;
        withdrawMoneyConstraints.gridy=0;
        withdrawMoneyConstraints.fill=GridBagConstraints.BOTH;
        withdrawMoneyConstraints.weightx=1;
        withdrawMoneyConstraints.weighty=1;
        withdrawMoneyFrame.add(withdrawMoneyUpperPanel,withdrawMoneyConstraints);

        withdrawMoneyConstraints.gridx=0;
        withdrawMoneyConstraints.gridy=1;
        withdrawMoneyConstraints.fill=GridBagConstraints.BOTH;
        withdrawMoneyConstraints.weightx=1;
        withdrawMoneyConstraints.weighty=20;
        withdrawMoneyFrame.add(withdrawMoneyLowerPanel,withdrawMoneyConstraints);


        withdrawMoneyClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdrawMoneyCardIdTextField.setText("");
                withdrawMoneyPinTextField.setText("");
                withdrawMoneyWithdrawAmountTextField.setText("");
            }
        });
    }
}
