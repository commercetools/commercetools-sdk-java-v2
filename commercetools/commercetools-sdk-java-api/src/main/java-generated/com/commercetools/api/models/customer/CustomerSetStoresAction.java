
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the Stores the Customer account is associated with. If no Stores are specified, the Customer becomes a global Customer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetStoresAction customerSetStoresAction = CustomerSetStoresAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
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
     * factory method to copy an instance of CustomerSetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetStoresAction of(final CustomerSetStoresAction template) {
        CustomerSetStoresActionImpl instance = new CustomerSetStoresActionImpl();
        instance.setStores(template.getStores());
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
