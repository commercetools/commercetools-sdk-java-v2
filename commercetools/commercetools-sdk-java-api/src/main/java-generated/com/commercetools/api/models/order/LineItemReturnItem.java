
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * LineItemReturnItem
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemReturnItem lineItemReturnItem = LineItemReturnItem.builder()
 *             .id("{id}")
 *             .quantity(0.3)
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("LineItemReturnItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemReturnItemImpl.class)
public interface LineItemReturnItem extends ReturnItem {

    /**
     * discriminator value for LineItemReturnItem
     */
    String LINE_ITEM_RETURN_ITEM = "LineItemReturnItem";

    /**
     *  <p>User-defined unique identifier of the LineItemReturnItem.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>id</code> of the returned LineItem.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Number of Line Items returned.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>User-defined unique identifier of the LineItemReturnItem.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>id</code> of the returned LineItem.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>Number of Line Items returned.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of LineItemReturnItem
     */
    public static LineItemReturnItem of() {
        return new LineItemReturnItemImpl();
    }

    /**
     * factory method to create a shallow copy LineItemReturnItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemReturnItem of(final LineItemReturnItem template) {
        LineItemReturnItemImpl instance = new LineItemReturnItemImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setQuantity(template.getQuantity());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setCustom(template.getCustom());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    public LineItemReturnItem copyDeep();

    /**
     * factory method to create a deep copy of LineItemReturnItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItemReturnItem deepCopy(@Nullable final LineItemReturnItem template) {
        if (template == null) {
            return null;
        }
        LineItemReturnItemImpl instance = new LineItemReturnItemImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setQuantity(template.getQuantity());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    /**
     * builder factory method for LineItemReturnItem
     * @return builder
     */
    public static LineItemReturnItemBuilder builder() {
        return LineItemReturnItemBuilder.of();
    }

    /**
     * create builder for LineItemReturnItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemReturnItemBuilder builder(final LineItemReturnItem template) {
        return LineItemReturnItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemReturnItem(Function<LineItemReturnItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemReturnItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemReturnItem>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemReturnItem>";
            }
        };
    }
}
