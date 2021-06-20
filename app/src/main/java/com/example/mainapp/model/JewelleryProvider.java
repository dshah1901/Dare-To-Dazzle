package com.example.mainapp.model;

import com.example.mainapp.R;

import java.util.ArrayList;
import java.util.Collections;

public class JewelleryProvider {

    static String[] names = {"Butterfly Minimalist Band Ring", "Platinum Plated Delicate Lace Rings",
            "Band of Hearts Sterling Silver Ring", "Gold Plated Twisted Rope Eternity Band",
            "Blue Sapphire & White Diamond Wedding Band", "Gold Round Emerald Rings",
            "Blossom & Hue Cluster Ring", "Black Tone Sapphire ring", "Black Dahlia Flower Ring",
            "Rose Gold Engagement Ring", "White Gold Water Drop Necklace", "Double Infinity Necklace",
            "Birthstone Pendant", "Crystal Aurora Pendant", "White Magic Pendant",
            "Sparkling Aqua Necklace", "Hexagonal Malachite Crystal Necklace",
            "Pearl Beaded Layered Necklace", "Ruby & Diamond Vine Branch Pendant",
            "Mini Pyramid Diamond Necklace", "Solitaire Diamond Bracelet",
            "Rattan Bracelet", "Infinity Heart Symbol Charm Bracelet", "Classic Tennis Bracelet",
            "Floral Design Gold Tone Bracelet", "Natural Stone Stretch Bracelet",
            "Blue and Clear Sparkle Slider Bracelet", "Butterfly Crystal Bracelet",
            "Hand-palm Connected Finger Zircon Bracelet", "Reflexions Mesh Bracelet", "Cartoon Frog Charm Earrings", "Star Stud Earrings",
            "Double Teardrop Dangly Earrings", "Silver Rose and Leaf dangle earring",
            "Teardrop Sparkly Dangle Earrings", "Sunburst Teardrop Pattern Earrings",
            "Gold Plated Hoops", "Studded Twisted rope hoops",
            "Celtic Knot Dangles", "Filigree Cut-out Dangling Earrings"
    };

    static String[] ids = {"R001", "R002", "R003", "R004", "R005", "R006", "R007", "R008", "R009",
            "R010", "N001", "N002", "N003", "N004", "N005", "N006", "N007", "N008", "N009",
            "N010", "B001", "B002", "B003", "B004", "B005", "B006", "B007", "B008", "B009", "B010",
            "E001", "E002", "E003", "E004", "E005", "E006", "E007", "E008", "E009", "E010"
    };

    static String[] costs = {"$3.71", "$4.14", "$32.19", "$13.45", "$296.75", "$564.80",
            "$11.99", "$187.50", "$22.99", "$60.00", "$24.95", "$59.00", "$149.00", "$29.90",
            "$179.00", "$249.00", "$34.99", "$8.95", "$622.00", "$578.00", "$12.95", "$13.00",
            "$59.99", "$14.95", "$99.00", "$9.88", "$119.00", "$49.97", "$23.90", "$349.00",
            "$1.95", "$19.95", "$17.89", "$38.00", "$14.99", "$12.99", "$12.95", "$12.95",
            "$11.99", "$12.99"
    };

