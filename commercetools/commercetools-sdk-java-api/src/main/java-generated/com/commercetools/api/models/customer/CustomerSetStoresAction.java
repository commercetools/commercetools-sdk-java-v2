
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets the Stores the Customer account is associated with. If no Stores are specified, the Customer becomes a global Customer.</p>
 *  <p>This action generates the CustomerStoresSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetStoresAction customerSetStoresAction = CustomerSetStoresAction.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStores")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetStoresActionImpl.class)
public interface CustomerSetStoresAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetStoresAction
     */
    String SET_STORES = "setStores";

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    /**
     *  <p>ResourceIdentifier of the Stores to set.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreResourceIdentifier> stores);

    /**
     * factory method
     * @return instance of CustomerSetStoresAction
     */
    public static CustomerSetStoresAction of() {
        return new CustomerSetStoresActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetStoresAction of(final CustomerSetStoresAction template) {
        CustomerSetStoresActionImpl instance = new CustomerSetStoresActionImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    public CustomerSetStoresAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerSetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetStoresAction deepCopy(@Nullable final CustomerSetStoresAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetStoresActionImpl instance = new CustomerSetStoresActionImpl();
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerSetStoresAction
     * @return builder
     */
    public static CustomerSetStoresActionBuilder builder() {
        return CustomerSetStoresActionBuilder.of();
    }

    /**
     * create builder for CustomerSetStoresAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetStoresActionBuilder builder(final CustomerSetStoresAction template) {
        return CustomerSetStoresActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetStoresAction(Function<CustomerSetStoresAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetStoresAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetStoresAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetStoresAction>";
            }
        };
    }
}
