
public class ClienteDAO {
	
 java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContatoDAO {

    private static Long qtdContatos = 3L; 
    private static final Map<Long, Contato> ALL = new HashMap<Long, Contato>();
    
    static {
    	      
        ALL.put(1L, new Contato(1L, "Greiciane Assis", "assis@teste", "rua 1231")); 
        ALL.put(1L, new Contato(2L, "Alice Oli", "oli@teste", "rua 1231")); 
        ALL.put(1L, new Contato(3L, "Bruno Rocha", "rocha@teste", "rua 1231")); 
    }
    
    public Collection<Contato> getLista() {
        return ALL.values();
    }

    public void adiciona(Contato contato) {
        if(contato.getId()==null) {
            qtdContados++;
            contato.setId(qtdContatos);
        }
        ALL.put(contato.getId(), contato);
    }

    public void remove(Contato contato) {
        ALL.remove(contato.getId());
    }

    public Contato procura(Long id) {
        return ALL.get(id);
    }


}

}






List<Contato> lista = new ContatoDAO().getLista();
