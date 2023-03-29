
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the Stores of the Business Unit. Can only be set if the Business Unit <code>storeMode</code> is <code>Explicit</code>. Carts and Orders created after the Set Stores update must use the new Stores of the Business Unit and, if set, their Product Selections, and Channels. Orders created prior to the Set Stores update action are unchanged. Setting the Stores on a Business Unit generates a BusinessUnitStoresSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetStoresAction businessUnitSetStoresAction = BusinessUnitSetStoresAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetStoresActionImpl.class)
public interface BusinessUnitSetStoresAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetStoresAction
     */
    String SET_STORES = "setStores";

    /**
     *  <p>Stores to set. Overrides the current list of Stores.</p>
     * @return stores
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <p>Stores to set. Overrides the current list of Stores.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    /**
     *  <p>Stores to set. Overrides the current list of Stores.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreResourceIdentifier> stores);

    /**
     * factory method
     * @return instance of BusinessUnitSetStoresAction
     */
    public static BusinessUnitSetStoresAction of() {
        return new BusinessUnitSetStoresActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetStoresAction of(final BusinessUnitSetStoresAction template) {
        BusinessUnitSetStoresActionImpl instance = new BusinessUnitSetStoresActionImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitSetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSetStoresAction deepCopy(@Nullable final BusinessUnitSetStoresAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSetStoresActionImpl instance = new BusinessUnitSetStoresActionImpl();
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetStoresAction
     * @return builder
     */
    public static BusinessUnitSetStoresActionBuilder builder() {
        return BusinessUnitSetStoresActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetStoresAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetStoresActionBuilder builder(final BusinessUnitSetStoresAction template) {
        return BusinessUnitSetStoresActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetStoresAction(Function<BusinessUnitSetStoresAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetStoresAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetStoresAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetStoresAction>";
            }
        };
    }
}
