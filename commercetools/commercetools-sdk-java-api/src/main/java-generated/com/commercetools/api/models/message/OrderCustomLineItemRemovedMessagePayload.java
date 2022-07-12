
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
 * OrderCustomLineItemRemovedMessagePayload
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemRemovedMessagePayloadImpl.class)
public interface OrderCustomLineItemRemovedMessagePayload extends OrderMessagePayload {

    String ORDER_CUSTOM_LINE_ITEM_REMOVED = "OrderCustomLineItemRemoved";

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
    @Valid
    @JsonProperty("customLineItem")
    public CustomLineItem getCustomLineItem();

    public void setCustomLineItemId(final String customLineItemId);

    public void setCustomLineItem(final CustomLineItem customLineItem);

    public static OrderCustomLineItemRemovedMessagePayload of() {
        return new OrderCustomLineItemRemovedMessagePayloadImpl();
    }

    public static OrderCustomLineItemRemovedMessagePayload of(final OrderCustomLineItemRemovedMessagePayload template) {
        OrderCustomLineItemRemovedMessagePayloadImpl instance = new OrderCustomLineItemRemovedMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItem(template.getCustomLineItem());
        return instance;
    }

    public static OrderCustomLineItemRemovedMessagePayloadBuilder builder() {
        return OrderCustomLineItemRemovedMessagePayloadBuilder.of();
    }

    public static OrderCustomLineItemRemovedMessagePayloadBuilder builder(
            final OrderCustomLineItemRemovedMessagePayload template) {
        return OrderCustomLineItemRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderCustomLineItemRemovedMessagePayload(
            Function<OrderCustomLineItemRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemRemovedMessagePayload>";
            }
        };
    }
}
