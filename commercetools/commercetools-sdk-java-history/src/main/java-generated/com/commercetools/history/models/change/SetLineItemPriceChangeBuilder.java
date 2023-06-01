package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Price;
import com.commercetools.history.models.change.SetLineItemPriceChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemPriceChange setLineItemPriceChange = SetLineItemPriceChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
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
public class SetLineItemPriceChangeBuilder implements Builder<SetLineItemPriceChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString lineItem;
    
    
    
    private com.commercetools.history.models.common.Price nextValue;
    
    
    
    private com.commercetools.history.models.common.Price previousValue;

    
    /**
     *  <p>Update action for <code>setLineItemPrice</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetLineItemPriceChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetLineItemPriceChangeBuilder lineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetLineItemPriceChangeBuilder withLineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */
    
    public SetLineItemPriceChangeBuilder lineItem( final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetLineItemPriceChangeBuilder nextValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetLineItemPriceChangeBuilder withNextValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetLineItemPriceChangeBuilder nextValue( final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetLineItemPriceChangeBuilder previousValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetLineItemPriceChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetLineItemPriceChangeBuilder previousValue( final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setLineItemPrice</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of lineItem}
     * @return lineItem
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getLineItem(){
        return this.lineItem;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.Price getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.Price getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds SetLineItemPriceChange with checking for non-null required values
     * @return SetLineItemPriceChange
     */
    public SetLineItemPriceChange build() {
        Objects.requireNonNull(change, SetLineItemPriceChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemPriceChange.class + ": lineItem is missing");
        Objects.requireNonNull(nextValue, SetLineItemPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemPriceChange.class + ": previousValue is missing");
        return new SetLineItemPriceChangeImpl(change, lineItem, nextValue, previousValue);
    }
    
    /**
     * builds SetLineItemPriceChange without checking for non-null required values
     * @return SetLineItemPriceChange
     */
    public SetLineItemPriceChange buildUnchecked() {
        return new SetLineItemPriceChangeImpl(change, lineItem, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetLineItemPriceChangeBuilder
     * @return builder 
     */
    public static SetLineItemPriceChangeBuilder of() {
        return new SetLineItemPriceChangeBuilder();
    }

    /**
     * create builder for SetLineItemPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemPriceChangeBuilder of(final SetLineItemPriceChange template) {
        SetLineItemPriceChangeBuilder builder = new SetLineItemPriceChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
