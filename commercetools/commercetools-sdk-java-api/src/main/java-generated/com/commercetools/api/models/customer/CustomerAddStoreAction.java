
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Associates the Customer with a Store.</p>
 *
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
@JsonDeserialize(as = CustomerAddStoreActionImpl.class)
public interface CustomerAddStoreAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerAddStoreAction
     */
    String ADD_STORE = "addStore";

    /**
     *  <p>ResourceIdentifier of the Store to add.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>ResourceIdentifier of the Store to add.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of CustomerAddStoreAction
     */
    public static CustomerAddStoreAction of() {
        return new CustomerAddStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddStoreAction of(final CustomerAddStoreAction template) {
        CustomerAddStoreActionImpl instance = new CustomerAddStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerAddStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddStoreAction deepCopy(@Nullable final CustomerAddStoreAction template) {
        if (template == null) {
            return null;
        }
        CustomerAddStoreActionImpl instance = new CustomerAddStoreActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for CustomerAddStoreAction
     * @return builder
     */
    public static CustomerAddStoreActionBuilder builder() {
        return CustomerAddStoreActionBuilder.of();
    }

    /**
     * create builder for CustomerAddStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddStoreActionBuilder builder(final CustomerAddStoreAction template) {
        return CustomerAddStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddStoreAction(Function<CustomerAddStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddStoreAction>";
            }
        };
    }
}
