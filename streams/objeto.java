public class objeto {
    
    private String title;
    private long price;

    objeto(String title, long d){
        this.title = title;
        this.price = d;
    }

    public String getTitle(){
        return this.title;
    }

    public long getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "objeto [title=" + title + ", price=" + price + "]";
    }

    

}
