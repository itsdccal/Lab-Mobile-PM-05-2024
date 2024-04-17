package com.example.tugas3;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<User> users = generateDummyUsers();

    private static ArrayList<User> generateDummyUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Shinkaifilms", "Seventeen years have flown by since '5 Centimeters Per Second' first graced the silver screen, yet its tender tale of love and longing remains etched in our hearts. Here's to the timeless magic of storytelling. ✨ #5CentimetersPerSecond #17Years #TimelessClassic", R.drawable.shinkai, R.drawable.shinkaipost, R.drawable.shinkaisg, "150000", "67"));
        users.add(new User("YukinoYukari", "Finding solace in the rain, amidst the whispers of nature's secrets. 🌿☔️ #GardenOfWords #RainyDayThoughts", R.drawable.yukino, R.drawable.yukinopost, R.drawable.yukinosg, "670", "110"));
        users.add(new User("Mitsuha_Miyamizu", "Lost in a dance of time and fate, weaving dreams in the threads of destiny. ✨🌪️ #YourName #ConnectedSouls", R.drawable.mitsuha, R.drawable.mitsuhapost, R.drawable.mitsuhasg, "1200", "964"));
        users.add(new User("TachibanaTaki_12", "Chasing echoes of a distant voice, across realms bound by a red string. 🌌🔴 #YourName #DestinyCalls", R.drawable.taki, R.drawable.takipost, R.drawable.takisg, "590", "620"));
        users.add(new User("Takao_san",  "Stepping into the rain, each drop a melody of inspiration. 🎶☔️ #GardenOfWords #RainyDayVibes", R.drawable.takao, R.drawable.takaopost, R.drawable.takaosg, "179", "260"));
        users.add(new User("AmanoH1na", "Beneath the sky's tears, we paint our hopes on the canvas of tomorrow. ☔️🌈 #WeatheringWithYou #DreamsUnleashed", R.drawable.hina, R.drawable.hinapost, R.drawable.hinasg, "450", "461"));
        users.add(new User("_Suzume", "In the silence of twilight, where memories linger and shadows dance, we find our stories waiting to be told. 🌅📖 #SuzumeNoTojimari #WhispersOfThePast", R.drawable.suzume, R.drawable.suzumepost, R.drawable.suzumesg, "964", "650"));
        users.add(new User("SoutaExplorer", "Amidst the pages of a forgotten tale, where courage meets destiny and adventure unfolds. 🍃⚔️ #SuzumeNoTojimari #JourneyAwaits", R.drawable.souta, R.drawable.soutapost, R.drawable.soutasg, "117", "442"));
        users.add(new User("Hodaka", "In the storm's embrace, seeking clarity amidst chaos, and finding purpose in every drop. 🌧️💫 #WeatheringWithYou #FindYourPath", R.drawable.hodaka, R.drawable.hodakapost, R.drawable.hodakasg, "235", "168"));
        users.add(new User("Shinohara-san", "In the fleeting moments of distance and time, our hearts remain tethered by the promise of tomorrow. \uD83C\uDF0C\uD83D\uDC94 #5cmPerSecond #UnforgettableBond", R.drawable.shinohara, R.drawable.shinoharapost, R.drawable.shinoharasg, "867", "678"));
        users.add(new User("TonoTaka", "Through the passage of seasons, I search for the echoes of your footsteps in the winds of change. \uD83C\uDF42\uD83D\uDC63 #5cmPerSecond #JourneyOfLonging", R.drawable.tono, R.drawable.tonopost, R.drawable.tonosg, "633", "768"));
        return users;
    }
}
