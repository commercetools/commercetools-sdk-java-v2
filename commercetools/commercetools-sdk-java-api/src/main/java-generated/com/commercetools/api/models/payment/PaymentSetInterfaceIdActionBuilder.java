
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetInterfaceIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetInterfaceIdAction paymentSetInterfaceIdAction = PaymentSetInterfaceIdAction.builder()
 *             .interfaceId("{interfaceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetInterfaceIdActionBuilder implements Builder<PaymentSetInterfaceIdAction> {

    private String interfaceId;

    /**
     *  <p>Value to set. Once set, the <code>interfaceId</code> cannot be changed.</p>
     */

    public PaymentSetInterfaceIdActionBuilder interfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    public String getInterfaceId() {
        return this.interfaceId;
    }

    public PaymentSetInterfaceIdAction build() {
        Objects.requireNonNull(interfaceId, PaymentSetInterfaceIdAction.class + ": interfaceId is missing");
        return new PaymentSetInterfaceIdActionImpl(interfaceId);
    }

    /**
     * builds PaymentSetInterfaceIdAction without checking for non null required values
     */
    public PaymentSetInterfaceIdAction buildUnchecked() {
        return new PaymentSetInterfaceIdActionImpl(interfaceId);
    }

    public static PaymentSetInterfaceIdActionBuilder of() {
        return new PaymentSetInterfaceIdActionBuilder();
    }

    public static PaymentSetInterfaceIdActionBuilder of(final PaymentSetInterfaceIdAction template) {
        PaymentSetInterfaceIdActionBuilder builder = new PaymentSetInterfaceIdActionBuilder();
        builder.interfaceId = template.getInterfaceId();
        return builder;
    }

}
