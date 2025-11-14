
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveCountryUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveCountryUpdateAction removeCountryUpdateAction = RemoveCountryUpdateAction.builder()
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveCountryUpdateActionBuilder implements Builder<RemoveCountryUpdateAction> {

    private String country;

    /**
     *  <p>Country to remove. Represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     * @return Builder
     */

    public RemoveCountryUpdateActionBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Country to remove. Represented by two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * builds RemoveCountryUpdateAction with checking for non-null required values
     * @return RemoveCountryUpdateAction
     */
    public RemoveCountryUpdateAction build() {
        Objects.requireNonNull(country, RemoveCountryUpdateAction.class + ": country is missing");
        return new RemoveCountryUpdateActionImpl(country);
    }

    /**
     * builds RemoveCountryUpdateAction without checking for non-null required values
     * @return RemoveCountryUpdateAction
     */
    public RemoveCountryUpdateAction buildUnchecked() {
        return new RemoveCountryUpdateActionImpl(country);
    }

    /**
     * factory method for an instance of RemoveCountryUpdateActionBuilder
     * @return builder
     */
    public static RemoveCountryUpdateActionBuilder of() {
        return new RemoveCountryUpdateActionBuilder();
    }

    /**
     * create builder for RemoveCountryUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveCountryUpdateActionBuilder of(final RemoveCountryUpdateAction template) {
        RemoveCountryUpdateActionBuilder builder = new RemoveCountryUpdateActionBuilder();
        builder.country = template.getCountry();
        return builder;
    }

}
