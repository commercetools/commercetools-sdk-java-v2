
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddCountryUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddCountryUpdateAction addCountryUpdateAction = AddCountryUpdateAction.builder()
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddCountryUpdateActionBuilder implements Builder<AddCountryUpdateAction> {

    private String country;

    /**
     *  <p>Country to add. Represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     * @return Builder
     */

    public AddCountryUpdateActionBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Country to add. Represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * builds AddCountryUpdateAction with checking for non-null required values
     * @return AddCountryUpdateAction
     */
    public AddCountryUpdateAction build() {
        Objects.requireNonNull(country, AddCountryUpdateAction.class + ": country is missing");
        return new AddCountryUpdateActionImpl(country);
    }

    /**
     * builds AddCountryUpdateAction without checking for non-null required values
     * @return AddCountryUpdateAction
     */
    public AddCountryUpdateAction buildUnchecked() {
        return new AddCountryUpdateActionImpl(country);
    }

    /**
     * factory method for an instance of AddCountryUpdateActionBuilder
     * @return builder
     */
    public static AddCountryUpdateActionBuilder of() {
        return new AddCountryUpdateActionBuilder();
    }

    /**
     * create builder for AddCountryUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddCountryUpdateActionBuilder of(final AddCountryUpdateAction template) {
        AddCountryUpdateActionBuilder builder = new AddCountryUpdateActionBuilder();
        builder.country = template.getCountry();
        return builder;
    }

}
