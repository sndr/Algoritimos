import java.time.LocalDateTime;
import java.util.*;


public class Algoritimos {
    class InsertionSort {
        public static ArrayList<Integer> sortIntegerList(ArrayList<Integer> lista) {
            for (int i = 1; i < lista.size(); i++) {
                Integer temp = lista.get(i);
                int j = i - 1;
                while (j>=0 && lista.get(j) > temp) {
                    lista.set(j+1, lista.get(j));
                    j = j - 1;
                }
                lista.set(j + 1, temp);
            }
            return lista;
            }
        public static ArrayList<String> sortStringList(ArrayList<String> lista) {

            for (int i = 1; i < lista.size(); i++) {
                String temp = lista.get(i);
                int j = i - 1;
                while (j>=0 && lista.get(j).compareTo(temp) > 0) {
                    lista.set(j+1, lista.get(j));
                    j = j - 1;
                }
                lista.set(j + 1, temp);
            }
            return lista;
            }
        public static ArrayList<LocalDateTime> sortDateList(ArrayList<LocalDateTime> lista) {

            for (int i = 1; i < lista.size(); i++) {
                LocalDateTime temp = lista.get(i);
                int j = i - 1;
                while (j>=0 && lista.get(j).compareTo(temp) > 0) {
                    lista.set(j+1, lista.get(j));
                    j = j - 1;
                }
                lista.set(j + 1, temp);
            }
            return lista;
            }
        public static void insertionSort_4(double[] salarios, String[] nomes, int[] ids) {
            int n = salarios.length;
            for (int i = 1; i < n; ++i) {
                double salarioKey = salarios[i];
                String nomeKey = nomes[i];
                int idKey = ids[i];
                int j = i - 1;
    
                while (j >= 0 && salarios[j] > salarioKey) {
                    salarios[j + 1] = salarios[j];
                    nomes[j + 1] = nomes[j];
                    ids[j + 1] = ids[j];
                    j = j - 1;
                }
                salarios[j + 1] = salarioKey;
                nomes[j + 1] = nomeKey;
                ids[j + 1] = idKey;
            }
            }
        public static void insertionSort_5(ArrayList<Integer> lista) { // recebe o array
            for (int i = 1; i < lista.size(); i++) { // faz o for de 1 ate o tamnho do array e incrementa o i++
                int chave = lista.get(i); // chave  = ao indice i da lista em 10 vezes
                int j = i - 1; // j pega o I e subtrai 
                while (j >= 0 && lista.get(j) > chave) {
                    lista.set(j + 1, lista.get(j));
                    j = j - 1;
                }
                lista.set(j + 1, chave);
            }
        }
        public static void removeDuplicatas(ArrayList<Integer> lista) {
            for (int i = 1; i < lista.size(); i++) {
                if (lista.get(i).equals(lista.get(i - 1))) {
                    lista.remove(i);
                    i--;  // ajusta o índice após a remoção
                }
            }
        }
        public class Pessoa {
            String nome;
            int id;
            Pessoa(String nome, int id) {
                this.nome = nome;
                this.id = id;
            }
        
            public String getNome() {
                return nome;
            }
        
