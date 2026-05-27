
package com.commercetools.api.models.warning;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CannotCreateReservationWarningBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CannotCreateReservationWarning cannotCreateReservationWarning = CannotCreateReservationWarning.builder()
 *             .message("{message}")
 *             .productId("{productId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CannotCreateReservationWarningBuilder implements Builder<CannotCreateReservationWarning> {

    private String message;

    private String productId;

    @Nullable
    private String sku;

    @Nullable
    private String supplyChannel;

    private Double quantity;

    /**
     *  <p><code>"Failed to create a reservation for product $productId (SKU: $sku, Supply Channel: $supplyChannel) with quantity $quantity."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public CannotCreateReservationWarningBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The ID of the Product for which the reservation could not be created.</p>
     * @param productId value to be set
     * @return Builder
     */

    public CannotCreateReservationWarningBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>The SKU of the Product Variant for which the reservation could not be created.</p>
     * @param sku value to be set
     * @return Builder
     */

    public CannotCreateReservationWarningBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The ID of the Supply Channel for which the reservation could not be created.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public CannotCreateReservationWarningBuilder supplyChannel(@Nullable final String supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>The quantity for which the reservation could not be created.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public CannotCreateReservationWarningBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p><code>"Failed to create a reservation for product $productId (SKU: $sku, Supply Channel: $supplyChannel) with quantity $quantity."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The ID of the Product for which the reservation could not be created.</p>
     * @return productId
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>The SKU of the Product Variant for which the reservation could not be created.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The ID of the Supply Channel for which the reservation could not be created.</p>
     * @return supplyChannel
     */

    @Nullable
    public String getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>The quantity for which the reservation could not be created.</p>
     * @return quantity
     */

    public Double getQuantity() {
        return this.quantity;
    }

    /**
     * builds CannotCreateReservationWarning with checking for non-null required values
     * @return CannotCreateReservationWarning
     */
    public CannotCreateReservationWarning build() {
        Objects.requireNonNull(message, CannotCreateReservationWarning.class + ": message is missing");
        Objects.requireNonNull(productId, CannotCreateReservationWarning.class + ": productId is missing");
        Objects.requireNonNull(quantity, CannotCreateReservationWarning.class + ": quantity is missing");
        return new CannotCreateReservationWarningImpl(message, productId, sku, supplyChannel, quantity);
    }

    /**
     * builds CannotCreateReservationWarning without checking for non-null required values
     * @return CannotCreateReservationWarning
     */
    public CannotCreateReservationWarning buildUnchecked() {
        return new CannotCreateReservationWarningImpl(message, productId, sku, supplyChannel, quantity);
    }

    /**
     * factory method for an instance of CannotCreateReservationWarningBuilder
     * @return builder
     */
    public static CannotCreateReservationWarningBuilder of() {
        return new CannotCreateReservationWarningBuilder();
    }

    /**
     * create builder for CannotCreateReservationWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CannotCreateReservationWarningBuilder of(final CannotCreateReservationWarning template) {
        CannotCreateReservationWarningBuilder builder = new CannotCreateReservationWarningBuilder();
        builder.message = template.getMessage();
        builder.productId = template.getProductId();
        builder.sku = template.getSku();
        builder.supplyChannel = template.getSupplyChannel();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
