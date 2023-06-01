package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeShoppingListLineItemQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeShoppingListLineItemQuantityChange changeShoppingListLineItemQuantityChange = ChangeShoppingListLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeShoppingListLineItemQuantityChangeBuilder implements Builder<ChangeShoppingListLineItemQuantityChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;
    
    
    
    private Integer previousValue;
    
    
    
    private Integer nextValue;

    
    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeShoppingListLineItemQuantityChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public ChangeShoppingListLineItemQuantityChangeBuilder lineItem(Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public ChangeShoppingListLineItemQuantityChangeBuilder withLineItem(Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValue> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */
    
    public ChangeShoppingListLineItemQuantityChangeBuilder lineItem( final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeShoppingListLineItemQuantityChangeBuilder previousValue( final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeShoppingListLineItemQuantityChangeBuilder nextValue( final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     * value of change}
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of lineItem}
     * @return lineItem
     */
    
    
    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem(){
        return this.lineItem;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public Integer getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public Integer getNextValue(){
        return this.nextValue;
    }

    /**
     * builds ChangeShoppingListLineItemQuantityChange with checking for non-null required values
     * @return ChangeShoppingListLineItemQuantityChange
     */
    public ChangeShoppingListLineItemQuantityChange build() {
        Objects.requireNonNull(change, ChangeShoppingListLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, ChangeShoppingListLineItemQuantityChange.class + ": lineItem is missing");
        Objects.requireNonNull(previousValue, ChangeShoppingListLineItemQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeShoppingListLineItemQuantityChange.class + ": nextValue is missing");
        return new ChangeShoppingListLineItemQuantityChangeImpl(change, lineItem, previousValue, nextValue);
    }
    
    /**
     * builds ChangeShoppingListLineItemQuantityChange without checking for non-null required values
     * @return ChangeShoppingListLineItemQuantityChange
     */
    public ChangeShoppingListLineItemQuantityChange buildUnchecked() {
        return new ChangeShoppingListLineItemQuantityChangeImpl(change, lineItem, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeShoppingListLineItemQuantityChangeBuilder
     * @return builder 
     */
    public static ChangeShoppingListLineItemQuantityChangeBuilder of() {
        return new ChangeShoppingListLineItemQuantityChangeBuilder();
    }

    /**
     * create builder for ChangeShoppingListLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeShoppingListLineItemQuantityChangeBuilder of(final ChangeShoppingListLineItemQuantityChange template) {
        ChangeShoppingListLineItemQuantityChangeBuilder builder = new ChangeShoppingListLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
