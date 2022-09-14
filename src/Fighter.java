public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name,int damage,int health,int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.damage=damage;
    }

    public int hit(Fighter feo){
        System.out.println("--------------");
        System.out.println(this.name+"=>"+feo.name+" "+this.damage+"Hasar Vurdu");

        if(feo.dodge()){
            System.out.println(feo.name+"Gelen Hasarı Savurdu");
            return feo.health;
        }
        if(feo.health-this.damage<0)
            return 0;
        return feo.health-this.damage;
    }

    public boolean dodge(){
        double randomValue=Math.random()*100;
        return randomValue<=this.dodge;
    }

}
