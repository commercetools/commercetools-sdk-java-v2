
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetStoreAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetStoreAction orderSetStoreAction = OrderSetStoreAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetStoreActionImpl.class)
public interface OrderSetStoreAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetStoreAction
     */
    String SET_STORE = "setStore";

    /**
     *  <p>ResourceIdentifier to a Store.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>ResourceIdentifier to a Store.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of OrderSetStoreAction
     */
    public static OrderSetStoreAction of() {
        return new OrderSetStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetStoreAction of(final OrderSetStoreAction template) {
        OrderSetStoreActionImpl instance = new OrderSetStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetStoreAction deepCopy(@Nullable final OrderSetStoreAction template) {
        if (template == null) {
            return null;
        }
        OrderSetStoreActionImpl instance = new OrderSetStoreActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for OrderSetStoreAction
     * @return builder
     */
    public static OrderSetStoreActionBuilder builder() {
        return OrderSetStoreActionBuilder.of();
    }

    /**
     * create builder for OrderSetStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetStoreActionBuilder builder(final OrderSetStoreAction template) {
        return OrderSetStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetStoreAction(Function<OrderSetStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetStoreAction>";
            }
        };
    }
}
