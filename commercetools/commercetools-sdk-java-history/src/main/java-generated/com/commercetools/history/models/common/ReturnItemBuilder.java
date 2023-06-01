package com.commercetools.history.models.common;

import com.commercetools.history.models.common.ReturnPaymentState;
import com.commercetools.history.models.common.ReturnShipmentState;
import com.commercetools.history.models.common.ReturnItem;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */
    
    public ReturnItemBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */
    
    public ReturnItemBuilder quantity( final Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    
    
    
    
    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */
    
    public ReturnItemBuilder type( final String type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     * set the value to the comment
     * @param comment value to be set
     * @return Builder
     */
    
    public ReturnItemBuilder comment( final String comment) {
        this.comment = comment;
        return this;
    }
    
    
    
    
    /**
     * set the value to the shipmentState
     * @param shipmentState value to be set
     * @return Builder
     */
    
    public ReturnItemBuilder shipmentState( final com.commercetools.history.models.common.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }
    
    
    
    
    /**
     * set the value to the paymentState
     * @param paymentState value to be set
     * @return Builder
     */
    
    public ReturnItemBuilder paymentState( final com.commercetools.history.models.common.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lastModifiedAt
     * @param lastModifiedAt value to be set
     * @return Builder
     */
    
    public ReturnItemBuilder lastModifiedAt( final String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    
    
    /**
     * set the value to the createdAt
     * @param createdAt value to be set
     * @return Builder
     */
    
    public ReturnItemBuilder createdAt( final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    

    /**
     * value of id}
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     * value of quantity}
     * @return quantity
     */
    
    
    public Integer getQuantity(){
        return this.quantity;
    }
    
    /**
     * value of type}
     * @return type
     */
    
    
    public String getType(){
        return this.type;
    }
    
    /**
     * value of comment}
     * @return comment
     */
    
    
    public String getComment(){
        return this.comment;
    }
    
    /**
     * value of shipmentState}
     * @return shipmentState
     */
    
    
    public com.commercetools.history.models.common.ReturnShipmentState getShipmentState(){
        return this.shipmentState;
    }
    
    /**
     * value of paymentState}
     * @return paymentState
     */
    
    
    public com.commercetools.history.models.common.ReturnPaymentState getPaymentState(){
        return this.paymentState;
    }
    
    /**
     * value of lastModifiedAt}
     * @return lastModifiedAt
     */
    
    
    public String getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     * value of createdAt}
     * @return createdAt
     */
    
    
    public String getCreatedAt(){
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
        Objects.requireNonNull(comment, ReturnItem.class + ": comment is missing");
        Objects.requireNonNull(shipmentState, ReturnItem.class + ": shipmentState is missing");
        Objects.requireNonNull(paymentState, ReturnItem.class + ": paymentState is missing");
        Objects.requireNonNull(lastModifiedAt, ReturnItem.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(createdAt, ReturnItem.class + ": createdAt is missing");
        return new ReturnItemImpl(id, quantity, type, comment, shipmentState, paymentState, lastModifiedAt, createdAt);
    }
    
    /**
     * builds ReturnItem without checking for non-null required values
     * @return ReturnItem
     */
    public ReturnItem buildUnchecked() {
        return new ReturnItemImpl(id, quantity, type, comment, shipmentState, paymentState, lastModifiedAt, createdAt);
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
