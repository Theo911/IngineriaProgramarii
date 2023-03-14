import java.util.Vector;
import java.util.List;
import java.util.ArrayList;

public class Doctor implements Persoana {

  public Integer CodUnic;

  public Integer salariu;

  private Integer experienta;

  public ArrayList<String> specializare;

  public ArrayList<Integer> idPacienti;


  public void consultare( Integer idPacient) {
  }

  private void diagnosticare( Integer idPacient) {
  }

  private void eliberareReteta( Integer idPacient) {
  }
  
  @Override
	public void getProgramare() {}
	
  @Override
	public void getAdresa() {}
	
	@Override
  public void getNume(){}
	@Override
  public void getVarsta(){}
	@Override
  public void getID(){}
@Override
  public void getNrTelefon(){}
}