    static String[] descriptions = {"A cubic Zirconia shaped Butterfly Minimalist Band Ring, 925 Sterling Silver. Made In China.\n",
            "925  Sterling Silver With Platinum Plated Delicate Lace Rings, Laces are embedded with tiny gems. Made in Shenzhen.\n",
            "Linked Love: Simple yet elegant, this sterling silver ring is comprised of a series of connected hearts; With beaded details and a meaningful design, it will add a chic expression to every ring stack.\n",
            "Our twisted eternity band shines with a unique interwoven design that sparkles. A simple and dainty twisted rope design, this elegant eternity ring offers premium quality fashion and is available in rose gold, white gold and yellow gold.\n",
            "Stunning wedding band is a piece of jewel that will certainly amaze you. Fit for all occasions\n",
            "Dazzling rock Collection 0.85 Carat (ctw) 14K, Gemstone: Emerald\n", "Our delicate cluster ring features 13 tiny sparkling cubic zirconia stones set in an alternating pattern across the band.\n",
            "A garnet red centre stone is set above the head of the dragon. It will be certain to show a cool and unique look on your finger.\n",
            "Decorated with a dainty black dahlia inspired blossom; this gorgeous ring comes to life thanks to the zirconia stone at the centre for a hint of sparkle.\n",
            "A Cubic Zirconia Gold-plated Vintage ring with a Natural quartz gemstone. Surface width: 14mm.\n",
            "White gold plated necklace with silver chain linked to a small heart charm, comfortable and fashionable specially designed for individuals, add a splash of colour to your look with this charm necklace.\n",
            "Infinity connectors paved with cubic zirconia. Has Halo style cubic zirconia teardrop and is Rhodium plated.\n",
            "This Swarovski pendant is inspired by the concept of birthstones, precious stones that correspond to different birth months. This rhodium-plated design features a single large, brilliantly cut crystal in a deep blue aquamarine tone.\n",
            "A simple yet elegant pendant made with Brass, Stainless Steel, Rose Gold Plating & Crystals.\n",
            "The Magic Necklace is inspired by the mystery and elegance of snowflakes. Its beautifully balanced rhodium-plated design captures the spirit of the festive season with an irresistible touch of Swarovski sparkle.\n",
            "This lovely Swarovski necklace features a bright colour scheme. It consists of a rhodium-plated chain adorned with a square-shaped, sparkling blue Swarovski crystal.\n",
            "Malachite encourages us to turn over a new leaf. A stone of transformation, give this crystal to your loved one or friend as they enter into a new chapter in their life. The crystal shall bring energy and focus to your whole self, leading you to successful growth.\n",
            "Glamorous Layered Faux Pearl Necklace suitable for special occasions. The colour of the pearls is Beige.\n",
            "A handcrafted natural Burmese ruby pendant featuring four brilliant-cut round diamonds. This popular design is a QP favourite: each ruby is picked out by eye and examined before being set into solid white gold. The pendant is suspended by a delicate yet robust double link rope chain.\n",
            "Consciously handcrafted in high quality 50% recycled 9k White Gold. Six White Diamonds.\n",
            "Beautiful Solitaire Simulated Diamond Dainty Bracelets for Women are set with handpicked AAAAA Grade Cubic Zirconia.\n",
            "Handmade Rattan bracelet is crafted by hand featuring wicker braid Straw bracelet, elegantly charming. made of Natural Materials, Straw Weave which is hypoallergenic, no nickel and lead-free, suitable for sensitive skins.\n",
            "Fastened with a lobster clasp, this charm adjustable bracelet is punctuated by a beautiful infinity heart symbol which is embellished with glittering crystal to make it truly eye-catching.\n",
            "Tennis bracelet featuring round 3mm AAA+ cubic zirconia stones in four-prong basket settings. Measures 6.5 inches in length.\n",
            "The Tropical bangle bracelet combines the precision and quality of brilliant crystals with a tropical design and gold-tone plating, for a touch of glamour for any occasion.\n",
            "The bracelet is natural stone blue sandstone, beads for jewellery making, healing crystals beads, beautiful and healthy.\n",
            "Inspire a sense of majestic beauty with this sterling silver slider bracelet. Featuring sparkling blue and clear stones in an alternating pattern, this bracelet will be a simple and elegant addition to any outfit. This bracelet features a sliding clasp, so you can adjust it to your perfect fit.\n",
            "This is our beautiful Butterfly Crystal Bracelet with Swarovski Crystals. For anyone who loves Butterflies, this is a must-have.\n",
            "Trendy Gold plated cubic zirconia bracelet connected to one of the fingers.\n",
            "The collection's flat mesh bracelet holds clip-on charms that sit flush to mirror your style – whatever shape it takes.\n",
            "Cute boho dangling resin earrings that remind you of Kermit the frog.\n",
            "Really beautiful and well made cute classic star stud earrings. Perfect for women. They fit your daily looks perfectly but also work great to rock perfect occasions.\n",
            "Light-catching chandelier ear dangles feature two sparkly dangling simulated druzy.\n", "Modern, affordable chic metal earrings of 1.25 inches in length.\n",
            "Dramatic Zirconia Crystal cubic zirconia rhinestones  Drop Earrings with metal casting. Austrian Style. Hypoallergenic.\n",
            "Made With Love, Filigree sunburst teardrop pattern earrings are a timeless treasure! for a look that's ornate yet still incredibly versatile.\n",
            "Large Yellow Gold Hoop Earrings. Crafted to be lightweight for easy all-day wear. They are plated in 14K Yellow Gold for a long-lasting brilliant finish.\n",
            "These tasteful twisted rope design hoop earrings are a classic piece of jewellery for any woman! The 14K gold plated twisted hoops add a simple and easy accessory for everyday fashion.\n",
            "Platinum plating OVER STERLING SILVER, give the look of white gold and platinum, Tarnish resistant. Comfort-Fit Design. Adjustable sizing.\n",
            "Filigree Hanging Dazzling Style. 18k Gold Plated High Polish Finish.\n"
    };

