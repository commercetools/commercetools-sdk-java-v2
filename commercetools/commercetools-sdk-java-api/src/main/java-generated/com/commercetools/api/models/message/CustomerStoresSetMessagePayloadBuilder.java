
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerStoresSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerStoresSetMessagePayload customerStoresSetMessagePayload = CustomerStoresSetMessagePayload.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .plusOldStores(oldStoresBuilder -> oldStoresBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerStoresSetMessagePayloadBuilder implements Builder<CustomerStoresSetMessagePayload> {

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores;

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder stores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder plusStores(
            final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder addStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder setStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param oldStores value to be set
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder oldStores(
            final com.commercetools.api.models.store.StoreKeyReference... oldStores) {
        this.oldStores = new ArrayList<>(Arrays.asList(oldStores));
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param oldStores value to be set
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder oldStores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> oldStores) {
        this.oldStores = oldStores;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param oldStores value to be set
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder plusOldStores(
            final com.commercetools.api.models.store.StoreKeyReference... oldStores) {
        if (this.oldStores == null) {
            this.oldStores = new ArrayList<>();
        }
        this.oldStores.addAll(Arrays.asList(oldStores));
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the oldStores value
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder plusOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.oldStores == null) {
            this.oldStores = new ArrayList<>();
        }
        this.oldStores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the oldStores value
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder withOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.oldStores = new ArrayList<>();
        this.oldStores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the oldStores value
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder addOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusOldStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param builder function to build the oldStores value
     * @return Builder
     */

    public CustomerStoresSetMessagePayloadBuilder setOldStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return oldStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @return stores
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @return oldStores
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getOldStores() {
        return this.oldStores;
    }

    /**
     * builds CustomerStoresSetMessagePayload with checking for non-null required values
     * @return CustomerStoresSetMessagePayload
     */
    public CustomerStoresSetMessagePayload build() {
        Objects.requireNonNull(stores, CustomerStoresSetMessagePayload.class + ": stores is missing");
        Objects.requireNonNull(oldStores, CustomerStoresSetMessagePayload.class + ": oldStores is missing");
        return new CustomerStoresSetMessagePayloadImpl(stores, oldStores);
    }

    /**
     * builds CustomerStoresSetMessagePayload without checking for non-null required values
     * @return CustomerStoresSetMessagePayload
     */
    public CustomerStoresSetMessagePayload buildUnchecked() {
        return new CustomerStoresSetMessagePayloadImpl(stores, oldStores);
    }

    /**
     * factory method for an instance of CustomerStoresSetMessagePayloadBuilder
     * @return builder
     */
    public static CustomerStoresSetMessagePayloadBuilder of() {
        return new CustomerStoresSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerStoresSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerStoresSetMessagePayloadBuilder of(final CustomerStoresSetMessagePayload template) {
        CustomerStoresSetMessagePayloadBuilder builder = new CustomerStoresSetMessagePayloadBuilder();
        builder.stores = template.getStores();
        builder.oldStores = template.getOldStores();
        return builder;
    }

}
