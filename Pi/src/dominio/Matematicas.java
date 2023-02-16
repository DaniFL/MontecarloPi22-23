// Copyright [2023] [Daniel Fernández López]
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
// either express or implied. See the License for the specific
// language governing permissions and limitations under theLicense.

package dominio;

import java.util.Random;
public class Matematicas {

    public static double calcularPi(int n) {

        int inside = 0; // número de puntos dentro del círculo

        // generar n puntos aleatorios
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            double x = rand.nextDouble(); // coordenada x
            double y = rand.nextDouble(); // coordenada y
            if (x * x + y * y <= 1) { // punto dentro del círculo
                inside++;
            }
        }

        // calcular el valor aproximado de Pi
        double circleArea = inside / (double) n;
        double squareArea = 1;
        double pi = (circleArea * 4) / squareArea;
        return pi;
    }
}
