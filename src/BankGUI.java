import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BankGUI extends JFrame {

    private ArrayList <DebitCard> debitCards;
    private ArrayList<CreditCard> creditCards;




    public BankGUI() {
        debitCards=new ArrayList();
        creditCards=new ArrayList();
        JFrame bankCardFrame = new JFrame();
        bankCardFrame.setTitle("Bank GUI");
        bankCardFrame.setSize(700, 700);
        bankCardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bankCardFrame.setVisible(true);
        bankCardFrame.setLayout(new GridLayout(2, 1));




        JPanel bankCardUpperPanel = new JPanel();
        bankCardUpperPanel.setLayout(new GridBagLayout());
//        bankCardUpperPanel.setBackground(Color.cyan);
        bankCardUpperPanel.setOpaque(true);

        JPanel bankCardLowerPanel = new JPanel();
        bankCardLowerPanel.setLayout(new GridBagLayout());
//        bankCardLowerPanel.setBackground(Color.LIGHT_GRAY);

        GridBagConstraints gbc = new GridBagConstraints();


//        Color lightGreenColor = new Color(193,255,193);

        JLabel bankNameLabel = new JLabel("XYZ Bank Limited");
        bankNameLabel.setBackground(Color.LIGHT_GRAY);
        bankNameLabel.setOpaque(true);
        bankNameLabel.setFont(new Font("Serif", Font.BOLD, 90));

        JLabel selectLabel = new JLabel("Please Select!");
        selectLabel.setFont(new Font("Serif", Font.BOLD, 40));

        JButton debitCardButton = new JButton("Debit Card");
        debitCardButton.setFont(new Font("Serif", Font.BOLD, 15));

        JButton creditCardButton = new JButton("Credit Card");
        creditCardButton.setFont(new Font("Serif", Font.BOLD, 15));

        JButton withdrawMoneyButton = new JButton("Withdraw Money");
        withdrawMoneyButton.setFont(new Font("Serif", Font.BOLD, 15));

        JButton creditLimitButton = new JButton("Credit Limit");
        creditLimitButton.setFont(new Font("Serif", Font.BOLD, 15));

        JButton cancelCardButton = new JButton("Cancel Card");
        cancelCardButton.setFont(new Font("Serif", Font.BOLD, 15));


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(100, 0, 0, 0);
        bankCardUpperPanel.add(bankNameLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(150, 0, 0, 0);
        bankCardUpperPanel.add(selectLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 50, 200, 50);
        bankCardLowerPanel.add(debitCardButton, gbc);
        debitCardButton.setPreferredSize(new Dimension(150, 75));

        gbc.gridx = 1;
        gbc.gridy = 0;
        bankCardLowerPanel.add(creditCardButton, gbc);
        creditCardButton.setPreferredSize(new Dimension(150, 75));

        gbc.gridx = 2;
        gbc.gridy = 0;
        bankCardLowerPanel.add(withdrawMoneyButton, gbc);
        withdrawMoneyButton.setPreferredSize(new Dimension(150, 75));

        gbc.gridx = 3;
        gbc.gridy = 0;
        bankCardLowerPanel.add(creditLimitButton, gbc);
        creditLimitButton.setPreferredSize(new Dimension(150, 75));

        gbc.gridx = 4;
        gbc.gridy = 0;
        bankCardLowerPanel.add(cancelCardButton, gbc);
        cancelCardButton.setPreferredSize(new Dimension(150, 75));

        bankCardFrame.add(bankCardUpperPanel);
        bankCardFrame.add(bankCardLowerPanel);

        debitCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DebitCardGUI();
            }
        });

        creditCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreditCardGUI();
            }
        });

        withdrawMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WithdrawMoneyGUI();
            }
        });

    }



    public void addDebitCard(DebitCard debitCardForm){debitCards.add(debitCardForm);}

    public ArrayList<DebitCard> getDebitCards() {
        return debitCards;
    }

    public void addCreditCard(CreditCard creditCardForm){creditCards.add(creditCardForm);}

    public ArrayList<CreditCard> getCreditCards(){return creditCards;}

    public static void main (String[] args){
        new BankGUI();
    }
}
