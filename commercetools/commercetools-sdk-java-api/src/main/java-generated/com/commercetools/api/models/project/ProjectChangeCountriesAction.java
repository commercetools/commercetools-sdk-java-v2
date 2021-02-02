
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectChangeCountriesActionImpl.class)
public interface ProjectChangeCountriesAction extends ProjectUpdateAction {

    String CHANGE_COUNTRIES = "changeCountries";

    /**
    *  <p>A two-digit country code as per country code.</p>
    */
    @NotNull
    @JsonProperty("countries")
    public List<String> getCountries();

    @JsonIgnore
    public void setCountries(final String... countries);

    public void setCountries(final List<String> countries);

    public static ProjectChangeCountriesAction of() {
        return new ProjectChangeCountriesActionImpl();
    }

    public static ProjectChangeCountriesAction of(final ProjectChangeCountriesAction template) {
        ProjectChangeCountriesActionImpl instance = new ProjectChangeCountriesActionImpl();
        instance.setCountries(template.getCountries());
        return instance;
    }

    public static ProjectChangeCountriesActionBuilder builder() {
        return ProjectChangeCountriesActionBuilder.of();
    }

    public static ProjectChangeCountriesActionBuilder builder(final ProjectChangeCountriesAction template) {
        return ProjectChangeCountriesActionBuilder.of(template);
    }

    default <T> T withProjectChangeCountriesAction(Function<ProjectChangeCountriesAction, T> helper) {
        return helper.apply(this);
    }
}
