
package com.commercetools.api.models.payment_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodSetInterfaceAccountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetInterfaceAccountAction paymentMethodSetInterfaceAccountAction = PaymentMethodSetInterfaceAccountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetInterfaceAccountActionBuilder implements Builder<PaymentMethodSetInterfaceAccountAction> {

    @Nullable
    private String interfaceAccount;

    /**
     *  <p>New account or instance of the payment interface. If empty, any existing value will be removed.</p>
     * @param interfaceAccount value to be set
     * @return Builder
     */

    public PaymentMethodSetInterfaceAccountActionBuilder interfaceAccount(@Nullable final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
        return this;
    }

    /**
     *  <p>New account or instance of the payment interface. If empty, any existing value will be removed.</p>
     * @return interfaceAccount
     */

    @Nullable
    public String getInterfaceAccount() {
        return this.interfaceAccount;
    }

    /**
     * builds PaymentMethodSetInterfaceAccountAction with checking for non-null required values
     * @return PaymentMethodSetInterfaceAccountAction
     */
    public PaymentMethodSetInterfaceAccountAction build() {
        return new PaymentMethodSetInterfaceAccountActionImpl(interfaceAccount);
    }

    /**
     * builds PaymentMethodSetInterfaceAccountAction without checking for non-null required values
     * @return PaymentMethodSetInterfaceAccountAction
     */
    public PaymentMethodSetInterfaceAccountAction buildUnchecked() {
        return new PaymentMethodSetInterfaceAccountActionImpl(interfaceAccount);
    }

    /**
     * factory method for an instance of PaymentMethodSetInterfaceAccountActionBuilder
     * @return builder
     */
    public static PaymentMethodSetInterfaceAccountActionBuilder of() {
        return new PaymentMethodSetInterfaceAccountActionBuilder();
    }

    /**
     * create builder for PaymentMethodSetInterfaceAccountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetInterfaceAccountActionBuilder of(
            final PaymentMethodSetInterfaceAccountAction template) {
        PaymentMethodSetInterfaceAccountActionBuilder builder = new PaymentMethodSetInterfaceAccountActionBuilder();
        builder.interfaceAccount = template.getInterfaceAccount();
        return builder;
    }

}
