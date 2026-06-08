
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ReturnItemDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnItemDraft returnItemDraft = ReturnItemDraft.builder()
 *             .quantity(0.3)
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReturnItemDraftImpl.class)
public interface ReturnItemDraft extends io.vrap.rmf.base.client.Draft<ReturnItemDraft> {

    /**
     *  <p>Number of Line Items or Custom Line Items to return.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to return.</p>
     *  <p>Required if Line Items are returned, to create a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemReturnItem" rel="nofollow">LineItemReturnItem</a>.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to return.</p>
     *  <p>Required if Custom Line Items are returned, to create a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemReturnItem" rel="nofollow">CustomLineItemReturnItem</a>.</p>
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>User-defined description for the return.</p>
     * @return comment
     */

    @JsonProperty("comment")
    public String getComment();

    /**
     *  <p>Shipment status of the item to be returned.</p>
     * @return shipmentState
     */
    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    /**
     *  <p>Number of Line Items or Custom Line Items to return.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to return.</p>
     *  <p>Required if Line Items are returned, to create a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemReturnItem" rel="nofollow">LineItemReturnItem</a>.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to return.</p>
     *  <p>Required if Custom Line Items are returned, to create a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemReturnItem" rel="nofollow">CustomLineItemReturnItem</a>.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>User-defined description for the return.</p>
     * @param comment value to be set
     */

    public void setComment(final String comment);

    /**
     *  <p>Shipment status of the item to be returned.</p>
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ReturnShipmentState shipmentState);

    /**
     * factory method
     * @return instance of ReturnItemDraft
     */
    public static ReturnItemDraft of() {
        return new ReturnItemDraftImpl();
    }

    /**
     * factory method to create a shallow copy ReturnItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReturnItemDraft of(final ReturnItemDraft template) {
        ReturnItemDraftImpl instance = new ReturnItemDraftImpl();
        instance.setQuantity(template.getQuantity());
        instance.setLineItemId(template.getLineItemId());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    public ReturnItemDraft copyDeep();

    /**
     * factory method to create a deep copy of ReturnItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnItemDraft deepCopy(@Nullable final ReturnItemDraft template) {
        if (template == null) {
            return null;
        }
        ReturnItemDraftImpl instance = new ReturnItemDraftImpl();
        instance.setQuantity(template.getQuantity());
        instance.setLineItemId(template.getLineItemId());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setComment(template.getComment());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    /**
     * builder factory method for ReturnItemDraft
     * @return builder
     */
    public static ReturnItemDraftBuilder builder() {
        return ReturnItemDraftBuilder.of();
    }

    /**
     * create builder for ReturnItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnItemDraftBuilder builder(final ReturnItemDraft template) {
        return ReturnItemDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnItemDraft(Function<ReturnItemDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnItemDraft>";
            }
        };
    }
}
