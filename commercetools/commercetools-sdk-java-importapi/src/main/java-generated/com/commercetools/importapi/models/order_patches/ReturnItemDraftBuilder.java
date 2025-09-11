
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnItemDraftBuilder
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
public class ReturnItemDraftBuilder implements Builder<ReturnItemDraft> {

    private Long quantity;

    @Nullable
    private String lineItemId;

    @Nullable
    private String customLineItemId;

    @Nullable
    private String comment;

    private com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState;

    /**
     *  <p>Number of Line Items or Custom Line Items to return.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ReturnItemDraftBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to return.</p>
     *  <p>Required if Line Items are returned, to create a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemReturnItem" rel="nofollow">LineItemReturnItem</a>.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public ReturnItemDraftBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to return.</p>
     *  <p>Required if Custom Line Items are returned, to create a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemReturnItem" rel="nofollow">CustomLineItemReturnItem</a>.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public ReturnItemDraftBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>User-defined description for the return.</p>
     * @param comment value to be set
     * @return Builder
     */

    public ReturnItemDraftBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>Shipment status of the item to be returned.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public ReturnItemDraftBuilder shipmentState(
            final com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Number of Line Items or Custom Line Items to return.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to return.</p>
     *  <p>Required if Line Items are returned, to create a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemReturnItem" rel="nofollow">LineItemReturnItem</a>.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to return.</p>
     *  <p>Required if Custom Line Items are returned, to create a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemReturnItem" rel="nofollow">CustomLineItemReturnItem</a>.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>User-defined description for the return.</p>
     * @return comment
     */

    @Nullable
    public String getComment() {
        return this.comment;
    }

    /**
     *  <p>Shipment status of the item to be returned.</p>
     * @return shipmentState
     */

    public com.commercetools.importapi.models.order_patches.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     * builds ReturnItemDraft with checking for non-null required values
     * @return ReturnItemDraft
     */
    public ReturnItemDraft build() {
        Objects.requireNonNull(quantity, ReturnItemDraft.class + ": quantity is missing");
        Objects.requireNonNull(shipmentState, ReturnItemDraft.class + ": shipmentState is missing");
        return new ReturnItemDraftImpl(quantity, lineItemId, customLineItemId, comment, shipmentState);
    }

    /**
     * builds ReturnItemDraft without checking for non-null required values
     * @return ReturnItemDraft
     */
    public ReturnItemDraft buildUnchecked() {
        return new ReturnItemDraftImpl(quantity, lineItemId, customLineItemId, comment, shipmentState);
    }

    /**
     * factory method for an instance of ReturnItemDraftBuilder
     * @return builder
     */
    public static ReturnItemDraftBuilder of() {
        return new ReturnItemDraftBuilder();
    }

    /**
     * create builder for ReturnItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnItemDraftBuilder of(final ReturnItemDraft template) {
        ReturnItemDraftBuilder builder = new ReturnItemDraftBuilder();
        builder.quantity = template.getQuantity();
        builder.lineItemId = template.getLineItemId();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.comment = template.getComment();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
