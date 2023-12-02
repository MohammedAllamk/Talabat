package OOP;

public class CreditCard {
    private String cardNumber;
    private String cvv;
    private String cardholderName;
    //(visa,mastercard)نوع البطاقه
    private String tyBe;

    private String expirationDate;
    public CreditCard(String cardNumber ,String cvv ,String cardholderName,String expirationDate,String tyBe){
        this.cardNumber=cardNumber;
        this.cvv=cvv;
        this.cardNumber=cardNumber;
        this.expirationDate=expirationDate;
        this.tyBe=tyBe;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber=cardNumber;
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public void setCvv(String cvv){
        this.cvv=cvv;
    }
    public String getCvv(){
        return cvv;
    }
    public void setCardholderName(String cardholderName){
        this.cardholderName=cardholderName;
    }

    public String getCardholderName() {
        return cardholderName;
    }
    public void setExpirationDate(String expirationDate){
        this.expirationDate=expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
    public String identifyCreditCardTyBe( String cardNumber){
        if(cardNumber.startsWith("4")){
            return "Visa";
        }
        else if(cardNumber.startsWith("5")){
            return "MasterCard";
        }
        else{
            return "Unknown";
        }

    }
}

