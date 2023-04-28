public class BankCard {

        //Declaring attributes

        private int cardID;
        private String issuerBank;
        private String bankAccount;
        private String clientName;
        private double balanceAmount;


        //creating constructors with parameters


        protected BankCard(int cardID,String issuerBank,String bankAccount,double balanceAmount) {
            this.cardID = cardID;
            this.issuerBank = issuerBank;
            this.bankAccount = bankAccount;
            this.clientName = "";
            this.balanceAmount = balanceAmount;
        }



        public int getCardID(){
            return cardID;
        }

        public String getIssuerBank(){
            return issuerBank;
        }

        public String getBankAccount(){
            return bankAccount;
        }

        public String getClientName(){
            return clientName;
        }

        public double getBalanceAmount(){
            return balanceAmount;
        }


        //creating client name using setter method

        public void setClientName(String clientName){

            this.clientName = clientName;

        }

        public void setBalanceAmount(double balanceAmount){
            this.balanceAmount = balanceAmount;

        }


        //Creating Display method
        protected void display(){

            //Checking if client name is empty
            if (clientName.equals("")){
                System.out.println("No client name has been entered.");
            }else{
                System.out.println("Client Name: " + clientName);
            }

            System.out.println("Card Id: " + cardID);
            System.out.println("Issuer Bank" + issuerBank);
            System.out.println("Bank Account: " + bankAccount);
            System.out.println("Balance Amount: " + balanceAmount);

        }


    }
