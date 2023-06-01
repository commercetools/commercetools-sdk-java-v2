package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxRate;
import com.commercetools.history.models.change.SetShippingMethodTaxRateChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingMethodTaxRateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingMethodTaxRateChange setShippingMethodTaxRateChange = SetShippingMethodTaxRateChange.builder()
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
public class SetShippingMethodTaxRateChangeBuilder implements Builder<SetShippingMethodTaxRateChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.TaxMode taxMode;
    
    
    
    private com.commercetools.history.models.common.TaxRate nextValue;
    
    
    
    private com.commercetools.history.models.common.TaxRate previousValue;

    
    /**
     *  <p>Update action for <code>setShippingMethodTaxRate</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetShippingMethodTaxRateChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the taxMode
     * @param taxMode value to be set
     * @return Builder
     */
    
    public SetShippingMethodTaxRateChangeBuilder taxMode( final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }
    
    
    
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetShippingMethodTaxRateChangeBuilder nextValue(Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetShippingMethodTaxRateChangeBuilder withNextValue(Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRate> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetShippingMethodTaxRateChangeBuilder nextValue( final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetShippingMethodTaxRateChangeBuilder previousValue(Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetShippingMethodTaxRateChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRate> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetShippingMethodTaxRateChangeBuilder previousValue( final com.commercetools.history.models.common.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setShippingMethodTaxRate</code></p>
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
     * builds SetShippingMethodTaxRateChange with checking for non-null required values
     * @return SetShippingMethodTaxRateChange
     */
    public SetShippingMethodTaxRateChange build() {
        Objects.requireNonNull(change, SetShippingMethodTaxRateChange.class + ": change is missing");
        Objects.requireNonNull(taxMode, SetShippingMethodTaxRateChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetShippingMethodTaxRateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShippingMethodTaxRateChange.class + ": previousValue is missing");
        return new SetShippingMethodTaxRateChangeImpl(change, taxMode, nextValue, previousValue);
    }
    
    /**
     * builds SetShippingMethodTaxRateChange without checking for non-null required values
     * @return SetShippingMethodTaxRateChange
     */
    public SetShippingMethodTaxRateChange buildUnchecked() {
        return new SetShippingMethodTaxRateChangeImpl(change, taxMode, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetShippingMethodTaxRateChangeBuilder
     * @return builder 
     */
    public static SetShippingMethodTaxRateChangeBuilder of() {
        return new SetShippingMethodTaxRateChangeBuilder();
    }

    /**
     * create builder for SetShippingMethodTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingMethodTaxRateChangeBuilder of(final SetShippingMethodTaxRateChange template) {
        SetShippingMethodTaxRateChangeBuilder builder = new SetShippingMethodTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
