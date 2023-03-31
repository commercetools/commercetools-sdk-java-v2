
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLMissingTaxRateForCountryErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMissingTaxRateForCountryError graphQLMissingTaxRateForCountryError = GraphQLMissingTaxRateForCountryError.builder()
 *             .taxCategoryId("{taxCategoryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMissingTaxRateForCountryErrorBuilder implements Builder<GraphQLMissingTaxRateForCountryError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String taxCategoryId;

    @Nullable
    private String country;

    @Nullable
    private String state;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLMissingTaxRateForCountryErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLMissingTaxRateForCountryErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     * @param taxCategoryId value to be set
     * @return Builder
     */

    public GraphQLMissingTaxRateForCountryErrorBuilder taxCategoryId(final String taxCategoryId) {
        this.taxCategoryId = taxCategoryId;
        return this;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     * @return Builder
     */

    public GraphQLMissingTaxRateForCountryErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @param state value to be set
     * @return Builder
     */

    public GraphQLMissingTaxRateForCountryErrorBuilder state(@Nullable final String state) {
        this.state = state;
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
     *  <p>Unique identifier of the TaxCategory.</p>
     * @return taxCategoryId
     */

    public String getTaxCategoryId() {
        return this.taxCategoryId;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @return state
     */

    @Nullable
    public String getState() {
        return this.state;
    }

    /**
     * builds GraphQLMissingTaxRateForCountryError with checking for non-null required values
     * @return GraphQLMissingTaxRateForCountryError
     */
    public GraphQLMissingTaxRateForCountryError build() {
        Objects.requireNonNull(taxCategoryId,
            GraphQLMissingTaxRateForCountryError.class + ": taxCategoryId is missing");
        return new GraphQLMissingTaxRateForCountryErrorImpl(values, taxCategoryId, country, state);
    }

    /**
     * builds GraphQLMissingTaxRateForCountryError without checking for non-null required values
     * @return GraphQLMissingTaxRateForCountryError
     */
    public GraphQLMissingTaxRateForCountryError buildUnchecked() {
        return new GraphQLMissingTaxRateForCountryErrorImpl(values, taxCategoryId, country, state);
    }

    /**
     * factory method for an instance of GraphQLMissingTaxRateForCountryErrorBuilder
     * @return builder
     */
    public static GraphQLMissingTaxRateForCountryErrorBuilder of() {
        return new GraphQLMissingTaxRateForCountryErrorBuilder();
    }

    /**
     * create builder for GraphQLMissingTaxRateForCountryError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMissingTaxRateForCountryErrorBuilder of(final GraphQLMissingTaxRateForCountryError template) {
        GraphQLMissingTaxRateForCountryErrorBuilder builder = new GraphQLMissingTaxRateForCountryErrorBuilder();
        builder.values = template.values();
        builder.taxCategoryId = template.getTaxCategoryId();
        builder.country = template.getCountry();
        builder.state = template.getState();
        return builder;
    }

}
