
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLLineItemQuantityAboveLimitErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLLineItemQuantityAboveLimitError graphQLLineItemQuantityAboveLimitError = GraphQLLineItemQuantityAboveLimitError.builder()
 *             .quantity(1)
 *             .maxCartQuantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLLineItemQuantityAboveLimitErrorBuilder implements Builder<GraphQLLineItemQuantityAboveLimitError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private Integer quantity;

    private Integer maxCartQuantity;

    @Nullable
    private String lineItem;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLLineItemQuantityAboveLimitErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLLineItemQuantityAboveLimitErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public GraphQLLineItemQuantityAboveLimitErrorBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>The maximum quantity allowed for this Line Item.</p>
     * @param maxCartQuantity value to be set
     * @return Builder
     */

    public GraphQLLineItemQuantityAboveLimitErrorBuilder maxCartQuantity(final Integer maxCartQuantity) {
        this.maxCartQuantity = maxCartQuantity;
        return this;
    }

    /**
     *  <p>Reference to the Line Item that caused the error.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public GraphQLLineItemQuantityAboveLimitErrorBuilder lineItem(@Nullable final String lineItem) {
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
     *  <p>The maximum quantity allowed for this Line Item.</p>
     * @return maxCartQuantity
     */

    public Integer getMaxCartQuantity() {
        return this.maxCartQuantity;
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
     * builds GraphQLLineItemQuantityAboveLimitError with checking for non-null required values
     * @return GraphQLLineItemQuantityAboveLimitError
     */
    public GraphQLLineItemQuantityAboveLimitError build() {
        Objects.requireNonNull(quantity, GraphQLLineItemQuantityAboveLimitError.class + ": quantity is missing");
        Objects.requireNonNull(maxCartQuantity,
            GraphQLLineItemQuantityAboveLimitError.class + ": maxCartQuantity is missing");
        return new GraphQLLineItemQuantityAboveLimitErrorImpl(values, quantity, maxCartQuantity, lineItem);
    }

    /**
     * builds GraphQLLineItemQuantityAboveLimitError without checking for non-null required values
     * @return GraphQLLineItemQuantityAboveLimitError
     */
    public GraphQLLineItemQuantityAboveLimitError buildUnchecked() {
        return new GraphQLLineItemQuantityAboveLimitErrorImpl(values, quantity, maxCartQuantity, lineItem);
    }

    /**
     * factory method for an instance of GraphQLLineItemQuantityAboveLimitErrorBuilder
     * @return builder
     */
    public static GraphQLLineItemQuantityAboveLimitErrorBuilder of() {
        return new GraphQLLineItemQuantityAboveLimitErrorBuilder();
    }

    /**
     * create builder for GraphQLLineItemQuantityAboveLimitError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLLineItemQuantityAboveLimitErrorBuilder of(
            final GraphQLLineItemQuantityAboveLimitError template) {
        GraphQLLineItemQuantityAboveLimitErrorBuilder builder = new GraphQLLineItemQuantityAboveLimitErrorBuilder();
        builder.values = template.values();
        builder.quantity = template.getQuantity();
        builder.maxCartQuantity = template.getMaxCartQuantity();
        builder.lineItem = template.getLineItem();
        return builder;
    }

}
