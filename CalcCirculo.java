public class CalcCirculo {
    public static void main(String[] args) {

        //Criando um objeto com Construtor
        Circulo c1 = new Circulo(3);  // O raio já é definido na criação do objeto
        //System.out.print("A área é: ");
        //System.out.println(c1.area());  // Método para calcular área
       // System.out.print("O comprimento é: ");
       // System.out.print(c1.comprimento());

       //       get e set na prática
       
       System.out.println("valor de raio: "+ c1.getRaio());
       System.out.print("A área é: " + c1.area());
       c1.setRaio(2);
       System.out.println("valor novo de raio: "+ c1.getRaio());
       System.out.print("A área é: "+ c1.area());




        

    }
}