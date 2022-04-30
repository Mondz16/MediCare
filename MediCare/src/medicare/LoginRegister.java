/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class LoginRegister {

    private ArrayList<Account> accounts = new ArrayList<>();
    private final File file = new File("C:\\Users\\Christian\\Documents\\NetBeansProjects\\MediCare\\MediCare\\src\\medicare\\Database\\accounts.txt");

    public LoginRegister() throws IOException {
        GetAccountsFromTextFile();
        for(Account a : accounts){
            System.out.println(a.toString());
        }
    }

    public Account LoginAccount(String username, String password) {
        Account account = null;
        if (accounts.isEmpty()) {
            return null;
        }

        for (Account a : accounts) {
            if (a.getUsername().equals(username) && a.getPassword().equals(password)) {
                account = a.getAccount();
            } else {
                System.out.println("Username and Password doesn't match!");
            }
        }
        
        return account;
    }

    public void RegisterAccount(String username, String password) throws FileNotFoundException, IOException {
        Account account = new Account(username, password);
        SaveAccountIntoTextFile(account);
    }

    public void SaveAccountIntoTextFile(Account account) throws FileNotFoundException, IOException {
        PrintWriter outputFile = new PrintWriter(file);

        if (!accounts.isEmpty()) {
            for (Account a : accounts) {
                outputFile.println(a.toString());
                outputFile.println("---");
            }
        }

        outputFile.println(account.toString());
        outputFile.println("---");
        outputFile.close();
        System.out.println("New Account Registered!");
    }

    public void GetAccountsFromTextFile() throws IOException {
        if (!file.exists()) {
            System.out.println("File not found, so ignore reading the file");
            return;
        }

        BufferedReader lineReader = null;
        ArrayList<String> lineText = new ArrayList<String>();
        try {
            lineReader = new BufferedReader(new FileReader(file));
            String line;
            Account account;

            while ((line = lineReader.readLine()) != null) {
                if (line.equals("---")) {
                    account = new Account(lineText.get(0), lineText.get(1));
                    accounts.add(account);

                    lineText = new ArrayList<String>();
                } else {
                    lineText.add(line);
                }
            }
        } finally {
            if (lineReader != null) {
                lineReader.close();
            }
        }
    }
}
