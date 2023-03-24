
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetStatusInterfaceCodeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetStatusInterfaceCodeAction paymentSetStatusInterfaceCodeAction = PaymentSetStatusInterfaceCodeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetStatusInterfaceCodeActionBuilder implements Builder<PaymentSetStatusInterfaceCodeAction> {

    @Nullable
    private String interfaceCode;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param interfaceCode value to be set
     * @return Builder
     */

    public PaymentSetStatusInterfaceCodeActionBuilder interfaceCode(@Nullable final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    @Nullable
    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    /**
     * builds PaymentSetStatusInterfaceCodeAction with checking for non-null required values
     * @return PaymentSetStatusInterfaceCodeAction
     */
    public PaymentSetStatusInterfaceCodeAction build() {
        return new PaymentSetStatusInterfaceCodeActionImpl(interfaceCode);
    }

    /**
     * builds PaymentSetStatusInterfaceCodeAction without checking for non-null required values
     * @return PaymentSetStatusInterfaceCodeAction
     */
    public PaymentSetStatusInterfaceCodeAction buildUnchecked() {
        return new PaymentSetStatusInterfaceCodeActionImpl(interfaceCode);
    }

    public static PaymentSetStatusInterfaceCodeActionBuilder of() {
        return new PaymentSetStatusInterfaceCodeActionBuilder();
    }

    public static PaymentSetStatusInterfaceCodeActionBuilder of(final PaymentSetStatusInterfaceCodeAction template) {
        PaymentSetStatusInterfaceCodeActionBuilder builder = new PaymentSetStatusInterfaceCodeActionBuilder();
        builder.interfaceCode = template.getInterfaceCode();
        return builder;
    }

}
