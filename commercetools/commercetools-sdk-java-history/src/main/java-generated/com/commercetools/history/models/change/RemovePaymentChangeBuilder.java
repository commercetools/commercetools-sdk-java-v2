
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemovePaymentChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemovePaymentChange removePaymentChange = RemovePaymentChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemovePaymentChangeBuilder implements Builder<RemovePaymentChange> {

    private String change;

    private com.commercetools.history.models.common.PaymentInfo nextValue;

    private com.commercetools.history.models.common.PaymentInfo previousValue;

    /**
     *  <p>Update action for <code>addPayment</code> &amp; <code>removePayment</code></p>
     * @param change value to be set
     * @return Builder
     */

    public RemovePaymentChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemovePaymentChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public RemovePaymentChangeBuilder nextValue(final com.commercetools.history.models.common.PaymentInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemovePaymentChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfoBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemovePaymentChangeBuilder previousValue(
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
     * builds RemovePaymentChange with checking for non-null required values
     * @return RemovePaymentChange
     */
    public RemovePaymentChange build() {
        Objects.requireNonNull(change, RemovePaymentChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, RemovePaymentChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, RemovePaymentChange.class + ": previousValue is missing");
        return new RemovePaymentChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds RemovePaymentChange without checking for non-null required values
     * @return RemovePaymentChange
     */
    public RemovePaymentChange buildUnchecked() {
        return new RemovePaymentChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of RemovePaymentChangeBuilder
     * @return builder
     */
    public static RemovePaymentChangeBuilder of() {
        return new RemovePaymentChangeBuilder();
    }

    /**
     * create builder for RemovePaymentChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemovePaymentChangeBuilder of(final RemovePaymentChange template) {
        RemovePaymentChangeBuilder builder = new RemovePaymentChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
