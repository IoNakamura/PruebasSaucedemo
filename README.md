# 🧪 SauceDemoTestFlow

**SauceDemoTestFlow** es un proyecto de automatización de pruebas funcionales web que valida el flujo de compra completo en el sitio [saucedemo.com](https://www.saucedemo.com). Está desarrollado en **Java** con **Gradle**, aplicando el patrón **Screenplay** e integrado con **SerenityBDD** y **Gherkin** para pruebas BDD legibles y mantenibles.

---

## 🚀 Tecnologías utilizadas

- 🎭 **Screenplay Pattern**
- 🎥 **SerenityBDD**
- 🐍 **Gherkin** (lenguaje BDD)
- ☕ **Java**
- ⚙️ **Gradle**

---

## 📋 Características del proyecto

- Inicio de sesión con usuarios válidos.
- Agregado de artículos al carrito de compras.
- Proceso completo de checkout.
- Validación del mensaje final: `Thank you for your order!`.

---

## 🧾 Estructura del Feature

```gherkin
Característica: Realizar una compra en la pagina saucedemo

  @inicio_sesion
  Esquema del escenario: Ingresar al home Saucedemo
    Dado que inicio sesion en la pagina Saucedemo con los datos de sesion
      | <usuario> | <contrasena> |

  @comprar_articulos
  Esquema del escenario: Comprar articulos en Saucedemo
    Dado que inicio sesion en la pagina Saucedemo con los datos de sesion
      | <usuario> | <contrasena> |
    Cuando agrego 2 articulos al inventario para acceder al carrito de compras
    Y continuo el checkout para visualizar y completar el formulario de compra
    Y se visualiza el costo total finalizando la compra
    Entonces se debe verificar el mensaje: Thank you for your order!