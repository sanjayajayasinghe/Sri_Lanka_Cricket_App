package LatestNewsList;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class NewsCreator {

    static NewsCreator newsCreator;
    List<NewsParent> newsParents;


    private NewsCreator(Context context){

        newsParents = new ArrayList<>();

        newsParents.add(new NewsParent("Bangladesh vs Zimbabwe, Tri-series, 1st Match","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180507/shakib-will-lead-a-side-that-i.jpg","Hello and welcome to the opening game of the tri-series involving hosts Bangladesh and Zimbabwe. While this will be Zimbabwe's first game post being suspended by the ICC, Bangladesh themselves are recovering from their embarrassing 224-run defeat to Afghanistan.\n" +
                "\n" +
                "This is Hamilton Masakadza's last series before he calls time on his career. Can Zimbabwe give him a fitting farewell? Join us in a bit for the toss."));

        newsParents.add(new NewsParent("Strauss returns to ECB as chairman of cricket committee","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180506/he-played-a-key-role-in-the-im.jpg","Andrew Strauss, the former England captain, is back with the England and Wales Cricket Board (ECB) as Chairman of its cricket committee, the ECB announced on Thursday (September 12). Strauss's new role will include \"monitoring and developing the delivery\" of men's and women's professional cricket, along with overseeing disability cricket, national counties, clubs and universities cricket, and the talent pathway.\n" +
                "\n" +
                "The 42-year-old, knighted on Tuesday, had stepped down as ECB's director of cricket last year - having served in that capacity for three years - in order to support his wife Ruth, who was battling cancer. Andy Flower took over the role on an interim basis before Ashley Giles appointed to the position.\n" +
                "\n" +
                "\"It is a real pleasure to return to ECB in this new capacity. ECB and the whole cricket family have been a vital source of support over an extremely difficult year and it's really great to be back at Lord's, a place that has become a second home to me,\" Strauss said in a statement. \"I'm extremely passionate about developing and growing cricket in England and Wales and I look forward to working with my colleagues on the Cricket Committee to continually drive all aspects of the professional game, including women's, men's and disability cricket.\n" +
                "\n" +
                "\"I've seen first-hand how this summer of cricket has inspired more people to fall in love with the sport and I can't wait to help build on its success and support the roll-out of ECB's strategy to grow the game, Inspiring Generations.\"\n" +
                "\n" +
                "As director of cricket, a role given to Strauss in the wake of England's early exit from the 2015 World Cup, he played a key role in the improvement of England's limited-overs cricket, which paved way for the men's team's entry to the final in the World T20 in 2016 as well as their maiden World Cup title in July this year.\n" +
                "\n" +
                "Strauss's name was recommended for the role of chairman of the cricket committee by the nominations committee and he was unanimously voted for the position in August. The former opener replaces Peter Wright who stepped down as Chair of the Cricket Committee after nine years in the role."));


        newsParents.add(new NewsParent("Ethics Officer finds Ganguly guilty of \"tractable\" Conflict of Interest","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180505/ganguly-was-alleged-of-occupyi.jpg","Justice DK Jain, BCCI's Ombudsman cum Ethics Officer, has found former Sourav Ganguly guilty of \"tractable\" conflict while also offering the former India captain the benefit of doubt given the recency of the formulated new rules of the constitution. In two separate complaints filed by members of the public dated March 25, 2019 and April 4, 2019, Ganguly was alleged of occupying multiple roles - with the Cricket Advisory Committee, as an advisor with IPL side Delhi Capitals and as CAB President - amounting to conflict."));

        newsParents.add(new NewsParent("Live Cricket Score: England vs Australia, 5th Ashes Test, Day 2","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180499/mitch-marsh-powered-australia.jpg","A maiden Test five-wicket haul for Mitchell Marsh! Leads the team into the dressing room, with England bowled out for 294. It was Pat Cummins who opened things up for Australia once again, picking Jos Buttler's wicket, and Marsh has followed through with aplomb. Good time to re-plug this Mitch Marsh piece by Bharat Sundaresan.\n" +
                "\n" +
                "About the total, it's more than Tim Paine would have imagine when he opted to bowl but he will know it's a good pitch, and that Australia will need a good lead here."));

        newsParents.add(new NewsParent("Rahkeem Cornwall blitz gives St Lucia Zouks first win","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180498/cornwall-smashed-75-off-30-dur.jpg","Allrounder Rahkeem Cornwall went on a rampage in Jamaica to help St Lucia Zouks pick up their first win of the 2019 Caribbean Premier League. Cornwall, sent out to open in the chase of 171, sent the Jamaica Tallawahs bowlers on a leather hunt smashing eight sixes in his 30-ball 75 that paved the way for his side's resounding win with 20 balls left to spare.\n" +
                "\n" +
                "While Andre Fletcher got the chase underway with a six in the very first over, Cornwall began his spree with back-to-back big hits off Jerome Taylor in the third over. The boundaries continued to flow with the Tallawahs also handing out reprieves to both the openers. At the end of the powerplay, 79 runs were knocked off already with Cornwall reaching his half-century off just 19 deliveries. Despite the field now getting spread, the onslaught didn't end as Cornwall smashed two sixes and a four in the seventh over as the total reached 100 off just 43 deliveries.\n" +
                "\n" +
                "Shamar Springer finally provided his side some relief as Cornwall inside-edged one onto his stumps. Two balls later, new man John Campbell was trapped plumb in front by Ramaal Lewis. After a brief lull, Colin de Grandhomme got going as a 17-run over put the game out of Tallawahs' reach. Even though Oshane Thomas came up with a late three-wicket burst, the damage that was done in the first half of the chase as the visitors won by five wickets."));


        newsParents.add(new NewsParent("Nawroz Mangal - Living his Test dream vicariously","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180497/i-learned-from-the-big-player.jpg","Sixteen years ago Nawroz Mangal was in attendance when Bangladesh played Pakistan in Peshawar. So it was an occasion of great significance for Afghanistan's most popular captain as the team's batting coach and selector watched the Test side beat Bangaldesh last week, continuing their meteoric rise in international cricket.\n" +
                "\n" +
                "\"I was a spectator of Bangladesh and Pakistan Test match in 2003 [in Peshawar] and now we are playing against Bangladesh and beating them in Test and that is certainly a huge achievement,\" Nawroz told Cricbuzz reflecting on the journey of Afghanistan's cricket over the last decade. \"Definitely it was a big pleasure for me. When you are struggling and you are at a low stage and then you achieve your dreams then certainly that gives you a good amount of satisfaction,\" he said."));

        newsParents.add(new NewsParent("I take every match for India as a do-or-die game - Deepak Chahar","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180496/chahar-has-been-a-crucial-play.jpg","He was late to flourish after showing early promise. But as they say, it's better late than never. Deepak Chahar, who made his Team India debut last year is in the T20I squad to face the visiting South Africans. Ahead of the three-match series, the Team Rajasthan seamer spoke about his tryst with injuries, Mahendra Singh Dhoni's crucial role in his career and the upcoming matches against South Africa among other things. Excerpts:\n" +
                "\n" +
                "Almost a decade ago you made a grand entry into first-class cricket registering figures of 8-10 against Hyderabad. Since then, it has been a long struggle before you could make it to the international stage. How does it feel to have come this far?\n" +
                "\n" +
                "Since it is after so much of struggle I have reached this point in my career, the feeling is special. I could have made my debut in 2010 itself when I was the highest wicket-taker in the first-class season, but this feeling would not have been there as dealing with recurrent injuries and lack of opportunities at the state-level have made me realise the value of hard work and patience."));

        newsParents = new ArrayList<>();

        newsParents.add(new NewsParent("Bangladesh vs Zimbabwe, Tri-series, 1st Match","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180507/shakib-will-lead-a-side-that-i.jpg","Hello and welcome to the opening game of the tri-series involving hosts Bangladesh and Zimbabwe. While this will be Zimbabwe's first game post being suspended by the ICC, Bangladesh themselves are recovering from their embarrassing 224-run defeat to Afghanistan.\n" +
                "\n" +
                "This is Hamilton Masakadza's last series before he calls time on his career. Can Zimbabwe give him a fitting farewell? Join us in a bit for the toss."));

        newsParents.add(new NewsParent("Strauss returns to ECB as chairman of cricket committee","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180506/he-played-a-key-role-in-the-im.jpg","Andrew Strauss, the former England captain, is back with the England and Wales Cricket Board (ECB) as Chairman of its cricket committee, the ECB announced on Thursday (September 12). Strauss's new role will include \"monitoring and developing the delivery\" of men's and women's professional cricket, along with overseeing disability cricket, national counties, clubs and universities cricket, and the talent pathway.\n" +
                "\n" +
                "The 42-year-old, knighted on Tuesday, had stepped down as ECB's director of cricket last year - having served in that capacity for three years - in order to support his wife Ruth, who was battling cancer. Andy Flower took over the role on an interim basis before Ashley Giles appointed to the position.\n" +
                "\n" +
                "\"It is a real pleasure to return to ECB in this new capacity. ECB and the whole cricket family have been a vital source of support over an extremely difficult year and it's really great to be back at Lord's, a place that has become a second home to me,\" Strauss said in a statement. \"I'm extremely passionate about developing and growing cricket in England and Wales and I look forward to working with my colleagues on the Cricket Committee to continually drive all aspects of the professional game, including women's, men's and disability cricket.\n" +
                "\n" +
                "\"I've seen first-hand how this summer of cricket has inspired more people to fall in love with the sport and I can't wait to help build on its success and support the roll-out of ECB's strategy to grow the game, Inspiring Generations.\"\n" +
                "\n" +
                "As director of cricket, a role given to Strauss in the wake of England's early exit from the 2015 World Cup, he played a key role in the improvement of England's limited-overs cricket, which paved way for the men's team's entry to the final in the World T20 in 2016 as well as their maiden World Cup title in July this year.\n" +
                "\n" +
                "Strauss's name was recommended for the role of chairman of the cricket committee by the nominations committee and he was unanimously voted for the position in August. The former opener replaces Peter Wright who stepped down as Chair of the Cricket Committee after nine years in the role."));


        newsParents.add(new NewsParent("Ethics Officer finds Ganguly guilty of \"tractable\" Conflict of Interest","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180505/ganguly-was-alleged-of-occupyi.jpg","Justice DK Jain, BCCI's Ombudsman cum Ethics Officer, has found former Sourav Ganguly guilty of \"tractable\" conflict while also offering the former India captain the benefit of doubt given the recency of the formulated new rules of the constitution. In two separate complaints filed by members of the public dated March 25, 2019 and April 4, 2019, Ganguly was alleged of occupying multiple roles - with the Cricket Advisory Committee, as an advisor with IPL side Delhi Capitals and as CAB President - amounting to conflict."));

        newsParents.add(new NewsParent("Live Cricket Score: England vs Australia, 5th Ashes Test, Day 2","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180499/mitch-marsh-powered-australia.jpg","A maiden Test five-wicket haul for Mitchell Marsh! Leads the team into the dressing room, with England bowled out for 294. It was Pat Cummins who opened things up for Australia once again, picking Jos Buttler's wicket, and Marsh has followed through with aplomb. Good time to re-plug this Mitch Marsh piece by Bharat Sundaresan.\n" +
                "\n" +
                "About the total, it's more than Tim Paine would have imagine when he opted to bowl but he will know it's a good pitch, and that Australia will need a good lead here."));

        newsParents.add(new NewsParent("Rahkeem Cornwall blitz gives St Lucia Zouks first win","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180498/cornwall-smashed-75-off-30-dur.jpg","Allrounder Rahkeem Cornwall went on a rampage in Jamaica to help St Lucia Zouks pick up their first win of the 2019 Caribbean Premier League. Cornwall, sent out to open in the chase of 171, sent the Jamaica Tallawahs bowlers on a leather hunt smashing eight sixes in his 30-ball 75 that paved the way for his side's resounding win with 20 balls left to spare.\n" +
                "\n" +
                "While Andre Fletcher got the chase underway with a six in the very first over, Cornwall began his spree with back-to-back big hits off Jerome Taylor in the third over. The boundaries continued to flow with the Tallawahs also handing out reprieves to both the openers. At the end of the powerplay, 79 runs were knocked off already with Cornwall reaching his half-century off just 19 deliveries. Despite the field now getting spread, the onslaught didn't end as Cornwall smashed two sixes and a four in the seventh over as the total reached 100 off just 43 deliveries.\n" +
                "\n" +
                "Shamar Springer finally provided his side some relief as Cornwall inside-edged one onto his stumps. Two balls later, new man John Campbell was trapped plumb in front by Ramaal Lewis. After a brief lull, Colin de Grandhomme got going as a 17-run over put the game out of Tallawahs' reach. Even though Oshane Thomas came up with a late three-wicket burst, the damage that was done in the first half of the chase as the visitors won by five wickets."));


        newsParents.add(new NewsParent("Nawroz Mangal - Living his Test dream vicariously","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180497/i-learned-from-the-big-player.jpg","Sixteen years ago Nawroz Mangal was in attendance when Bangladesh played Pakistan in Peshawar. So it was an occasion of great significance for Afghanistan's most popular captain as the team's batting coach and selector watched the Test side beat Bangaldesh last week, continuing their meteoric rise in international cricket.\n" +
                "\n" +
                "\"I was a spectator of Bangladesh and Pakistan Test match in 2003 [in Peshawar] and now we are playing against Bangladesh and beating them in Test and that is certainly a huge achievement,\" Nawroz told Cricbuzz reflecting on the journey of Afghanistan's cricket over the last decade. \"Definitely it was a big pleasure for me. When you are struggling and you are at a low stage and then you achieve your dreams then certainly that gives you a good amount of satisfaction,\" he said."));

        newsParents.add(new NewsParent("I take every match for India as a do-or-die game - Deepak Chahar","https://www.cricbuzz.com/a/img/v1/205x152/i1/c180496/chahar-has-been-a-crucial-play.jpg","He was late to flourish after showing early promise. But as they say, it's better late than never. Deepak Chahar, who made his Team India debut last year is in the T20I squad to face the visiting South Africans. Ahead of the three-match series, the Team Rajasthan seamer spoke about his tryst with injuries, Mahendra Singh Dhoni's crucial role in his career and the upcoming matches against South Africa among other things. Excerpts:\n" +
                "\n" +
                "Almost a decade ago you made a grand entry into first-class cricket registering figures of 8-10 against Hyderabad. Since then, it has been a long struggle before you could make it to the international stage. How does it feel to have come this far?\n" +
                "\n" +
                "Since it is after so much of struggle I have reached this point in my career, the feeling is special. I could have made my debut in 2010 itself when I was the highest wicket-taker in the first-class season, but this feeling would not have been there as dealing with recurrent injuries and lack of opportunities at the state-level have made me realise the value of hard work and patience."));





    }

    public static NewsCreator get (Context context){
        if(newsCreator == null){
            newsCreator = new NewsCreator(context);
        }
        return newsCreator;
    }

    public List<NewsParent> getAll(){
        return newsParents;
    }

}
