
/**
 * Write a description of class CadastroPaciente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class CadastroPaciente
{
    private Paciente [] vetor;
    private int index;
    
    Scanner in = new Scanner(System.in);
    
    public CadastroPaciente ( ){
    vetor = new Paciente[11];
    index = 0;
    }
    
    public boolean adicionaPaciente(Paciente novo){
        if(index>=vetor.length){System.out.println("\fLamento, o vetor está cheio! Para cadastrar outro paciente retire um da ficha!"); return false;}
        else{vetor[index] = novo;
        index++;
        return true;}
    }
    
    public int localizaPaciente (Paciente x){
    int local =-1;
    for (int i = 0; i<index; i++){if(vetor[i] ==x) {local = i;}}
    return local;
    }
    
    public boolean removePaciente(Paciente x){
        System.out.println("\f");
        System.out.println("Escolha o paciente que você deseja remover");
            for(int i = 0; i<index; i++){
            System.out.println("\nPaciente cadastrado número " + (i+1) + "\n*************************");
            System.out.println(vetor[i].toString());
        
        }
        System.out.println("\nEscolha o paciente que você deseja remover");
        int posicion = in.nextInt();
        {for(int i = posicion - 1 ; i<index-1; i++){vetor [i] = vetor[i+1];}
        vetor [index-1] = null;
        index--;
        return true;
        }
    }
    
    
    public void imprimeOVetor(){
    System.out.println("\f");
    for(int i = 0; i<index; i++){
    System.out.println("\nPaciente cadastrado número " + (i+1) + "\n*************************");
    System.out.println(vetor[i].toString());

    }
    }
    
    public void imprimeOVetorOcupado(){
    System.out.println("\f");    
    for(int i = 0; i<index; i++){
    if(vetor[i] != null){
    System.out.println("\nPaciente cadastrado número " + (i+1) + "\n*************************");
    System.out.println(vetor[i].toString());}
    }
    }
    
    public void escreveEmOrdemAlfabética(){
        System.out.println("\f");
    String aux = "";
    String [] nomes = new String [index];
    for(int i = 0; i<index; i++){
    nomes[i]= vetor[i].getNome();
    }
    Arrays.sort(nomes);
    System.out.println("Nomes em ordem alfabética: " + Arrays.toString(nomes));
    }
    
    public double mediaConsultas()
    {double media = 0;
    for(int i = 0 ; i<index; i++){ media = media + vetor[i].getNumeroConsultas();}
    media = media/index;
    return media; 
    }
    
    public void porcentagemDiagnosticos(){
    double contadorCovid=0.;
    double contadorZica=0.;
    double contadorChiku=0.;
    double contadorDengue=0.;
    double contadorVariolaM=0.;
    double contadorOutro=0.;
    for(int i = 0 ; i<index; i++)
    {if(vetor[i].getDiagnostico().equalsIgnoreCase("Dengue")){contadorDengue++; System.out.println("Nome de um dos pacientes que possui Dengue: " + vetor[i].getNome());}if(vetor[i].getDiagnostico().equalsIgnoreCase("Covid")){contadorCovid++; System.out.println("Nome de um dos pacientes que possui Covid: " + vetor[i].getNome());}
    if(vetor[i].getDiagnostico().equalsIgnoreCase("Zica")){contadorZica++; System.out.println("Nome de um dos pacientes que possui Zica: " + vetor[i].getNome());}if(vetor[i].getDiagnostico().equalsIgnoreCase("Chikungunya")){contadorChiku++; System.out.println("Nome de um dos pacientes que possui Chikungunya: " + vetor[i].getNome());}
    if(vetor[i].getDiagnostico().equalsIgnoreCase("Varíola do macaco")){contadorVariolaM++; System.out.println("Nome de um dos pacientes que possui Varíola do Macaco: " + vetor[i].getNome());}if(vetor[i].getDiagnostico().equalsIgnoreCase("Outro")){contadorOutro++; System.out.println("Nome de um dos pacientes que possui Outra doença: " + vetor[i].getNome());}}
    System.out.println("Porcentagem de pacientes com:");
    System.out.println("Covid:" + (contadorCovid/index)*100+"%");
    System.out.println("Zica:" + (contadorZica/index)*100 +"%");
    System.out.println("Chikungunya:" + (contadorChiku/index)*100+"%");
    System.out.println("Dengue:" + (contadorDengue/index)*100+"%");
    System.out.println("Varíola do Macaco:" + (contadorVariolaM/index)*100+"%");
    System.out.println("Outro:" + (contadorOutro/index)*100+"%");
    }
    
    public int getIndex(){return index;}
    }

