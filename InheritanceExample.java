//Thanavat Voloshin 632115022
package week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball",20,"Male");
        art.genre = "hip hop";
        art.introduce();
        art.playMusic();
        Engineer job1 = new Engineer("Mike");
        job1.engineer = "Engineer";
        job1.engineer();
        Doctor job2 = new Doctor("Guy");
        job2.doctor = "Doctor";
        job2.doctor();
        Chef job3 = new Chef("Boo");
        job3.chef = "Chef";
        job3.chef();
        Singer job4 = new Singer("Anna");
        job4.singer = "Singer";
        job4.singer();
        Police job5 = new Police("Bob");
        job5.police = "Police";
        job5.police();
    }      
}
