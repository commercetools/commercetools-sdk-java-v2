package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.SetLineItemProductSlugChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemProductSlugChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemProductSlugChange setLineItemProductSlugChange = SetLineItemProductSlugChange.builder()
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
public class SetLineItemProductSlugChangeBuilder implements Builder<SetLineItemProductSlugChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString lineItem;
    
    
    
    private String variant;
    
    
    
    private com.commercetools.history.models.common.LocalizedString nextValue;
    
    
    
    private com.commercetools.history.models.common.LocalizedString previousValue;

    
    /**
     *  <p>Update action for <code>setLineItemProductSlug</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder lineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder withLineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder lineItem( final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the variant
     * @param variant value to be set
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder variant( final String variant) {
        this.variant = variant;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder nextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder withNextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder nextValue( final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder previousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetLineItemProductSlugChangeBuilder previousValue( final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setLineItemProductSlug</code></p>
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
     * builds SetLineItemProductSlugChange with checking for non-null required values
     * @return SetLineItemProductSlugChange
     */
    public SetLineItemProductSlugChange build() {
        Objects.requireNonNull(change, SetLineItemProductSlugChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemProductSlugChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemProductSlugChange.class + ": variant is missing");
        Objects.requireNonNull(nextValue, SetLineItemProductSlugChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemProductSlugChange.class + ": previousValue is missing");
        return new SetLineItemProductSlugChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }
    
    /**
     * builds SetLineItemProductSlugChange without checking for non-null required values
     * @return SetLineItemProductSlugChange
     */
    public SetLineItemProductSlugChange buildUnchecked() {
        return new SetLineItemProductSlugChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetLineItemProductSlugChangeBuilder
     * @return builder 
     */
    public static SetLineItemProductSlugChangeBuilder of() {
        return new SetLineItemProductSlugChangeBuilder();
    }

    /**
     * create builder for SetLineItemProductSlugChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemProductSlugChangeBuilder of(final SetLineItemProductSlugChange template) {
        SetLineItemProductSlugChangeBuilder builder = new SetLineItemProductSlugChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
