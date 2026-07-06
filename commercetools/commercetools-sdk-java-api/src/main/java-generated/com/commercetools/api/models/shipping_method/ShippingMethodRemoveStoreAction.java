
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Removes the association to a Store from the ShippingMethod. If no more Stores are assigned, the ShippingMethod becomes a global ShippingMethod.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodRemoveStoreAction shippingMethodRemoveStoreAction = ShippingMethodRemoveStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeStore")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodRemoveStoreActionImpl.class)
public interface ShippingMethodRemoveStoreAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodRemoveStoreAction
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
     * @return instance of ShippingMethodRemoveStoreAction
     */
    public static ShippingMethodRemoveStoreAction of() {
        return new ShippingMethodRemoveStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodRemoveStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodRemoveStoreAction of(final ShippingMethodRemoveStoreAction template) {
        ShippingMethodRemoveStoreActionImpl instance = new ShippingMethodRemoveStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public ShippingMethodRemoveStoreAction copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodRemoveStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodRemoveStoreAction deepCopy(@Nullable final ShippingMethodRemoveStoreAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodRemoveStoreActionImpl instance = new ShippingMethodRemoveStoreActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodRemoveStoreAction
     * @return builder
     */
    public static ShippingMethodRemoveStoreActionBuilder builder() {
        return ShippingMethodRemoveStoreActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodRemoveStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodRemoveStoreActionBuilder builder(final ShippingMethodRemoveStoreAction template) {
        return ShippingMethodRemoveStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodRemoveStoreAction(Function<ShippingMethodRemoveStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ShippingMethodRemoveStoreAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ShippingMethodRemoveStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodRemoveStoreAction>";
            }
        };
    }
}
