package com.alfinhe;

public class BusDistanceCalculator {
    // Distâncias entre as cidades em quilômetros
        double[][] distances = {
                {55.0, 195.0, 130.0, 278.0, 550.0},// Autocarro 1
                {195.0, 55.0, 130.0, 278.0, 550.0},// Autocarro 2
                {130.0, 130.0, 55.0, 278.0, 550.0},// Autocarro 3
                {278.0, 278.0, 278.0, 55.0, 550.0},// Autocarro 4
                {550.0, 550.0, 550.0, 550.0, 55.0}// Autocarro 5
        };
        String[] busNames = {"Autocarro 1", "Autocarro 2", "Autocarro 3", "Autocarro 4", "Autocarro 5"};
        double maxDistance = 0;
        String busWithMaxDistance = "";

        for (int i = 0; i < distances.length; i++) {
            double totalDistance = 0;
            for (int j = 0; j < distances[i].length; j++) {
                totalDistance += distances[i][j];
            }
            double averageDistance = totalDistance / distances[i].length;
            System.out.println ( "Distância média do " + busNames[i] + ": " + averageDistance + " km" );

            if (totalDistance > maxDistance) {
                maxDistance = totalDistance;
                busWithMaxDistance = busNames[i];

            }
            System.out.println("O " + busWithMaxDistance + " percorreu a maior distância: " + maxDistance + " quilômetros");
            System.out.println ( "O autocarro com a distância média mais elevada é o " + busWithMaxDistance + " com uma distância média de " + maxDistance + " km" );

        }
    }

}
