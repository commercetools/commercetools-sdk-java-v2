
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLLineItemQuantityBelowLimitErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLLineItemQuantityBelowLimitError graphQLLineItemQuantityBelowLimitError = GraphQLLineItemQuantityBelowLimitError.builder()
 *             .quantity(1)
 *             .minCartQuantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLLineItemQuantityBelowLimitErrorBuilder implements Builder<GraphQLLineItemQuantityBelowLimitError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private Integer quantity;

    private Integer minCartQuantity;

    @Nullable
    private String lineItem;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLLineItemQuantityBelowLimitErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLLineItemQuantityBelowLimitErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>The quantity that was requested.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public GraphQLLineItemQuantityBelowLimitErrorBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>The minimum quantity required for this Line Item.</p>
     * @param minCartQuantity value to be set
     * @return Builder
     */

    public GraphQLLineItemQuantityBelowLimitErrorBuilder minCartQuantity(final Integer minCartQuantity) {
        this.minCartQuantity = minCartQuantity;
        return this;
    }

    /**
     *  <p>Reference to the Line Item that caused the error.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public GraphQLLineItemQuantityBelowLimitErrorBuilder lineItem(@Nullable final String lineItem) {
        this.lineItem = lineItem;
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
     *  <p>The quantity that was requested.</p>
     * @return quantity
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>The minimum quantity required for this Line Item.</p>
     * @return minCartQuantity
     */

    public Integer getMinCartQuantity() {
        return this.minCartQuantity;
    }

    /**
     *  <p>Reference to the Line Item that caused the error.</p>
     * @return lineItem
     */

    @Nullable
    public String getLineItem() {
        return this.lineItem;
    }

    /**
     * builds GraphQLLineItemQuantityBelowLimitError with checking for non-null required values
     * @return GraphQLLineItemQuantityBelowLimitError
     */
    public GraphQLLineItemQuantityBelowLimitError build() {
        Objects.requireNonNull(quantity, GraphQLLineItemQuantityBelowLimitError.class + ": quantity is missing");
        Objects.requireNonNull(minCartQuantity,
            GraphQLLineItemQuantityBelowLimitError.class + ": minCartQuantity is missing");
        return new GraphQLLineItemQuantityBelowLimitErrorImpl(values, quantity, minCartQuantity, lineItem);
    }

    /**
     * builds GraphQLLineItemQuantityBelowLimitError without checking for non-null required values
     * @return GraphQLLineItemQuantityBelowLimitError
     */
    public GraphQLLineItemQuantityBelowLimitError buildUnchecked() {
        return new GraphQLLineItemQuantityBelowLimitErrorImpl(values, quantity, minCartQuantity, lineItem);
    }

    /**
     * factory method for an instance of GraphQLLineItemQuantityBelowLimitErrorBuilder
     * @return builder
     */
    public static GraphQLLineItemQuantityBelowLimitErrorBuilder of() {
        return new GraphQLLineItemQuantityBelowLimitErrorBuilder();
    }

    /**
     * create builder for GraphQLLineItemQuantityBelowLimitError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLLineItemQuantityBelowLimitErrorBuilder of(
            final GraphQLLineItemQuantityBelowLimitError template) {
        GraphQLLineItemQuantityBelowLimitErrorBuilder builder = new GraphQLLineItemQuantityBelowLimitErrorBuilder();
        builder.values = template.values();
        builder.quantity = template.getQuantity();
        builder.minCartQuantity = template.getMinCartQuantity();
        builder.lineItem = template.getLineItem();
        return builder;
    }

}
