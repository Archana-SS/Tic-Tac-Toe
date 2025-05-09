package player;

public class Player {
    private String name;
    private char symbol;
    private String address;
    private String number;
    private String emailId;
    private int age;

    public void setPlayerDetails(String name,char symbol,String address,String number,String emailId,int age){
        this.name=name;
        this.symbol=symbol;
        this.address=address;
        this.number=number;
        this.emailId=emailId;
        this.age=age;
    }

    public void setPlayerNameAndAge(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setPlayerNameSymbolEmailIdAge(String name,char symbol,String emailId,int age){
        this.name=name;
        this.symbol=symbol;
        this.emailId=emailId;
        this.age=age;
    }

    public void setPlayerNameAndSymbol(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }
    
    public void changeSymbol(char symbol){
        this.symbol=symbol;
    }

    public String getPlayerName(){
        return this.name;
    }

    public char getPlayerSymbol(){
        return this.symbol;
    }

    public void getPlayerNameAndSymbol(){
        System.out.println("Player Name: "+this.name);
        System.out.println("Player Symbol: "+this.symbol);
    }

    public void getPlayerNameAndAge(){
        System.out.println("Player Name: "+this.name);
        System.out.println("Player Age: "+this.age);
    }

    public void getPlayerDatails(){
        System.out.println("Player Name: "+this.name);
        System.out.println("Player Symbol: "+this.symbol);
        System.out.println("Player Email Id: "+this.emailId);
        System.out.println("Player age: "+this.age);
        System.out.println("Player Phone No: "+this.number);
        System.out.println("Player Address: "+this.address);
    }
}

