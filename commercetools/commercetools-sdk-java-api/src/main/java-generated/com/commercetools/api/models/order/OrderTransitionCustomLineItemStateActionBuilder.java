package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order.OrderTransitionCustomLineItemStateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderTransitionCustomLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderTransitionCustomLineItemStateAction orderTransitionCustomLineItemStateAction = OrderTransitionCustomLineItemStateAction.builder()
 *             .customLineItemId("{customLineItemId}")
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
public class OrderTransitionCustomLineItemStateActionBuilder implements Builder<OrderTransitionCustomLineItemStateAction> {

    
    
    private String customLineItemId;
    
    
    
    private Long quantity;
    
    
    
    private com.commercetools.api.models.state.StateResourceIdentifier fromState;
    
    
    
    private com.commercetools.api.models.state.StateResourceIdentifier toState;
    
    
    @Nullable
    private java.time.ZonedDateTime actualTransitionDate;

    
    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public OrderTransitionCustomLineItemStateActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */
    
    public OrderTransitionCustomLineItemStateActionBuilder quantity( final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    
    
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */
    
    public OrderTransitionCustomLineItemStateActionBuilder fromState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */
    
    public OrderTransitionCustomLineItemStateActionBuilder withFromState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param fromState value to be set
     * @return Builder
     */
    
    public OrderTransitionCustomLineItemStateActionBuilder fromState( final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
        return this;
    }
    
    
    
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param builder function to build the toState value
     * @return Builder
     */
    
    public OrderTransitionCustomLineItemStateActionBuilder toState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param builder function to build the toState value
     * @return Builder
     */
    
    public OrderTransitionCustomLineItemStateActionBuilder withToState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param toState value to be set
     * @return Builder
     */
    
    public OrderTransitionCustomLineItemStateActionBuilder toState( final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
        return this;
    }
    
    
    
    
    /**
     * set the value to the actualTransitionDate
     * @param actualTransitionDate value to be set
     * @return Builder
     */
    
    public OrderTransitionCustomLineItemStateActionBuilder actualTransitionDate(@Nullable final java.time.ZonedDateTime actualTransitionDate) {
        this.actualTransitionDate = actualTransitionDate;
        return this;
    }
    
    

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
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
     * builds OrderTransitionCustomLineItemStateAction with checking for non-null required values
     * @return OrderTransitionCustomLineItemStateAction
     */
    public OrderTransitionCustomLineItemStateAction build() {
        Objects.requireNonNull(customLineItemId, OrderTransitionCustomLineItemStateAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(quantity, OrderTransitionCustomLineItemStateAction.class + ": quantity is missing");
        Objects.requireNonNull(fromState, OrderTransitionCustomLineItemStateAction.class + ": fromState is missing");
        Objects.requireNonNull(toState, OrderTransitionCustomLineItemStateAction.class + ": toState is missing");
        return new OrderTransitionCustomLineItemStateActionImpl(customLineItemId, quantity, fromState, toState, actualTransitionDate);
    }
    
    /**
     * builds OrderTransitionCustomLineItemStateAction without checking for non-null required values
     * @return OrderTransitionCustomLineItemStateAction
     */
    public OrderTransitionCustomLineItemStateAction buildUnchecked() {
        return new OrderTransitionCustomLineItemStateActionImpl(customLineItemId, quantity, fromState, toState, actualTransitionDate);
    }

    /**
     * factory method for an instance of OrderTransitionCustomLineItemStateActionBuilder
     * @return builder 
     */
    public static OrderTransitionCustomLineItemStateActionBuilder of() {
        return new OrderTransitionCustomLineItemStateActionBuilder();
    }

    /**
     * create builder for OrderTransitionCustomLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderTransitionCustomLineItemStateActionBuilder of(final OrderTransitionCustomLineItemStateAction template) {
        OrderTransitionCustomLineItemStateActionBuilder builder = new OrderTransitionCustomLineItemStateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        builder.actualTransitionDate = template.getActualTransitionDate();
        return builder;
    }

}