    //Image Path of Front Image in the drawable folder
    static int[] coverImages = {R.drawable.r001a, R.drawable.r002a, R.drawable.r003a,
            R.drawable.r004a, R.drawable.r005a, R.drawable.r006a, R.drawable.r007a,
            R.drawable.r008a, R.drawable.r009a, R.drawable.r010a, R.drawable.n001a, R.drawable.n002a,
            R.drawable.n003a, R.drawable.n004a, R.drawable.n005a, R.drawable.n006a, R.drawable.n007a,
            R.drawable.n008a, R.drawable.n009a, R.drawable.n010a, R.drawable.b001a, R.drawable.b002a,
            R.drawable.b003a, R.drawable.b004a, R.drawable.b005a, R.drawable.b006a, R.drawable.b007a,
            R.drawable.b008a, R.drawable.b009a, R.drawable.b010a, R.drawable.e001a, R.drawable.e002a,
            R.drawable.e003a, R.drawable.e004a, R.drawable.e005d, R.drawable.e006a, R.drawable.e007a,
            R.drawable.e008a, R.drawable.e009a, R.drawable.e010a
    };

    static int[][] images = {
            {R.drawable.r001a, R.drawable.r001b, R.drawable.r001c, R.drawable.r001d},
            {R.drawable.r002a, R.drawable.r002b, R.drawable.r002c, R.drawable.r002d},
            {R.drawable.r003a, R.drawable.r003b, R.drawable.r003c, R.drawable.r003d},
            {R.drawable.r004a, R.drawable.r004b, R.drawable.r004c, R.drawable.r004d},
            {R.drawable.r005a, R.drawable.r005b, R.drawable.r005c, R.drawable.r005d},
            {R.drawable.r006a, R.drawable.r006b, R.drawable.r006c, R.drawable.r006d},
            {R.drawable.r007a, R.drawable.r007b, R.drawable.r007c, R.drawable.r007d},
            {R.drawable.r008a, R.drawable.r008b, R.drawable.r008c, R.drawable.r008d},
            {R.drawable.r009a, R.drawable.r009b, R.drawable.r009c, R.drawable.r009d},
            {R.drawable.r010a, R.drawable.r010b, R.drawable.r010c, R.drawable.r010d},
            {R.drawable.n001a, R.drawable.n001b, R.drawable.n001c, R.drawable.n001d},
            {R.drawable.n002a, R.drawable.n002a, R.drawable.n002c, R.drawable.n002d},
            {R.drawable.n003a, R.drawable.n003b, R.drawable.n003c, R.drawable.n003d},
            {R.drawable.n004a, R.drawable.n004b, R.drawable.n004c, R.drawable.n004d},
            {R.drawable.n005a, R.drawable.n005b, R.drawable.n005c, R.drawable.n005d},
            {R.drawable.n006a, R.drawable.n006b, R.drawable.n006c, R.drawable.n006d},
            {R.drawable.n007a, R.drawable.n007b, R.drawable.n007c, R.drawable.n007d},
            {R.drawable.n008a, R.drawable.n008b, R.drawable.n008c, R.drawable.n008d},
            {R.drawable.n009a, R.drawable.n009b, R.drawable.n009c, R.drawable.n009d},
            {R.drawable.n010a, R.drawable.n010b, R.drawable.n010c, R.drawable.n010d},
            {R.drawable.b001a, R.drawable.b001b, R.drawable.b001c, R.drawable.b001d},
            {R.drawable.b002a, R.drawable.b002b, R.drawable.b002c, R.drawable.b002d},
            {R.drawable.b003a, R.drawable.b003b, R.drawable.b003c, R.drawable.b003d},
            {R.drawable.b004a, R.drawable.b004b, R.drawable.b004c, R.drawable.b004d},
            {R.drawable.b005a, R.drawable.b005b, R.drawable.b005c, R.drawable.b005d},
            {R.drawable.b006a, R.drawable.b006b, R.drawable.b006c, R.drawable.b006d},
            {R.drawable.b007a, R.drawable.b007b, R.drawable.b007c, R.drawable.b007d},
            {R.drawable.b008a, R.drawable.b008b, R.drawable.b008c, R.drawable.b008d},
            {R.drawable.b009a, R.drawable.b009b, R.drawable.b009c, R.drawable.b009d},
            {R.drawable.b010a, R.drawable.b010b, R.drawable.b010c, R.drawable.b010d},
            {R.drawable.e001a, R.drawable.e001b, R.drawable.e001c, R.drawable.e001d},
            {R.drawable.e002a, R.drawable.e002b, R.drawable.e002c, R.drawable.e002d},
            {R.drawable.e003a, R.drawable.e003b, R.drawable.e003c, R.drawable.e003d},
            {R.drawable.e004a, R.drawable.e004b, R.drawable.e004c, R.drawable.e004d},
            {R.drawable.e005a, R.drawable.e005b, R.drawable.e005c, R.drawable.e005d},
            {R.drawable.e006a, R.drawable.e006b, R.drawable.e006c, R.drawable.e006d},
            {R.drawable.e007a, R.drawable.e007b, R.drawable.e007c, R.drawable.e007d},
            {R.drawable.e008a, R.drawable.e008b, R.drawable.e008c, R.drawable.e008d},
            {R.drawable.e009a, R.drawable.e009b, R.drawable.e009c, R.drawable.e009d},
            {R.drawable.e010a, R.drawable.e010b, R.drawable.e010c, R.drawable.e010d}
    };


