
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetCountriesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCountriesAction storeSetCountriesAction = StoreSetCountriesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetCountriesActionBuilder implements Builder<StoreSetCountriesAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries;

    /**
     *  <p>New value to set.</p>
     * @param countries
     * @return Builder
     */

    public StoreSetCountriesActionBuilder countries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... countries) {
        this.countries = new ArrayList<>(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @param countries
     * @return Builder
     */

    public StoreSetCountriesActionBuilder countries(
            @Nullable final java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries) {
        this.countries = countries;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @param countries
     * @return Builder
     */

    public StoreSetCountriesActionBuilder plusCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... countries) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.addAll(Arrays.asList(countries));
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return Builder
     */

    public StoreSetCountriesActionBuilder plusCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return Builder
     */

    public StoreSetCountriesActionBuilder withCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.countries = new ArrayList<>();
        this.countries.add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getCountries() {
        return this.countries;
    }

    public StoreSetCountriesAction build() {
        return new StoreSetCountriesActionImpl(countries);
    }

    /**
     * builds StoreSetCountriesAction without checking for non null required values
     */
    public StoreSetCountriesAction buildUnchecked() {
        return new StoreSetCountriesActionImpl(countries);
    }

    public static StoreSetCountriesActionBuilder of() {
        return new StoreSetCountriesActionBuilder();
    }

    public static StoreSetCountriesActionBuilder of(final StoreSetCountriesAction template) {
        StoreSetCountriesActionBuilder builder = new StoreSetCountriesActionBuilder();
        builder.countries = template.getCountries();
        return builder;
    }

}
