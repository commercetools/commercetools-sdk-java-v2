package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadImpl;

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
 *  <p>Generated after a successful Remove Custom Line Item update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemRemovedMessagePayload orderCustomLineItemRemovedMessagePayload = OrderCustomLineItemRemovedMessagePayload.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderCustomLineItemRemovedMessagePayloadImpl.class)
public interface OrderCustomLineItemRemovedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomLineItemRemovedMessagePayload
     */
    String ORDER_CUSTOM_LINE_ITEM_REMOVED = "OrderCustomLineItemRemoved";

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    /**
     *  <p>Custom Line Item that was removed from the Order.</p>
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public CustomLineItem getCustomLineItem();

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @param customLineItemId value to be set
     */
    
    public void setCustomLineItemId(final String customLineItemId);
    
    
    /**
     *  <p>Custom Line Item that was removed from the Order.</p>
     * @param customLineItem value to be set
     */
    
    public void setCustomLineItem(final CustomLineItem customLineItem);
    

    /**
     * factory method
     * @return instance of OrderCustomLineItemRemovedMessagePayload
     */
    public static OrderCustomLineItemRemovedMessagePayload of(){
        return new OrderCustomLineItemRemovedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderCustomLineItemRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomLineItemRemovedMessagePayload of(final OrderCustomLineItemRemovedMessagePayload template) {
        OrderCustomLineItemRemovedMessagePayloadImpl instance = new OrderCustomLineItemRemovedMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItem(template.getCustomLineItem());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomLineItemRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomLineItemRemovedMessagePayload deepCopy(@Nullable final OrderCustomLineItemRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomLineItemRemovedMessagePayloadImpl instance = new OrderCustomLineItemRemovedMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItem(com.commercetools.api.models.cart.CustomLineItem.deepCopy(template.getCustomLineItem()));
        return instance;
    }

    /**
     * builder factory method for OrderCustomLineItemRemovedMessagePayload
     * @return builder
     */
    public static OrderCustomLineItemRemovedMessagePayloadBuilder builder() {
        return OrderCustomLineItemRemovedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for OrderCustomLineItemRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemRemovedMessagePayloadBuilder builder(final OrderCustomLineItemRemovedMessagePayload template) {
        return OrderCustomLineItemRemovedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomLineItemRemovedMessagePayload(Function<OrderCustomLineItemRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemRemovedMessagePayload>";
            }
        };
    }
}
