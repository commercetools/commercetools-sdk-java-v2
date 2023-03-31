
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLCountryNotConfiguredInStoreErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLCountryNotConfiguredInStoreError graphQLCountryNotConfiguredInStoreError = GraphQLCountryNotConfiguredInStoreError.builder()
 *             .plusStoreCountries(storeCountriesBuilder -> storeCountriesBuilder)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLCountryNotConfiguredInStoreErrorBuilder
        implements Builder<GraphQLCountryNotConfiguredInStoreError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<String> storeCountries;

    private String country;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLCountryNotConfiguredInStoreErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLCountryNotConfiguredInStoreErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries value to be set
     * @return Builder
     */

    public GraphQLCountryNotConfiguredInStoreErrorBuilder storeCountries(final String... storeCountries) {
        this.storeCountries = new ArrayList<>(Arrays.asList(storeCountries));
        return this;
    }

    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries value to be set
     * @return Builder
     */

    public GraphQLCountryNotConfiguredInStoreErrorBuilder storeCountries(final java.util.List<String> storeCountries) {
        this.storeCountries = storeCountries;
        return this;
    }

    /**
     *  <p>Countries configured for the Store.</p>
     * @param storeCountries value to be set
     * @return Builder
     */

    public GraphQLCountryNotConfiguredInStoreErrorBuilder plusStoreCountries(final String... storeCountries) {
        if (this.storeCountries == null) {
            this.storeCountries = new ArrayList<>();
        }
        this.storeCountries.addAll(Arrays.asList(storeCountries));
        return this;
    }

    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     * @param country value to be set
     * @return Builder
     */

    public GraphQLCountryNotConfiguredInStoreErrorBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>Countries configured for the Store.</p>
     * @return storeCountries
     */

    public java.util.List<String> getStoreCountries() {
        return this.storeCountries;
    }

    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     * @return country
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * builds GraphQLCountryNotConfiguredInStoreError with checking for non-null required values
     * @return GraphQLCountryNotConfiguredInStoreError
     */
    public GraphQLCountryNotConfiguredInStoreError build() {
        Objects.requireNonNull(storeCountries,
            GraphQLCountryNotConfiguredInStoreError.class + ": storeCountries is missing");
        Objects.requireNonNull(country, GraphQLCountryNotConfiguredInStoreError.class + ": country is missing");
        return new GraphQLCountryNotConfiguredInStoreErrorImpl(values, storeCountries, country);
    }

    /**
     * builds GraphQLCountryNotConfiguredInStoreError without checking for non-null required values
     * @return GraphQLCountryNotConfiguredInStoreError
     */
    public GraphQLCountryNotConfiguredInStoreError buildUnchecked() {
        return new GraphQLCountryNotConfiguredInStoreErrorImpl(values, storeCountries, country);
    }

    /**
     * factory method for an instance of GraphQLCountryNotConfiguredInStoreErrorBuilder
     * @return builder
     */
    public static GraphQLCountryNotConfiguredInStoreErrorBuilder of() {
        return new GraphQLCountryNotConfiguredInStoreErrorBuilder();
    }

    /**
     * create builder for GraphQLCountryNotConfiguredInStoreError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLCountryNotConfiguredInStoreErrorBuilder of(
            final GraphQLCountryNotConfiguredInStoreError template) {
        GraphQLCountryNotConfiguredInStoreErrorBuilder builder = new GraphQLCountryNotConfiguredInStoreErrorBuilder();
        builder.values = template.values();
        builder.storeCountries = template.getStoreCountries();
        builder.country = template.getCountry();
        return builder;
    }

}
