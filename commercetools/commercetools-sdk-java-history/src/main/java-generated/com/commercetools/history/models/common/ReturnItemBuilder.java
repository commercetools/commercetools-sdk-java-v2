
package com.commercetools.history.models.common;

import java.util.*;

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
 *             .quantity(1)
 *             .type("{type}")
 *             .comment("{comment}")
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .lastModifiedAt("{lastModifiedAt}")
 *             .createdAt("{createdAt}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnItemBuilder implements Builder<ReturnItem> {

    private String id;

    private Integer quantity;

    private String type;

    private String comment;

    private com.commercetools.history.models.common.ReturnShipmentState shipmentState;

    private com.commercetools.history.models.common.ReturnPaymentState paymentState;

    private String lastModifiedAt;

    private String createdAt;

    /**
     *
     * @param id
     * @return Builder
     */

    public ReturnItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @param quantity
     * @return Builder
     */

    public ReturnItemBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *
     * @param type
     * @return Builder
     */

    public ReturnItemBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @param comment
     * @return Builder
     */

    public ReturnItemBuilder comment(final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *
     * @param shipmentState
     * @return Builder
     */

    public ReturnItemBuilder shipmentState(
            final com.commercetools.history.models.common.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *
     * @param paymentState
     * @return Builder
     */

    public ReturnItemBuilder paymentState(
            final com.commercetools.history.models.common.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *
     * @param lastModifiedAt
     * @return Builder
     */

    public ReturnItemBuilder lastModifiedAt(final String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *
     * @param createdAt
     * @return Builder
     */

    public ReturnItemBuilder createdAt(final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public String getType() {
        return this.type;
    }

    public String getComment() {
        return this.comment;
    }

    public com.commercetools.history.models.common.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public com.commercetools.history.models.common.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public ReturnItem build() {
        Objects.requireNonNull(id, ReturnItem.class + ": id is missing");
        Objects.requireNonNull(quantity, ReturnItem.class + ": quantity is missing");
        Objects.requireNonNull(type, ReturnItem.class + ": type is missing");
        Objects.requireNonNull(comment, ReturnItem.class + ": comment is missing");
        Objects.requireNonNull(shipmentState, ReturnItem.class + ": shipmentState is missing");
        Objects.requireNonNull(paymentState, ReturnItem.class + ": paymentState is missing");
        Objects.requireNonNull(lastModifiedAt, ReturnItem.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(createdAt, ReturnItem.class + ": createdAt is missing");
        return new ReturnItemImpl(id, quantity, type, comment, shipmentState, paymentState, lastModifiedAt, createdAt);
    }

    /**
     * builds ReturnItem without checking for non null required values
     */
    public ReturnItem buildUnchecked() {
        return new ReturnItemImpl(id, quantity, type, comment, shipmentState, paymentState, lastModifiedAt, createdAt);
    }

    public static ReturnItemBuilder of() {
        return new ReturnItemBuilder();
    }

    public static ReturnItemBuilder of(final ReturnItem template) {
        ReturnItemBuilder builder = new ReturnItemBuilder();
        builder.id = template.getId();
        builder.quantity = template.getQuantity();
        builder.type = template.getType();
        builder.comment = template.getComment();
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.createdAt = template.getCreatedAt();
        return builder;
    }

}
