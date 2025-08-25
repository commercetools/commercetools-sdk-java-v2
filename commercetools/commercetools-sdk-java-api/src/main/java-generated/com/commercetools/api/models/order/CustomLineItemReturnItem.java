
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
@io.vrap.rmf.base.client.utils.json.SubType("CustomLineItemReturnItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomLineItemReturnItemImpl.class)
public interface CustomLineItemReturnItem extends ReturnItem {

    /**
     * discriminator value for CustomLineItemReturnItem
     */
    String CUSTOM_LINE_ITEM_RETURN_ITEM = "CustomLineItemReturnItem";

    /**
     *  <p>User-defined unique identifier of the CustomLineItemReturnItem.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>id</code> of the returned <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>Number of Custom Line Items returned.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>User-defined unique identifier of the CustomLineItemReturnItem.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>id</code> of the returned <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>Number of Custom Line Items returned.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     * factory method
     * @return instance of CustomLineItemReturnItem
     */
    public static CustomLineItemReturnItem of() {
        return new CustomLineItemReturnItemImpl();
    }

    /**
     * factory method to create a shallow copy CustomLineItemReturnItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomLineItemReturnItem of(final CustomLineItemReturnItem template) {
        CustomLineItemReturnItemImpl instance = new CustomLineItemReturnItemImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
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

    public CustomLineItemReturnItem copyDeep();

    /**
     * factory method to create a deep copy of CustomLineItemReturnItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomLineItemReturnItem deepCopy(@Nullable final CustomLineItemReturnItem template) {
        if (template == null) {
            return null;
        }
        CustomLineItemReturnItemImpl instance = new CustomLineItemReturnItemImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setQuantity(template.getQuantity());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    /**
     * builder factory method for CustomLineItemReturnItem
     * @return builder
     */
    public static CustomLineItemReturnItemBuilder builder() {
        return CustomLineItemReturnItemBuilder.of();
    }

    /**
     * create builder for CustomLineItemReturnItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemReturnItemBuilder builder(final CustomLineItemReturnItem template) {
        return CustomLineItemReturnItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomLineItemReturnItem(Function<CustomLineItemReturnItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemReturnItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemReturnItem>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemReturnItem>";
            }
        };
    }
}
