
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

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

    @Nullable
    private String key;

    private Long quantity;

    @Nullable
    private String lineItemId;

    @Nullable
    private String customLineItemId;

    @Nullable
    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined unique identifier of the Return Item.</p>
     * @param key value to be set
     * @return Builder
     */

    public ReturnItemDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

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
     *  <p><code>id</code> of the LineItem to return.</p>
     *  <p>Required if Line Items are returned, to create a LineItemReturnItem.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public ReturnItemDraftBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to return.</p>
     *  <p>Required if Custom Line Items are returned, to create a CustomLineItemReturnItem.</p>
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
     *  <p>Shipment status of the item to be returned. Can either be <code>Advised</code> or <code>Returned</code> only.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public ReturnItemDraftBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Custom Fields for the Return Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ReturnItemDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Return Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ReturnItemDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Return Item.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ReturnItemDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Return Item.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Number of Line Items or Custom Line Items to return.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p><code>id</code> of the LineItem to return.</p>
     *  <p>Required if Line Items are returned, to create a LineItemReturnItem.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to return.</p>
     *  <p>Required if Custom Line Items are returned, to create a CustomLineItemReturnItem.</p>
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
     *  <p>Shipment status of the item to be returned. Can either be <code>Advised</code> or <code>Returned</code> only.</p>
     * @return shipmentState
     */

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Custom Fields for the Return Item.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds ReturnItemDraft with checking for non-null required values
     * @return ReturnItemDraft
     */
    public ReturnItemDraft build() {
        Objects.requireNonNull(quantity, ReturnItemDraft.class + ": quantity is missing");
        Objects.requireNonNull(shipmentState, ReturnItemDraft.class + ": shipmentState is missing");
        return new ReturnItemDraftImpl(key, quantity, lineItemId, customLineItemId, comment, shipmentState, custom);
    }

    /**
     * builds ReturnItemDraft without checking for non-null required values
     * @return ReturnItemDraft
     */
    public ReturnItemDraft buildUnchecked() {
        return new ReturnItemDraftImpl(key, quantity, lineItemId, customLineItemId, comment, shipmentState, custom);
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
        builder.key = template.getKey();
        builder.quantity = template.getQuantity();
        builder.lineItemId = template.getLineItemId();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.comment = template.getComment();
        builder.shipmentState = template.getShipmentState();
        builder.custom = template.getCustom();
        return builder;
    }

}
