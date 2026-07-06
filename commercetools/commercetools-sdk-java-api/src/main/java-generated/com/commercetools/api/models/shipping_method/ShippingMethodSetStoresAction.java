
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the Stores the ShippingMethod is associated with. If empty, the ShippingMethod becomes a global ShippingMethod.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetStoresAction shippingMethodSetStoresAction = ShippingMethodSetStoresAction.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStores")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetStoresActionImpl.class)
public interface ShippingMethodSetStoresAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodSetStoresAction
     */
    String SET_STORES = "setStores";

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    /**
     *  <p>ResourceIdentifiers of the Stores to set. Overrides the current list of Stores. If empty, any existing values are removed.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreResourceIdentifier> stores);

    /**
     * factory method
     * @return instance of ShippingMethodSetStoresAction
     */
    public static ShippingMethodSetStoresAction of() {
        return new ShippingMethodSetStoresActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetStoresAction of(final ShippingMethodSetStoresAction template) {
        ShippingMethodSetStoresActionImpl instance = new ShippingMethodSetStoresActionImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    public ShippingMethodSetStoresAction copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetStoresAction deepCopy(@Nullable final ShippingMethodSetStoresAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetStoresActionImpl instance = new ShippingMethodSetStoresActionImpl();
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetStoresAction
     * @return builder
     */
    public static ShippingMethodSetStoresActionBuilder builder() {
        return ShippingMethodSetStoresActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetStoresAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetStoresActionBuilder builder(final ShippingMethodSetStoresAction template) {
        return ShippingMethodSetStoresActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetStoresAction(Function<ShippingMethodSetStoresAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ShippingMethodSetStoresAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ShippingMethodSetStoresAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetStoresAction>";
            }
        };
    }
}
