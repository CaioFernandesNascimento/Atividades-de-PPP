public class Samsung implements FabricanteCelular{
    @Override
    public Celular constroicelular(String modelo){
        if(modelo.equalsIgnoreCase("Galaxy20")){
            return new Galaxy20();
        }
        else if(modelo.equalsIgnoreCase("Galaxy8")){
            return new Galaxy8();
        }
        else{
            return new Galaxy20();
        }
    }
}
