## OBJECT MOTHER PATTERN
- El patrón Madre de objeto es esencialmente un caso especial del patrón Fábrica utilizado para crear objetos de prueba.

Tema tratado de:
https://reflectoring.io/objectmother-fluent-builder/


El patrón Object Mother en sí mismo es de gran ayuda para obtener rápidamente objetos predefinidos para usar en las pruebas.

Al devolver Builders con una API fluida en lugar de devolver directamente instancias de objetos, agregamos mucha flexibilidad a nuestra generación de datos de prueba, lo que hace que la creación de nuevos objetos de prueba para cualquier requisito sea muy fácil. Admite el Principio de responsabilidad única al facilitar el ajuste local de los objetos creados.