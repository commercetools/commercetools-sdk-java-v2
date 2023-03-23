
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CountryNotConfiguredInStoreErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CountryNotConfiguredInStoreError countryNotConfiguredInStoreError = CountryNotConfiguredInStoreError.builder()
 *             .message("{message}")
 *             .plusStoreCountries(storeCountriesBuilder -> storeCountriesBuilder)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CountryNotConfiguredInStoreErrorBuilder implements Builder<CountryNotConfiguredInStoreError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<String> storeCountries;

    private String country;

    /**
     *  <p><code>"The country $country is not configured for the store $store."</code></p>
     * @param message
     * @return Builder
     */

    public CountryNotConfiguredInStoreErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public CountryNotConfiguredInStoreErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public CountryNotConfiguredInStoreErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries
     * @return Builder
     */

    public CountryNotConfiguredInStoreErrorBuilder storeCountries(final String... storeCountries) {
        this.storeCountries = new ArrayList<>(Arrays.asList(storeCountries));
        return this;
    }

    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries
     * @return Builder
     */

    public CountryNotConfiguredInStoreErrorBuilder storeCountries(final java.util.List<String> storeCountries) {
        this.storeCountries = storeCountries;
        return this;
    }

    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries
     * @return Builder
     */

    public CountryNotConfiguredInStoreErrorBuilder plusStoreCountries(final String... storeCountries) {
        if (this.storeCountries == null) {
            this.storeCountries = new ArrayList<>();
        }
        this.storeCountries.addAll(Arrays.asList(storeCountries));
        return this;
    }

    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     * @param country
     * @return Builder
     */

    public CountryNotConfiguredInStoreErrorBuilder country(final String country) {
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

    public CountryNotConfiguredInStoreError build() {
        Objects.requireNonNull(message, CountryNotConfiguredInStoreError.class + ": message is missing");
        Objects.requireNonNull(storeCountries, CountryNotConfiguredInStoreError.class + ": storeCountries is missing");
        Objects.requireNonNull(country, CountryNotConfiguredInStoreError.class + ": country is missing");
        return new CountryNotConfiguredInStoreErrorImpl(message, values, storeCountries, country);
    }

    /**
     * builds CountryNotConfiguredInStoreError without checking for non null required values
     */
    public CountryNotConfiguredInStoreError buildUnchecked() {
        return new CountryNotConfiguredInStoreErrorImpl(message, values, storeCountries, country);
    }

    public static CountryNotConfiguredInStoreErrorBuilder of() {
        return new CountryNotConfiguredInStoreErrorBuilder();
    }

    public static CountryNotConfiguredInStoreErrorBuilder of(final CountryNotConfiguredInStoreError template) {
        CountryNotConfiguredInStoreErrorBuilder builder = new CountryNotConfiguredInStoreErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.storeCountries = template.getStoreCountries();
        builder.country = template.getCountry();
        return builder;
    }

}
