### Escuela Colombiana de Ingeniería

### Ciclo de Vida de Desarrollo de Software
### Laboratorio N°4

## Integrantes: Ricardo Villamizar - Erick Montero

Para este taller se va a trabajar sobre el juego del ahorcado.

El sistema actual de puntuación del juego comienza en 100 puntos y va
descontando 10 puntos cada vez que se propone una letra incorrecta.

Algunos usuarios han propuesto diferentes esquemas para realizar la
puntuación, los cuales se describen a continuación:

* OriginalScore:
    * Es el esquema actual, se inicia con 100 puntos.
    * No se bonifican las letras correctas.
    * Se penaliza con 10 puntos con cada letra incorrecta.
    * El puntaje minimo es 0.

* BonusScore:
    * El juego inicia en 0 puntos.
    * Se bonifica con 10 puntos cada letra correcta.
    * Se penaliza con 5 puntos cada letra incorrecta.
    * El puntaje mínimo es 0

* PowerBonusScore:
    * El juego inicia en 0 puntos.
    * La $i-ésima$ letra correcta se bonifica con $5^i$.
    * Se penaliza con 8 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es
        500.

Lo anterior, se traduce en el siguiente modelo, donde se aplica el
principio de inversión de dependencias:

![imagen](img/model.png)

### Parte I

1. Haga un fork del proyecto (no lo descargue directamente!).

![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/5dd6af4f-8f4e-4df2-bec7-9c1f28f8170f)

3. A partir del código existente, implemente sólo los cascarones del
   modelo antes indicado.

4. Haga la especificación de los métodos calculateScore (de las tres
   variantes de GameScore), a partir de las especificaciones
   generales dadas anteriormente. Recuerde tener en cuenta: @pre,
   @pos, @param, @throws.

5. Haga commit de lo realizado hasta ahora. Desde la terminal:

    ```sh		
    git add .			
    git commit -m "especificación métodos"
    ```
![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/f460092c-757c-4e2f-9d4d-7f10c193c4f4)

![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/3a5c665b-c67a-4f36-ae98-4c155951d48e)

6. Actualice el archivo `pom.xml` e incluya las dependencias para la ultima versión de JUnit.

![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/742af7df-521c-4f44-8556-0331e5e04b67)


6. Teniendo en cuenta dichas especificaciones, en la clase donde se
   implementarán las pruebas (GameScoreTest), en los
   comentarios iniciales, especifique las clases de equivalencia para
   las tres variantes de GameScore, e identifique
   condiciones de frontera.

   ![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/0ab38c20-2d74-4b74-95c8-f494ed71823b)


8. Para cada clase de equivalencia y condición de frontera, implemente
   una prueba utilizando JUnit.

![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/e1b923ff-41e3-4ed4-97e2-d3b54fd92508)

8. Haga commit de lo realizado hasta ahora. Desde la terminal:

    ```sh		
    git add .			
    git commit -m "implementación pruebas"
    ```

![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/5495ffe6-be86-4289-bcb0-5d7dd3d9df4d)


9. Realice la implementación de los 'cascarones' realizados anteriormente.
   Asegúrese que todas las pruebas unitarias creadas en los puntos anteriores
   se ejecutan satisfactoriamente.

![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/c0af5984-1f35-424b-8952-12d1098a0b19)

![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/64da714b-c659-4758-9865-a70a51a617cb)

![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/3ab99452-2ed4-4136-a799-9812ea02839e)

11. Al finalizar haga un nuevo commit:

    ```sh		
    git add .			
    git commit -m "implementación del modelo"
    ```

    ![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/be30cafe-be4a-4367-990b-66d1e2f88dbb)


12. Para sincronizar el avance en el respositorio y NO PERDER el trabajo, use
    el comando de GIT para enviar los cambios:

    ```sh
    git push origin main
    ```

![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/f10d1cef-fccf-4ddd-8fc9-0e7e93135843)


### Parte II

Actualmente se utiliza el patrón FactoryMethod
que desacopla la creación de los objetos para diseñar un juego
de ahorcado (revisar setup.factoryMethod, el
constructor de la clase GUI y HangmanFactoryMethod).

1. Utilizando el HangmanFactoryMethod (MétodoFabrica) incluya el
   OriginalScore a la configuración.

![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/5a80dcfe-d803-44b4-a32b-626a9d98fad2)


* Mediante la configuración de la Inyección de
  Dependencias se pueda cambiar el comportamiento del mismo, por
  ejemplo:
    * Utilizar el esquema OriginalScore.
    * Utilizar el esquema BonusScore.
    * Utilizar el idioma francés.
    * Utilizar el diccionario francés.
    * etc...

 ![image](https://github.com/RichiVilla/CVDS-Lab04/assets/124943246/c452f13a-d862-4ebe-96e9-250db628b300)

