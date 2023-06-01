package com.commercetools.history.models.label;

import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.label.Label;
import com.commercetools.history.models.label.PaymentLabel;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentLabel paymentLabel = PaymentLabel.builder()
 *             .key("{key}")
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentLabelBuilder implements Builder<PaymentLabel> {

    
    
    private String key;
    
    
    
    private com.commercetools.history.models.common.Money amountPlanned;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public PaymentLabelBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     * set the value to the amountPlanned using the builder function
     * @param builder function to build the amountPlanned value
     * @return Builder
     */
    
    public PaymentLabelBuilder amountPlanned(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.amountPlanned = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the amountPlanned using the builder function
     * @param builder function to build the amountPlanned value
     * @return Builder
     */
    
    public PaymentLabelBuilder withAmountPlanned(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.amountPlanned = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the amountPlanned
     * @param amountPlanned value to be set
     * @return Builder
     */
    
    public PaymentLabelBuilder amountPlanned( final com.commercetools.history.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }
    
    

    /**
     * value of key}
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }
    
    /**
     * value of amountPlanned}
     * @return amountPlanned
     */
    
    
    public com.commercetools.history.models.common.Money getAmountPlanned(){
        return this.amountPlanned;
    }

    /**
     * builds PaymentLabel with checking for non-null required values
     * @return PaymentLabel
     */
    public PaymentLabel build() {
        Objects.requireNonNull(key, PaymentLabel.class + ": key is missing");
        Objects.requireNonNull(amountPlanned, PaymentLabel.class + ": amountPlanned is missing");
        return new PaymentLabelImpl(key, amountPlanned);
    }
    
    /**
     * builds PaymentLabel without checking for non-null required values
     * @return PaymentLabel
     */
    public PaymentLabel buildUnchecked() {
        return new PaymentLabelImpl(key, amountPlanned);
    }

    /**
     * factory method for an instance of PaymentLabelBuilder
     * @return builder 
     */
    public static PaymentLabelBuilder of() {
        return new PaymentLabelBuilder();
    }

    /**
     * create builder for PaymentLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentLabelBuilder of(final PaymentLabel template) {
        PaymentLabelBuilder builder = new PaymentLabelBuilder();
        builder.key = template.getKey();
        builder.amountPlanned = template.getAmountPlanned();
        return builder;
    }

}
