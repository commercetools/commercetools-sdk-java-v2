
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeCountriesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCountriesAction projectChangeCountriesAction = ProjectChangeCountriesAction.builder()
 *             .plusCountries(countriesBuilder -> countriesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeCountriesActionBuilder implements Builder<ProjectChangeCountriesAction> {

    private java.util.List<String> countries;

    /**
     <*  <p>New value to set. Must not be empty.</p>>
     */

    public ProjectChangeCountriesActionBuilder countries(final String... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    /**
     <*  <p>New value to set. Must not be empty.</p>>
     */

    public ProjectChangeCountriesActionBuilder countries(final java.util.List<String> countries) {
        this.countries = countries;
        return this;
    }

    /**
     <*  <p>New value to set. Must not be empty.</p>>
     */

    public ProjectChangeCountriesActionBuilder plusCountries(final String... countries) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.addAll(Arrays.asList(countries));
        return this;
    }

    public java.util.List<String> getCountries() {
        return this.countries;
    }

    public ProjectChangeCountriesAction build() {
        Objects.requireNonNull(countries, ProjectChangeCountriesAction.class + ": countries is missing");
        return new ProjectChangeCountriesActionImpl(countries);
    }

    /**
     * builds ProjectChangeCountriesAction without checking for non null required values
     */
    public ProjectChangeCountriesAction buildUnchecked() {
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
