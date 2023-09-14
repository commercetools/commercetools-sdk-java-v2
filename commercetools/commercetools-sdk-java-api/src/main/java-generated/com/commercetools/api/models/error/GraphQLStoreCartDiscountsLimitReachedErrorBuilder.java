
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLStoreCartDiscountsLimitReachedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLStoreCartDiscountsLimitReachedError graphQLStoreCartDiscountsLimitReachedError = GraphQLStoreCartDiscountsLimitReachedError.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLStoreCartDiscountsLimitReachedErrorBuilder
        implements Builder<GraphQLStoreCartDiscountsLimitReachedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLStoreCartDiscountsLimitReachedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLStoreCartDiscountsLimitReachedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param stores value to be set
     * @return Builder
     */

    public GraphQLStoreCartDiscountsLimitReachedErrorBuilder stores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param stores value to be set
     * @return Builder
     */

    public GraphQLStoreCartDiscountsLimitReachedErrorBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param stores value to be set
     * @return Builder
     */

    public GraphQLStoreCartDiscountsLimitReachedErrorBuilder plusStores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public GraphQLStoreCartDiscountsLimitReachedErrorBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public GraphQLStoreCartDiscountsLimitReachedErrorBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public GraphQLStoreCartDiscountsLimitReachedErrorBuilder addStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public GraphQLStoreCartDiscountsLimitReachedErrorBuilder setStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @return stores
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     * builds GraphQLStoreCartDiscountsLimitReachedError with checking for non-null required values
     * @return GraphQLStoreCartDiscountsLimitReachedError
     */
    public GraphQLStoreCartDiscountsLimitReachedError build() {
        Objects.requireNonNull(stores, GraphQLStoreCartDiscountsLimitReachedError.class + ": stores is missing");
        return new GraphQLStoreCartDiscountsLimitReachedErrorImpl(values, stores);
    }

    /**
     * builds GraphQLStoreCartDiscountsLimitReachedError without checking for non-null required values
     * @return GraphQLStoreCartDiscountsLimitReachedError
     */
    public GraphQLStoreCartDiscountsLimitReachedError buildUnchecked() {
        return new GraphQLStoreCartDiscountsLimitReachedErrorImpl(values, stores);
    }

    /**
     * factory method for an instance of GraphQLStoreCartDiscountsLimitReachedErrorBuilder
     * @return builder
     */
    public static GraphQLStoreCartDiscountsLimitReachedErrorBuilder of() {
        return new GraphQLStoreCartDiscountsLimitReachedErrorBuilder();
    }

    /**
     * create builder for GraphQLStoreCartDiscountsLimitReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLStoreCartDiscountsLimitReachedErrorBuilder of(
            final GraphQLStoreCartDiscountsLimitReachedError template) {
        GraphQLStoreCartDiscountsLimitReachedErrorBuilder builder = new GraphQLStoreCartDiscountsLimitReachedErrorBuilder();
        builder.values = template.values();
        builder.stores = template.getStores();
        return builder;
    }

}
