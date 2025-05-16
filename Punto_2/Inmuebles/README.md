# Actividad 3 - Punto 2: Herencia de clases y estructuras complejas

## Descripción

Este ejercicio corresponde al **punto 3 de la Actividad 3** de la materia **Programación Orientada a Objetos (POO)**.

El objetivo principal era **desarrollar un programa que modele diferentes tipos de inmuebles** con el uso de **herencia**, organizando clases según la jerarquía del enunciado propuesto en la guía.

Se implementaron las siguientes clases y estructuras:

- Clase base: `Inmueble` (atributos: identificador inmobiliario, área en metros cuadrados, dirección).
- Clases hijas de `Inmueble`:
  - `Vivienda` → clase abstracta para agrupar atributos comunes (número de habitaciones, número de baños).
    - `Casa` → se divide en:
      - `CasaRural` (atributos: distancia a la cabecera municipal, altitud).
      - `CasaUrbana` (puede ser conjunto cerrado o independiente).
        - `CasaConjuntoCerrado` (atributos: valor de administración, incluye o no áreas comunes).
    - `Apartamento` → se divide en:
      - `ApartaEstudio` (una sola habitación).
      - `ApartamentoFamiliar` (valor de administración).
  - `Local` → se divide en:
    - `LocalComercial` (atributos: localización interna o externa, centro comercial al que pertenece).
    - `Oficina` (atributo: si es del gobierno, tipo `boolean`).

También se implementó:

- Un método `imprimir()` en cada clase para mostrar sus atributos.
- Un atributo común en todos los inmuebles llamado `valorCompra`, que depende del área del inmueble.
- Uso de `super()` para invocar constructores de clases padre.
- Paquete definido como `Inmuebles`.

## UML

![Diagrama de clases](/Punto_2/Inmuebles/UML_Ejercicio2.png)
