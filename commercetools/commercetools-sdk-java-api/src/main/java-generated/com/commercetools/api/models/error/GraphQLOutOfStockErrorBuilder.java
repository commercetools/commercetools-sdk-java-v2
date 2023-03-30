
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLOutOfStockErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLOutOfStockError graphQLOutOfStockError = GraphQLOutOfStockError.builder()
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLOutOfStockErrorBuilder implements Builder<GraphQLOutOfStockError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<String> lineItems;

    private java.util.List<String> skus;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLOutOfStockErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLOutOfStockErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public GraphQLOutOfStockErrorBuilder lineItems(final String... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public GraphQLOutOfStockErrorBuilder lineItems(final java.util.List<String> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public GraphQLOutOfStockErrorBuilder plusLineItems(final String... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     * @param skus value to be set
     * @return Builder
     */

    public GraphQLOutOfStockErrorBuilder skus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     * @param skus value to be set
     * @return Builder
     */

    public GraphQLOutOfStockErrorBuilder skus(final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     * @param skus value to be set
     * @return Builder
     */

    public GraphQLOutOfStockErrorBuilder plusSkus(final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
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
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     * @return lineItems
     */

    public java.util.List<String> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     * @return skus
     */

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    /**
     * builds GraphQLOutOfStockError with checking for non-null required values
     * @return GraphQLOutOfStockError
     */
    public GraphQLOutOfStockError build() {
        Objects.requireNonNull(lineItems, GraphQLOutOfStockError.class + ": lineItems is missing");
        Objects.requireNonNull(skus, GraphQLOutOfStockError.class + ": skus is missing");
        return new GraphQLOutOfStockErrorImpl(values, lineItems, skus);
    }

    /**
     * builds GraphQLOutOfStockError without checking for non-null required values
     * @return GraphQLOutOfStockError
     */
    public GraphQLOutOfStockError buildUnchecked() {
        return new GraphQLOutOfStockErrorImpl(values, lineItems, skus);
    }

    /**
     * factory method for an instance of GraphQLOutOfStockErrorBuilder
     * @return builder
     */
    public static GraphQLOutOfStockErrorBuilder of() {
        return new GraphQLOutOfStockErrorBuilder();
    }

    /**
     * create builder for GraphQLOutOfStockError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLOutOfStockErrorBuilder of(final GraphQLOutOfStockError template) {
        GraphQLOutOfStockErrorBuilder builder = new GraphQLOutOfStockErrorBuilder();
        builder.values = template.values();
        builder.lineItems = template.getLineItems();
        builder.skus = template.getSkus();
        return builder;
    }

}
