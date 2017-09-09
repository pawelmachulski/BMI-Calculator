package pl.pm.BmiCalculator;

public class BmiModel {

    private double weight;
    private double height;


    public BmiModel(){};

    public BmiModel(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String bmi(double height, double weight){
        double bmi = weight*10000/(height*height);
        String bmiresult = String.format("%.2f", bmi);
        return bmiresult;
    }

    }
