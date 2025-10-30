
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnItem returnItem = ReturnItem.builder()
 *             .id("{id}")
 *             .quantity(0.3)
 *             .type("{type}")
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnItemBuilder implements Builder<ReturnItem> {

    private String id;

    @Nullable
    private String key;

    private Long quantity;

    private String type;

    @Nullable
    private String comment;

    private com.commercetools.history.models.common.ReturnShipmentState shipmentState;

    private com.commercetools.history.models.common.ReturnPaymentState paymentState;

    @Nullable
    private com.commercetools.history.models.common.CustomFields custom;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime createdAt;

    /**
     *  <p>Unique identifier of the Return Item.</p>
     * @param id value to be set
     * @return Builder
     */

    public ReturnItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Return Item.</p>
     * @param key value to be set
     * @return Builder
     */

    public ReturnItemBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Number of Line Items or Custom Line Items returned.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ReturnItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */

    public ReturnItemBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>User-defined description for the return.</p>
     * @param comment value to be set
     * @return Builder
     */

    public ReturnItemBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>Shipment status of the Return Item.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public ReturnItemBuilder shipmentState(
            final com.commercetools.history.models.common.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Payment status of the Return Item:</p>
     *  <ul>
     *   <li><code>NonRefundable</code>, for items in the <code>Advised</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnShipmentState" rel="nofollow">ReturnShipmentState</a></li>
     *   <li><code>Initial</code>, for items in the <code>Returned</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnShipmentState" rel="nofollow">ReturnShipmentState</a></li>
     *  </ul>
     * @param paymentState value to be set
     * @return Builder
     */

    public ReturnItemBuilder paymentState(
            final com.commercetools.history.models.common.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Custom Fields of the Return Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ReturnItemBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Return Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ReturnItemBuilder withCustom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Return Item.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ReturnItemBuilder custom(@Nullable final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Return Item was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ReturnItemBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Return Item was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ReturnItemBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Unique identifier of the Return Item.</p>
     * @return id
     */

    public String getId() {
        return this.id;
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
     *  <p>Number of Line Items or Custom Line Items returned.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * value of type}
     * @return type
     */

    public String getType() {
        return this.type;
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
     *  <p>Shipment status of the Return Item.</p>
     * @return shipmentState
     */

    public com.commercetools.history.models.common.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Payment status of the Return Item:</p>
     *  <ul>
     *   <li><code>NonRefundable</code>, for items in the <code>Advised</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnShipmentState" rel="nofollow">ReturnShipmentState</a></li>
     *   <li><code>Initial</code>, for items in the <code>Returned</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnShipmentState" rel="nofollow">ReturnShipmentState</a></li>
     *  </ul>
     * @return paymentState
     */

    public com.commercetools.history.models.common.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Custom Fields of the Return Item.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Date and time (UTC) the Return Item was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Date and time (UTC) the Return Item was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * builds ReturnItem with checking for non-null required values
     * @return ReturnItem
     */
    public ReturnItem build() {
        Objects.requireNonNull(id, ReturnItem.class + ": id is missing");
        Objects.requireNonNull(quantity, ReturnItem.class + ": quantity is missing");
        Objects.requireNonNull(type, ReturnItem.class + ": type is missing");
        Objects.requireNonNull(shipmentState, ReturnItem.class + ": shipmentState is missing");
        Objects.requireNonNull(paymentState, ReturnItem.class + ": paymentState is missing");
        Objects.requireNonNull(lastModifiedAt, ReturnItem.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(createdAt, ReturnItem.class + ": createdAt is missing");
        return new ReturnItemImpl(id, key, quantity, type, comment, shipmentState, paymentState, custom, lastModifiedAt,
            createdAt);
    }

    /**
     * builds ReturnItem without checking for non-null required values
     * @return ReturnItem
     */
    public ReturnItem buildUnchecked() {
        return new ReturnItemImpl(id, key, quantity, type, comment, shipmentState, paymentState, custom, lastModifiedAt,
            createdAt);
    }

    /**
     * factory method for an instance of ReturnItemBuilder
     * @return builder
     */
    public static ReturnItemBuilder of() {
        return new ReturnItemBuilder();
    }

    /**
     * create builder for ReturnItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnItemBuilder of(final ReturnItem template) {
        ReturnItemBuilder builder = new ReturnItemBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.quantity = template.getQuantity();
        builder.type = template.getType();
        builder.comment = template.getComment();
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.custom = template.getCustom();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.createdAt = template.getCreatedAt();
        return builder;
    }

}
