package javaPodstawy.PizzeriaApka;

public class PizzeriaMenu {
    private String[] menu;
    private String pizzeriaName;

    //kontruktory pod zmiennymi sie pisze, nic nie zwraca a nazywa sie tak jak klasa
    public PizzeriaMenu(String name) {
        // okragle sluza do argumentów- parametrow zeby je potem wywolac z tych nawiasow pojawi sie pod ta zmienną tu po {}
        // chcemy by w naszym menu znalazły sie zawsze pizze ktore napisalismy- inicjujemy

        menu = new String[]{"Margerita,Hawajska, Wegetariańska"};
        pizzeriaName = name;
        // wywolalismy w () i zostanie przypisana do pizzeriaName fioletowe linia 13

        // chcemy nazwe w parametrze bo nie chcemy zeby kazdy mial narzucona w konstruktorach nie stosujemy modyfikatorow widocznosci
        // jesli zmienna w metodzie to ma tylko jedna widocznosc lokalną
    }


    public void showMenu() {

        System.out.println("Tu pizzeria" + pizzeriaName + ", poniżej prezentuje NASZE MENU  ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
            // mamy tab menu ma 3 elementy pizze, margerira pod ind 1...

        }
    }

    // get menu to zwracanie z metody to zeby mial do niej dostep
    public String[] getMenu() {
        return menu;
        //return zwraca do wywolującego get menu i return musza byc by zwracalo
    }
// waparametrze metody order podac choose number
    public void order(int chooseNumber) {
        // string z znazwa pizzy ktora zaciaga z menu czyli tablicy ktora ma w sobie nazwy pizz
        // miejsce w tablicy -1
        int trueChosenNumber= chooseNumber-1;
        if(trueChosenNumber<menu.length && trueChosenNumber>=0){
        String pizzaName= menu[trueChosenNumber];
            System.out.println("Wybrałes pizeee"+  pizzaName);
            System.out.println("Smaczengo! Zapraszamy ponownie pizza dojedzie jutro");
    } else{
            System.out.println("Brak w ofercie, wybierz inna pizze!");
        }
    }
    //jak nie wiemy czy ma cos zwracac dajemy void
// z pizzerii wywołac order
}


