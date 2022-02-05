package Map;

import java.util.*;

/*
 Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class Exercicio1Map {
    public static void main(String[] args) {

        System.out.println("\nCrie um dicionário e relacione os estados e suas populações: ");
        Map<String, Long> estadosNordeste = new HashMap<>(){{
           put("PE", 9616621L);
           put("AL", 3351543L);
           put("CE", 9187103L);
           put("RN", 3534265L);
        }};
        for(Map.Entry<String, Long> estado : estadosNordeste.entrySet()){
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        estadosNordeste.put("RN", 3534165L);
        for(Map.Entry<String, Long> estado : estadosNordeste.entrySet()){
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277: ");
        if(!estadosNordeste.containsKey("PB")){
            estadosNordeste.put("PB", 4039277L);
        }
        for(Map.Entry<String, Long> estado : estadosNordeste.entrySet()){
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println("\nExiba a população PE: " + estadosNordeste.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Long> estadosNordeste1 = new LinkedHashMap<>(){{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};
        for(Map.Entry<String, Long> estado : estadosNordeste1.entrySet()){
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println("\nExiba os estados e suas populações em ordem alfabética: ");
        Map<String, Long> estadosNordeste2 = new TreeMap<>(estadosNordeste1);
        for(Map.Entry<String, Long> estado : estadosNordeste2.entrySet()){
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println("\nExiba o estado com o menor população e sua quantidade: ");
        Long menorPopulacao = Collections.min(estadosNordeste.values());
        Set<Map.Entry<String, Long>> entries = estadosNordeste.entrySet();
        String estadoMenorPopulacao = "";

        for(Map.Entry<String, Long> entry : entries){
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenorPopulacao = entry.getKey();
                System.out.println("Estado: " + estadoMenorPopulacao);
                System.out.println("População: " + menorPopulacao);
            }
        }

        System.out.println("\nExiba o estado com a maior população e sua quantidade: ");
        Long maiorPopulacao = Collections.max(estadosNordeste.values());
        String estadoMaiorPopulacao = "";

        for(Map.Entry<String, Long> entry : estadosNordeste.entrySet()){
            if(entry.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = entry.getKey();
                System.out.println("Estado: " + estadoMaiorPopulacao);
                System.out.println("População: " + maiorPopulacao);
            }
        }

        System.out.println("\nExiba a soma da população desses estados: ");
        Iterator<Long> iterator = estadosNordeste.values().iterator();
        Long soma = 0L;

        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + soma/estadosNordeste.size());

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Long> iterator1 = estadosNordeste.values().iterator();

        while(iterator1.hasNext()){
            if(iterator1.next() < 4000000){
                iterator1.remove();
            }
        }
        for(Map.Entry<String, Long> estado : estadosNordeste.entrySet()){
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println("\nApague o dicionário de estados: ");
        estadosNordeste.clear();

        System.out.println("\nConfira se o dicionário está vazio: " + estadosNordeste.isEmpty());


    }
}
