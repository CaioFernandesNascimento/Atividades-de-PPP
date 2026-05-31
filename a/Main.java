

public class Main {
    public static void main(String[] args) {
        FabricanteCelular apple = FabricanteCelularSingleton.getAppleInstance();
        FabricanteCelular samsung = FabricanteCelularSingleton.getSamsungInstance();

        Celular meuIphoneS = apple.constroicelular("IphoneS");
        Celular marianaIphoneX = apple.constroicelular("IphoneX");
        Celular fernandoGalaxy20 = samsung.constroicelular("Galaxy20");
        Celular lucasGalaxy8 = samsung.constroicelular("Galaxy8");

        meuIphoneS.fazLigacao();
        meuIphoneS.tirafoto();

        marianaIphoneX.fazLigacao();
        marianaIphoneX.tirafoto();

        fernandoGalaxy20.fazLigacao();
        fernandoGalaxy20.tirafoto();

        lucasGalaxy8.fazLigacao();
        lucasGalaxy8.tirafoto();
    }
}