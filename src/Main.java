import java.util.List;

public class Main {
    public static void main(String[] args) {
      PascalsTriangle pascalsTriangle= new PascalsTriangle();

        for (List<Integer> innerList : pascalsTriangle.generate(5)) {
            for (int num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }
}