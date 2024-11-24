
package tarea.pkg4.pkg1.pkg1.lpoo;

class Calculadora {
    int sumar(int a, int b) {
        return a + b;
    }
    double sumar(double a, double b) {
        return a + b;
    }
}



class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Ladrido");
    }
}




interface Transporte {
    void mover();
}
class Auto implements Transporte {
    public void mover() {
        System.out.println("Conducir en carretera");
    }
}
class Barco implements Transporte {
    public void mover() {
        System.out.println("Navegar en el agua");
    }
}
