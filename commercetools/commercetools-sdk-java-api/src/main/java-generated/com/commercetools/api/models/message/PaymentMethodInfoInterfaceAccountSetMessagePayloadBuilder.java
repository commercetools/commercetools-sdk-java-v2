
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoInterfaceAccountSetMessagePayload paymentMethodInfoInterfaceAccountSetMessagePayload = PaymentMethodInfoInterfaceAccountSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder
        implements Builder<PaymentMethodInfoInterfaceAccountSetMessagePayload> {

    @Nullable
    private String interfaceAccount;

    @Nullable
    private String oldInterfaceAccount;

    /**
     *  <p>Interface account of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfo InterfaceAccount</a> update action.</p>
     * @param interfaceAccount value to be set
     * @return Builder
     */

    public PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder interfaceAccount(
            @Nullable final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
        return this;
    }

    /**
     *  <p>Interface account of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfo InterfaceAccount</a> update action.</p>
     * @param oldInterfaceAccount value to be set
     * @return Builder
     */

    public PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder oldInterfaceAccount(
            @Nullable final String oldInterfaceAccount) {
        this.oldInterfaceAccount = oldInterfaceAccount;
        return this;
    }

    /**
     *  <p>Interface account of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfo InterfaceAccount</a> update action.</p>
     * @return interfaceAccount
     */

    @Nullable
    public String getInterfaceAccount() {
        return this.interfaceAccount;
    }

    /**
     *  <p>Interface account of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfo InterfaceAccount</a> update action.</p>
     * @return oldInterfaceAccount
     */

    @Nullable
    public String getOldInterfaceAccount() {
        return this.oldInterfaceAccount;
    }

    /**
     * builds PaymentMethodInfoInterfaceAccountSetMessagePayload with checking for non-null required values
     * @return PaymentMethodInfoInterfaceAccountSetMessagePayload
     */
    public PaymentMethodInfoInterfaceAccountSetMessagePayload build() {
        return new PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl(interfaceAccount, oldInterfaceAccount);
    }

    /**
     * builds PaymentMethodInfoInterfaceAccountSetMessagePayload without checking for non-null required values
     * @return PaymentMethodInfoInterfaceAccountSetMessagePayload
     */
    public PaymentMethodInfoInterfaceAccountSetMessagePayload buildUnchecked() {
        return new PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl(interfaceAccount, oldInterfaceAccount);
    }

    /**
     * factory method for an instance of PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder of() {
        return new PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodInfoInterfaceAccountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder of(
            final PaymentMethodInfoInterfaceAccountSetMessagePayload template) {
        PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder builder = new PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder();
        builder.interfaceAccount = template.getInterfaceAccount();
        builder.oldInterfaceAccount = template.getOldInterfaceAccount();
        return builder;
    }

}
