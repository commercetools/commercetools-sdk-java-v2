
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes the association to a Store from the Customer. If no more Stores are assigned, the Customer becomes a global Customer.</p>
 *
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
@JsonDeserialize(as = CustomerRemoveStoreActionImpl.class)
public interface CustomerRemoveStoreAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerRemoveStoreAction
     */
    String REMOVE_STORE = "removeStore";

    /**
     *  <p>ResourceIdentifier of the Store to remove.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>ResourceIdentifier of the Store to remove.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of CustomerRemoveStoreAction
     */
    public static CustomerRemoveStoreAction of() {
        return new CustomerRemoveStoreActionImpl();
    }

    /**
     * factory method to copy an instance of CustomerRemoveStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerRemoveStoreAction of(final CustomerRemoveStoreAction template) {
        CustomerRemoveStoreActionImpl instance = new CustomerRemoveStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * builder factory method for CustomerRemoveStoreAction
     * @return builder
     */
    public static CustomerRemoveStoreActionBuilder builder() {
        return CustomerRemoveStoreActionBuilder.of();
    }

    /**
     * create builder for CustomerRemoveStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerRemoveStoreActionBuilder builder(final CustomerRemoveStoreAction template) {
        return CustomerRemoveStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerRemoveStoreAction(Function<CustomerRemoveStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerRemoveStoreAction>";
            }
        };
    }
}
