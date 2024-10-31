public class objeto {
    
    private String title;
    private float price;

    objeto(String title, float d){
        this.title = title;
        this.price = d;
    }

    public String getTitle(){
        return this.title;
    }

    public float getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "objeto [title=" + title + ", price=" + price + "]";
    }

    

}
