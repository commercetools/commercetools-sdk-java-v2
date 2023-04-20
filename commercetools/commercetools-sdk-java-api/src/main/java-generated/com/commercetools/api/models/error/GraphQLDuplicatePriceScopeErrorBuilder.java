
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLDuplicatePriceScopeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicatePriceScopeError graphQLDuplicatePriceScopeError = GraphQLDuplicatePriceScopeError.builder()
 *             .conflictingPrice(conflictingPriceBuilder -> conflictingPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDuplicatePriceScopeErrorBuilder implements Builder<GraphQLDuplicatePriceScopeError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.common.Price conflictingPrice;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLDuplicatePriceScopeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLDuplicatePriceScopeErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param builder function to build the conflictingPrice value
     * @return Builder
     */

    public GraphQLDuplicatePriceScopeErrorBuilder conflictingPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.conflictingPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param builder function to build the conflictingPrice value
     * @return Builder
     */

    public GraphQLDuplicatePriceScopeErrorBuilder withConflictingPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.conflictingPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param conflictingPrice value to be set
     * @return Builder
     */

    public GraphQLDuplicatePriceScopeErrorBuilder conflictingPrice(
            final com.commercetools.api.models.common.Price conflictingPrice) {
        this.conflictingPrice = conflictingPrice;
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
     *  <p>Conflicting Embedded Price.</p>
     * @return conflictingPrice
     */

    public com.commercetools.api.models.common.Price getConflictingPrice() {
        return this.conflictingPrice;
    }

    /**
     * builds GraphQLDuplicatePriceScopeError with checking for non-null required values
     * @return GraphQLDuplicatePriceScopeError
     */
    public GraphQLDuplicatePriceScopeError build() {
        Objects.requireNonNull(conflictingPrice,
            GraphQLDuplicatePriceScopeError.class + ": conflictingPrice is missing");
        return new GraphQLDuplicatePriceScopeErrorImpl(values, conflictingPrice);
    }

    /**
     * builds GraphQLDuplicatePriceScopeError without checking for non-null required values
     * @return GraphQLDuplicatePriceScopeError
     */
    public GraphQLDuplicatePriceScopeError buildUnchecked() {
        return new GraphQLDuplicatePriceScopeErrorImpl(values, conflictingPrice);
    }

    /**
     * factory method for an instance of GraphQLDuplicatePriceScopeErrorBuilder
     * @return builder
     */
    public static GraphQLDuplicatePriceScopeErrorBuilder of() {
        return new GraphQLDuplicatePriceScopeErrorBuilder();
    }

    /**
     * create builder for GraphQLDuplicatePriceScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicatePriceScopeErrorBuilder of(final GraphQLDuplicatePriceScopeError template) {
        GraphQLDuplicatePriceScopeErrorBuilder builder = new GraphQLDuplicatePriceScopeErrorBuilder();
        builder.values = template.values();
        builder.conflictingPrice = template.getConflictingPrice();
        return builder;
    }

}
