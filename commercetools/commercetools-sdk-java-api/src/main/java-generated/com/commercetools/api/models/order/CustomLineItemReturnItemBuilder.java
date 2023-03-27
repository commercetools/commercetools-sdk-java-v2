
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemReturnItemBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemReturnItemBuilder implements Builder<CustomLineItemReturnItem> {

    private String id;

    private Long quantity;

    @Nullable
    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime createdAt;

    private String customLineItemId;

    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomLineItemReturnItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */

    public CustomLineItemReturnItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * set the value to the comment
     * @param comment value to be set
     * @return Builder
     */

    public CustomLineItemReturnItemBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * set the value to the shipmentState
     * @param shipmentState value to be set
     * @return Builder
     */

    public CustomLineItemReturnItemBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     * set the value to the paymentState
     * @param paymentState value to be set
     * @return Builder
     */

    public CustomLineItemReturnItemBuilder paymentState(
            final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Custom Fields of this return item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomLineItemReturnItemBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of this return item.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CustomLineItemReturnItemBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     * set the value to the lastModifiedAt
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public CustomLineItemReturnItemBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     * set the value to the createdAt
     * @param createdAt value to be set
     * @return Builder
     */

    public CustomLineItemReturnItemBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CustomLineItemReturnItemBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * value of quantity}
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * value of comment}
     * @return comment
     */

    @Nullable
    public String getComment() {
        return this.comment;
    }

    /**
     * value of shipmentState}
     * @return shipmentState
     */

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     * value of paymentState}
     * @return paymentState
     */

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Custom Fields of this return item.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * value of lastModifiedAt}
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * value of createdAt}
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     * builds CustomLineItemReturnItem with checking for non-null required values
     * @return CustomLineItemReturnItem
     */
    public CustomLineItemReturnItem build() {
        Objects.requireNonNull(id, CustomLineItemReturnItem.class + ": id is missing");
        Objects.requireNonNull(quantity, CustomLineItemReturnItem.class + ": quantity is missing");
        Objects.requireNonNull(shipmentState, CustomLineItemReturnItem.class + ": shipmentState is missing");
        Objects.requireNonNull(paymentState, CustomLineItemReturnItem.class + ": paymentState is missing");
        Objects.requireNonNull(lastModifiedAt, CustomLineItemReturnItem.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(createdAt, CustomLineItemReturnItem.class + ": createdAt is missing");
        Objects.requireNonNull(customLineItemId, CustomLineItemReturnItem.class + ": customLineItemId is missing");
        return new CustomLineItemReturnItemImpl(id, quantity, comment, shipmentState, paymentState, custom,
            lastModifiedAt, createdAt, customLineItemId);
    }

    /**
     * builds CustomLineItemReturnItem without checking for non-null required values
     * @return CustomLineItemReturnItem
     */
    public CustomLineItemReturnItem buildUnchecked() {
        return new CustomLineItemReturnItemImpl(id, quantity, comment, shipmentState, paymentState, custom,
            lastModifiedAt, createdAt, customLineItemId);
    }

    /**
     * factory method for an instance of CustomLineItemReturnItemBuilder
     * @return builder
     */
    public static CustomLineItemReturnItemBuilder of() {
        return new CustomLineItemReturnItemBuilder();
    }

    /**
     * create builder for CustomLineItemReturnItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemReturnItemBuilder of(final CustomLineItemReturnItem template) {
        CustomLineItemReturnItemBuilder builder = new CustomLineItemReturnItemBuilder();
        builder.id = template.getId();
        builder.quantity = template.getQuantity();
        builder.comment = template.getComment();
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.custom = template.getCustom();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.createdAt = template.getCreatedAt();
        builder.customLineItemId = template.getCustomLineItemId();
        return builder;
    }

}
