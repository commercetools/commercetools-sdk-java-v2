
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectChangeCurrenciesActionImpl.class)
public interface ProjectChangeCurrenciesAction extends ProjectUpdateAction {

    String CHANGE_CURRENCIES = "changeCurrencies";

    /**
    *  <p>A three-digit currency code as per currency code.</p>
    */
    @NotNull
    @JsonProperty("currencies")
    public List<String> getCurrencies();

    @JsonIgnore
    public void setCurrencies(final String... currencies);

    public void setCurrencies(final List<String> currencies);

    public static ProjectChangeCurrenciesAction of() {
        return new ProjectChangeCurrenciesActionImpl();
    }

    public static ProjectChangeCurrenciesAction of(final ProjectChangeCurrenciesAction template) {
        ProjectChangeCurrenciesActionImpl instance = new ProjectChangeCurrenciesActionImpl();
        instance.setCurrencies(template.getCurrencies());
        return instance;
    }

    public static ProjectChangeCurrenciesActionBuilder builder() {
        return ProjectChangeCurrenciesActionBuilder.of();
    }

    public static ProjectChangeCurrenciesActionBuilder builder(final ProjectChangeCurrenciesAction template) {
        return ProjectChangeCurrenciesActionBuilder.of(template);
    }

    default <T> T withProjectChangeCurrenciesAction(Function<ProjectChangeCurrenciesAction, T> helper) {
        return helper.apply(this);
    }
}
