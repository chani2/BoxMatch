

public class Fighter {
    String name ;
    int damage;
    int health;
    int weight;
    int dodge;
    int firstDamage;

    Fighter (String name, int damage, int health, int weight,int dodge,int firstDamage){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.firstDamage = firstDamage;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + "hasar vurdu.");

        if ( foe.isDodge()){
            System.out.println(foe.name + " gelen hasari blokladi ! ");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }

        return  foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    boolean isFirstDamage(){
        double randonNumber = Math.random() * 100;
        return randonNumber <= this.firstDamage;
    }


}
