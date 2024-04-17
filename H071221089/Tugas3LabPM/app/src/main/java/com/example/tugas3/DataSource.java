package com.example.tugas3;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<User> users = generateDummyUsers();

    private static ArrayList<User> generateDummyUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Itadori Yuji", "I'll eat all the cursed objects! That's the kind of guy I am!", R.drawable.itadori, R.drawable.itadoripost, R.drawable.itadorisg, "150000", "67"));
        users.add(new User("Fushiguro Megumi", "If there's something you want to protect, then you have to fight for it.", R.drawable.fushiguro, R.drawable.fushiguropost, R.drawable.fushigurosg, "670", "110"));
        users.add(new User("Kugisaki Nobara", "I'll do it for my ideal... and to stomp out regret.", R.drawable.nobara, R.drawable.nobarapost, R.drawable.nobarasg, "1200", "964"));
        users.add(new User("Gojo Satoru", "Being special is pretty lonely, isn't it?", R.drawable.gojo, R.drawable.gojopost, R.drawable.gojosg, "590", "620"));
        users.add(new User("Nanami Kento", "I've gotten tired of only looking out for myself.", R.drawable.nanami, R.drawable.nanamipost, R.drawable.nanamisg, "179", "260"));
        users.add(new User("Inumaki Toge", "I can't stop eating! And if I don't, I'll die!", R.drawable.inumaki, R.drawable.inumakipost, R.drawable.inumakisg, "450", "461"));
        users.add(new User("Maki Zen'in", "I'll show you just how much of a Zen'in woman I can be!", R.drawable.maki, R.drawable.makipost, R.drawable.makisg, "964", "650"));
        users.add(new User("Panda", "I can talk! I'm not a Panda!", R.drawable.panda, R.drawable.pandapost, R.drawable.pandasg, "117", "442"));
        users.add(new User("Nanako Mimiko", "My body is the only place where I can express myself.", R.drawable.nanako, R.drawable.nanakopost, R.drawable.nanakosg, "235", "168"));
        users.add(new User("Yuta Okkotsu", "I'm sorry, I have to kill you.", R.drawable.yuta, R.drawable.yutapost, R.drawable.yutasg, "867", "678"));
        users.add(new User("Kamo Noritoshi", "My friends can't handle my happiness.", R.drawable.kamo, R.drawable.kamopost, R.drawable.kamosg, "633", "768"));
        return users;
    }

}
