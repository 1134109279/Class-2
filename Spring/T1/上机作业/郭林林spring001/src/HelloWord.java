import java.util.Date;

public class HelloWord {
    private String name;
    private Date data;

    public void setName(String name) {
        this.name = name;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void sayHello(){
        System.out.print("Hello"+name);
        System.out.print(data);
    }
}
