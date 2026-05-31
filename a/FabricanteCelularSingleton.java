public class FabricanteCelularSingleton {
    private static FabricanteCelular samsung;
    private static FabricanteCelular apple;

    public static FabricanteCelular getAppleInstance(){
        if(apple == null){
            apple = new Apple();
        }
        return apple;
    }
    public static FabricanteCelular getSamsungInstance(){
        if(samsung == null){
            samsung = new Samsung();
        }
        return samsung;
    }
}
//static