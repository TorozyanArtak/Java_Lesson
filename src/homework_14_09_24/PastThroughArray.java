package homework_14_09_24;

// double տիպի զանգվածի՝ պայմաններին բավարարող արժեքների գումարի ստացում
public class PastThroughArray {
    public static void main(String[] args) {
        double[] doubles = {4.5, -25.1, 0, 2.04, 14.1, -12.5, -11.2, 5.1, -1.2, 4.3, 0, 5.2, 1.6};
        double sum = 0;
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] == 0) {
                break;
            }
            if (doubles[i] > 0) {
                sum += doubles[i];
            }
            if (doubles[i] < 0) {
                sum += doubles[i++];
            }
        }
        System.out.println("The elements summary is " + sum);
    }
}
