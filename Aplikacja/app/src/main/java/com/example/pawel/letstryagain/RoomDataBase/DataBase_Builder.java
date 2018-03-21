package com.example.pawel.letstryagain.RoomDataBase;

/**
 * Created by Paweł on 23.01.2018.
 */

public class DataBase_Builder {
    private static DataBase_Imitation dataBase_imitation = new DataBase_Imitation();

    public static DataBase_Imitation getDataBase() {
        return dataBase_imitation;
    }
}
