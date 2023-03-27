
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerRemoveStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerRemoveStoreAction customerRemoveStoreAction = CustomerRemoveStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerRemoveStoreActionBuilder implements Builder<CustomerRemoveStoreAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>ResourceIdentifier of the Store to remove.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CustomerRemoveStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Store to remove.</p>
     * @param store value to be set
     * @return Builder
     */

    public CustomerRemoveStoreActionBuilder store(
            final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Store to remove.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     * builds CustomerRemoveStoreAction with checking for non-null required values
     * @return CustomerRemoveStoreAction
     */
    public CustomerRemoveStoreAction build() {
        Objects.requireNonNull(store, CustomerRemoveStoreAction.class + ": store is missing");
        return new CustomerRemoveStoreActionImpl(store);
    }

    /**
     * builds CustomerRemoveStoreAction without checking for non-null required values
     * @return CustomerRemoveStoreAction
     */
    public CustomerRemoveStoreAction buildUnchecked() {
        return new CustomerRemoveStoreActionImpl(store);
    }

    /**
     * factory method for an instance of CustomerRemoveStoreActionBuilder
     * @return builder
     */
    public static CustomerRemoveStoreActionBuilder of() {
        return new CustomerRemoveStoreActionBuilder();
    }

    /**
     * create builder for CustomerRemoveStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerRemoveStoreActionBuilder of(final CustomerRemoveStoreAction template) {
        CustomerRemoveStoreActionBuilder builder = new CustomerRemoveStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
