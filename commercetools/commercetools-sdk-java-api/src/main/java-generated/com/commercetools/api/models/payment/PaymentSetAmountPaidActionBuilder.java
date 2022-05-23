
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   PaymentSetAmountPaidAction paymentSetAmountPaidAction = PaymentSetAmountPaidAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetAmountPaidActionBuilder implements Builder<PaymentSetAmountPaidAction> {

    @Nullable
    private com.commercetools.api.models.common.Money amount;

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public PaymentSetAmountPaidActionBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public PaymentSetAmountPaidActionBuilder amount(@Nullable final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    public PaymentSetAmountPaidAction build() {
        return new PaymentSetAmountPaidActionImpl(amount);
    }

    /**
     * builds PaymentSetAmountPaidAction without checking for non null required values
     */
    public PaymentSetAmountPaidAction buildUnchecked() {
        return new PaymentSetAmountPaidActionImpl(amount);
    }

    public static PaymentSetAmountPaidActionBuilder of() {
        return new PaymentSetAmountPaidActionBuilder();
    }

    public static PaymentSetAmountPaidActionBuilder of(final PaymentSetAmountPaidAction template) {
        PaymentSetAmountPaidActionBuilder builder = new PaymentSetAmountPaidActionBuilder();
        builder.amount = template.getAmount();
        return builder;
    }

}
