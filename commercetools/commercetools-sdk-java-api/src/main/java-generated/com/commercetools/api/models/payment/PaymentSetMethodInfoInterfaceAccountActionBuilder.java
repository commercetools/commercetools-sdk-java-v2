
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoInterfaceAccountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoInterfaceAccountAction paymentSetMethodInfoInterfaceAccountAction = PaymentSetMethodInfoInterfaceAccountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoInterfaceAccountActionBuilder
        implements Builder<PaymentSetMethodInfoInterfaceAccountAction> {

    @Nullable
    private String interfaceAccount;

    /**
     *  <p>New account or instance of the payment interface. If empty, any existing value will be removed.</p>
     * @param interfaceAccount value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoInterfaceAccountActionBuilder interfaceAccount(@Nullable final String interfaceAccount) {
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
     * builds PaymentSetMethodInfoInterfaceAccountAction with checking for non-null required values
     * @return PaymentSetMethodInfoInterfaceAccountAction
     */
    public PaymentSetMethodInfoInterfaceAccountAction build() {
        return new PaymentSetMethodInfoInterfaceAccountActionImpl(interfaceAccount);
    }

    /**
     * builds PaymentSetMethodInfoInterfaceAccountAction without checking for non-null required values
     * @return PaymentSetMethodInfoInterfaceAccountAction
     */
    public PaymentSetMethodInfoInterfaceAccountAction buildUnchecked() {
        return new PaymentSetMethodInfoInterfaceAccountActionImpl(interfaceAccount);
    }

    /**
     * factory method for an instance of PaymentSetMethodInfoInterfaceAccountActionBuilder
     * @return builder
     */
    public static PaymentSetMethodInfoInterfaceAccountActionBuilder of() {
        return new PaymentSetMethodInfoInterfaceAccountActionBuilder();
    }

    /**
     * create builder for PaymentSetMethodInfoInterfaceAccountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoInterfaceAccountActionBuilder of(
            final PaymentSetMethodInfoInterfaceAccountAction template) {
        PaymentSetMethodInfoInterfaceAccountActionBuilder builder = new PaymentSetMethodInfoInterfaceAccountActionBuilder();
        builder.interfaceAccount = template.getInterfaceAccount();
        return builder;
    }

}
