
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ReturnItem
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnItem returnItem = ReturnItem.customLineItemReturnItemBuilder()
 *             id("{id}")
 *             quantity(0.3)
 *             shipmentState(ReturnShipmentState.ADVISED)
 *             paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ReturnItemImpl.class, visible = true)
@JsonDeserialize(as = ReturnItemImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReturnItem extends com.commercetools.api.models.Customizable<ReturnItem> {

    /**
     *  <p>Unique identifier of the Return Item.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the Return Item.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Number of Line Items or Custom Line Items returned.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-defined description for the return.</p>
     * @return comment
     */

    @JsonProperty("comment")
    public String getComment();

    /**
     *  <p>Shipment status of the Return Item.</p>
     * @return shipmentState
     */
    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    /**
     *  <p>Payment status of the Return Item:</p>
     *  <ul>
     *   <li><code>NonRefundable</code>, for items in the <code>Advised</code> ReturnShipmentState</li>
     *   <li><code>Initial</code>, for items in the <code>Returned</code> ReturnShipmentState</li>
     *  </ul>
     * @return paymentState
     */
    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    /**
     *  <p>Custom Fields of the Return Item.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Date and time (UTC) the Return Item was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Date and time (UTC) the Return Item was intitially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Unique identifier of the Return Item.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the Return Item.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Number of Line Items or Custom Line Items returned.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>User-defined description for the return.</p>
     * @param comment value to be set
     */

    public void setComment(final String comment);

    /**
     *  <p>Shipment status of the Return Item.</p>
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ReturnShipmentState shipmentState);

    /**
     *  <p>Payment status of the Return Item:</p>
     *  <ul>
     *   <li><code>NonRefundable</code>, for items in the <code>Advised</code> ReturnShipmentState</li>
     *   <li><code>Initial</code>, for items in the <code>Returned</code> ReturnShipmentState</li>
     *  </ul>
     * @param paymentState value to be set
     */

    public void setPaymentState(final ReturnPaymentState paymentState);

    /**
     *  <p>Custom Fields of the Return Item.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Date and time (UTC) the Return Item was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Date and time (UTC) the Return Item was intitially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    public ReturnItem copyDeep();

    /**
     * factory method to create a deep copy of ReturnItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnItem deepCopy(@Nullable final ReturnItem template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ReturnItemImpl)) {
            return template.copyDeep();
        }
        ReturnItemImpl instance = new ReturnItemImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setQuantity(template.getQuantity());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    /**
     * builder for customLineItemReturnItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.CustomLineItemReturnItemBuilder customLineItemReturnItemBuilder() {
        return com.commercetools.api.models.order.CustomLineItemReturnItemBuilder.of();
    }

    /**
     * builder for lineItemReturnItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.order.LineItemReturnItemBuilder lineItemReturnItemBuilder() {
        return com.commercetools.api.models.order.LineItemReturnItemBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnItem(Function<ReturnItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnItem>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnItem>";
            }
        };
    }
}
