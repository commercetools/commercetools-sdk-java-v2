package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.change.SetLineItemDistributionChannelChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDistributionChannelChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDistributionChannelChange setLineItemDistributionChannelChange = SetLineItemDistributionChannelChange.builder()
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
public class SetLineItemDistributionChannelChangeBuilder implements Builder<SetLineItemDistributionChannelChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString lineItem;
    
    
    
    private String variant;
    
    
    
    private com.commercetools.history.models.common.Reference nextValue;
    
    
    
    private com.commercetools.history.models.common.Reference previousValue;

    
    /**
     *  <p>Update action for <code>setLineItemDistributionChannel</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder lineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder withLineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder lineItem( final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the variant
     * @param variant value to be set
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder variant( final String variant) {
        this.variant = variant;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder nextValue(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder withNextValue(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder nextValue( final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder previousValue(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetLineItemDistributionChannelChangeBuilder previousValue( final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setLineItemDistributionChannel</code></p>
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
    
    
    public com.commercetools.history.models.common.Reference getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.Reference getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds SetLineItemDistributionChannelChange with checking for non-null required values
     * @return SetLineItemDistributionChannelChange
     */
    public SetLineItemDistributionChannelChange build() {
        Objects.requireNonNull(change, SetLineItemDistributionChannelChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemDistributionChannelChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemDistributionChannelChange.class + ": variant is missing");
        Objects.requireNonNull(nextValue, SetLineItemDistributionChannelChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemDistributionChannelChange.class + ": previousValue is missing");
        return new SetLineItemDistributionChannelChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }
    
    /**
     * builds SetLineItemDistributionChannelChange without checking for non-null required values
     * @return SetLineItemDistributionChannelChange
     */
    public SetLineItemDistributionChannelChange buildUnchecked() {
        return new SetLineItemDistributionChannelChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetLineItemDistributionChannelChangeBuilder
     * @return builder 
     */
    public static SetLineItemDistributionChannelChangeBuilder of() {
        return new SetLineItemDistributionChannelChangeBuilder();
    }

    /**
     * create builder for SetLineItemDistributionChannelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemDistributionChannelChangeBuilder of(final SetLineItemDistributionChannelChange template) {
        SetLineItemDistributionChannelChangeBuilder builder = new SetLineItemDistributionChannelChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
