
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

    private Double quantity;

    @Nullable
    private String lineItemId;

    @Nullable
    private String customLineItemId;

    @Nullable
    private String comment;

    private com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState;

    /**
     *
     * @param quantity
     * @return Builder
     */

    public ReturnItemDraftBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *
     * @param lineItemId
     * @return Builder
     */

    public ReturnItemDraftBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *
     * @param customLineItemId
     * @return Builder
     */

    public ReturnItemDraftBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *
     * @param comment
     * @return Builder
     */

    public ReturnItemDraftBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>Maps to <code>ReturnItem.shipmentState</code></p>
     * @param shipmentState
     * @return Builder
     */

    public ReturnItemDraftBuilder shipmentState(
            final com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    @Nullable
    public String getComment() {
        return this.comment;
    }

    public com.commercetools.importapi.models.order_patches.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public ReturnItemDraft build() {
        Objects.requireNonNull(quantity, ReturnItemDraft.class + ": quantity is missing");
        Objects.requireNonNull(shipmentState, ReturnItemDraft.class + ": shipmentState is missing");
        return new ReturnItemDraftImpl(quantity, lineItemId, customLineItemId, comment, shipmentState);
    }

    /**
     * builds ReturnItemDraft without checking for non null required values
     */
    public ReturnItemDraft buildUnchecked() {
        return new ReturnItemDraftImpl(quantity, lineItemId, customLineItemId, comment, shipmentState);
    }

    public static ReturnItemDraftBuilder of() {
        return new ReturnItemDraftBuilder();
    }

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
