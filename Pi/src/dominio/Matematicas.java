//Copyright [2023] [Daniel Fernández López]
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

public class Matematicas {
    // Calculo Aproximación a pi mediante Montecarlo
    public static double piMontecarlo(int n) {
        int dentro = 0;
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                dentro++;
            }
        }
        return 4.0 * dentro / n;
    }
}
