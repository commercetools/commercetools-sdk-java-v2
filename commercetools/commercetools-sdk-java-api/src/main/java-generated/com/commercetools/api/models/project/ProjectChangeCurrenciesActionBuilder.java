
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeCurrenciesActionBuilder {

    private java.util.List<String> currencies;

    public ProjectChangeCurrenciesActionBuilder currencies(final String... currencies) {
        this.currencies = new ArrayList<>(Arrays.asList(currencies));
        return this;
    }

    public ProjectChangeCurrenciesActionBuilder currencies(final java.util.List<String> currencies) {
        this.currencies = currencies;
        return this;
    }

    public java.util.List<String> getCurrencies() {
        return this.currencies;
    }

    public ProjectChangeCurrenciesAction build() {
        return new ProjectChangeCurrenciesActionImpl(currencies);
    }

    public static ProjectChangeCurrenciesActionBuilder of() {
        return new ProjectChangeCurrenciesActionBuilder();
    }

    public static ProjectChangeCurrenciesActionBuilder of(final ProjectChangeCurrenciesAction template) {
        ProjectChangeCurrenciesActionBuilder builder = new ProjectChangeCurrenciesActionBuilder();
        builder.currencies = template.getCurrencies();
        return builder;
    }

}
