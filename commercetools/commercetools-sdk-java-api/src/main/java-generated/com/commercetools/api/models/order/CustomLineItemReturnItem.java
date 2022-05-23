
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemReturnItem
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemReturnItem customLineItemReturnItem = CustomLineItemReturnItem.builder()
 *             .id("{id}")
 *             .quantity(0.3)
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomLineItemReturnItemImpl.class)
public interface CustomLineItemReturnItem extends ReturnItem {

    String CUSTOM_LINE_ITEM_RETURN_ITEM = "CustomLineItemReturnItem";

    /**
     <>
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    public void setCustomLineItemId(final String customLineItemId);

    public static CustomLineItemReturnItem of() {
        return new CustomLineItemReturnItemImpl();
    }

    public static CustomLineItemReturnItem of(final CustomLineItemReturnItem template) {
        CustomLineItemReturnItemImpl instance = new CustomLineItemReturnItemImpl();
        instance.setId(template.getId());
        instance.setQuantity(template.getQuantity());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setCustom(template.getCustom());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    public static CustomLineItemReturnItemBuilder builder() {
        return CustomLineItemReturnItemBuilder.of();
    }

    public static CustomLineItemReturnItemBuilder builder(final CustomLineItemReturnItem template) {
        return CustomLineItemReturnItemBuilder.of(template);
    }

    default <T> T withCustomLineItemReturnItem(Function<CustomLineItemReturnItem, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemReturnItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemReturnItem>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemReturnItem>";
            }
        };
    }
}
