
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddPaymentChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPaymentChange addPaymentChange = AddPaymentChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddPaymentChangeBuilder implements Builder<AddPaymentChange> {

    private String change;

    private com.commercetools.history.models.common.PaymentInfo nextValue;

    private com.commercetools.history.models.common.PaymentInfo previousValue;

    /**
     *  <p>Update action for <code>addPayment</code> &amp; <code>removePayment</code></p>
     * @param change value to be set
     * @return Builder
     */

    public AddPaymentChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddPaymentChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddPaymentChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfo> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public AddPaymentChangeBuilder nextValue(final com.commercetools.history.models.common.PaymentInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddPaymentChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfoBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddPaymentChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfo> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public AddPaymentChangeBuilder previousValue(
            final com.commercetools.history.models.common.PaymentInfo previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>addPayment</code> &amp; <code>removePayment</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.PaymentInfo getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.PaymentInfo getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds AddPaymentChange with checking for non-null required values
     * @return AddPaymentChange
     */
    public AddPaymentChange build() {
        Objects.requireNonNull(change, AddPaymentChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddPaymentChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddPaymentChange.class + ": previousValue is missing");
        return new AddPaymentChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds AddPaymentChange without checking for non-null required values
     * @return AddPaymentChange
     */
    public AddPaymentChange buildUnchecked() {
        return new AddPaymentChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of AddPaymentChangeBuilder
     * @return builder
     */
    public static AddPaymentChangeBuilder of() {
        return new AddPaymentChangeBuilder();
    }

    /**
     * create builder for AddPaymentChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddPaymentChangeBuilder of(final AddPaymentChange template) {
        AddPaymentChangeBuilder builder = new AddPaymentChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
