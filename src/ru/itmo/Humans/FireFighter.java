package ru.itmo.Humans;

public class FireFighter {
    public static void saveMalysh(Malysh malysh) {
        try {
            if (malysh.isNeedHelp()) {
                System.out.println("FireFighters working");
            }
            else {
                throw new NotWorkingException("FireFighters dont have a job now");
            }
        } catch (NotWorkingException e) {
            e.printStackTrace();
        }
    }
}
