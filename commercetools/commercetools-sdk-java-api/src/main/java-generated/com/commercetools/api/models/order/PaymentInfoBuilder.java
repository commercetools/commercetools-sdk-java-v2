
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentInfoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentInfo paymentInfo = PaymentInfo.builder()
 *             .plusPayments(paymentsBuilder -> paymentsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentInfoBuilder implements Builder<PaymentInfo> {

    private java.util.List<com.commercetools.api.models.payment.PaymentReference> payments;

    /**
     * set values to the payments
     * @param payments value to be set
     * @return Builder
     */

    public PaymentInfoBuilder payments(final com.commercetools.api.models.payment.PaymentReference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
        return this;
    }

    /**
     * set value to the payments
     * @param payments value to be set
     * @return Builder
     */

    public PaymentInfoBuilder payments(
            final java.util.List<com.commercetools.api.models.payment.PaymentReference> payments) {
        this.payments = payments;
        return this;
    }

    /**
     * add values to the payments
     * @param payments value to be set
     * @return Builder
     */

    public PaymentInfoBuilder plusPayments(final com.commercetools.api.models.payment.PaymentReference... payments) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.addAll(Arrays.asList(payments));
        return this;
    }

    /**
     * add the value to the payments using the builder function
     * @param builder function to build the payments value
     * @return Builder
     */

    public PaymentInfoBuilder plusPayments(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.add(builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the payments using the builder function
     * @param builder function to build the payments value
     * @return Builder
     */

    public PaymentInfoBuilder withPayments(
            Function<com.commercetools.api.models.payment.PaymentReferenceBuilder, com.commercetools.api.models.payment.PaymentReferenceBuilder> builder) {
        this.payments = new ArrayList<>();
        this.payments.add(builder.apply(com.commercetools.api.models.payment.PaymentReferenceBuilder.of()).build());
        return this;
    }

    /**
     * value of payments}
     * @return payments
     */

    public java.util.List<com.commercetools.api.models.payment.PaymentReference> getPayments() {
        return this.payments;
    }

    /**
     * builds PaymentInfo with checking for non-null required values
     * @return PaymentInfo
     */
    public PaymentInfo build() {
        Objects.requireNonNull(payments, PaymentInfo.class + ": payments is missing");
        return new PaymentInfoImpl(payments);
    }

    /**
     * builds PaymentInfo without checking for non-null required values
     * @return PaymentInfo
     */
    public PaymentInfo buildUnchecked() {
        return new PaymentInfoImpl(payments);
    }

    /**
     * factory method for an instance of PaymentInfoBuilder
     * @return builder
     */
    public static PaymentInfoBuilder of() {
        return new PaymentInfoBuilder();
    }

    /**
     * create builder for PaymentInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentInfoBuilder of(final PaymentInfo template) {
        PaymentInfoBuilder builder = new PaymentInfoBuilder();
        builder.payments = template.getPayments();
        return builder;
    }

}
