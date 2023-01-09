
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CountryNotConfiguredInStoreBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CountryNotConfiguredInStore countryNotConfiguredInStore = CountryNotConfiguredInStore.builder()
 *             .message("{message}")
 *             .plusStoreCountries(storeCountriesBuilder -> storeCountriesBuilder)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CountryNotConfiguredInStoreBuilder implements Builder<CountryNotConfiguredInStore> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<String> storeCountries;

    private String country;

    /**
     *  <p><code>"The country $country is not configured for the store $store."</code></p>
     */

    public CountryNotConfiguredInStoreBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public CountryNotConfiguredInStoreBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public CountryNotConfiguredInStoreBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Countries configured for the Store.</p>
     */

    public CountryNotConfiguredInStoreBuilder storeCountries(final String... storeCountries) {
        this.storeCountries = new ArrayList<>(Arrays.asList(storeCountries));
        return this;
    }

    /**
     *  <p>Countries configured for the Store.</p>
     */

    public CountryNotConfiguredInStoreBuilder storeCountries(final java.util.List<String> storeCountries) {
        this.storeCountries = storeCountries;
        return this;
    }

    /**
     *  <p>Countries configured for the Store.</p>
     */

    public CountryNotConfiguredInStoreBuilder plusStoreCountries(final String... storeCountries) {
        if (this.storeCountries == null) {
            this.storeCountries = new ArrayList<>();
        }
        this.storeCountries.addAll(Arrays.asList(storeCountries));
        return this;
    }

    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     */

    public CountryNotConfiguredInStoreBuilder country(final String country) {
        this.country = country;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public java.util.List<String> getStoreCountries() {
        return this.storeCountries;
    }

    public String getCountry() {
        return this.country;
    }

    public CountryNotConfiguredInStore build() {
        Objects.requireNonNull(message, CountryNotConfiguredInStore.class + ": message is missing");
        Objects.requireNonNull(storeCountries, CountryNotConfiguredInStore.class + ": storeCountries is missing");
        Objects.requireNonNull(country, CountryNotConfiguredInStore.class + ": country is missing");
        return new CountryNotConfiguredInStoreImpl(message, values, storeCountries, country);
    }

    /**
     * builds CountryNotConfiguredInStore without checking for non null required values
     */
    public CountryNotConfiguredInStore buildUnchecked() {
        return new CountryNotConfiguredInStoreImpl(message, values, storeCountries, country);
    }

    public static CountryNotConfiguredInStoreBuilder of() {
        return new CountryNotConfiguredInStoreBuilder();
    }

    public static CountryNotConfiguredInStoreBuilder of(final CountryNotConfiguredInStore template) {
        CountryNotConfiguredInStoreBuilder builder = new CountryNotConfiguredInStoreBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.storeCountries = template.getStoreCountries();
        builder.country = template.getCountry();
        return builder;
    }

}
