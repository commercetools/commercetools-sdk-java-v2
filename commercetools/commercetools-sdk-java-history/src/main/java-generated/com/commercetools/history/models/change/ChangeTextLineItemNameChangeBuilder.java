package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.TextLineItemValue;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.ChangeTextLineItemNameChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTextLineItemNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTextLineItemNameChange changeTextLineItemNameChange = ChangeTextLineItemNameChange.builder()
 *             .change("{change}")
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeTextLineItemNameChangeBuilder implements Builder<ChangeTextLineItemNameChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;
    
    
    
    private com.commercetools.history.models.common.LocalizedString nextValue;
    
    
    
    private com.commercetools.history.models.common.LocalizedString previousValue;

    
    /**
     *  <p>Update action for <code>changeTextLineItemName</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemNameChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the textLineItem using the builder function
     * @param builder function to build the textLineItem value
     * @return Builder
     */
    
    public ChangeTextLineItemNameChangeBuilder textLineItem(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the textLineItem using the builder function
     * @param builder function to build the textLineItem value
     * @return Builder
     */
    
    public ChangeTextLineItemNameChangeBuilder withTextLineItem(Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValue> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the textLineItem
     * @param textLineItem value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemNameChangeBuilder textLineItem( final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeTextLineItemNameChangeBuilder nextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeTextLineItemNameChangeBuilder withNextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemNameChangeBuilder nextValue( final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeTextLineItemNameChangeBuilder previousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeTextLineItemNameChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeTextLineItemNameChangeBuilder previousValue( final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>changeTextLineItemName</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
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
    
    
    public com.commercetools.history.models.common.LocalizedString getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds ChangeTextLineItemNameChange with checking for non-null required values
     * @return ChangeTextLineItemNameChange
     */
    public ChangeTextLineItemNameChange build() {
        Objects.requireNonNull(change, ChangeTextLineItemNameChange.class + ": change is missing");
        Objects.requireNonNull(textLineItem, ChangeTextLineItemNameChange.class + ": textLineItem is missing");
        Objects.requireNonNull(nextValue, ChangeTextLineItemNameChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeTextLineItemNameChange.class + ": previousValue is missing");
        return new ChangeTextLineItemNameChangeImpl(change, textLineItem, nextValue, previousValue);
    }
    
    /**
     * builds ChangeTextLineItemNameChange without checking for non-null required values
     * @return ChangeTextLineItemNameChange
     */
    public ChangeTextLineItemNameChange buildUnchecked() {
        return new ChangeTextLineItemNameChangeImpl(change, textLineItem, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeTextLineItemNameChangeBuilder
     * @return builder 
     */
    public static ChangeTextLineItemNameChangeBuilder of() {
        return new ChangeTextLineItemNameChangeBuilder();
    }

    /**
     * create builder for ChangeTextLineItemNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTextLineItemNameChangeBuilder of(final ChangeTextLineItemNameChange template) {
        ChangeTextLineItemNameChangeBuilder builder = new ChangeTextLineItemNameChangeBuilder();
        builder.change = template.getChange();
        builder.textLineItem = template.getTextLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
