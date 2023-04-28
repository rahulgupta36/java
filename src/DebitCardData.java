import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DebitCardData extends JFrame {
    public DebitCardData(ArrayList<DebitCard> debitCards){
        JFrame debitCardDataFrame=new JFrame();
        debitCardDataFrame.setTitle("Debit Card Data");
        debitCardDataFrame.setSize(700,700);
        debitCardDataFrame.setVisible(true);
//        debitCardDataFrame.setLayout(new GridBagLayout());
        debitCardDataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columnNames = {"Card ID","Client name","PIN number","Bank account","Issuer bank","Balance amount"};
        String[][] data = new String[debitCards.size()][6];

        for(int i = 0; i < debitCards.size(); i++){
            data[i][0] = String.valueOf(debitCards.get(i).getCardID());
            data[i][1] = debitCards.get(i).getClientName();
            data[i][2] = String.valueOf(debitCards.get(i).getPinNumber());
            data[i][3] = debitCards.get(i).getBankAccount();
            data[i][4] = debitCards.get(i).getIssuerBank();
            data[i][5] = String.valueOf(debitCards.get(i).getBalanceAmount());
        }

        JTable displayTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(displayTable);
        debitCardDataFrame.add(scrollPane);

    }

}
