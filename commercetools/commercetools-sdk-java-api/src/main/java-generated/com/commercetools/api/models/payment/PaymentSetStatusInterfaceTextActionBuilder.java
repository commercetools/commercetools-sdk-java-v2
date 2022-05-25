
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetStatusInterfaceTextActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetStatusInterfaceTextAction paymentSetStatusInterfaceTextAction = PaymentSetStatusInterfaceTextAction.builder()
 *             .interfaceText("{interfaceText}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetStatusInterfaceTextActionBuilder implements Builder<PaymentSetStatusInterfaceTextAction> {

    private String interfaceText;

    /**
     *
     */

    public PaymentSetStatusInterfaceTextActionBuilder interfaceText(final String interfaceText) {
        this.interfaceText = interfaceText;
        return this;
    }

    public String getInterfaceText() {
        return this.interfaceText;
    }

    public PaymentSetStatusInterfaceTextAction build() {
        Objects.requireNonNull(interfaceText, PaymentSetStatusInterfaceTextAction.class + ": interfaceText is missing");
        return new PaymentSetStatusInterfaceTextActionImpl(interfaceText);
    }

    /**
     * builds PaymentSetStatusInterfaceTextAction without checking for non null required values
     */
    public PaymentSetStatusInterfaceTextAction buildUnchecked() {
        return new PaymentSetStatusInterfaceTextActionImpl(interfaceText);
    }

    public static PaymentSetStatusInterfaceTextActionBuilder of() {
        return new PaymentSetStatusInterfaceTextActionBuilder();
    }

    public static PaymentSetStatusInterfaceTextActionBuilder of(final PaymentSetStatusInterfaceTextAction template) {
        PaymentSetStatusInterfaceTextActionBuilder builder = new PaymentSetStatusInterfaceTextActionBuilder();
        builder.interfaceText = template.getInterfaceText();
        return builder;
    }

}
