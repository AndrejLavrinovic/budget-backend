package ie.altech.budget.pages;

public class Home {

    final private String id;
    final private String content;

    public Home(String id, String content){
        this.id = id;
        this.content = content;
    }

    public String getId(){
        return this.id;
    }

    public String getContent(){
        return this.content;
    }
}
