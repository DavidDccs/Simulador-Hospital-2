import java.util.*;
import java.math.*;
/**
 * Simulador de um arquivo de hospital com diagnósticos, convênios e dados dos pacientes.
 *
 * @author David Campos e Rodrigo Binsfeld
 * @version V3
 */
public class AppPaciente
{
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args){
    System.out.println("\f");
    Paciente p1 = null;Paciente p2 = null;Paciente p3 = null;Paciente p4 = null;Paciente p5 = null;Paciente p6 = null;Paciente p7 = null;Paciente p8 = null;Paciente p9 = null;Paciente p0 = null;
    CadastroPaciente cad = new CadastroPaciente();
    int index = 0;
    while(true){
    int escolha=menu();
    if (escolha ==0){System.out.println("\fVocê fechou o programa, adeus :)"); break;}
        switch(escolha){
        case 1: 
        if(p1 == null ){p1 = new Paciente();    
        cad.adicionaPaciente(p1); index++;}else if(p2 == null){p2 = new Paciente();    
        cad.adicionaPaciente(p2);index++;}else if(p3 == null){p3 = new Paciente();    
        cad.adicionaPaciente(p3);index++;}else if(p4 == null){p4 = new Paciente();    
        cad.adicionaPaciente(p4);index++;}else if(p5 == null){p5 = new Paciente();    
        cad.adicionaPaciente(p5);index++;}else if(p6 == null){p6 = new Paciente();    
        cad.adicionaPaciente(p6);index++;}else if(p7 == null){p7 = new Paciente();    
        cad.adicionaPaciente(p7);index++;}else if(p8 == null){p8 = new Paciente();    
        cad.adicionaPaciente(p8);index++;}else if(p9 == null){p9 = new Paciente();    
        cad.adicionaPaciente(p9);index++;}else if(p0 == null){p0 = new Paciente();    
        cad.adicionaPaciente(p0);index++;}else{System.out.println("Cadastro cheio, para adicionar outro remova alguém do cadastro");}
        
        break;
        
        case 2:
        
        if(p1 == null || index==0 ){System.out.println("\fNão ha pacientes para retirar do cadastro \n");}
        else{cad.removePaciente(p1); index--;}
                
        break;
        
        case 3:
            
        
        cad.imprimeOVetor();
            
        break;
        
        case 4:
        cad.imprimeOVetorOcupado();
            
        break;
        
        case 5:
        cad.escreveEmOrdemAlfabética();
    
        break;
        
        case 6:         
        System.out.println("A média de consultas é" + cad.mediaConsultas());
        
        break;
        
        case 7:
        cad.porcentagemDiagnosticos();    
            
        break;
        
        default: System.out.println("\fEscolha uma opção valida!\n\n\n"); break;
    
    }
}
}
public static int menu() {
System.out.println("O que deseja fazer?");
System.out.println("1- Adicionar um paciente ao cadastro \n2- Remover um paciente do cadastro  \n3- Imprimir todo o cadastro  \n4- Imprimir somente as posições do cadastro ocupadas \n5- Escrever o nome dos pacientes em ordem alfabética  \n6- Escrever a média da consulta dos pacientes cadastrados \n7- Escrever a porcentagem das doenças dos pacientes  \n0- Fechar o Programa");
int menu = in.nextInt();
return menu;
}
    }
