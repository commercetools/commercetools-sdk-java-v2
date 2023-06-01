package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderImportCustomLineItemStateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderImportCustomLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImportCustomLineItemStateAction orderImportCustomLineItemStateAction = OrderImportCustomLineItemStateAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .plusState(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderImportCustomLineItemStateActionBuilder implements Builder<OrderImportCustomLineItemStateAction> {

    
    
    private String customLineItemId;
    
    
    
    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    
    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public OrderImportCustomLineItemStateActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    /**
     * set values to the state
     * @param state value to be set
     * @return Builder
     */
    
    public OrderImportCustomLineItemStateActionBuilder state( final com.commercetools.api.models.order.ItemState ...state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }
    
    /**
     * set value to the state
     * @param state value to be set
     * @return Builder
     */
    
    public OrderImportCustomLineItemStateActionBuilder state( final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }
    
    /**
     * add values to the state
     * @param state value to be set
     * @return Builder
     */
    
    public OrderImportCustomLineItemStateActionBuilder plusState( final com.commercetools.api.models.order.ItemState ...state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }
    
    
    
    /**
     * add the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */
    
    public OrderImportCustomLineItemStateActionBuilder plusState(Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */
    
    public OrderImportCustomLineItemStateActionBuilder withState(Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */
    
    public OrderImportCustomLineItemStateActionBuilder addState(Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }
    
    /**
     * set the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */
    
    public OrderImportCustomLineItemStateActionBuilder setState(Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return state(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }
                    

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     * value of state}
     * @return state
     */
    
    
    public java.util.List<com.commercetools.api.models.order.ItemState> getState(){
        return this.state;
    }

    /**
     * builds OrderImportCustomLineItemStateAction with checking for non-null required values
     * @return OrderImportCustomLineItemStateAction
     */
    public OrderImportCustomLineItemStateAction build() {
        Objects.requireNonNull(customLineItemId, OrderImportCustomLineItemStateAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(state, OrderImportCustomLineItemStateAction.class + ": state is missing");
        return new OrderImportCustomLineItemStateActionImpl(customLineItemId, state);
    }
    
    /**
     * builds OrderImportCustomLineItemStateAction without checking for non-null required values
     * @return OrderImportCustomLineItemStateAction
     */
    public OrderImportCustomLineItemStateAction buildUnchecked() {
        return new OrderImportCustomLineItemStateActionImpl(customLineItemId, state);
    }

    /**
     * factory method for an instance of OrderImportCustomLineItemStateActionBuilder
     * @return builder 
     */
    public static OrderImportCustomLineItemStateActionBuilder of() {
        return new OrderImportCustomLineItemStateActionBuilder();
    }

    /**
     * create builder for OrderImportCustomLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderImportCustomLineItemStateActionBuilder of(final OrderImportCustomLineItemStateAction template) {
        OrderImportCustomLineItemStateActionBuilder builder = new OrderImportCustomLineItemStateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.state = template.getState();
        return builder;
    }

}
