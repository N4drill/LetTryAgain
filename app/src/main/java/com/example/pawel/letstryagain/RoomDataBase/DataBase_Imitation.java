package com.example.pawel.letstryagain.RoomDataBase;

import android.util.ArrayMap;

import com.example.pawel.letstryagain.Model.Business_Classes.Kurs;
import com.example.pawel.letstryagain.Model.Business_Classes.Opinia;
import com.example.pawel.letstryagain.Model.Business_Classes.Podanie;
import com.example.pawel.letstryagain.Model.Business_Classes.Prowadzacy;
import com.example.pawel.letstryagain.Model.Business_Classes.Sala;
import com.example.pawel.letstryagain.Model.Business_Classes.Student;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Paweł on 23.01.2018.
 */

public class DataBase_Imitation {
    ArrayList<Kurs> db_kursy;
    ArrayList<Opinia> db_opinie;
    ArrayList<Podanie> db_podania;
    ArrayList<Prowadzacy> db_prowadzacy;
    ArrayList<Sala> db_sale;
    ArrayList<Student> db_studenci;
    Random random = new Random();

    public DataBase_Imitation()
    {
        db_kursy = db_fill_kursy();
        db_opinie= db_fill_opinie();
        db_podania = new ArrayList<>();
        db_prowadzacy = db_fill_prowadzacy();
        db_sale = db_fill_sale();
        db_studenci = db_fill_studenci();
    }

    private ArrayList<Kurs> db_fill_kursy() {
        ArrayList<Kurs> temp = new ArrayList<>();
        temp.add(new Kurs("Analiza",30,2,1));
        temp.add(new Kurs("Algebra",30,3,2));
        temp.add(new Kurs("Fizyka",20,1,3));
        temp.add(new Kurs("Paradygmaty",15,1,4));
        temp.add(new Kurs("Mechanika",30,3,5));
        temp.add(new Kurs("Rachunek",30,8,6));
        temp.add(new Kurs("Optoelektronika",30,2,7));
        return temp;
    }

    private ArrayList<Opinia> db_fill_opinie() {
        ArrayList<Opinia> temp = new ArrayList<>();
        return temp;
    }


    private ArrayList<Prowadzacy> db_fill_prowadzacy() {
        ArrayList<Prowadzacy> temp = new ArrayList<>();

        Prowadzacy p1 = new Prowadzacy(30,"Marek","Konrad",9991,"mgr","Informatyki");
        Prowadzacy p2 = new Prowadzacy(50,"Marek","Jacek",9992,"dr","Matematyki");
        Prowadzacy p3 = new Prowadzacy(20,"Jacek","Kondzik",9993,"dr","Mechaniki");
        Prowadzacy p4 = new Prowadzacy(70,"Olgiert","Jacek",9994,"dr","Informatyki");
        Prowadzacy p5 = new Prowadzacy(120,"Władysłw","Orak",9995,"dr","Informatyki");
        Prowadzacy p6 = new Prowadzacy(60,"Julian","Gridziak",9996,"prof","Informatyki");
        Prowadzacy p7 = new Prowadzacy(50,"Ziemowit","Ziom",9997,"mgr","Elektroniki");
        Prowadzacy p8 = new Prowadzacy(33,"Janusz","Frak",9998,"dr","WF");
        Prowadzacy p9 = new Prowadzacy(200,"Jerzy","Czubek",9999,"dr","Elektroniki");
        Prowadzacy p10 = new Prowadzacy(40,"Zdzisław","Moher",1111,"dr","Elektroniki");
        Prowadzacy p11 = new Prowadzacy(30,"Jeremi","Jacenko",1113,"prof","Elektroniki");
        Prowadzacy p12 = new Prowadzacy(80,"Paweł","Piotr",1112,"prof","Elektroniki");


        ArrayList<Kurs> p1_kursy = new ArrayList<>();
        p1_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p1_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p1_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p1.setKursy_prowadzone_ArrayList(p1_kursy);

        ArrayList<Kurs> p2_kursy = new ArrayList<>();
        p2_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p2.setKursy_prowadzone_ArrayList(p2_kursy);

        ArrayList<Kurs> p3_kursy = new ArrayList<>();
        p3_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p3_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p3.setKursy_prowadzone_ArrayList(p3_kursy);

        ArrayList<Kurs> p4_kursy = new ArrayList<>();
        p4_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p4.setKursy_prowadzone_ArrayList(p4_kursy);

        ArrayList<Kurs> p5_kursy = new ArrayList<>();
        p5_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p5.setKursy_prowadzone_ArrayList(p5_kursy);

        ArrayList<Kurs> p6_kursy = new ArrayList<>();
        p6_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p6.setKursy_prowadzone_ArrayList(p6_kursy);

        ArrayList<Kurs> p7_kursy = new ArrayList<>();
        p7_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p7.setKursy_prowadzone_ArrayList(p7_kursy);

        ArrayList<Kurs> p8_kursy = new ArrayList<>();
        p8_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p8.setKursy_prowadzone_ArrayList(p8_kursy);

        ArrayList<Kurs> p9_kursy = new ArrayList<>();
        p9_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p9_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p9_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p9.setKursy_prowadzone_ArrayList(p9_kursy);

        ArrayList<Kurs> p10_kursy = new ArrayList<>();
        p10_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p10_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p10.setKursy_prowadzone_ArrayList(p10_kursy);


        ArrayList<Kurs> p11_kursy = new ArrayList<>();
        p11_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p11.setKursy_prowadzone_ArrayList(p11_kursy);

        ArrayList<Kurs> p12_kursy = new ArrayList<>();
        p12_kursy.add(db_kursy.get(random.nextInt(db_kursy.size()-1)));
        p12.setKursy_prowadzone_ArrayList(p12_kursy);

        temp.add(p1);
        temp.add(p2);
        temp.add(p3);
        temp.add(p4);
        temp.add(p5);
        temp.add(p6);
        temp.add(p7);
        temp.add(p8);
        temp.add(p9);
        temp.add(p10);
        temp.add(p11);
        temp.add(p12);

        return temp;
    }


