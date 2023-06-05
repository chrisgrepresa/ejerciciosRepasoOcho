public class Ejecutable {

    Electrodomestico electrodomesticoUno = new Electrodomestico();
    Electrodomestico electrodomesticoDos = new Electrodomestico();
    Electrodomestico electrodomesticoTres = new Electrodomestico();
    Electrodomestico electrodomesticoCuatro = new Electrodomestico();
    Lavadora lavadoraUno = new Lavadora();
    Lavadora lavadoraDos = new Lavadora();
    Lavadora lavadoraTres = new Lavadora();
    Television televisionUno = new Television();
    Television televisionDos = new Television();
    Television televisionTres = new Television();


    Electrodomestico[] electrodomesticos = {electrodomesticoUno, electrodomesticoDos, electrodomesticoTres,
            electrodomesticoCuatro, lavadoraUno, lavadoraDos, lavadoraTres, televisionUno, televisionDos,
            televisionTres};

    public void comprobar() {
        for (Electrodomestico electrodomestico : electrodomesticos) {

            if(electrodomestico instanceof Lavadora){
                System.out.println("Lavadora: " + electrodomestico);
            }
            else if (electrodomestico instanceof Television){
                System.out.println("Televisión: " + electrodomestico);
            }
            else{
                System.out.println("Otro electrodoméstico: " + electrodomestico);
            }
        }

    }
}
