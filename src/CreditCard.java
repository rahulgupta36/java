
    public class CreditCard extends BankCard{
        //Declaring Attributes
        private int cvcNumber;
        private int gracePeriod;
        private String expirationDate;
        private double creditLimit;
        private double interestRate;
        private boolean isGranted;

        //creating constructors with parameters
        protected CreditCard(int cardID, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, double interestRate, String expirationDate){
            super(cardID,issuerBank,bankAccount, balanceAmount);
            super.setClientName(clientName);
            super.setBalanceAmount(balanceAmount);
            this.cvcNumber = cvcNumber;
            this.interestRate = interestRate;
            this.expirationDate = expirationDate;
            this.isGranted = false;
        }

        public int getCvcNumber(){
            return cvcNumber;
        }

        public int getGracePeriod(){
            return gracePeriod;
        }

        public String getExpirationDate(){
            return expirationDate;
        }

        public double getCreditLimit(){
            return creditLimit;
        }

        public double getInterestRate(){
            return interestRate;
        }

        public boolean getIsGranted(){
            return isGranted;
        }

        //modifier for setting credit limit
        public void setCreditLimit(double creditLimit, int gracePeriod){
            if (creditLimit<= 2.5 * getBalanceAmount()){
                this.creditLimit = creditLimit;
                this.gracePeriod = gracePeriod;
                this.isGranted = true;

            }
            else{
                System.out.println("Credit card cannot be issued");
            }

        }
        //Method for canceling a credit card
        protected void cancelCreditCard(){
            if(this.isGranted){
                this.cvcNumber = 0;
                this.creditLimit = 0;
                this.gracePeriod = 0;
                this.isGranted = false;
            }
            else{
                System.out.println("Credit card is not granted");
            }
        }
        //Creating Display method
        protected void display(){
            if (this.isGranted ){
                super.display(); //Calling Display method from parent class
                System.out.println("CVC number: " + cvcNumber);
                System.out.println("Grace period: " + gracePeriod);
                System.out.println("Expiration date: " + expirationDate);
                System.out.println("Credit limit: " + creditLimit);
                System.out.println("Interest rate: " + interestRate);
            }
            else{
                System.out.println("No credit card has been issued.");
            }
        }
    }

