
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
 *  <p>Associates the ShippingMethod with a Store.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddStoreAction shippingMethodAddStoreAction = ShippingMethodAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addStore")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodAddStoreActionImpl.class)
public interface ShippingMethodAddStoreAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodAddStoreAction
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
     * @return instance of ShippingMethodAddStoreAction
     */
    public static ShippingMethodAddStoreAction of() {
        return new ShippingMethodAddStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodAddStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodAddStoreAction of(final ShippingMethodAddStoreAction template) {
        ShippingMethodAddStoreActionImpl instance = new ShippingMethodAddStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public ShippingMethodAddStoreAction copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodAddStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodAddStoreAction deepCopy(@Nullable final ShippingMethodAddStoreAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodAddStoreActionImpl instance = new ShippingMethodAddStoreActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodAddStoreAction
     * @return builder
     */
    public static ShippingMethodAddStoreActionBuilder builder() {
        return ShippingMethodAddStoreActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodAddStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodAddStoreActionBuilder builder(final ShippingMethodAddStoreAction template) {
        return ShippingMethodAddStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodAddStoreAction(Function<ShippingMethodAddStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ShippingMethodAddStoreAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ShippingMethodAddStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodAddStoreAction>";
            }
        };
    }
}
