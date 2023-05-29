package main;

import sp.fateczl.arvorechar.Arvore;

public class Principal {
    public static void main(String[] args) {
        char[] valores = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
        
        Arvore arvore = new Arvore();
        
        for (char valor : valores) {
            arvore.insert(valor);
        }
        
        System.out.println("Atravessamento pré-fixado (antes da remoção):");
        try {
            arvore.prefixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            arvore.remove('F');
            arvore.remove('U');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nAtravessamento pré-fixado (após a remoção):");
        try {
            arvore.prefixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nAtravessamento in-fixado (após a remoção):");
        try {
            arvore.infixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nAtravessamento pós-fixado (após a remoção):");
        try {
            arvore.postfixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

