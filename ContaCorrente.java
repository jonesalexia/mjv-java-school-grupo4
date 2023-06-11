import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    
    String numeroConta;
    String numeroAgencia;
    String nomeCliente;
    List<Object> extrato;
    LocalDate dataNascimento;

    public void sacar(double valor){}

    public void transferir(String contaDestinatario, double valor) {}

    public void cancelar(String justificativa) {}

    public List<Object> consultarExtrato(){return extrato;}
}




