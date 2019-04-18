package com.syafrin.drinklist;

import java.util.ArrayList;

public class Dataset_Drinks {

    public static String[][] data = new String[][]{
            {"Juice", "Fresh Orange Juice", "35.000","Tulip Glass","Squeeze","Mengonsumsi jeruk dalam bentuk jus memang menyegarkan terlebih di siang hari. Tapi tak cuma menyegarkan, buah yang satu ini juga kaya nutrisi yang memiliki manfaat sehat selain meningkatkan daya tahan tubuh",String.valueOf(R.drawable.orange)},
            {"Squash", "Lime Squash", "25.000","Long Glass","Strring","Lime Squash seringkali disajikan sebagai minuman di kafe. Rasanya yang segar dan aroma cytrusnya yang menggoda akan membuat suasana siang yang terik akan menjadi lebih dingin. Jika selama ini kamu hanya dapat menikmati minuman ini saat di kafe ",String.valueOf(R.drawable.lime)},
            {"Milkshake", "Banana Milk Shake", "26.000","Tumbler Glass","Blend","Jika Milk Lovers di rumah adalah para penggemar buah pisang maka salah satu cara alternatif untuk menikmatinya adalah dengan membuat banana milkshake. Banyak orang memang kurang menyukai buah pisang yang di jus karena teksturnya yang lembek, kental, dan kurang mengundang selera. Namun, jika buah pisang tersebut dicampur dengan milkshake pasti rasanya akan sangat lezat",String.valueOf(R.drawable.banana)},
            {"Coffee", "Coffee Latte", "37.000","Coffee Cup", "Build","Susah bangun pagi? Atau harus lembur semalaman karena banyak kerjaan? Cobalah meminum kopi saat kamu merasa ngantuk, seketika kamu akan terasa khasiatnya. Kopi bisa jadi penyelamat agar mata melek di pagi dan malam hari",String.valueOf(R.drawable.latte)},
            {"Tea", "Jasmine Tea", "18.000","Tea Cup","Build","Minum teh di pagi hari dapat memberikan semangat untuk memulai aktivitas. Minum teh di sore hari dapat membuat waktu santai lebih menyenangkan. Selain kedua manfaat tersebut, masih banyak lagi manfaat teh untuk kesehatan yang bisa Anda dapatkan. e",String.valueOf(R.drawable.jasmine)},
            {"Punch", "Fruit Punch", "29.000","Collins Glass","Shake","Fruit punch adalah minuman yang dibuat dengan jus buah dan campuran buah-buahan Campuran-campuran buah-buahan inilah yang memerlukan ketepatan dan juga kombinasi yang tepat untuk menghasilkan minuman fruit punch yang enak.",String.valueOf(R.drawable.fruitpunch)},
            {"Smoothies", "Stroberry Smoothies", "21000","Tulip Glass","Blend"," Smoothie adalah minuman berbahan baku buah-buahan, sayuran, sirup gula/ gula pasir, susu tawar cair dan es batu. Selain penambahan susu sebagai ciri khas smoothie, yoghurt, cokelat dan susu kental manis jug",String.valueOf(R.drawable.stawberry)}
    };

    public static ArrayList<Drinks> getDrinks(){
        Drinks dr = null;
        ArrayList<Drinks> list = new ArrayList<>();
        for(String[] eD : data){
            dr = new Drinks();
            dr.setKategori(eD[0]);
            dr.setNama(eD[1]);
            dr.setHarga(eD[2]);
            dr.setGlass(eD[3]);
            dr.setMetode(eD[4]);
            dr.setDeskripsi(eD[5]);
            dr.setPhoto(eD[6]);
            list.add(dr);

        }
        return list;
    };
}
