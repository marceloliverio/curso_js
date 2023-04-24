import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Classificavel;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.balura.screenmatch.modelos.Episodio;
import br.com.balura.screenmatch.modelos.Filme;
import br.com.balura.screenmatch.modelos.Serie;
import br.com.balura.screenmatch.modelos.Titulo;

public class Principal {
    public static void main(String[] args) {
        Titulo meuFilme = new Titulo();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("duração do filme : " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações:" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(20);
        lost.setMinutosPorEpisodio(50);
        System.out.println("tempo para maratonar : " + lost.getDuracaoEmMinutos() + " minutos.");

        CalculadoraDeTempo calculadora  = new CalculadoraDeTempo();
        calculadora.inclui((Filme) meuFilme);
        System.out.println(calculadora.getTempoTotal());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora2 = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra((Classificavel) meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}