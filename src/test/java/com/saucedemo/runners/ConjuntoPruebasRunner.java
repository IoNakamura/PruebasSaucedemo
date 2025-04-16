package com.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.saucedemo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@comprar_articulos"
)

public class ConjuntoPruebasRunner {
}