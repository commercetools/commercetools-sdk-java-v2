
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemReturnItemBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemReturnItemBuilder implements Builder<LineItemReturnItem> {

    private String id;

    @Nullable
    private String key;

    private Long quantity;

    @Nullable
    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime createdAt;

    private String lineItemId;

    /**
     *  <p>Unique identifier of the Return Item.</p>
     * @param id value to be set
     * @return Builder
     */

    public LineItemReturnItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the LineItemReturnItem.</p>
     * @param key value to be set
     * @return Builder
     */

    public LineItemReturnItemBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Number of Line Items returned.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public LineItemReturnItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>User-defined description for the return.</p>
     * @param comment value to be set
     * @return Builder
     */

    public LineItemReturnItemBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>Shipment status of the Return Item.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public LineItemReturnItemBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
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

    public LineItemReturnItemBuilder paymentState(
            final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Custom Fields of the Return Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public LineItemReturnItemBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Return Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public LineItemReturnItemBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Return Item.</p>
     * @param custom value to be set
     * @return Builder
     */

    public LineItemReturnItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Return Item was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public LineItemReturnItemBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Return Item was intitially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public LineItemReturnItemBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p><code>id</code> of the returned <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public LineItemReturnItemBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
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
     *  <p>User-defined unique identifier of the LineItemReturnItem.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Number of Line Items returned.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
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

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
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

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Custom Fields of the Return Item.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
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
     *  <p>Date and time (UTC) the Return Item was intitially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p><code>id</code> of the returned <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     * builds LineItemReturnItem with checking for non-null required values
     * @return LineItemReturnItem
     */
    public LineItemReturnItem build() {
        Objects.requireNonNull(id, LineItemReturnItem.class + ": id is missing");
        Objects.requireNonNull(quantity, LineItemReturnItem.class + ": quantity is missing");
        Objects.requireNonNull(shipmentState, LineItemReturnItem.class + ": shipmentState is missing");
        Objects.requireNonNull(paymentState, LineItemReturnItem.class + ": paymentState is missing");
        Objects.requireNonNull(lastModifiedAt, LineItemReturnItem.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(createdAt, LineItemReturnItem.class + ": createdAt is missing");
        Objects.requireNonNull(lineItemId, LineItemReturnItem.class + ": lineItemId is missing");
        return new LineItemReturnItemImpl(id, key, quantity, comment, shipmentState, paymentState, custom,
            lastModifiedAt, createdAt, lineItemId);
    }

    /**
     * builds LineItemReturnItem without checking for non-null required values
     * @return LineItemReturnItem
     */
    public LineItemReturnItem buildUnchecked() {
        return new LineItemReturnItemImpl(id, key, quantity, comment, shipmentState, paymentState, custom,
            lastModifiedAt, createdAt, lineItemId);
    }

    /**
     * factory method for an instance of LineItemReturnItemBuilder
     * @return builder
     */
    public static LineItemReturnItemBuilder of() {
        return new LineItemReturnItemBuilder();
    }

    /**
     * create builder for LineItemReturnItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemReturnItemBuilder of(final LineItemReturnItem template) {
        LineItemReturnItemBuilder builder = new LineItemReturnItemBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.quantity = template.getQuantity();
        builder.comment = template.getComment();
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.custom = template.getCustom();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.createdAt = template.getCreatedAt();
        builder.lineItemId = template.getLineItemId();
        return builder;
    }

}
