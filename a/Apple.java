public class Apple implements FabricanteCelular{

    @Override
    public Celular constroicelular(String modelo){
        if(modelo.equalsIgnoreCase("IphoneX")){
            return new IphoneX();
        }
        else if(modelo.equalsIgnoreCase("IphoneS")){
            return new IphoneS();
        }
        else{
            return new IphoneS();
        }
    }

}
