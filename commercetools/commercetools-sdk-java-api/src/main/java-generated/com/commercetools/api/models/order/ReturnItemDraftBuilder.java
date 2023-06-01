package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.order.ReturnItemDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReturnItemDraftBuilder implements Builder<ReturnItemDraft> {

    
    
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
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */
    
    public ReturnItemDraftBuilder quantity( final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lineItemId
     * @param lineItemId value to be set
     * @return Builder
     */
    
    public ReturnItemDraftBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public ReturnItemDraftBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the comment
     * @param comment value to be set
     * @return Builder
     */
    
    public ReturnItemDraftBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }
    
    
    
    
    /**
     * set the value to the shipmentState
     * @param shipmentState value to be set
     * @return Builder
     */
    
    public ReturnItemDraftBuilder shipmentState( final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }
    
    
    
    
    /**
     *  <p>Custom Fields of this return item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public ReturnItemDraftBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields of this return item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public ReturnItemDraftBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields of this return item.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public ReturnItemDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }
    
    

    /**
     * value of quantity}
     * @return quantity
     */
    
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     * value of lineItemId}
     * @return lineItemId
     */
    
    @Nullable
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     * value of customLineItemId}
     * @return customLineItemId
     */
    
    @Nullable
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     * value of comment}
     * @return comment
     */
    
    @Nullable
    public String getComment(){
        return this.comment;
    }
    
    /**
     * value of shipmentState}
     * @return shipmentState
     */
    
    
    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState(){
        return this.shipmentState;
    }
    
    /**
     *  <p>Custom Fields of this return item.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    /**
     * builds ReturnItemDraft with checking for non-null required values
     * @return ReturnItemDraft
     */
    public ReturnItemDraft build() {
        Objects.requireNonNull(quantity, ReturnItemDraft.class + ": quantity is missing");
        Objects.requireNonNull(shipmentState, ReturnItemDraft.class + ": shipmentState is missing");
        return new ReturnItemDraftImpl(quantity, lineItemId, customLineItemId, comment, shipmentState, custom);
    }
    
    /**
     * builds ReturnItemDraft without checking for non-null required values
     * @return ReturnItemDraft
     */
    public ReturnItemDraft buildUnchecked() {
        return new ReturnItemDraftImpl(quantity, lineItemId, customLineItemId, comment, shipmentState, custom);
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
        builder.custom = template.getCustom();
        return builder;
    }

}
