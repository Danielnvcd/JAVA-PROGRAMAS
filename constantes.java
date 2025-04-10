 class Constantes {
    public static final double ATMOSFERA_NORMAL = 1.013e5; 
    public static final double DENSIDAD_AIRE_CN = 1.293; 
    public static final double VELOCIDAD_SONIDO = 331.4; 
    public static final double CONSTANTE_SOLAR = 1340; 
    public static final double RADIO_ECUADOR_TIERRA = 6378e3; 
    public static final double RADIO_POLAR_TIERRA = 6357e3; 
    public static final double VOLUMEN_TIERRA = 1.087e21; 
    public static final double RADIO_MEDIO_TIERRA = 6371e3; 
    public static final double MASA_TIERRA = 5.983e24; 
    public static final double VELOCIDAD_MEDIA_ORBITAL_TIERRA = 107172; 
    public static final double VELOCIDAD_ANGULAR_TIERRA = 7.29e-5; 
    public static final double DENSIDAD_TIERRA = 5522; 
    public static final double RADIO_ORBITAL_TIERRA = 149e6; 
    public static final double MASA_SOLAR = 329.39e24; 
    public static final double RADIO_SOLAR = 695300; 
    public static final double GRAVEDAD_SOLAR = 28; 
    public static final double RADIO_ORBITAL_LUNA = 384e3;
    public static final double MASA_LUNA = 0.0123e24;
    public static final double GRAVEDAD_LUNA = 0.17; 
    public static final double RADIO_LUNA = 1738; 
    
    }
    
    public class Main 

    {

    public static void main(String[] args) {
        Constantes ctes = new Constantes();
        
        System.out.println("Atmósfera normal: " + ctes.ATMOSFERA_NORMAL + " N/m2");
        System.out.println("Densidad aire (CN): " + ctes.DENSIDAD_AIRE_CN + " kg/m3");
        System.out.println("Velocidad sonido: " + ctes.VELOCIDAD_SONIDO + " m/s");
        System.out.println("Constante solar: " + ctes.CONSTANTE_SOLAR + " W/m2");
        System.out.println("Radio Ecuador Tierra: " + ctes.RADIO_ECUADOR_TIERRA + " m");
        System.out.println("Radio polar Tierra: " + ctes.RADIO_POLAR_TIERRA + " m");
        System.out.println("Volumen Tierra: " + ctes.VOLUMEN_TIERRA + " m3");
        System.out.println("Radio medio Tierra: " + ctes.RADIO_MEDIO_TIERRA + " m");
        System.out.println("Masa Tierra: " + ctes.MASA_TIERRA + " kg");
        System.out.println("Velocidad media orbital Tierra: " + ctes.VELOCIDAD_MEDIA_ORBITAL_TIERRA + " km/h");
        System.out.println("Velocidad angular Tierra: " + ctes.VELOCIDAD_ANGULAR_TIERRA + " rad/s");
        System.out.println("Densidad Tierra: " + ctes.DENSIDAD_TIERRA + " kg/m3");
        System.out.println("Radio orbital Tierra: " + ctes.RADIO_ORBITAL_TIERRA + " km");
        System.out.println("Masa solar: " + ctes.MASA_SOLAR + " kg");
        System.out.println("Radio solar: " + ctes.RADIO_SOLAR + " km");
        System.out.println("Gravedad solar: " + ctes.GRAVEDAD_SOLAR + " gT");
        System.out.println("Radio orbital lunar: " + ctes.RADIO_ORBITAL_LUNA + " km");
        System.out.println("Masa lunar: " + ctes.MASA_LUNA + " kg");
        System.out.println("Gravedad lunar: " + ctes.GRAVEDAD_LUNA + " gT");
        System.out.println("Radio lunar: " + ctes.RADIO_LUNA + " km");
        
    }
}    
