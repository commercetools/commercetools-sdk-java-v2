
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCartDiscountsLimitReachedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCartDiscountsLimitReachedError storeCartDiscountsLimitReachedError = StoreCartDiscountsLimitReachedError.builder()
 *             .message("{message}")
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCartDiscountsLimitReachedErrorBuilder implements Builder<StoreCartDiscountsLimitReachedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    /**
     *  <p><code>"Maximum number of active cart discounts reached for $stores."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public StoreCartDiscountsLimitReachedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public StoreCartDiscountsLimitReachedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public StoreCartDiscountsLimitReachedErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public StoreCartDiscountsLimitReachedErrorBuilder stores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param stores value to be set
     * @return Builder
     */

    public StoreCartDiscountsLimitReachedErrorBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param stores value to be set
     * @return Builder
     */

    public StoreCartDiscountsLimitReachedErrorBuilder plusStores(
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

    public StoreCartDiscountsLimitReachedErrorBuilder plusStores(
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

    public StoreCartDiscountsLimitReachedErrorBuilder withStores(
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

    public StoreCartDiscountsLimitReachedErrorBuilder addStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public StoreCartDiscountsLimitReachedErrorBuilder setStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p><code>"Maximum number of active cart discounts reached for $stores."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
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
     * builds StoreCartDiscountsLimitReachedError with checking for non-null required values
     * @return StoreCartDiscountsLimitReachedError
     */
    public StoreCartDiscountsLimitReachedError build() {
        Objects.requireNonNull(message, StoreCartDiscountsLimitReachedError.class + ": message is missing");
        Objects.requireNonNull(stores, StoreCartDiscountsLimitReachedError.class + ": stores is missing");
        return new StoreCartDiscountsLimitReachedErrorImpl(message, values, stores);
    }

    /**
     * builds StoreCartDiscountsLimitReachedError without checking for non-null required values
     * @return StoreCartDiscountsLimitReachedError
     */
    public StoreCartDiscountsLimitReachedError buildUnchecked() {
        return new StoreCartDiscountsLimitReachedErrorImpl(message, values, stores);
    }

    /**
     * factory method for an instance of StoreCartDiscountsLimitReachedErrorBuilder
     * @return builder
     */
    public static StoreCartDiscountsLimitReachedErrorBuilder of() {
        return new StoreCartDiscountsLimitReachedErrorBuilder();
    }

    /**
     * create builder for StoreCartDiscountsLimitReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCartDiscountsLimitReachedErrorBuilder of(final StoreCartDiscountsLimitReachedError template) {
        StoreCartDiscountsLimitReachedErrorBuilder builder = new StoreCartDiscountsLimitReachedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.stores = template.getStores();
        return builder;
    }

}
