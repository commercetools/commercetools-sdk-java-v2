package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.change.SetOrderTotalPriceChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderTotalPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderTotalPriceChange setOrderTotalPriceChange = SetOrderTotalPriceChange.builder()
 *             .change("{change}")
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
public class SetOrderTotalPriceChangeBuilder implements Builder<SetOrderTotalPriceChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.Money nextValue;
    
    
    
    private com.commercetools.history.models.common.Money previousValue;

    
    /**
     *  <p>Update action for <code>setOrderTotalPrice</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetOrderTotalPriceChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetOrderTotalPriceChangeBuilder nextValue(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetOrderTotalPriceChangeBuilder withNextValue(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetOrderTotalPriceChangeBuilder nextValue( final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetOrderTotalPriceChangeBuilder previousValue(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetOrderTotalPriceChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetOrderTotalPriceChangeBuilder previousValue( final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setOrderTotalPrice</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
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
     * builds SetOrderTotalPriceChange with checking for non-null required values
     * @return SetOrderTotalPriceChange
     */
    public SetOrderTotalPriceChange build() {
        Objects.requireNonNull(change, SetOrderTotalPriceChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetOrderTotalPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetOrderTotalPriceChange.class + ": previousValue is missing");
        return new SetOrderTotalPriceChangeImpl(change, nextValue, previousValue);
    }
    
    /**
     * builds SetOrderTotalPriceChange without checking for non-null required values
     * @return SetOrderTotalPriceChange
     */
    public SetOrderTotalPriceChange buildUnchecked() {
        return new SetOrderTotalPriceChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetOrderTotalPriceChangeBuilder
     * @return builder 
     */
    public static SetOrderTotalPriceChangeBuilder of() {
        return new SetOrderTotalPriceChangeBuilder();
    }

    /**
     * create builder for SetOrderTotalPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderTotalPriceChangeBuilder of(final SetOrderTotalPriceChange template) {
        SetOrderTotalPriceChangeBuilder builder = new SetOrderTotalPriceChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