    private Kurs isKursAvaible(String name,ArrayMap<String,Kurs> kurs)
    {
        if(kurs.containsKey(name))
        {
            return kurs.get(name);
        }
        else
            return null;
    }


    private ArrayList<Sala> db_fill_sale() {
        ArrayList<Sala> temp = new ArrayList<>();

        temp.add(new Sala(11,"B4",222));
        temp.add(new Sala(13,"B4",222));
        temp.add(new Sala(9,"B3",2));
        temp.add(new Sala(17,"A1",329));

        return temp;
    }

    private ArrayList<Student> db_fill_studenci() {
        ArrayList<Student> temp = new ArrayList<>();

        temp.add(new Student("Pawel", "Gluszczak", 222222, 5, "w8","informatyka","email@gmail.com"));
        temp.add(new Student("Mariusz", "Marciniak", 222289, 3, "w4","informatyka","email@gmail.com"));
        temp.add(new Student("Adam", "Zientek", 232222, 7, "w8","informatyka","email@gmail.com"));

        return temp;
    }


//------------------------------------------------------------------------

    public void db_add_kurs(Kurs kurs) {
        db_kursy.add(kurs);
    }
    public void db_add_opinie(Opinia opinia) {
        db_opinie.add(opinia);
    }
    public void db_add_podanie(Podanie podanie) {
        db_podania.add(podanie);
    }
    public void db_add_prowadzacego(Prowadzacy prowadzacy) {
        db_prowadzacy.add(prowadzacy);
    }
    public void db_add_sale(Sala sala) {
        db_sale.add(sala);
    }
    public void db_add_studenta(Student student) {
        db_studenci.add(student);
    }

    public ArrayList<Kurs> getDb_kursy() {
        return db_kursy;
    }

    public ArrayList<Opinia> getDb_opinie() {
        return db_opinie;
    }

    public ArrayList<Podanie> getDb_podania() {
        return db_podania;
    }

    public ArrayList<Prowadzacy> getDb_prowadzacy() {
        return db_prowadzacy;
    }

    public ArrayList<Sala> getDb_sale() {
        return db_sale;
    }

    public ArrayList<Student> getDb_studenci() {
        return db_studenci;
    }




}
