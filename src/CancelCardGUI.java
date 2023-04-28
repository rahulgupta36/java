import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelCardGUI {
    public CancelCardGUI(){
        JFrame cancelCardFrame=new JFrame();
        cancelCardFrame.setTitle("Cancel Card");
        cancelCardFrame.setSize(700,700);
        cancelCardFrame.setVisible(true);
        cancelCardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cancelCardFrame.setLayout(new GridBagLayout());

        JPanel cancelCardUpperPanel=new JPanel();
//                                                cancelCardUpperPanel.setBackground(Color.PINK);
        cancelCardUpperPanel.setLayout(new GridBagLayout());

        JPanel cancelCardLowerPanel=new JPanel();
        cancelCardLowerPanel.setBackground(Color.LIGHT_GRAY);
        cancelCardLowerPanel.setLayout(new GridBagLayout());

        GridBagConstraints cancelCardConstraints=new GridBagConstraints();

        JLabel cancelCardBankNameLabel=new JLabel("XYZ Bank Limited");
        cancelCardBankNameLabel.setFont(new Font("Serif",Font.BOLD,70));

        JLabel cancelCardLabel=new JLabel("Cancel Card");
        cancelCardLabel.setFont(new Font("Serif",Font.BOLD,50));

        JLabel cancelCardCardIdLabel=new JLabel("Card ID");
        cancelCardCardIdLabel.setFont(new Font("Serif",Font.BOLD,30));

        JTextField cancelCardCardIdTextField=new JTextField(20);
        cancelCardCardIdTextField.setPreferredSize(new Dimension(0,30));

        JButton cancelCardSubmitButton=new JButton("Submit");
        cancelCardSubmitButton.setPreferredSize(new Dimension(100,40));

        JButton cancelCardClearButton=new JButton("Clear");
        cancelCardClearButton.setPreferredSize(new Dimension(100,40));

        JButton cancelCardDisplayButton=new JButton("Display");
        cancelCardDisplayButton.setPreferredSize(new Dimension(100,40));

        cancelCardConstraints.gridx=0;
        cancelCardConstraints.gridy=0;
        cancelCardUpperPanel.add(cancelCardBankNameLabel,cancelCardConstraints);

        cancelCardConstraints.gridx=0;
        cancelCardConstraints.gridy=0;
        cancelCardConstraints.insets=new Insets(0,0,20,0);
        cancelCardLowerPanel.add(cancelCardLabel,cancelCardConstraints);

        cancelCardConstraints.gridx=0;
        cancelCardConstraints.gridy=1;
        cancelCardLowerPanel.add(cancelCardCardIdLabel,cancelCardConstraints);

        cancelCardConstraints.gridx=1;
        cancelCardConstraints.gridy=1;
        cancelCardConstraints.gridwidth=2;
        cancelCardLowerPanel.add(cancelCardCardIdTextField,cancelCardConstraints);

        cancelCardConstraints.gridx=1;
        cancelCardConstraints.gridy=2;
        cancelCardConstraints.gridwidth=1;
        cancelCardConstraints.insets=new Insets(10,0,0,0);
        cancelCardLowerPanel.add(cancelCardSubmitButton,cancelCardConstraints);

        cancelCardConstraints.gridx=2;
        cancelCardConstraints.gridy=2;
        cancelCardConstraints.gridwidth=1;
        cancelCardConstraints.insets=new Insets(10,0,0,0);
        cancelCardLowerPanel.add(cancelCardClearButton,cancelCardConstraints);

        cancelCardConstraints.gridx=1;
        cancelCardConstraints.gridy=3;
        cancelCardConstraints.gridwidth=2;
        cancelCardConstraints.insets=new Insets(10,0,0,0);
        cancelCardLowerPanel.add(cancelCardDisplayButton,cancelCardConstraints);


        cancelCardConstraints.gridx=0;
        cancelCardConstraints.gridy=0;
        cancelCardConstraints.fill=GridBagConstraints.BOTH;
        cancelCardConstraints.weightx=1;
        cancelCardConstraints.weighty=1;
        cancelCardFrame.add(cancelCardUpperPanel,cancelCardConstraints);

        cancelCardConstraints.gridx=0;
        cancelCardConstraints.gridy=1;
        cancelCardConstraints.fill=GridBagConstraints.BOTH;
        cancelCardConstraints.weightx=1;
        cancelCardConstraints.weighty=20;
        cancelCardFrame.add(cancelCardLowerPanel,cancelCardConstraints);

        cancelCardClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelCardCardIdTextField.setText("");
            }
        });
    }
}
