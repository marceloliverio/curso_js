public class Main {
    public static void main(String[] args) {

        Time time1 =  new Time();
        time1.setNomeTime("Vasco");

        Time time2 = new Time();
        time2.setNomeTime("Flamengo");

        Torneio torneio = new Torneio();
        torneio.setAnoTorneio = "2023";
        torneio.setNomeTorneio = "Campeonato Carioca";

        Partida partida1 = new Partida();
        partida1.setDataPartida("04/05/2023");
        partida1.setLocalPartida("São Januário");
        partida1.setTime1(partida1.getTime1());
        partida1.setTime2(partida1.getTime2());
        partida1.setResultado(partida1.getTime1());


    }
}