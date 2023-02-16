/* Copyright [2023] [Daniel Fernández López]
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 either express or implied. See the License for the specific
 language governing permissions and limitations under theLicense.*/

/**
 * Paquete dominio que contiene la clase Matemáticas.
 */
package dominio;

import java.util.Random;

/**
 * Clase Matematicas en la que se desarrolla la aproximación.
 */
public class Matematicas {

/**
     * Calcular pi double.
     *
     * @param n the n
     * @return the double
     */
    public static double calcularPi(int n) {

        double aciertos = 0.0;
        double areaCuadrado = 4.0;
        double radio = 1.0;

        Random rand = new Random(); // generador de números aleatorios
        for (int i = 0; i <= n; i++) {
            double x = rand.nextDouble(); // coordenada x
            double y = rand.nextDouble(); // coordenada y
            if ((x * x) + (y * y) <= 1) {
                n++;
                aciertos++;
            }
        }
        // Área del círculo = PI * radio^2
        // Área del cuadrado = lado^2
        // PI = Área del círculo / Área del cuadrado // PI = (aciertos / n) * (lado^2) / radio^2
        double areaCirculo = areaCuadrado * (aciertos / n);
        return areaCirculo / Math.pow(radio, 2);
    }
}
