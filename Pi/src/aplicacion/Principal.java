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

package aplicacion;

import dominio.Matematicas;

/**
 * Clase Principal que alberga el método main del programa.
 */
public class Principal {
    /**
     * Método main del programa.
     *
     * @param args argumentos que recibe el programa.
     */
    public static void main(String[] args) {
        // Muestra por pantalla el valor de PI.
        System.out.println("El valor de PI es: " + Matematicas.calcularPi(1000000));
    }
}
