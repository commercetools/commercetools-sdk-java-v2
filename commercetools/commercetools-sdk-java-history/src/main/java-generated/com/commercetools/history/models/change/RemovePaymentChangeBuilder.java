
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
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemovePaymentChangeBuilder implements Builder<RemovePaymentChange> {

    private String change;

    private com.commercetools.history.models.common.PaymentInfo previousValue;

    private com.commercetools.history.models.common.PaymentInfo nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemovePaymentChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemovePaymentChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfoBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemovePaymentChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfo> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemovePaymentChangeBuilder previousValue(
            final com.commercetools.history.models.common.PaymentInfo previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemovePaymentChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemovePaymentChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfo> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemovePaymentChangeBuilder nextValue(final com.commercetools.history.models.common.PaymentInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.PaymentInfo getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.PaymentInfo getNextValue() {
        return this.nextValue;
    }

    /**
     * builds RemovePaymentChange with checking for non-null required values
     * @return RemovePaymentChange
     */
    public RemovePaymentChange build() {
        Objects.requireNonNull(change, RemovePaymentChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemovePaymentChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemovePaymentChange.class + ": nextValue is missing");
        return new RemovePaymentChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemovePaymentChange without checking for non-null required values
     * @return RemovePaymentChange
     */
    public RemovePaymentChange buildUnchecked() {
        return new RemovePaymentChangeImpl(change, previousValue, nextValue);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
