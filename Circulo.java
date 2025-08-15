public class Circulo{

 double raio;

    // Objeto com construtor
    Circulo(int r){
        raio = r;
    }

    double area(){
        return 3.14 * raio * raio;
    }

    double comprimento(){
        return 2 * 3.14 * raio;
    }
}