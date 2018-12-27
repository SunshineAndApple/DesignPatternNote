package sunshine.builder;
/*
Product
 */
public class Coffee {
    private String name;
    private String milk;
    private String espresso;
    private String froth;

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getEspresso() {
        return espresso;
    }

    public void setEspresso(String espresso) {
        this.espresso = espresso;
    }

    public String getFroth() {
        return froth;
    }

    public void setFroth(String froth) {
        this.froth = froth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "’‚ «“ª±≠{" +
                "'" + name + '\'' +
                "£∫ milk='" + milk + '\'' +
                ", espresso='" + espresso + '\'' +
                ", froth='" + froth + '\'' +
                '}';
    }
}
