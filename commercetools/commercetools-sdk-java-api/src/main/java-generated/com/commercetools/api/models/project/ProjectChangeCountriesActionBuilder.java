
package com.commercetools.api.models.project;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.project.ProjectChangeCountriesAction;
import com.commercetools.api.models.project.ProjectUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeCountriesActionBuilder {

    private java.util.List<String> countries;

    public ProjectChangeCountriesActionBuilder countries(final String... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    public ProjectChangeCountriesActionBuilder countries(final java.util.List<String> countries) {
        this.countries = countries;
        return this;
    }

    public java.util.List<String> getCountries() {
        return this.countries;
    }

    public ProjectChangeCountriesAction build() {
        return new ProjectChangeCountriesActionImpl(countries);
    }

    public static ProjectChangeCountriesActionBuilder of() {
        return new ProjectChangeCountriesActionBuilder();
    }

    public static ProjectChangeCountriesActionBuilder of(final ProjectChangeCountriesAction template) {
        ProjectChangeCountriesActionBuilder builder = new ProjectChangeCountriesActionBuilder();
        builder.countries = template.getCountries();
        return builder;
    }

}
