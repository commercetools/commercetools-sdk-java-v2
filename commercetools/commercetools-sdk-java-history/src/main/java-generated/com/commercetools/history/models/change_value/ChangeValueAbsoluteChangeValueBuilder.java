package com.commercetools.history.models.change_value;

import com.commercetools.history.models.change_value.ChangeValueChangeValue;
import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeValueAbsoluteChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueAbsoluteChangeValue changeValueAbsoluteChangeValue = ChangeValueAbsoluteChangeValue.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeValueAbsoluteChangeValueBuilder implements Builder<ChangeValueAbsoluteChangeValue> {

    
    
    private java.util.List<com.commercetools.history.models.common.Money> money;

    /**
     * set values to the money
     * @param money value to be set
     * @return Builder
     */
    
    public ChangeValueAbsoluteChangeValueBuilder money( final com.commercetools.history.models.common.Money ...money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }
    
    /**
     * set value to the money
     * @param money value to be set
     * @return Builder
     */
    
    public ChangeValueAbsoluteChangeValueBuilder money( final java.util.List<com.commercetools.history.models.common.Money> money) {
        this.money = money;
        return this;
    }
    
    /**
     * add values to the money
     * @param money value to be set
     * @return Builder
     */
    
    public ChangeValueAbsoluteChangeValueBuilder plusMoney( final com.commercetools.history.models.common.Money ...money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }
    
    
    
    /**
     * add the value to the money using the builder function
     * @param builder function to build the money value
     * @return Builder
     */
    
    public ChangeValueAbsoluteChangeValueBuilder plusMoney(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the money using the builder function
     * @param builder function to build the money value
     * @return Builder
     */
    
    public ChangeValueAbsoluteChangeValueBuilder withMoney(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the money using the builder function
     * @param builder function to build the money value
     * @return Builder
     */
    
    public ChangeValueAbsoluteChangeValueBuilder addMoney(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        return plusMoney(builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()));
    }
    
    /**
     * set the value to the money using the builder function
     * @param builder function to build the money value
     * @return Builder
     */
    
    public ChangeValueAbsoluteChangeValueBuilder setMoney(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        return money(builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()));
    }
                    

    /**
     * value of money}
     * @return money
     */
    
    
    public java.util.List<com.commercetools.history.models.common.Money> getMoney(){
        return this.money;
    }

    /**
     * builds ChangeValueAbsoluteChangeValue with checking for non-null required values
     * @return ChangeValueAbsoluteChangeValue
     */
    public ChangeValueAbsoluteChangeValue build() {
        Objects.requireNonNull(money, ChangeValueAbsoluteChangeValue.class + ": money is missing");
        return new ChangeValueAbsoluteChangeValueImpl(money);
    }
    
    /**
     * builds ChangeValueAbsoluteChangeValue without checking for non-null required values
     * @return ChangeValueAbsoluteChangeValue
     */
    public ChangeValueAbsoluteChangeValue buildUnchecked() {
        return new ChangeValueAbsoluteChangeValueImpl(money);
    }

    /**
     * factory method for an instance of ChangeValueAbsoluteChangeValueBuilder
     * @return builder 
     */
    public static ChangeValueAbsoluteChangeValueBuilder of() {
        return new ChangeValueAbsoluteChangeValueBuilder();
    }

    /**
     * create builder for ChangeValueAbsoluteChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueAbsoluteChangeValueBuilder of(final ChangeValueAbsoluteChangeValue template) {
        ChangeValueAbsoluteChangeValueBuilder builder = new ChangeValueAbsoluteChangeValueBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
