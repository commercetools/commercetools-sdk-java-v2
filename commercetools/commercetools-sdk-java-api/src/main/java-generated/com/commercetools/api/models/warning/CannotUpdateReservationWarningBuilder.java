
package com.commercetools.api.models.warning;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CannotUpdateReservationWarningBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CannotUpdateReservationWarning cannotUpdateReservationWarning = CannotUpdateReservationWarning.builder()
 *             .message("{message}")
 *             .lineItemId("{lineItemId}")
 *             .requestedQuantity(0.3)
 *             .reservedQuantity(0.3)
 *             .productId("{productId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CannotUpdateReservationWarningBuilder implements Builder<CannotUpdateReservationWarning> {

    private String message;

    private String lineItemId;

    private Double requestedQuantity;

    private Double reservedQuantity;

    private String productId;

    @Nullable
    private String sku;

    @Nullable
    private String supplyChannel;

    /**
     *  <p><code>"Failed to update the reservation for line item $lineItemId (Product ID: $productId, SKU: $sku, Supply Channel: $supplyChannel) to a quantity of $requestedQuantity. The reserved amount is still $reservedQuantity."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public CannotUpdateReservationWarningBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The ID of the Line Item.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public CannotUpdateReservationWarningBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>The quantity that was requested for the Line Item.</p>
     * @param requestedQuantity value to be set
     * @return Builder
     */

    public CannotUpdateReservationWarningBuilder requestedQuantity(final Double requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
        return this;
    }

    /**
     *  <p>The quantity that remains reserved for the Line Item.</p>
     * @param reservedQuantity value to be set
     * @return Builder
     */

    public CannotUpdateReservationWarningBuilder reservedQuantity(final Double reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
        return this;
    }

    /**
     *  <p>The ID of the Product associated with the Line Item.</p>
     * @param productId value to be set
     * @return Builder
     */

    public CannotUpdateReservationWarningBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>The SKU of the Product Variant associated with the Line Item.</p>
     * @param sku value to be set
     * @return Builder
     */

    public CannotUpdateReservationWarningBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The ID of the Supply Channel associated with the reservation.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public CannotUpdateReservationWarningBuilder supplyChannel(@Nullable final String supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p><code>"Failed to update the reservation for line item $lineItemId (Product ID: $productId, SKU: $sku, Supply Channel: $supplyChannel) to a quantity of $requestedQuantity. The reserved amount is still $reservedQuantity."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The ID of the Line Item.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>The quantity that was requested for the Line Item.</p>
     * @return requestedQuantity
     */

    public Double getRequestedQuantity() {
        return this.requestedQuantity;
    }

    /**
     *  <p>The quantity that remains reserved for the Line Item.</p>
     * @return reservedQuantity
     */

    public Double getReservedQuantity() {
        return this.reservedQuantity;
    }

    /**
     *  <p>The ID of the Product associated with the Line Item.</p>
     * @return productId
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>The SKU of the Product Variant associated with the Line Item.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The ID of the Supply Channel associated with the reservation.</p>
     * @return supplyChannel
     */

    @Nullable
    public String getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds CannotUpdateReservationWarning with checking for non-null required values
     * @return CannotUpdateReservationWarning
     */
    public CannotUpdateReservationWarning build() {
        Objects.requireNonNull(message, CannotUpdateReservationWarning.class + ": message is missing");
        Objects.requireNonNull(lineItemId, CannotUpdateReservationWarning.class + ": lineItemId is missing");
        Objects.requireNonNull(requestedQuantity,
            CannotUpdateReservationWarning.class + ": requestedQuantity is missing");
        Objects.requireNonNull(reservedQuantity,
            CannotUpdateReservationWarning.class + ": reservedQuantity is missing");
        Objects.requireNonNull(productId, CannotUpdateReservationWarning.class + ": productId is missing");
        return new CannotUpdateReservationWarningImpl(message, lineItemId, requestedQuantity, reservedQuantity,
            productId, sku, supplyChannel);
    }

    /**
     * builds CannotUpdateReservationWarning without checking for non-null required values
     * @return CannotUpdateReservationWarning
     */
    public CannotUpdateReservationWarning buildUnchecked() {
        return new CannotUpdateReservationWarningImpl(message, lineItemId, requestedQuantity, reservedQuantity,
            productId, sku, supplyChannel);
    }

    /**
     * factory method for an instance of CannotUpdateReservationWarningBuilder
     * @return builder
     */
    public static CannotUpdateReservationWarningBuilder of() {
        return new CannotUpdateReservationWarningBuilder();
    }

    /**
     * create builder for CannotUpdateReservationWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CannotUpdateReservationWarningBuilder of(final CannotUpdateReservationWarning template) {
        CannotUpdateReservationWarningBuilder builder = new CannotUpdateReservationWarningBuilder();
        builder.message = template.getMessage();
        builder.lineItemId = template.getLineItemId();
        builder.requestedQuantity = template.getRequestedQuantity();
        builder.reservedQuantity = template.getReservedQuantity();
        builder.productId = template.getProductId();
        builder.sku = template.getSku();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
