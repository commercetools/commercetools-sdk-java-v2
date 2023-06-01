package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderRemoveDeliveryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * OrderRemoveDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderRemoveDeliveryAction orderRemoveDeliveryAction = OrderRemoveDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderRemoveDeliveryActionImpl.class)
public interface OrderRemoveDeliveryAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderRemoveDeliveryAction
     */
    String REMOVE_DELIVERY = "removeDelivery";

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */
    
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */
    
    @JsonProperty("deliveryKey")
    public String getDeliveryKey();

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     */
    
    public void setDeliveryId(final String deliveryId);
    
    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     */
    
    public void setDeliveryKey(final String deliveryKey);
    

    /**
     * factory method
     * @return instance of OrderRemoveDeliveryAction
     */
    public static OrderRemoveDeliveryAction of(){
        return new OrderRemoveDeliveryActionImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderRemoveDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderRemoveDeliveryAction of(final OrderRemoveDeliveryAction template) {
        OrderRemoveDeliveryActionImpl instance = new OrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderRemoveDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderRemoveDeliveryAction deepCopy(@Nullable final OrderRemoveDeliveryAction template) {
        if (template == null) {
            return null;
        }
        OrderRemoveDeliveryActionImpl instance = new OrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        return instance;
    }

    /**
     * builder factory method for OrderRemoveDeliveryAction
     * @return builder
     */
    public static OrderRemoveDeliveryActionBuilder builder() {
        return OrderRemoveDeliveryActionBuilder.of();
    }
    
    /**
     * create builder for OrderRemoveDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderRemoveDeliveryActionBuilder builder(final OrderRemoveDeliveryAction template) {
        return OrderRemoveDeliveryActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderRemoveDeliveryAction(Function<OrderRemoveDeliveryAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderRemoveDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderRemoveDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderRemoveDeliveryAction>";
            }
        };
    }
}
