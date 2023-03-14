import java.util.Vector;
import java.util.List;
import java.util.ArrayList;

public abstract class Asistenta implements Persoana {

  public Integer codUnic;

  public Integer salariu;

  public String specilizare;

  public ArrayList<String> listaPacienti;


  public void verificarePacient( Integer idPacient) {}

  private void programarePacient( Integer idPacient) {}

  public void preluarePacient( Integer idPacient) {}

}