            public int getId() {
                return id;
            }
        }
        public class OrdenarPorNomeEId implements Comparator<Pessoa> {
            public int compare(Pessoa a, Pessoa b) {
                int nomeCompare = a.getNome().compareTo(b.getNome());
                int idCompare = a.getId() - b.getId();

                if (nomeCompare == 0) {
                    return ((idCompare == 0) ? nomeCompare : idCompare);
                } else {
                    return nomeCompare;
                }
            }   
        }
        public static void inserirEmListaOrdenada(List<Integer> lista, int elemento) {
            int i = 0;
            while (i < lista.size() && lista.get(i) < elemento) {
                i++;
            }
            lista.add(i, elemento);
        }
        public static void insertionSort_9(List<Integer> lista) {
            for (int i = 1; i < lista.size(); i++) {
                int chave = lista.get(i);
                int j = i - 1;
    
                while (j >= 0 && lista.get(j) > chave) {
                    lista.set(j + 1, lista.get(j));
                    j = j - 1;
                }
                lista.set(j + 1, chave);
            }
        }
        public static void insertionSort_10(int[] array) {
            for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = key;
            }
        }
    }    
    public static void main(String[] args){
        /*  1 Ordenação de Números: Crie uma lista de números inteiros ou flutuantes aleatórios
        e use o Insertion Sort para ordená-los em ordem crescente ou decrescente.*/
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(4,5,33,55,4,6,45,56));
        System.out.println("1 = " + Algoritimos.InsertionSort.sortIntegerList(lista));
        /* 2. Ordenação de Strings: Ordene uma lista de strings alfabeticamente usando o
        Insertion Sort. Considere tanto a ordenação case-sensitive (diferencia maiúsculas de
        minúsculas) quanto case-insensitive.*/
        ArrayList<String> listStr = new ArrayList<>(Arrays.asList("joao","paulo","ana","joana","zira"));
        System.out.println("2 = " + Algoritimos.InsertionSort.sortStringList(listStr));
        /* 3. Ordenação de Datas: Dada uma lista de datas, use o Insertion Sort para ordená-las
        do mais antigo para o mais recente. Você pode usar objetos de data de uma biblioteca
        de datas em sua linguagem de programação.*/
        ArrayList<LocalDateTime> listTime = new ArrayList<>(Arrays.asList(
        LocalDateTime.of(1950,10,3,0,0),
        LocalDateTime.of(1800,4,23,0,0),
        LocalDateTime.of(2004,7,25,0,0)));
        System.out.println("3  = " + Algoritimos.InsertionSort.sortDateList(listTime));
        /*4. Ordenação de Objetos Personalizados: Crie uma classe ou estrutura para
        representar um objeto com múltiplos campos (por exemplo, um registro de empregado
        com nome, ID, e salário) e use o Insertion Sort para ordenar uma lista desses objetos
        com base em um campo específico.*/
        double[] salarios = {2000.00, 3000.00, 2500.00};
        String[] nomes = {"João", "Maria", "Pedro"};
        int[] ids = {1, 2, 3};
        Algoritimos.InsertionSort.insertionSort_4(salarios, nomes, ids);
        for (int i = 0; i < salarios.length; i++) {
            System.out.println("4 = " +i + " Nome: " + nomes[i] + ", ID: " + ids[i] + ", Salário: " + salarios[i]);
        }
        /* 5. Detectando Duplicatas: Use o Insertion Sort para ordenar uma lista e, em seguida,
        iterar sobre a lista ordenada para detectar e remover ou marcar valores duplicados. */
        ArrayList<Integer> lista_5 = new ArrayList<>(Arrays.asList(4, 3, 2, 4, 1, 3, 2, 1, 5, 5, 6)); // cria o array
        Algoritimos.InsertionSort.insertionSort_5(lista_5);
        Algoritimos.InsertionSort.removeDuplicatas(lista_5);
        System.out.println("5 = RESULTADO = " + lista_5);
        /*6. Ordenação Parcial: Ordene apenas uma parte de uma lista, mantendo o restante da
        lista inalterado. Isso pode ser útil quando apenas uma subseção de uma lista precisa
        ser ordenada.*/
        int[] numeros = {5, 3, 2, 8, 7, 6, 4, 1, 9};
        System.out.println("6 = Array original: " + Arrays.toString(numeros));
        Arrays.sort(numeros, 2, 7);
        System.out.println("6 = Array após a ordenação parcial: " + Arrays.toString(numeros));
        /* 7. Ordenação por Critérios Múltiplos: Similar à ordenação de objetos personalizados,
        mas agora considerando múltiplos critérios de ordenação. Por exemplo, primeiro por
        nome e, em caso de empate, por ID.*/
        Algoritimos algoritimos = new Algoritimos();
        Algoritimos.InsertionSort insertionSort = algoritimos.new InsertionSort();
        ArrayList<Algoritimos.InsertionSort.Pessoa> lista_7 = new ArrayList<Algoritimos.InsertionSort.Pessoa>();
        lista_7.add(insertionSort.new Pessoa("Ana", 3));
        lista_7.add(insertionSort.new Pessoa("Carlos", 1));
        lista_7.add(insertionSort.new Pessoa("Ana", 2));
        Collections.sort(lista_7, insertionSort.new OrdenarPorNomeEId());
        for (Algoritimos.InsertionSort.Pessoa pessoa : lista_7) {
            System.out.println("7 = "+ pessoa.getNome() + ", " + pessoa.getId());
        }
        /*8. Inserção em Lista Ordenada: Dada uma lista já ordenada e um novo elemento, use
        uma adaptação do Insertion Sort para inserir o novo elemento na posição correta,
        mantendo a lista ordenada.*/
        List<Integer> lista_8 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6));
        int novoElemento = 3;
        Algoritimos.InsertionSort.inserirEmListaOrdenada(lista_8, novoElemento);
        System.out.println("8 = "+ lista_8);
        /*9. Combinação de Listas Ordenadas: Dadas duas listas já ordenadas, use o Insertion
        Sort para combinar estas duas listas em uma única lista ordenada.*/
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        lista1.addAll(lista2);
        Algoritimos.InsertionSort.insertionSort_9(lista1);
        System.out.println("9 = ");
        for (int num : lista1) {
            System.out.print( num + " ");
        }
        /*10. Simulação de Classificação de Cartas: Imagine que você está ordenando um
        baralho de cartas manualmente, pegando uma carta de cada vez e inserindo-a na
        posição correta em sua mão. Simule este processo usando o Insertion Sort.*/
        int[] deck = {5, 3, 8, 4, 2, 7, 1, 10, 9, 6}; // Representação do baralho de cartas
            Algoritimos.InsertionSort.insertionSort_10(deck);
            System.out.println("\n10 = ");
            for (int i = 0; i < deck.length; i++) {
                System.out.print(deck[i] + " ");
            }
    }


}