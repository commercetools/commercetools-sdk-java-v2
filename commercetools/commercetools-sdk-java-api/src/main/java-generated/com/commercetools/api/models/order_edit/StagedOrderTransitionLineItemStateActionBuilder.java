package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderTransitionLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderTransitionLineItemStateAction stagedOrderTransitionLineItemStateAction = StagedOrderTransitionLineItemStateAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderTransitionLineItemStateActionBuilder implements Builder<StagedOrderTransitionLineItemStateAction> {

    
    
    private String lineItemId;
    
    
    
    private Long quantity;
    
    
    
    private com.commercetools.api.models.state.StateResourceIdentifier fromState;
    
    
    
    private com.commercetools.api.models.state.StateResourceIdentifier toState;
    
    
    @Nullable
    private java.time.ZonedDateTime actualTransitionDate;

    
    /**
     * set the value to the lineItemId
     * @param lineItemId value to be set
     * @return Builder
     */
    
    public StagedOrderTransitionLineItemStateActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */
    
    public StagedOrderTransitionLineItemStateActionBuilder quantity( final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    
    
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */
    
    public StagedOrderTransitionLineItemStateActionBuilder fromState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */
    
    public StagedOrderTransitionLineItemStateActionBuilder withFromState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param fromState value to be set
     * @return Builder
     */
    
    public StagedOrderTransitionLineItemStateActionBuilder fromState( final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
        return this;
    }
    
    
    
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param builder function to build the toState value
     * @return Builder
     */
    
    public StagedOrderTransitionLineItemStateActionBuilder toState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param builder function to build the toState value
     * @return Builder
     */
    
    public StagedOrderTransitionLineItemStateActionBuilder withToState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param toState value to be set
     * @return Builder
     */
    
    public StagedOrderTransitionLineItemStateActionBuilder toState( final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
        return this;
    }
    
    
    
    
    /**
     * set the value to the actualTransitionDate
     * @param actualTransitionDate value to be set
     * @return Builder
     */
    
    public StagedOrderTransitionLineItemStateActionBuilder actualTransitionDate(@Nullable final java.time.ZonedDateTime actualTransitionDate) {
        this.actualTransitionDate = actualTransitionDate;
        return this;
    }
    
    

    /**
     * value of lineItemId}
     * @return lineItemId
     */
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     * value of quantity}
     * @return quantity
     */
    
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @return fromState
     */
    
    
    public com.commercetools.api.models.state.StateResourceIdentifier getFromState(){
        return this.fromState;
    }
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @return toState
     */
    
    
    public com.commercetools.api.models.state.StateResourceIdentifier getToState(){
        return this.toState;
    }
    
    /**
     * value of actualTransitionDate}
     * @return actualTransitionDate
     */
    
    @Nullable
    public java.time.ZonedDateTime getActualTransitionDate(){
        return this.actualTransitionDate;
    }

    /**
     * builds StagedOrderTransitionLineItemStateAction with checking for non-null required values
     * @return StagedOrderTransitionLineItemStateAction
     */
    public StagedOrderTransitionLineItemStateAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderTransitionLineItemStateAction.class + ": lineItemId is missing");
        Objects.requireNonNull(quantity, StagedOrderTransitionLineItemStateAction.class + ": quantity is missing");
        Objects.requireNonNull(fromState, StagedOrderTransitionLineItemStateAction.class + ": fromState is missing");
        Objects.requireNonNull(toState, StagedOrderTransitionLineItemStateAction.class + ": toState is missing");
        return new StagedOrderTransitionLineItemStateActionImpl(lineItemId, quantity, fromState, toState, actualTransitionDate);
    }
    
    /**
     * builds StagedOrderTransitionLineItemStateAction without checking for non-null required values
     * @return StagedOrderTransitionLineItemStateAction
     */
    public StagedOrderTransitionLineItemStateAction buildUnchecked() {
        return new StagedOrderTransitionLineItemStateActionImpl(lineItemId, quantity, fromState, toState, actualTransitionDate);
    }

    /**
     * factory method for an instance of StagedOrderTransitionLineItemStateActionBuilder
     * @return builder 
     */
    public static StagedOrderTransitionLineItemStateActionBuilder of() {
        return new StagedOrderTransitionLineItemStateActionBuilder();
    }

    /**
     * create builder for StagedOrderTransitionLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderTransitionLineItemStateActionBuilder of(final StagedOrderTransitionLineItemStateAction template) {
        StagedOrderTransitionLineItemStateActionBuilder builder = new StagedOrderTransitionLineItemStateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        builder.actualTransitionDate = template.getActualTransitionDate();
        return builder;
    }

}
