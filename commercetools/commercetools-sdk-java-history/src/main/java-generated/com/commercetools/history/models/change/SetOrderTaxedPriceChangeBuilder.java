package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxedItemPrice;
import com.commercetools.history.models.change.SetOrderTaxedPriceChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderTaxedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderTaxedPriceChange setOrderTaxedPriceChange = SetOrderTaxedPriceChange.builder()
 *             .change("{change}")
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
public class SetOrderTaxedPriceChangeBuilder implements Builder<SetOrderTaxedPriceChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.TaxMode taxMode;
    
    
    
    private com.commercetools.history.models.common.TaxedItemPrice nextValue;
    
    
    
    private com.commercetools.history.models.common.TaxedItemPrice previousValue;

    
    /**
     *  <p>Update action for <code>setOrderTaxedPrice</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetOrderTaxedPriceChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the taxMode
     * @param taxMode value to be set
     * @return Builder
     */
    
    public SetOrderTaxedPriceChangeBuilder taxMode( final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetOrderTaxedPriceChangeBuilder nextValue(Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetOrderTaxedPriceChangeBuilder withNextValue(Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetOrderTaxedPriceChangeBuilder nextValue( final com.commercetools.history.models.common.TaxedItemPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetOrderTaxedPriceChangeBuilder previousValue(Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetOrderTaxedPriceChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetOrderTaxedPriceChangeBuilder previousValue( final com.commercetools.history.models.common.TaxedItemPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setOrderTaxedPrice</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of taxMode}
     * @return taxMode
     */
    
    
    public com.commercetools.history.models.common.TaxMode getTaxMode(){
        return this.taxMode;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.TaxedItemPrice getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.TaxedItemPrice getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds SetOrderTaxedPriceChange with checking for non-null required values
     * @return SetOrderTaxedPriceChange
     */
    public SetOrderTaxedPriceChange build() {
        Objects.requireNonNull(change, SetOrderTaxedPriceChange.class + ": change is missing");
        Objects.requireNonNull(taxMode, SetOrderTaxedPriceChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetOrderTaxedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetOrderTaxedPriceChange.class + ": previousValue is missing");
        return new SetOrderTaxedPriceChangeImpl(change, taxMode, nextValue, previousValue);
    }
    
    /**
     * builds SetOrderTaxedPriceChange without checking for non-null required values
     * @return SetOrderTaxedPriceChange
     */
    public SetOrderTaxedPriceChange buildUnchecked() {
        return new SetOrderTaxedPriceChangeImpl(change, taxMode, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetOrderTaxedPriceChangeBuilder
     * @return builder 
     */
    public static SetOrderTaxedPriceChangeBuilder of() {
        return new SetOrderTaxedPriceChangeBuilder();
    }

    /**
     * create builder for SetOrderTaxedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderTaxedPriceChangeBuilder of(final SetOrderTaxedPriceChange template) {
        SetOrderTaxedPriceChangeBuilder builder = new SetOrderTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
