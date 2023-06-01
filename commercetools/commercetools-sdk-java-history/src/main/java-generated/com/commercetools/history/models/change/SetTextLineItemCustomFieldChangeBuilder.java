package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.TextLineItemValue;
import java.lang.Object;
import com.commercetools.history.models.change.SetTextLineItemCustomFieldChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTextLineItemCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextLineItemCustomFieldChange setTextLineItemCustomFieldChange = SetTextLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetTextLineItemCustomFieldChangeBuilder implements Builder<SetTextLineItemCustomFieldChange> {

    
    
    private String change;
    
    
    
    private String name;
    
    
    
    private String customTypeId;
    
    
    
    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;
    
    
    
    private java.lang.Object nextValue;
    
    
    
    private java.lang.Object previousValue;

    
    /**
     *  <p>Update action for <code>setTextLineItemCustomField</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetTextLineItemCustomFieldChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */
    
    public SetTextLineItemCustomFieldChangeBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     * set the value to the customTypeId
     * @param customTypeId value to be set
     * @return Builder
     */
    
    public SetTextLineItemCustomFieldChangeBuilder customTypeId( final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the textLineItem using the builder function
     * @param builder function to build the textLineItem value
     * @return Builder
     */
    
    public SetTextLineItemCustomFieldChangeBuilder textLineItem(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the textLineItem using the builder function
     * @param builder function to build the textLineItem value
     * @return Builder
     */
    
    public SetTextLineItemCustomFieldChangeBuilder withTextLineItem(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValue> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the textLineItem
     * @param textLineItem value to be set
     * @return Builder
     */
    
    public SetTextLineItemCustomFieldChangeBuilder textLineItem( final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetTextLineItemCustomFieldChangeBuilder nextValue( final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetTextLineItemCustomFieldChangeBuilder previousValue( final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setTextLineItemCustomField</code></p>
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
     * value of textLineItem}
     * @return textLineItem
     */
    
    
    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem(){
        return this.textLineItem;
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
     * builds SetTextLineItemCustomFieldChange with checking for non-null required values
     * @return SetTextLineItemCustomFieldChange
     */
    public SetTextLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetTextLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, SetTextLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetTextLineItemCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(textLineItem, SetTextLineItemCustomFieldChange.class + ": textLineItem is missing");
        Objects.requireNonNull(nextValue, SetTextLineItemCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetTextLineItemCustomFieldChange.class + ": previousValue is missing");
        return new SetTextLineItemCustomFieldChangeImpl(change, name, customTypeId, textLineItem, nextValue, previousValue);
    }
    
    /**
     * builds SetTextLineItemCustomFieldChange without checking for non-null required values
     * @return SetTextLineItemCustomFieldChange
     */
    public SetTextLineItemCustomFieldChange buildUnchecked() {
        return new SetTextLineItemCustomFieldChangeImpl(change, name, customTypeId, textLineItem, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetTextLineItemCustomFieldChangeBuilder
     * @return builder 
     */
    public static SetTextLineItemCustomFieldChangeBuilder of() {
        return new SetTextLineItemCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetTextLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextLineItemCustomFieldChangeBuilder of(final SetTextLineItemCustomFieldChange template) {
        SetTextLineItemCustomFieldChangeBuilder builder = new SetTextLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.textLineItem = template.getTextLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
