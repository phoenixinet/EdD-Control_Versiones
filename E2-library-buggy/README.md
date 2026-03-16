# 📚 E2 - Biblioteca | Debug + Git

**Práctica 4.1 – Full Stack Developer: Depuración y Control de Versiones**  
*DAW – Entornos de Desarrollo*

## Descripción del Proyecto

Sistema de gestión de biblioteca desarrollado en Java.  
La versión inicial contenía **8 bugs intencionados**. En la **Fase 3 (Corrección Sistematizada)** se han identificado, documentado, testeado y corregido todos los bugs, y se han añadido nuevas funcionalidades y mejoras de calidad.

## ✨ Nuevas Funcionalidades y Correcciones (Fase 3)

### Gestión de Libros
- **Prevención de duplicados por ISBN**  
  `addBook()` ahora valida que no existan libros con el mismo ISBN (usando `equals()` basado en ISBN).
- **Búsqueda insensible a mayúsculas/minúsculas**  
  `findBookByTitle()` utiliza `equalsIgnoreCase()`.
- **Nuevo método `removeBook(Book book)`**  
  Permite eliminar libros de la biblioteca.

### Préstamos y Devoluciones
- **Validación completa de préstamo**  
  No permite prestar un libro que ya está prestado.
- **Validación completa de devolución**  
  No permite devolver un libro que ya está disponible.
- Lógica de estado `available` correctamente gestionada en `Book.java`.

### Consultas y Rendimiento
- **`findAvailableBooks()` corregido**  
  Ahora devuelve **solo** los libros realmente disponibles.
- **Protección contra `ConcurrentModificationException`**  
  Se realiza una copia defensiva de la lista para garantizar seguridad multihilo.

### Mejoras Técnicas y Refactorización
- Getters necesarios añadidos en `Book.java`.
- Refactorización: método privado `isIsbnUnique()` en `Library.java` para separar lógica.
- Mejores prácticas de encapsulación y código limpio.

## 🛠 Tecnologías y Herramientas
- Java
- Git + GitHub (branch `bugfix/library-issues`)
- Debugger de VS Code
- JUnit (tests que reproducen y verifican cada bug)

## 📁 Estructura del Repositorio
- E2-library-buggy/
  - README.md
  - .gitignore
  - Main.java                  # Punto de entrada
  - Book.java
  - Library.java
  - LibraryTest.java           # Tests unitarios
  - E2-Full_Stack_Developer-Debug+Git.pdf
  - documentacion/             # Capturas debugger, issues y evidencias


## 🚀 Cómo Ejecutar

```bash
# Compilar
javac *.java

# Ejecutar la aplicación
java Main

Azucar sintáctico 😊
