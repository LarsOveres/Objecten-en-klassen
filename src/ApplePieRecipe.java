class ApplePieRecipe {

    public void printIngredients() {
        System.out.println(ongezoutenRoomboter.getAmount() + " " + ongezoutenRoomboter.getUnit() + " " + ongezoutenRoomboter.getName());
        System.out.println(witteBasterdSuiker.getAmount() + " " + witteBasterdSuiker.getUnit() + " " + witteBasterdSuiker.getName());
        System.out.println(zelfrijzendBakmeel.getAmount() + " " + zelfrijzendBakmeel.getUnit() + " " + zelfrijzendBakmeel.getName());
        System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
        System.out.println(vanillesuiker.getAmount() + " " + vanillesuiker.getUnit() + " " + vanillesuiker.getName());
        System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
        System.out.println(zoetzureAppels.getAmount() + " " + zoetzureAppels.getUnit() + " " + zoetzureAppels.getName());
        System.out.println(kristalSuiker.getAmount() + " " + kristalSuiker.getUnit() + " " + kristalSuiker.getName());
        System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
        System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());
    }

    //    Objecten
    Ingredients ongezoutenRoomboter = new Ingredients(200, "gram", "ongezouten roomboter");
    Ingredients witteBasterdSuiker = new Ingredients(200, "gram", "witte bastard suiker");
    Ingredients zelfrijzendBakmeel = new Ingredients(400, "gram", "zelfrijzend bakmeel");
    Ingredients ei = new Ingredients(1, "stuks", "ei");
    Ingredients vanillesuiker = new Ingredients(8, "gram", "vanillesuiker");
    Ingredients zout = new Ingredients(1, "snuf", "zout");
    Ingredients zoetzureAppels = new Ingredients(1.5, "kilo", "zoetzure appels");
    Ingredients kristalSuiker = new Ingredients(75, "gram", "kristal suiker");
    Ingredients kaneel = new Ingredients(3, "theelepels", "kaneel");
    Ingredients paneermeel = new Ingredients(15, "gram", "paneermeel");


    //Methodes
    public void step1() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void step2() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void step3() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void step4() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void step5() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void step6() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void step7() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void step8() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void step9() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void step10() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }


}