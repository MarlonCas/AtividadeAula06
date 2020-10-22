
package atvaula06;

/**
 *
 * @author Marlon
 */
public class AtvAula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
     Aluno a1 = new Aluno();
     a1.nome = "Konohamaru Sarutobi";
     a1.cpf = "012.123.123-45";
     a1.endereco = "Aldeia da Folha - konoha";
     a1.telefone = "(51) 99999-1234";
     
     a1.curso[0] = "Matematica";
     a1.nota[0][0] = 8.8; 
     a1.nota[0][1] = 9.0; 
     a1.nota[0][2] = 5.2;
     
     a1.curso[1] = "Português";
     a1.nota[1][0] = 7.8; 
     a1.nota[1][1] = 6.9; 
     a1.nota[1][2] = 9.2;
     
     a1.curso[2] = "Ciências";
     a1.nota[2][0] = 5.5; 
     a1.nota[2][1] = 5.3; 
     a1.nota[2][2] = 7.0;
        
      
     
     Professor p1 = new Professor();
     p1.nome = "Naruto Uzumaki";
     p1.cpf = "022.223.223-87";
     p1.endereco = "Aldeia da Folha - konoha";
     p1.telefone = "(51) 99998-2222";
     
     p1.curso[0] = "Matematica";
     p1.salario = 2000.00;
     double inss = ( 0.09*p1.salario );
     double ir = ( 0.075 * p1.salario);
    
     
    System.out.println("\nO Salário Liquido de " + p1.nome
                        +" é: " + ( p1.salario - inss - ir ) );  
     
     
        double soma = 0;
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 3; j++) {
                soma = (double) (soma + a1.nota[0][j]/3);           
              }
            }
            
        if(soma >= 7){
                System.out.println("\nNome "+a1.nome + "\nCurso: " + a1.curso[0]
                        + "\nNota: " +soma + "\nAluno Aprovado"); 
            }else if(soma < 7){
                System.out.println("\nNome "+a1.nome + "\nCurso: " + a1.curso[0]
                        + "\nNota: " +soma + "\nAluno Reprovado");
 
            }
        }
   
   
     
             

        
        
        
      
       
}
    

