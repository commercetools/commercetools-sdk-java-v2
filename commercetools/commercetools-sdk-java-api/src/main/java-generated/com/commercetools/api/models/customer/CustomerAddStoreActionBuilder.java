
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddStoreActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddStoreAction customerAddStoreAction = CustomerAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddStoreActionBuilder implements Builder<CustomerAddStoreAction> {

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    /**
     *  <p>ResourceIdentifier to a Store.</p>
     */

    public CustomerAddStoreActionBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Store.</p>
     */

    public CustomerAddStoreActionBuilder store(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    public CustomerAddStoreAction build() {
        Objects.requireNonNull(store, CustomerAddStoreAction.class + ": store is missing");
        return new CustomerAddStoreActionImpl(store);
    }

    /**
     * builds CustomerAddStoreAction without checking for non null required values
     */
    public CustomerAddStoreAction buildUnchecked() {
        return new CustomerAddStoreActionImpl(store);
    }

    public static CustomerAddStoreActionBuilder of() {
        return new CustomerAddStoreActionBuilder();
    }

    public static CustomerAddStoreActionBuilder of(final CustomerAddStoreAction template) {
        CustomerAddStoreActionBuilder builder = new CustomerAddStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
