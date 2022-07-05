
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomLineItemQuantityChangedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemQuantityChangedMessagePayload orderCustomLineItemQuantityChangedMessagePayload = OrderCustomLineItemQuantityChangedMessagePayload.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .oldQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemQuantityChangedMessagePayloadImpl.class)
public interface OrderCustomLineItemQuantityChangedMessagePayload extends OrderMessagePayload {

    String ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED = "OrderCustomLineItemQuantityChanged";

    /**
     *
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *
     */
    @NotNull
    @JsonProperty("oldQuantity")
    public Long getOldQuantity();

    public void setCustomLineItemId(final String customLineItemId);

    public void setQuantity(final Long quantity);

    public void setOldQuantity(final Long oldQuantity);

    public static OrderCustomLineItemQuantityChangedMessagePayload of() {
        return new OrderCustomLineItemQuantityChangedMessagePayloadImpl();
    }

    public static OrderCustomLineItemQuantityChangedMessagePayload of(
            final OrderCustomLineItemQuantityChangedMessagePayload template) {
        OrderCustomLineItemQuantityChangedMessagePayloadImpl instance = new OrderCustomLineItemQuantityChangedMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setOldQuantity(template.getOldQuantity());
        return instance;
    }

    public static OrderCustomLineItemQuantityChangedMessagePayloadBuilder builder() {
        return OrderCustomLineItemQuantityChangedMessagePayloadBuilder.of();
    }

    public static OrderCustomLineItemQuantityChangedMessagePayloadBuilder builder(
            final OrderCustomLineItemQuantityChangedMessagePayload template) {
        return OrderCustomLineItemQuantityChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderCustomLineItemQuantityChangedMessagePayload(
            Function<OrderCustomLineItemQuantityChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemQuantityChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemQuantityChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemQuantityChangedMessagePayload>";
            }
        };
    }
}
