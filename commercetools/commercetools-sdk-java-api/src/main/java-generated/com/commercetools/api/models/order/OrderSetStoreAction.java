
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> the Order is assigned to. It should be used to migrate Orders to a new Store. No validations are performed (such as that the Customer is allowed to create Orders in the Store).</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderStoreSetMessage" rel="nofollow">Order Store Set</a> Message. Returns a <code>400</code> error if <code>store</code> references the same Store the Order is currently assigned to, including if you try to remove the value when no Store is currently assigned.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setStore")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetStoreActionImpl.class)
public interface OrderSetStoreAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetStoreAction
     */
    String SET_STORE = "setStore";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If <code>store</code> references the same Store the Order is currently assigned to or if you try to remove the value when no Store is currently assigned, a <code>400</code> error is returned.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If <code>store</code> references the same Store the Order is currently assigned to or if you try to remove the value when no Store is currently assigned, a <code>400</code> error is returned.</p>
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

    public OrderSetStoreAction copyDeep();

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
