package Main;

public class data<T extends Number, K extends String> {
    T data1;
    K data2;

    public data(T data1, K data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public void printData() {
        System.out.println(data1 + " " + data2);
    }
}
