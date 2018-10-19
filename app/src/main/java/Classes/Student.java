package Classes;

public class Student {
    private String name;
    private float firstCut;
    private float secondCut;
    private float thirdCut;

    public Student(){}

    public Student(String name, float firstCut, float secondCut, float thirdCut) {
        this.name = name;
        this.firstCut = firstCut;
        this.secondCut = secondCut;
        this.thirdCut = thirdCut;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getFirstCut() {
        return firstCut;
    }
    public void setFirstCut(float firstCut) {
        this.firstCut = firstCut;
    }
    public float getSecondCut() {
        return secondCut;
    }
    public void setSecondCut(float secondCut) {
        this.secondCut = secondCut;
    }
    public float getThirdCut() {
        return thirdCut;
    }
    public void setThirdCut(float thirdCut) {
        this.thirdCut = thirdCut;
    }
}
