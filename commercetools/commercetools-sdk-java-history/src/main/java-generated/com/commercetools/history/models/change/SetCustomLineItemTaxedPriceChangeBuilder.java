package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemTaxedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemTaxedPriceChange setCustomLineItemTaxedPriceChange = SetCustomLineItemTaxedPriceChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
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
public class SetCustomLineItemTaxedPriceChangeBuilder implements Builder<SetCustomLineItemTaxedPriceChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString customLineItem;
    
    
    
    private String customLineItemId;
    
    
    
    private com.commercetools.history.models.common.Money nextValue;
    
    
    
    private com.commercetools.history.models.common.Money previousValue;

    
    /**
     *  <p>Update action for <code>setCustomLineItemTaxedPrice</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the customLineItem using the builder function
     * @param builder function to build the customLineItem value
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder customLineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the customLineItem using the builder function
     * @param builder function to build the customLineItem value
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder withCustomLineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the customLineItem
     * @param customLineItem value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder customLineItem( final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder nextValue(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder withNextValue(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder nextValue( final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder previousValue(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxedPriceChangeBuilder previousValue( final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setCustomLineItemTaxedPrice</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of customLineItem}
     * @return customLineItem
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getCustomLineItem(){
        return this.customLineItem;
    }
    
    /**
     * value of customLineItemId}
     * @return customLineItemId
     */
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.Money getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.Money getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds SetCustomLineItemTaxedPriceChange with checking for non-null required values
     * @return SetCustomLineItemTaxedPriceChange
     */
    public SetCustomLineItemTaxedPriceChange build() {
        Objects.requireNonNull(change, SetCustomLineItemTaxedPriceChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem, SetCustomLineItemTaxedPriceChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId, SetCustomLineItemTaxedPriceChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemTaxedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomLineItemTaxedPriceChange.class + ": previousValue is missing");
        return new SetCustomLineItemTaxedPriceChangeImpl(change, customLineItem, customLineItemId, nextValue, previousValue);
    }
    
    /**
     * builds SetCustomLineItemTaxedPriceChange without checking for non-null required values
     * @return SetCustomLineItemTaxedPriceChange
     */
    public SetCustomLineItemTaxedPriceChange buildUnchecked() {
        return new SetCustomLineItemTaxedPriceChangeImpl(change, customLineItem, customLineItemId, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetCustomLineItemTaxedPriceChangeBuilder
     * @return builder 
     */
    public static SetCustomLineItemTaxedPriceChangeBuilder of() {
        return new SetCustomLineItemTaxedPriceChangeBuilder();
    }

    /**
     * create builder for SetCustomLineItemTaxedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemTaxedPriceChangeBuilder of(final SetCustomLineItemTaxedPriceChange template) {
        SetCustomLineItemTaxedPriceChangeBuilder builder = new SetCustomLineItemTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
