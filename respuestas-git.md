# Cuestionario

1. ¿Qué diferencia existe entre `git add` y `git commit`?
   - `git add` añade los archivos modificados para que luego al hacer `git commit` se guarden esos cambios en el historial del repositorio.


2. ¿Qué hace `git push`? ¿Por qué puede ser rechazado?
   - Envía los commits almacenados localmente hacia el repositorio remoto. Puede ser rechazado si el repositorio remoto contiene cambios que no fueron actualizados en el local.


3. ¿En qué se diferencian `git fetch` y `git pull`?
   - `git fetch` descarga los cambios del repositorio remoto al local pero sin llegar a modificar ningún archivo.
   - `git pull` integra esos cambios remotos en la rama local.


4. ¿Qué significa `origin/main`?
   - Es una referencia que indica el estado en el que se encuentra la rama `main` en el servidor remoto (`origin`).


5. ¿Qué muestra `git status` antes y después de `git add`?
   - Antes de `git add` muestra en rojo los archivos que han sido modificados y después muestra los mismos archivos en verde, indicando que están listos para el commit.


6. ¿Qué información muestra `git diff --cached`?
   - Muestra las diferencias que hay entre el último commit y los cambios que estan añadidos con `git add`.


7. ¿Para qué sirve `git log --oneline HEAD..origin/main`?
   - Sirve para listar en una línea qué commits nuevos existen en el repositorio remoto que todavía no han sido descargados.


8. ¿Por qué conviene usar commits pequeños y descriptivos?
   - Porque facilitan el seguimiento de versiones, permiten identificar los cambios y errores de forma más sencilla, y hacen que el trabajo en equipo sea mucho más ordenado.


9. ¿Cómo has resuelto el push rechazado?
   - Ejecutando primero un `git fetch origin` para recibir los cambios del repositorio remoto, seguido de un `git pull --no-rebase origin main` y un `git push origin main` para fusionar la rama remota con la local.


10. ¿En qué carpeta y ventana de IntelliJ estabas cuando ocurrió el rechazo?
    - Estaba en la carpeta `~/git/dam-pro-equipo2` dentro de la ventana del Equipo 2.