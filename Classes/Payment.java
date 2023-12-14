package Talabat.Classes;
    public class Payment{
        private  double Total_price;
        private String Payment_Method;
        private String Transaction_id;
        private String Payment_Status; // it`s static because it`s changeable
        private String Payment_Date;
        private User user;

        public Payment(String transactionType, double amount) {
            if (transactionType.equals("Deposit")) {
                this.Total_price = amount;
            } else if (transactionType.equals("Withdrawal")) {
                this.Total_price = -amount;
            }
        }

                public void setPayment_Method(String payment_Method) {
            Payment_Method = payment_Method;
        }

        public void setTransaction_id(String transaction_id) {
            Transaction_id = transaction_id;
        }

        public void setPayment_Status(String payment_Status) {
            Payment_Status = payment_Status;
        }

        public void setPayment_Date(String payment_Date) {
            Payment_Date = payment_Date;
        }

        public String getPayment_Method() {
            return Payment_Method;
        }

        public String getTransaction_id() {
            return Transaction_id;
        }

        public String getPayment_Status() {
            return Payment_Status;
        }

        public String getPayment_Date() {
            return Payment_Date;
        }

        // for the pay method it takes the total price and the payment method,
        // for the wallet payment method it will check if the total price is more or less than the wallet amount
        // if the total price is less than the wallet amount it will return true else it will return false
        // therefor if you have enough money or not
        // for the credit card method payment method it only will return paid for now
        public void Pay(double total_price, Object Payment_method) {

            this.Total_price = total_price;


            if (Payment_method instanceof Wallet) {
                Wallet wallet = (Wallet) Payment_method;
                if (wallet.deductFunds(total_price)) {
                    Payment_Status = "Successfully paid ";

                } else {
                    Payment_Status = "Sorry you don`t have enough money ";
                }
            }
            if (Payment_method instanceof Creditcard) {
                Payment_Status = "Successfully paid ";
            }


        }
    }
