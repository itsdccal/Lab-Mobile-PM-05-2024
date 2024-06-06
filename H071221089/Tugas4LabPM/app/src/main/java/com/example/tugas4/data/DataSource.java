package com.example.tugas4.data;

import com.example.tugas4.R;
import com.example.tugas4.model.User;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<User> users = generateDummyUsers();

    private static ArrayList<User> generateDummyUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("tokyo lagi ", "ini_tokyolagii", "Sunday Morning", R.drawable.tokyo, R.drawable.tokyopost));
        users.add(new User("vicidior", "vicidiorrrr", "sunset with me", R.drawable.vicidior, R.drawable.vicidiorpost));
        users.add(new User("Tz Shian", "shizuru_515", "16歲生日快樂\uD83C\uDF82❤\uFE0F\n" +
                "希望今年也可以繼續擁有你們的陪伴⸝⸝◜~◝⸝⸝ᥫᩣ", R.drawable.shizuru, R.drawable.shizurupost));
        users.add(new User("XIAOYU", "xiaoyukiko", "520快樂呀 \uD83D\uDC96✨ 在這種特別的日子發yi點點粉絲福利，不過分吧？ ⁄(⁄ ⁄ ⁄ω⁄ ⁄ ⁄)⁄\n" +
                "\n" +
                "Happy 520 \uD83D\uDC96✨ It means I love you in Chinese!", R.drawable.xiaoyukiko, R.drawable.xiaoyukikopost));
        users.add(new User("Siwon Kim ", "siw0ns", "\uD83D\uDC9B휴일⭐\uFE0F 다들 주말 푹 쉬세유 !", R.drawable.siwon, R.drawable.siwonpost));
        users.add(new User("단한별", "92ddo", "재밌어보이길래", R.drawable.ddo, R.drawable.ddopost));
        return users;
    }
}
