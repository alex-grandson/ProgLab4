package ru.itmo;

import ru.itmo.Humans.Karlson;
import ru.itmo.Humans.Malysh;
import ru.itmo.Humans.Mom;
import ru.itmo.Location.Kitchen;
import ru.itmo.Location.Roof;
import ru.itmo.Objects.Album;
import ru.itmo.Objects.Organs;
import ru.itmo.Objects.Stump;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* Main Text
        Но Малыш не мог оторваться от своей марки.
        Он ее уже наклеил и сейчас любовался ею --
        до чего хороша! Малыш отложил альбом. Полететь
        с Карлсоном на крышу -- об этом можно было только
        мечтать! Лишь однажды довелось ему побывать у Карлсона,
        в его маленьком домике на крыше. Но в тот раз мама почему-то
        ужасно испугалась и вызвала пожарников.
         */
        ArrayList<Organs> karlsonOrgans = new ArrayList<Organs>();
        karlsonOrgans.add(new Organs("harya", Organs.OrganTypes.FACE));
        karlsonOrgans.add(new Organs("propeller", Organs.OrganTypes.PROPELLER));
        karlsonOrgans.add(new Organs("motorchick", Organs.OrganTypes.HEART));
        Karlson karlson = new Karlson("Karlson", karlsonOrgans);

        ArrayList<Organs> malyshOrgans = new ArrayList<Organs>();
        malyshOrgans.add(new Organs("litso", Organs.OrganTypes.FACE));
        malyshOrgans.add(new Organs("glaza", Organs.OrganTypes.EYES));
        malyshOrgans.add(new Organs("serdechko", Organs.OrganTypes.HEART));
        Malysh malysh = new Malysh("malysh", malyshOrgans);

        Mom mom = new Mom("Mom");
        Album album = new Album(malysh.getName());
        Stump stump = new Stump("The most beautiful stump", 100, "USSR", 5);

        Kitchen kitchen = new Kitchen();
        kitchen.addCreature(malysh);
        kitchen.addCreature(karlson);
        malysh.pasteStump(album, stump);
        malysh.lubovatsa(stump);
        malysh.otlozhit(album);

        Roof roof = new Roof();
        roof.addCreature(karlson);
        roof.addCreature(malysh);
        karlson.showRodnoyHouse(malysh);
        karlson.poshalitb(malysh);

        malysh.dontNeedHelp();

        mom.frightened(malysh);
        karlson.flyAway();
    }
}
