
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetKeyAction orderEditSetKeyAction = OrderEditSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditSetKeyActionImpl.class)
public interface OrderEditSetKeyAction extends OrderEditUpdateAction {

    /**
     * discriminator value for OrderEditSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of OrderEditSetKeyAction
     */
    public static OrderEditSetKeyAction of() {
        return new OrderEditSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderEditSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditSetKeyAction of(final OrderEditSetKeyAction template) {
        OrderEditSetKeyActionImpl instance = new OrderEditSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public OrderEditSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of OrderEditSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditSetKeyAction deepCopy(@Nullable final OrderEditSetKeyAction template) {
        if (template == null) {
            return null;
        }
        OrderEditSetKeyActionImpl instance = new OrderEditSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for OrderEditSetKeyAction
     * @return builder
     */
    public static OrderEditSetKeyActionBuilder builder() {
        return OrderEditSetKeyActionBuilder.of();
    }

    /**
     * create builder for OrderEditSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditSetKeyActionBuilder builder(final OrderEditSetKeyAction template) {
        return OrderEditSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditSetKeyAction(Function<OrderEditSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderEditSetKeyAction ofUnset() {
        return OrderEditSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditSetKeyAction>";
            }
        };
    }
}
