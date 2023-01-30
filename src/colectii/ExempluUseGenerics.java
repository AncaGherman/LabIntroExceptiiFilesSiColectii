package colectii;

public class ExempluUseGenerics {
    public static void main(String[] args) {
        Box<String> s = new Box<String>();
        //functioneaza si asa:
        // Box<String> s = new Box<>();
        s.setT("maimuta");

        Box<Integer> i = new Box<Integer>();
        //functioneaza si asa:
        // Box<Integer> s = new Box<>();
        i.setT(55);

        //now use diamond operator:
        Box<Integer> i1 = new Box<>(); //box de integers, nu mai tb sa pun tipul si la creare
    }
}
