
package main;

import conexao.ConexaoMySql;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Barbosa
 */
public class programa {
    
    public static void main(String[] args) throws SQLException {
        
        ConexaoMySql teste = new ConexaoMySql();
        //Scanner sc = new Scanner(System.in);
        
        //System.out.print("Digite seu nome: ");
        //String nome = sc.nextLine();
        
        //String sql = "INSERT INTO aluno (aluno_nome) VALUES(?)";
        teste.conectar();
        JOptionPane.showMessageDialog(null, "Banco de dados escola, criado com sucesso!");
        
        //sc.close();
    }
}
