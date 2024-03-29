
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreRemoveCountryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRemoveCountryAction storeRemoveCountryAction = StoreRemoveCountryAction.builder()
 *             .country(countryBuilder -> countryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreRemoveCountryActionBuilder implements Builder<StoreRemoveCountryAction> {

    private com.commercetools.api.models.store_country.StoreCountry country;

    /**
     *  <p>Value to remove from <code>countries</code>.</p>
     * @param builder function to build the country value
     * @return Builder
     */

    public StoreRemoveCountryActionBuilder country(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.country = builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to remove from <code>countries</code>.</p>
     * @param builder function to build the country value
     * @return Builder
     */

    public StoreRemoveCountryActionBuilder withCountry(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        this.country = builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of());
        return this;
    }

    /**
     *  <p>Value to remove from <code>countries</code>.</p>
     * @param country value to be set
     * @return Builder
     */

    public StoreRemoveCountryActionBuilder country(
            final com.commercetools.api.models.store_country.StoreCountry country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Value to remove from <code>countries</code>.</p>
     * @return country
     */

    public com.commercetools.api.models.store_country.StoreCountry getCountry() {
        return this.country;
    }

    /**
     * builds StoreRemoveCountryAction with checking for non-null required values
     * @return StoreRemoveCountryAction
     */
    public StoreRemoveCountryAction build() {
        Objects.requireNonNull(country, StoreRemoveCountryAction.class + ": country is missing");
        return new StoreRemoveCountryActionImpl(country);
    }

    /**
     * builds StoreRemoveCountryAction without checking for non-null required values
     * @return StoreRemoveCountryAction
     */
    public StoreRemoveCountryAction buildUnchecked() {
        return new StoreRemoveCountryActionImpl(country);
    }

    /**
     * factory method for an instance of StoreRemoveCountryActionBuilder
     * @return builder
     */
    public static StoreRemoveCountryActionBuilder of() {
        return new StoreRemoveCountryActionBuilder();
    }

    /**
     * create builder for StoreRemoveCountryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreRemoveCountryActionBuilder of(final StoreRemoveCountryAction template) {
        StoreRemoveCountryActionBuilder builder = new StoreRemoveCountryActionBuilder();
        builder.country = template.getCountry();
        return builder;
    }

}
