
package com.commercetools.history.models.label;

import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentLabelBuilder implements Builder<PaymentLabel> {

    private String key;

    private com.commercetools.history.models.common.Money amountPlanned;

    /**
     *  <p>User-defined unique identifier of the Payment.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the Customer.</p>
     * @param builder function to build the amountPlanned value
     * @return Builder
     */

    public PaymentLabelBuilder amountPlanned(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.amountPlanned = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the Customer.</p>
     * @param builder function to build the amountPlanned value
     * @return Builder
     */

    public PaymentLabelBuilder withAmountPlanned(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.amountPlanned = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the Customer.</p>
     * @param amountPlanned value to be set
     * @return Builder
     */

    public PaymentLabelBuilder amountPlanned(final com.commercetools.history.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Payment.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Money value the Payment intends to receive from the Customer.</p>
     * @return amountPlanned
     */

    public com.commercetools.history.models.common.Money getAmountPlanned() {
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