    public static ArrayList<Jewellery> generateData() {
        ArrayList<Jewellery> jewelleries = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            String name = names[i];
            String id = ids[i];
            String cost = costs[i];
            String description = descriptions[i];
            int covered = coverImages[i];
            int[] image = images[i];

            Jewellery aJewel = new Jewellery(id, name, cost, description, covered, image);
            jewelleries.add(aJewel);
        }
        return jewelleries;
    }

    public static ArrayList<Jewellery> generateRingsData() {
        ArrayList<Jewellery> jewelleries = generateData();
        ArrayList<Jewellery> rings = new ArrayList<>();
        for (Jewellery aJewel : jewelleries) {
            if (aJewel.getId().contains("R"))
                rings.add(aJewel);
        }
        return rings;
    }

    public static ArrayList<Jewellery> generateNecklaceData() {
        ArrayList<Jewellery> jewelleries = generateData();
        ArrayList<Jewellery> necklaces = new ArrayList<>();
        for (Jewellery aJewel : jewelleries) {
            if (aJewel.getId().contains("N"))
                necklaces.add(aJewel);
        }
        return necklaces;
    }

    public static ArrayList<Jewellery> generateEarringData() {
        ArrayList<Jewellery> jewelleries = generateData();
        ArrayList<Jewellery> earrings = new ArrayList<>();
        for (Jewellery aJewel : jewelleries) {
            if (aJewel.getId().contains("E"))
                earrings.add(aJewel);
        }
        return earrings;
    }

    public static ArrayList<Jewellery> generateBraceletData() {
        ArrayList<Jewellery> jewelleries = generateData();
        ArrayList<Jewellery> bracelets = new ArrayList<>();
        for (Jewellery aJewel : jewelleries) {
            if (aJewel.getId().contains("B"))
                bracelets.add(aJewel);
        }
        return bracelets;
    }

    public static ArrayList<Jewellery> generateTopData() {
        ArrayList<Jewellery> jewelleries = sortByClicks(generateData());
        ArrayList<Jewellery> top = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            top.add(jewelleries.get(i));
        }
        return top;
    }

    public static ArrayList<Jewellery> sortByClicks(ArrayList<Jewellery> jewelleries) {
        Collections.sort(jewelleries, (o1, o2) -> o1.getClickNum().compareTo(o2.getClickNum()));
        Collections.reverse(jewelleries);
        return jewelleries;
    }
}
