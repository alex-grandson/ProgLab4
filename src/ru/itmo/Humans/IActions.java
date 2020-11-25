package ru.itmo.Humans;

import ru.itmo.Objects.Album;
import ru.itmo.Objects.Stump;

public interface IActions {
    public String otorvatsa();
    public String kley();
    public void lubovatsa(Stump stump);
    public void pasteStump(Album album, Stump stump);
    public void otlozhit(Album album);
    public String toBe();
}
