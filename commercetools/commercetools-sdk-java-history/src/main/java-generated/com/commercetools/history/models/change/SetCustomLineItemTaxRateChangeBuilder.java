package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxRate;
import com.commercetools.history.models.change.SetCustomLineItemTaxRateChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemTaxRateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemTaxRateChange setCustomLineItemTaxRateChange = SetCustomLineItemTaxRateChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .taxMode(TaxMode.PLATFORM)
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
public class SetCustomLineItemTaxRateChangeBuilder implements Builder<SetCustomLineItemTaxRateChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString customLineItem;
    
    
    
    private String customLineItemId;
    
    
    
    private com.commercetools.history.models.common.TaxMode taxMode;
    
    
    
    private com.commercetools.history.models.common.TaxRate nextValue;
    
    
    
    private com.commercetools.history.models.common.TaxRate previousValue;

    
    /**
     *  <p>Update action for <code>setCustomLineItemTaxRate</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the customLineItem using the builder function
     * @param builder function to build the customLineItem value
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder customLineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the customLineItem using the builder function
     * @param builder function to build the customLineItem value
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder withCustomLineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the customLineItem
     * @param customLineItem value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder customLineItem( final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the taxMode
     * @param taxMode value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder taxMode( final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }
    
    
    
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder nextValue(Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder withNextValue(Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRate> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder nextValue( final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder previousValue(Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRate> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetCustomLineItemTaxRateChangeBuilder previousValue( final com.commercetools.history.models.common.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setCustomLineItemTaxRate</code></p>
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
     * value of taxMode}
     * @return taxMode
     */
    
    
    public com.commercetools.history.models.common.TaxMode getTaxMode(){
        return this.taxMode;
    }
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.TaxRate getNextValue(){
        return this.nextValue;
    }
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.TaxRate getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds SetCustomLineItemTaxRateChange with checking for non-null required values
     * @return SetCustomLineItemTaxRateChange
     */
    public SetCustomLineItemTaxRateChange build() {
        Objects.requireNonNull(change, SetCustomLineItemTaxRateChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem, SetCustomLineItemTaxRateChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId, SetCustomLineItemTaxRateChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(taxMode, SetCustomLineItemTaxRateChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemTaxRateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomLineItemTaxRateChange.class + ": previousValue is missing");
        return new SetCustomLineItemTaxRateChangeImpl(change, customLineItem, customLineItemId, taxMode, nextValue, previousValue);
    }
    
    /**
     * builds SetCustomLineItemTaxRateChange without checking for non-null required values
     * @return SetCustomLineItemTaxRateChange
     */
    public SetCustomLineItemTaxRateChange buildUnchecked() {
        return new SetCustomLineItemTaxRateChangeImpl(change, customLineItem, customLineItemId, taxMode, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetCustomLineItemTaxRateChangeBuilder
     * @return builder 
     */
    public static SetCustomLineItemTaxRateChangeBuilder of() {
        return new SetCustomLineItemTaxRateChangeBuilder();
    }

    /**
     * create builder for SetCustomLineItemTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemTaxRateChangeBuilder of(final SetCustomLineItemTaxRateChange template) {
        SetCustomLineItemTaxRateChangeBuilder builder = new SetCustomLineItemTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
