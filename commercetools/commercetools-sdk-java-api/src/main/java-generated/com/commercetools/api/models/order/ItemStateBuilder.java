package com.commercetools.api.models.order;

import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.order.ItemState;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ItemStateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemState itemState = ItemState.builder()
 *             .quantity(0.3)
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ItemStateBuilder implements Builder<ItemState> {

    
    
    private Long quantity;
    
    
    
    private com.commercetools.api.models.state.StateReference state;

    
    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */
    
    public ItemStateBuilder quantity( final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    
    
    
    /**
     * set the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */
    
    public ItemStateBuilder state(Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */
    
    public ItemStateBuilder withState(Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the state
     * @param state value to be set
     * @return Builder
     */
    
    public ItemStateBuilder state( final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
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
     * value of state}
     * @return state
     */
    
    
    public com.commercetools.api.models.state.StateReference getState(){
        return this.state;
    }

    /**
     * builds ItemState with checking for non-null required values
     * @return ItemState
     */
    public ItemState build() {
        Objects.requireNonNull(quantity, ItemState.class + ": quantity is missing");
        Objects.requireNonNull(state, ItemState.class + ": state is missing");
        return new ItemStateImpl(quantity, state);
    }
    
    /**
     * builds ItemState without checking for non-null required values
     * @return ItemState
     */
    public ItemState buildUnchecked() {
        return new ItemStateImpl(quantity, state);
    }

    /**
     * factory method for an instance of ItemStateBuilder
     * @return builder 
     */
    public static ItemStateBuilder of() {
        return new ItemStateBuilder();
    }

    /**
     * create builder for ItemState instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ItemStateBuilder of(final ItemState template) {
        ItemStateBuilder builder = new ItemStateBuilder();
        builder.quantity = template.getQuantity();
        builder.state = template.getState();
        return builder;
    }

}
