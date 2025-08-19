public class Circulo{

private double raio;

// public void setRaio(int raio){     ----> metodo set de encapsulamento
//       this.raio = raio;
 // }


 // public int getRaio(){        ----> metodo get de encapsulamento
 //         return raio;
//  }

    // Objeto com construtor
     Circulo(int r){
        raio = r;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }






    double area(){
        return 3.14 * raio * raio;
    }

    double comprimento(){
        return 2 * 3.14 * raio;
    }
}