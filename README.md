# Kotlin.js + Tailwind + Kotlinx.html demos

This project demonstrates a way to combine kotlin.js and kotlinx.html. This gives you a JSX-like way to build frontend UIs, without needing anything heavyweight like React (that said, no performance testing has been done on this yet.) This also uses kotlin-browser, a library that provides an update to the older org.w3c.dom classes provided in kotlin.js.

Status: weekend code, not yet used in production.

[Hosted Demo](http://kdemo.cc)

## To Run Locally

`./gradlew watch`

This will open a browser tab which will hot reload on changes to code. Tailwind is automatically rerun when new styles are added.

## To Build For Production

`./gradlew deploy`

Deploy the contents of `dist`.

## Debug in IDE

Check out https://kotlinlang.org/docs/js-debugging.html for instructions on debugging in IntelliJ.

# Demos

## Dashboard

### 1) Text Styling

Showcases applying tailwind styles. 

### 2) Button Demo

Example of using SVG, combined with tailwind animations.

### 3) Chart Demo

SVG charting + web audio API.

## Blog

Rudimentary demo right now - just showcases events.

## Book Search

Simple ecommerce layout. Implements simple axios-like http client which is used to interact with an API.

## Scope

Full screen charting using Canvas.

## Kanban

Demonstrates integrating an npm library (in this case sortable.js).


