
    public class DebitCard extends BankCard{

        //Declaring Attributes

        private int withdrawalAmount;
        private int pinNumber;
        private boolean hasWithdrawn;
        private String dateOfWithdrawal;

        //Creating constructors with parameters
        protected DebitCard(double balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int pinNumber){
            super(cardID,issuerBank,bankAccount, balanceAmount );
            super.setClientName(clientName);
            super.setBalanceAmount(balanceAmount);
            this.pinNumber = pinNumber;
            this.hasWithdrawn = false;
        }

        public int getWithdrawalAmount(){
            return withdrawalAmount;
        }

        public int getPinNumber(){
            return pinNumber;
        }

        public boolean getHasWithdrawn(){
            return hasWithdrawn;
        }

        public String getDateOfWithdrawal(){
            return dateOfWithdrawal;
        }

        public void setWithdrawalAmount(int withdrawalAmount){
            this.withdrawalAmount = withdrawalAmount;
        }

        protected void WithDraw(int withdrawalAmount, String dateOfWithdrawal , int pinNumber){
            //validating the validity of the pin
            if (this.pinNumber == pinNumber){
                //compare the withdrawal amount and the remaining balance
                if(withdrawalAmount <= getBalanceAmount()){
                    super.setBalanceAmount(this.getBalanceAmount() - withdrawalAmount);
                    this.withdrawalAmount = withdrawalAmount;
                    this.dateOfWithdrawal = dateOfWithdrawal;
                    this.hasWithdrawn = true;
                }
                else{
                    System.out.println("Insufficient balance");
                }
            }
            else{
                System.out.println("Invalid pin");
            }

        }
        //Creating Display method
        protected void display(){
            super.display();//Calling Display method from parent class
            System.out.println("PIN number: " + pinNumber);
            //Only when hasWithdrawn is true is the withdrawal amount reported here.
            if(hasWithdrawn){
                System.out.println("Withdrawal amount: " + withdrawalAmount);
                System.out.println("Date of withdrawal: " + dateOfWithdrawal);
            }
            //The message below is displayed if hasWithdrawn is false.
            else{
                System.out.println("There has been no withdrawal.");
                System.out.println("Your bank account's balance is currently : " + super.getBalanceAmount());
            }

        }
    }
