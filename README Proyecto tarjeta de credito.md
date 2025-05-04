# 💳 Aplicación de Compras con Tarjeta de Crédito  

Aplicación Java que simula el proceso de realizar compras con una tarjeta de crédito, mostrando un resumen ordenado de transacciones y validando el saldo disponible.  

## 🚀 Características  
✔ **Menú interactivo** para registrar compras.  
✔ **Validación de saldo disponible** antes de cada compra.  
✔ **Listado de compras ordenadas** por valor (de mayor a menor).  
✔ **Manejo de errores** para entradas inválidas (evita crashes con texto mal ingresado).  
✔ **Resumen final** con saldo restante y todas las transacciones realizadas.  

## 🛠️ Cómo Ejecutar  
1. Clona el repositorio:  
   git clone https://github.com/tu-usuario/tarjeta-credito-app.git

    Navega al directorio del proyecto:

cd tarjeta-credito-app

Compila y ejecuta

    javac Main.java TarjetaDeCredito.java Compra.java
    java Main

🖥️ Uso

    Ingresa el límite de tu tarjeta (ejemplo: 1000).

    Registra compras:

        Descripción (ejemplo: Mouse Gamer).

        Valor (ejemplo: 150.50).

    El programa valida el saldo y muestra si la compra fue exitosa o no.

    Al finalizar, puedes:

        Continuar (1) para registrar otra compra.

        Salir (0) para ver el resumen final.

📸 Captura de Ejemplo

Escriba el límite de la tarjeta de crédito:
1000

Escriba la descripción de la compra:
Mouse Gamer

Escriba el valor de la compra:
150.50
Compra realizada!

***************************
Saldo actual: 849.50
Límite restante: 150.50

Compras realizadas (ordenadas por valor):
Compra: valor=150.5, descripción='Mouse Gamer'

Escriba 0 para salir o 1 para continuar:
1

🛑 Manejo de Errores

    Si ingresas texto donde se espera un número, el programa no se rompe, sino que pide el dato nuevamente.

    Si el saldo es insuficiente, muestra: Saldo Insuficiente!.


✨ ¡Contribuciones y sugerencias son bienvenidas! ✨
