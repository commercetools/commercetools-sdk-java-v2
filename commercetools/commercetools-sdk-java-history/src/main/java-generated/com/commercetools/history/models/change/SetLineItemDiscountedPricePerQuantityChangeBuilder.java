package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDiscountedPricePerQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDiscountedPricePerQuantityChange setLineItemDiscountedPricePerQuantityChange = SetLineItemDiscountedPricePerQuantityChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
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
public class SetLineItemDiscountedPricePerQuantityChangeBuilder implements Builder<SetLineItemDiscountedPricePerQuantityChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString lineItem;
    
    
    
    private String variant;
    
    
    
    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue;
    
    
    
    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue;

    
    /**
     *  <p>Update action for <code>setLineItemDiscountedPricePerQuantity</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder lineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder withLineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder lineItem( final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the variant
     * @param variant value to be set
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder variant( final String variant) {
        this.variant = variant;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder nextValue(Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder withNextValue(Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder nextValue( final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder previousValue(Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetLineItemDiscountedPricePerQuantityChangeBuilder previousValue( final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setLineItemDiscountedPricePerQuantity</code></p>
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
     * value of variant}
     * @return variant
     */
    
    
    public String getVariant(){
        return this.variant;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds SetLineItemDiscountedPricePerQuantityChange with checking for non-null required values
     * @return SetLineItemDiscountedPricePerQuantityChange
     */
    public SetLineItemDiscountedPricePerQuantityChange build() {
        Objects.requireNonNull(change, SetLineItemDiscountedPricePerQuantityChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemDiscountedPricePerQuantityChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemDiscountedPricePerQuantityChange.class + ": variant is missing");
        Objects.requireNonNull(nextValue, SetLineItemDiscountedPricePerQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemDiscountedPricePerQuantityChange.class + ": previousValue is missing");
        return new SetLineItemDiscountedPricePerQuantityChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }
    
    /**
     * builds SetLineItemDiscountedPricePerQuantityChange without checking for non-null required values
     * @return SetLineItemDiscountedPricePerQuantityChange
     */
    public SetLineItemDiscountedPricePerQuantityChange buildUnchecked() {
        return new SetLineItemDiscountedPricePerQuantityChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetLineItemDiscountedPricePerQuantityChangeBuilder
     * @return builder 
     */
    public static SetLineItemDiscountedPricePerQuantityChangeBuilder of() {
        return new SetLineItemDiscountedPricePerQuantityChangeBuilder();
    }

    /**
     * create builder for SetLineItemDiscountedPricePerQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemDiscountedPricePerQuantityChangeBuilder of(final SetLineItemDiscountedPricePerQuantityChange template) {
        SetLineItemDiscountedPricePerQuantityChangeBuilder builder = new SetLineItemDiscountedPricePerQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
