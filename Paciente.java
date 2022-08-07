import java.util.*;
/**
 * Write a description of class Paciente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Paciente
{
    private long cpf = 0;
    private String nome = "";
    private long telefone = 0;
    private String convenio = "";
    private String diagnostico = "";
    private int numeroConsultas = 0;
    public static Scanner in = new Scanner (System.in);
    public Paciente (){
        nome = nome();
        convenio = convenio();
        diagnostico = diagnostico();
        telefone = telefone();
        cpf = cpf();
        numeroConsultas = numeroConsultas();
    }
    public void setNome (String nome){
        nome = nome.toUpperCase();
        this.nome = nome;
    }
    public  void setConvenio (String convenio){
        convenio = convenio.toUpperCase();
        this.convenio = convenio;
    }
    public void setDiagnostico (String diagnostico){
    this.diagnostico = diagnostico;
    }
    public void setTelefone (long telefone){
        this.telefone = telefone;
    }
    public void setCpf (long cpf){
        this.cpf = cpf;
    }
    public void setNumeroConsultas (int consultas){
        numeroConsultas = consultas;
    }
    public String getNome(){return nome;}
    public String getConvenio(){return convenio;}
    public String getDiagnostico(){return diagnostico;}
    public long getCpf () {return cpf;}
    public int getNumeroConsultas () {return numeroConsultas;}
    public long getTelefone () {return telefone;}
    public String toString () 
    {
    return "\n Nome do paciente= "+ nome+"\n Cpf "+cpf+"\n Telefone= "+telefone+ "\n Convênio= "+convenio+ "\n Diagnóstico= "+diagnostico+"\n Número de consultas do mês= "+numeroConsultas;
    
   }
   public static long cpf ()
    {Random rnd = new Random();
     long cpf = (long) (10000000000L + rnd.nextFloat() * 99999999999L);
     return cpf;
    }
   public static String nome()
    {
        System.out.println("\fInsira aqui o primeiro nome do paciente:");
        String nome = in.next();
        return nome;
    }
    public static long telefone()
    {
        System.out.println("\fInsira aqui o telefone do paciente com DDD e tudo junto (ex:51995168869):");
        long telefone = 0;
        telefone = in.nextLong();
        return telefone;
    }
    public static String convenio()
    {
        System.out.println("\fInsira aqui o convenio do paciente:");
        String convenio = in.next();
        return convenio;
    }
    public static String diagnostico (){
        int escolha = 0;
        String diagnostico = "";
        while(escolha <1 || escolha >6){
        System.out.println("\fEscolha o diagnóstico do paciente");
        System.out.println("1- Covid 2- Zica 3- Chikungunya 4- Dengue 5-Varíola do Macaco; 6- Outro");
        escolha = in.nextInt();}
        switch(escolha){
        case 1: diagnostico = "Covid"; break;
        case 2: diagnostico = "Zica"; break;
        case 3: diagnostico = "Chikungunya"; break;
        case 4: diagnostico = "Dengue"; break;
        case 5: diagnostico = "Varíola do Macaco"; break;
        case 6: diagnostico = "Outro"; break;
        }
        return diagnostico;
    }
    public static int numeroConsultas(){
        System.out.println("\fInsira aqui o número de consultas do paciente:");
        int numeroConsultas = in.nextInt();
        return numeroConsultas;
    }
}
