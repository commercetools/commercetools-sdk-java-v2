
package com.commercetools.history.models.common;

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

    private java.util.List<com.commercetools.history.models.common.Reference> payments;

    /**
     * set values to the payments
     * @param payments value to be set
     * @return Builder
     */

    public PaymentInfoBuilder payments(final com.commercetools.history.models.common.Reference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
        return this;
    }

    /**
     * set value to the payments
     * @param payments value to be set
     * @return Builder
     */

    public PaymentInfoBuilder payments(
            final java.util.List<com.commercetools.history.models.common.Reference> payments) {
        this.payments = payments;
        return this;
    }

    /**
     * add values to the payments
     * @param payments value to be set
     * @return Builder
     */

    public PaymentInfoBuilder plusPayments(final com.commercetools.history.models.common.Reference... payments) {
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
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the payments using the builder function
     * @param builder function to build the payments value
     * @return Builder
     */

    public PaymentInfoBuilder withPayments(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.payments = new ArrayList<>();
        this.payments.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the payments using the builder function
     * @param builder function to build the payments value
     * @return Builder
     */

    public PaymentInfoBuilder addPayments(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        return plusPayments(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()));
    }

    /**
     * set the value to the payments using the builder function
     * @param builder function to build the payments value
     * @return Builder
     */

    public PaymentInfoBuilder setPayments(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        return payments(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()));
    }

    /**
     * value of payments}
     * @return payments
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getPayments() {
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
