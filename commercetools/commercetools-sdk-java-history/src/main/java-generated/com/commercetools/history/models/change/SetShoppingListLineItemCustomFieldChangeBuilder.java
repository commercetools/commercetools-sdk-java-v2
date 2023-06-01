package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import java.lang.Object;
import com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShoppingListLineItemCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShoppingListLineItemCustomFieldChange setShoppingListLineItemCustomFieldChange = SetShoppingListLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetShoppingListLineItemCustomFieldChangeBuilder implements Builder<SetShoppingListLineItemCustomFieldChange> {

    
    
    private String change;
    
    
    
    private String name;
    
    
    
    private String customTypeId;
    
    
    
    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;
    
    
    
    private java.lang.Object nextValue;
    
    
    
    private java.lang.Object previousValue;

    
    /**
     *  <p>Update action for <code>setLineItemCustomField</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetShoppingListLineItemCustomFieldChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */
    
    public SetShoppingListLineItemCustomFieldChangeBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     * set the value to the customTypeId
     * @param customTypeId value to be set
     * @return Builder
     */
    
    public SetShoppingListLineItemCustomFieldChangeBuilder customTypeId( final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetShoppingListLineItemCustomFieldChangeBuilder lineItem(Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetShoppingListLineItemCustomFieldChangeBuilder withLineItem(Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValue> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */
    
    public SetShoppingListLineItemCustomFieldChangeBuilder lineItem( final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetShoppingListLineItemCustomFieldChangeBuilder nextValue( final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetShoppingListLineItemCustomFieldChangeBuilder previousValue( final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setLineItemCustomField</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of name}
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     * value of customTypeId}
     * @return customTypeId
     */
    
    
    public String getCustomTypeId(){
        return this.customTypeId;
    }
    
    /**
     * value of lineItem}
     * @return lineItem
     */
    
    
    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem(){
        return this.lineItem;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public java.lang.Object getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public java.lang.Object getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds SetShoppingListLineItemCustomFieldChange with checking for non-null required values
     * @return SetShoppingListLineItemCustomFieldChange
     */
    public SetShoppingListLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetShoppingListLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, SetShoppingListLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetShoppingListLineItemCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(lineItem, SetShoppingListLineItemCustomFieldChange.class + ": lineItem is missing");
        Objects.requireNonNull(nextValue, SetShoppingListLineItemCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShoppingListLineItemCustomFieldChange.class + ": previousValue is missing");
        return new SetShoppingListLineItemCustomFieldChangeImpl(change, name, customTypeId, lineItem, nextValue, previousValue);
    }
    
    /**
     * builds SetShoppingListLineItemCustomFieldChange without checking for non-null required values
     * @return SetShoppingListLineItemCustomFieldChange
     */
    public SetShoppingListLineItemCustomFieldChange buildUnchecked() {
        return new SetShoppingListLineItemCustomFieldChangeImpl(change, name, customTypeId, lineItem, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetShoppingListLineItemCustomFieldChangeBuilder
     * @return builder 
     */
    public static SetShoppingListLineItemCustomFieldChangeBuilder of() {
        return new SetShoppingListLineItemCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetShoppingListLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShoppingListLineItemCustomFieldChangeBuilder of(final SetShoppingListLineItemCustomFieldChange template) {
        SetShoppingListLineItemCustomFieldChangeBuilder builder = new SetShoppingListLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.lineItem = template.getLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
