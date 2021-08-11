
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeCurrenciesActionBuilder implements Builder<ProjectChangeCurrenciesAction> {

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
        Objects.requireNonNull(currencies, ProjectChangeCurrenciesAction.class + ": currencies is missing");
        return new ProjectChangeCurrenciesActionImpl(currencies);
    }

    /**
     * builds ProjectChangeCurrenciesAction without checking for non null required values
     */
    public ProjectChangeCurrenciesAction buildUnchecked() {
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
