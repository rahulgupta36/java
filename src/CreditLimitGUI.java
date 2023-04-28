import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreditLimitGUI {
    public CreditLimitGUI(){
        JFrame creditLimitFrame=new JFrame();
        creditLimitFrame.setSize(700,700);
        creditLimitFrame.setTitle("Set Credit Limit");
        creditLimitFrame.setVisible(true);
        creditLimitFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        creditLimitFrame.setLayout(new GridBagLayout());

        JPanel creditLimitUpperPanel =new JPanel();
//                                        creditLimitUpperPanel.setBackground(Color.PINK);
        creditLimitUpperPanel.setLayout(new GridBagLayout());

        JPanel creditLimitLowerPanel=new JPanel();
        creditLimitLowerPanel.setBackground(Color.LIGHT_GRAY);
        creditLimitLowerPanel.setLayout(new GridBagLayout());

        GridBagConstraints creditLimitConstraints=new GridBagConstraints();

        JLabel creditLimitBankNameLabel=new JLabel("XYZ Bank Limited");
        creditLimitBankNameLabel.setFont(new Font("Serif",Font.BOLD,70));

        JLabel creditLimitLabel=new JLabel("Set Credit Limit");
        creditLimitLabel.setFont(new Font("Serif",Font.BOLD,50));

        JLabel creditLimitCardIdLabel=new JLabel("Card ID");
        creditLimitCardIdLabel.setFont(new Font("Serif",Font.BOLD,30));

        JLabel creditLimitCreditLimitLabel=new JLabel("Credit Limit");
        creditLimitCreditLimitLabel.setFont(new Font("Serif",Font.BOLD,30));

        JLabel creditLimitGracePeriodLabel=new JLabel("Grace Period");
        creditLimitGracePeriodLabel.setFont(new Font("Serif",Font.BOLD,30));

        JTextField creditLimitCardIdTextField=new JTextField(20);
        creditLimitCardIdTextField.setPreferredSize(new Dimension(0,30));

        JTextField creditLimitCreditLimitTextField=new JTextField(20);
        creditLimitCreditLimitTextField.setPreferredSize(new Dimension(0,30));

        JTextField creditLimitGracePeriodTextField=new JTextField(20);
        creditLimitGracePeriodTextField.setPreferredSize(new Dimension(0,30));

        JButton creditLimitSubmitButton=new JButton("Set");
        creditLimitSubmitButton.setPreferredSize(new Dimension(100,40));

        JButton creditLimitClearButton=new JButton("Clear");
        creditLimitClearButton.setPreferredSize(new Dimension(100,40));

        JButton creditLimitDisplayButton=new JButton("Display");
        creditLimitDisplayButton.setPreferredSize(new Dimension(100,40));

        creditLimitConstraints.gridx=0;
        creditLimitConstraints.gridy=0;
        creditLimitUpperPanel.add(creditLimitBankNameLabel,creditLimitConstraints);

        creditLimitConstraints.gridx=0;
        creditLimitConstraints.gridy=0;
        creditLimitConstraints.insets=new Insets(0,0,20,0);
        creditLimitLowerPanel.add(creditLimitLabel,creditLimitConstraints);

        creditLimitConstraints.gridx=0;
        creditLimitConstraints.gridy=1;
        creditLimitLowerPanel.add(creditLimitCardIdLabel,creditLimitConstraints);

        creditLimitConstraints.gridx=0;
        creditLimitConstraints.gridy=2;
        creditLimitLowerPanel.add(creditLimitCreditLimitLabel,creditLimitConstraints);

        creditLimitConstraints.gridx=0;
        creditLimitConstraints.gridy=3;
        creditLimitLowerPanel.add(creditLimitGracePeriodLabel,creditLimitConstraints);

        creditLimitConstraints.gridx=1;
        creditLimitConstraints.gridy=1;
        creditLimitConstraints.gridwidth=2;
        creditLimitLowerPanel.add(creditLimitCardIdTextField,creditLimitConstraints);

        creditLimitConstraints.gridx=1;
        creditLimitConstraints.gridy=2;
        creditLimitConstraints.gridwidth=2;
        creditLimitLowerPanel.add(creditLimitCreditLimitTextField,creditLimitConstraints);

        creditLimitConstraints.gridx=1;
        creditLimitConstraints.gridy=3;
        creditLimitConstraints.gridwidth=2;
        creditLimitLowerPanel.add(creditLimitGracePeriodTextField,creditLimitConstraints);

        creditLimitConstraints.gridx=1;
        creditLimitConstraints.gridy=4;
        creditLimitConstraints.gridwidth=1;
        creditLimitConstraints.insets=new Insets(10,0,0,0);
        creditLimitLowerPanel.add(creditLimitSubmitButton,creditLimitConstraints);

        creditLimitConstraints.gridx=2;
        creditLimitConstraints.gridy=4;
        creditLimitConstraints.gridwidth=1;
        creditLimitConstraints.insets=new Insets(10,0,0,0);
        creditLimitLowerPanel.add(creditLimitClearButton,creditLimitConstraints);

        creditLimitConstraints.gridx=1;
        creditLimitConstraints.gridy=5;
        creditLimitConstraints.gridwidth=2;
        creditLimitConstraints.insets=new Insets(10,0,0,0);
        creditLimitLowerPanel.add(creditLimitDisplayButton,creditLimitConstraints);

        creditLimitConstraints.gridx=0;
        creditLimitConstraints.gridy=0;
        creditLimitConstraints.fill=GridBagConstraints.BOTH;
        creditLimitConstraints.weightx=1;
        creditLimitConstraints.weighty=1;
        creditLimitFrame.add(creditLimitUpperPanel,creditLimitConstraints);

        creditLimitConstraints.gridx=0;
        creditLimitConstraints.gridy=1;
        creditLimitConstraints.fill=GridBagConstraints.BOTH;
        creditLimitConstraints.weightx=1;
        creditLimitConstraints.weighty=20;
        creditLimitFrame.add(creditLimitLowerPanel,creditLimitConstraints);



        creditLimitClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                creditLimitCardIdTextField.setText("");
                creditLimitCreditLimitTextField.setText("");
                creditLimitGracePeriodTextField.setText("");
            }
        });
    }
}
