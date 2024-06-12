# PROYECTO MENÚ DE OPCIONES


### INTRODUCCIÓN 
El presente código proporciona una aplicación de escritorio en Java usando JavaFX. La aplicación es un editor de texto simple con funcionalidades de archivo y edición, así como una opción de ayuda. Aquí está la descripción básica y los componentes clave que se le implementó al código:

### DESARROLLO
La aplicación crea una ventana con un área de texto y un menú. El menú permite a los usuarios crear un nuevo archivo, abrir un archivo existente, guardar el contenido del área de texto en un archivo, y salir de la aplicación. También incluye opciones de cortar, copiar y pegar texto, y un ítem de ayuda que muestra información sobre la aplicación.

### COMPORTAMIENTOS DEL CÓDIGO
   - Define el paquete `application`.
   - Importa las clases necesarias de JavaFX y Java IO para la aplicación.
   - La clase `Main` son heredadas de `Application`, siendo la clase base para aplicaciones JavaFX.
   - Define un área de texto (`TextArea`) donde se editará el contenido del archivo.
   - Método principal que configura y muestra la interfaz gráfica.
   - Crea un `BorderPane` como el layout principal.
   - Crea una barra de menú (`MenuBar`).


![Captura de pantalla 2024-06-11 225709](https://github.com/Dayana-Sabando/ProMenu/assets/168872451/4b2422fb-2a30-4109-966a-69165f716a55)




![Captura de pantalla 2024-06-11 225720](https://github.com/Dayana-Sabando/ProMenu/assets/168872451/af0b132c-b4ea-43eb-99fe-34d1d9d9f626)





   - Define y muestra el menú "Archivo" con opciones para crear, abrir, guardar y salir.
   - Define y muestra las acciones para los ítems del menú "Archivo".
   - Define y muestra el menú "Editar" con opciones para cortar, copiar y pegar.
    - Establece las acciones para los ítems del menú "Editar".
- Define el menú "Ayuda" con una opción para mostrar información sobre la aplicación.
-	Crea y Muestra la Escena.




![Captura de pantalla 2024-06-11 225728](https://github.com/Dayana-Sabando/ProMenu/assets/168872451/653c1c2e-1ae2-4e1a-bf54-0bfd38a378f5)





![Captura de pantalla 2024-06-11 225820](https://github.com/Dayana-Sabando/ProMenu/assets/168872451/748a1ff7-d776-4d35-a3ac-a26647ba96aa)




- El punto de entrada de la aplicación que llama al método `launch`es para iniciar la aplicación JavaFX.
- Imprime por consola las opciones a las cuales hemos accedido.


### CONCLUSIÓN

La interfaz gráfica se estructura usando un `BorderPane`, con una barra de menú en la parte superior y un área de texto en el centro. es similar a un pequeño prototipo que se lo realiza para verificar el funcionamiento de cada componente.
