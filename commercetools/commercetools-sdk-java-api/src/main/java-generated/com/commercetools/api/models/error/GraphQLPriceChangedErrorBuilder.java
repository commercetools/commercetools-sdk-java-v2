
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLPriceChangedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLPriceChangedError graphQLPriceChangedError = GraphQLPriceChangedError.builder()
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .shipping(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLPriceChangedErrorBuilder implements Builder<GraphQLPriceChangedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<String> lineItems;

    private Boolean shipping;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLPriceChangedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLPriceChangedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public GraphQLPriceChangedErrorBuilder lineItems(final String... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public GraphQLPriceChangedErrorBuilder lineItems(final java.util.List<String> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public GraphQLPriceChangedErrorBuilder plusLineItems(final String... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p><code>true</code> if the ShippingRate has changed.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public GraphQLPriceChangedErrorBuilder shipping(final Boolean shipping) {
        this.shipping = shipping;
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
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @return lineItems
     */

    public java.util.List<String> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p><code>true</code> if the ShippingRate has changed.</p>
     * @return shipping
     */

    public Boolean getShipping() {
        return this.shipping;
    }

    /**
     * builds GraphQLPriceChangedError with checking for non-null required values
     * @return GraphQLPriceChangedError
     */
    public GraphQLPriceChangedError build() {
        Objects.requireNonNull(lineItems, GraphQLPriceChangedError.class + ": lineItems is missing");
        Objects.requireNonNull(shipping, GraphQLPriceChangedError.class + ": shipping is missing");
        return new GraphQLPriceChangedErrorImpl(values, lineItems, shipping);
    }

    /**
     * builds GraphQLPriceChangedError without checking for non-null required values
     * @return GraphQLPriceChangedError
     */
    public GraphQLPriceChangedError buildUnchecked() {
        return new GraphQLPriceChangedErrorImpl(values, lineItems, shipping);
    }

    /**
     * factory method for an instance of GraphQLPriceChangedErrorBuilder
     * @return builder
     */
    public static GraphQLPriceChangedErrorBuilder of() {
        return new GraphQLPriceChangedErrorBuilder();
    }

    /**
     * create builder for GraphQLPriceChangedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLPriceChangedErrorBuilder of(final GraphQLPriceChangedError template) {
        GraphQLPriceChangedErrorBuilder builder = new GraphQLPriceChangedErrorBuilder();
        builder.values = template.values();
        builder.lineItems = template.getLineItems();
        builder.shipping = template.getShipping();
        return builder;
    }

}
