public class Main {
    public static void main(String[] args) {
        int xp = 16000;
        String experience;
        
        if (xp < 1000) {
            experience = "Ferro";
        } else if (xp <= 2000 && xp >= 1001) {
            experience = "Bronze";
        } else if (xp <= 5000 && xp >= 2001) {
            experience = "Prata";    
        } else if (xp <= 7000 && xp >= 5001) {
            experience = "Ouro";
        } else if (xp <= 8000 && xp >= 7001) {
            experience = "Platina";    
        } else if (xp <= 9000 && xp >= 8001) {
            experience = "Ascendente";
        } else if (xp <= 10000 && xp >= 9001) {
            experience = "Imortal";    
        } else if (xp <= 15000 && xp >= 10001) {
            experience = "Radiante";    
        } else {
            experience = "Antisocial";
        }

        String antiheroName = "Sat";      
        final String antiheroX = "O antiherói de nome " + antiheroName + " está no nível de";
        System.out.printf("%s %s.%n", antiheroX, experience);   
    }          
}