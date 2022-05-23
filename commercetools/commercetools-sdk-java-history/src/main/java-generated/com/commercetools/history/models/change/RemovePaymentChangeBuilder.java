
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   RemovePaymentChange removePaymentChange = RemovePaymentChange.builder()
           .change("{change}")
           .nextValue(nextValueBuilder -> nextValueBuilder)
           .previousValue(previousValueBuilder -> previousValueBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemovePaymentChangeBuilder implements Builder<RemovePaymentChange> {

    private String change;

    private com.commercetools.history.models.common.PaymentInfo nextValue;

    private com.commercetools.history.models.common.PaymentInfo previousValue;

    /**
     *  <p>Update action for <code>addPayment</code> &amp; <code>removePayment</code></p>
     */

    public RemovePaymentChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemovePaymentChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of()).build();
        return this;
    }

    public RemovePaymentChangeBuilder nextValue(final com.commercetools.history.models.common.PaymentInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public RemovePaymentChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PaymentInfoBuilder, com.commercetools.history.models.common.PaymentInfoBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PaymentInfoBuilder.of()).build();
        return this;
    }

    public RemovePaymentChangeBuilder previousValue(
            final com.commercetools.history.models.common.PaymentInfo previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.PaymentInfo getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.PaymentInfo getPreviousValue() {
        return this.previousValue;
    }

    public RemovePaymentChange build() {
        Objects.requireNonNull(change, RemovePaymentChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, RemovePaymentChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, RemovePaymentChange.class + ": previousValue is missing");
        return new RemovePaymentChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds RemovePaymentChange without checking for non null required values
     */
    public RemovePaymentChange buildUnchecked() {
        return new RemovePaymentChangeImpl(change, nextValue, previousValue);
    }

    public static RemovePaymentChangeBuilder of() {
        return new RemovePaymentChangeBuilder();
    }

    public static RemovePaymentChangeBuilder of(final RemovePaymentChange template) {
        RemovePaymentChangeBuilder builder = new RemovePaymentChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
