
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CustomLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomLineItemAddedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemAddedMessagePayload orderCustomLineItemAddedMessagePayload = OrderCustomLineItemAddedMessagePayload.builder()
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemAddedMessagePayloadImpl.class)
public interface OrderCustomLineItemAddedMessagePayload extends OrderMessagePayload {

    String ORDER_CUSTOM_LINE_ITEM_ADDED = "OrderCustomLineItemAdded";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public CustomLineItem getCustomLineItem();

    public void setCustomLineItem(final CustomLineItem customLineItem);

    public static OrderCustomLineItemAddedMessagePayload of() {
        return new OrderCustomLineItemAddedMessagePayloadImpl();
    }

    public static OrderCustomLineItemAddedMessagePayload of(final OrderCustomLineItemAddedMessagePayload template) {
        OrderCustomLineItemAddedMessagePayloadImpl instance = new OrderCustomLineItemAddedMessagePayloadImpl();
        instance.setCustomLineItem(template.getCustomLineItem());
        return instance;
    }

    public static OrderCustomLineItemAddedMessagePayloadBuilder builder() {
        return OrderCustomLineItemAddedMessagePayloadBuilder.of();
    }

    public static OrderCustomLineItemAddedMessagePayloadBuilder builder(
            final OrderCustomLineItemAddedMessagePayload template) {
        return OrderCustomLineItemAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderCustomLineItemAddedMessagePayload(
            Function<OrderCustomLineItemAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemAddedMessagePayload>";
            }
        };
    }
}
