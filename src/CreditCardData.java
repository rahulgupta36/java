import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CreditCardData {
    public CreditCardData(ArrayList<CreditCard>creditCards){
        JFrame creditCardDataFrame = new JFrame();
        creditCardDataFrame.setTitle("Credit Card Form");
        creditCardDataFrame.setSize(900,700);
        creditCardDataFrame.setVisible(true);
//        creditCardDataFrame.setLayout(new GridBagLayout());
        creditCardDataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columnNames = {"Issuer Bank","Client Name","Card ID","Bank Account","CVC NUmber","Balance Amount","Interest Rate","Expiration Date"};
        String[][] data = new String[creditCards.size()][8];

        for(int i = 0; i < creditCards.size(); i++){
            data[i][0] = String.valueOf(creditCards.get(i).getIssuerBank());
            data[i][1] = creditCards.get(i).getClientName();
            data[i][2] = String.valueOf(creditCards.get(i).getCardID());
            data[i][3] = creditCards.get(i).getBankAccount();
            data[i][4] = String.valueOf(creditCards.get(i).getCvcNumber());
            data[i][5] = String.valueOf(creditCards.get(i).getBalanceAmount());
            data[i][6] = String.valueOf(creditCards.get(i).getInterestRate());
            data[i][7] = String.valueOf(creditCards.get(i).getExpirationDate());
        }

        JTable displayTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(displayTable);
        creditCardDataFrame.add(scrollPane);
    }
}
