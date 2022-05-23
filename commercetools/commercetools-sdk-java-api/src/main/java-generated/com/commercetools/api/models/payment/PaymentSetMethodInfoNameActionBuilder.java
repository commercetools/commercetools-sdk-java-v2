
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoNameAction paymentSetMethodInfoNameAction = PaymentSetMethodInfoNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoNameActionBuilder implements Builder<PaymentSetMethodInfoNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    /**
     <*  <p>If not provided, the name is unset.</p>>
     */

    public PaymentSetMethodInfoNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>If not provided, the name is unset.</p>>
     */

    public PaymentSetMethodInfoNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public PaymentSetMethodInfoNameAction build() {
        return new PaymentSetMethodInfoNameActionImpl(name);
    }

    /**
     * builds PaymentSetMethodInfoNameAction without checking for non null required values
     */
    public PaymentSetMethodInfoNameAction buildUnchecked() {
        return new PaymentSetMethodInfoNameActionImpl(name);
    }

    public static PaymentSetMethodInfoNameActionBuilder of() {
        return new PaymentSetMethodInfoNameActionBuilder();
    }

    public static PaymentSetMethodInfoNameActionBuilder of(final PaymentSetMethodInfoNameAction template) {
        PaymentSetMethodInfoNameActionBuilder builder = new PaymentSetMethodInfoNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
