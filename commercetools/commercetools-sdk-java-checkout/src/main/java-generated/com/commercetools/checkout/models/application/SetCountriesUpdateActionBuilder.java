
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCountriesUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCountriesUpdateAction setCountriesUpdateAction = SetCountriesUpdateAction.builder()
 *             .plusCountries(countriesBuilder -> countriesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCountriesUpdateActionBuilder implements Builder<SetCountriesUpdateAction> {

    private java.util.List<String> countries;

    /**
     *  <p>Sets a list of countries to the Application. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries value to be set
     * @return Builder
     */

    public SetCountriesUpdateActionBuilder countries(final String... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Sets a list of countries to the Application. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries value to be set
     * @return Builder
     */

    public SetCountriesUpdateActionBuilder countries(final java.util.List<String> countries) {
        this.countries = countries;
        return this;
    }

    /**
     *  <p>Sets a list of countries to the Application. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param countries value to be set
     * @return Builder
     */

    public SetCountriesUpdateActionBuilder plusCountries(final String... countries) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.addAll(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>Sets a list of countries to the Application. Each country is represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return countries
     */

    public java.util.List<String> getCountries() {
        return this.countries;
    }

    /**
     * builds SetCountriesUpdateAction with checking for non-null required values
     * @return SetCountriesUpdateAction
     */
    public SetCountriesUpdateAction build() {
        Objects.requireNonNull(countries, SetCountriesUpdateAction.class + ": countries is missing");
        return new SetCountriesUpdateActionImpl(countries);
    }

    /**
     * builds SetCountriesUpdateAction without checking for non-null required values
     * @return SetCountriesUpdateAction
     */
    public SetCountriesUpdateAction buildUnchecked() {
        return new SetCountriesUpdateActionImpl(countries);
    }

    /**
     * factory method for an instance of SetCountriesUpdateActionBuilder
     * @return builder
     */
    public static SetCountriesUpdateActionBuilder of() {
        return new SetCountriesUpdateActionBuilder();
    }

    /**
     * create builder for SetCountriesUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCountriesUpdateActionBuilder of(final SetCountriesUpdateAction template) {
        SetCountriesUpdateActionBuilder builder = new SetCountriesUpdateActionBuilder();
        builder.countries = template.getCountries();
        return builder;
    }

}
