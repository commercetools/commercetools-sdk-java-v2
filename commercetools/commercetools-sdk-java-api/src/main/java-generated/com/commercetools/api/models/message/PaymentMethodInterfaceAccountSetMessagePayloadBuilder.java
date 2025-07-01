
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInterfaceAccountSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInterfaceAccountSetMessagePayload paymentMethodInterfaceAccountSetMessagePayload = PaymentMethodInterfaceAccountSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInterfaceAccountSetMessagePayloadBuilder
        implements Builder<PaymentMethodInterfaceAccountSetMessagePayload> {

    @Nullable
    private String interfaceAccount;

    @Nullable
    private String oldInterfaceAccount;

    /**
     *  <p>Interface account of the Payment Method after the Set InterfaceAccount update action.</p>
     * @param interfaceAccount value to be set
     * @return Builder
     */

    public PaymentMethodInterfaceAccountSetMessagePayloadBuilder interfaceAccount(
            @Nullable final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
        return this;
    }

    /**
     *  <p>Interface account of the Payment Method before the Set InterfaceAccount update action.</p>
     * @param oldInterfaceAccount value to be set
     * @return Builder
     */

    public PaymentMethodInterfaceAccountSetMessagePayloadBuilder oldInterfaceAccount(
            @Nullable final String oldInterfaceAccount) {
        this.oldInterfaceAccount = oldInterfaceAccount;
        return this;
    }

    /**
     *  <p>Interface account of the Payment Method after the Set InterfaceAccount update action.</p>
     * @return interfaceAccount
     */

    @Nullable
    public String getInterfaceAccount() {
        return this.interfaceAccount;
    }

    /**
     *  <p>Interface account of the Payment Method before the Set InterfaceAccount update action.</p>
     * @return oldInterfaceAccount
     */

    @Nullable
    public String getOldInterfaceAccount() {
        return this.oldInterfaceAccount;
    }

    /**
     * builds PaymentMethodInterfaceAccountSetMessagePayload with checking for non-null required values
     * @return PaymentMethodInterfaceAccountSetMessagePayload
     */
    public PaymentMethodInterfaceAccountSetMessagePayload build() {
        return new PaymentMethodInterfaceAccountSetMessagePayloadImpl(interfaceAccount, oldInterfaceAccount);
    }

    /**
     * builds PaymentMethodInterfaceAccountSetMessagePayload without checking for non-null required values
     * @return PaymentMethodInterfaceAccountSetMessagePayload
     */
    public PaymentMethodInterfaceAccountSetMessagePayload buildUnchecked() {
        return new PaymentMethodInterfaceAccountSetMessagePayloadImpl(interfaceAccount, oldInterfaceAccount);
    }

    /**
     * factory method for an instance of PaymentMethodInterfaceAccountSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodInterfaceAccountSetMessagePayloadBuilder of() {
        return new PaymentMethodInterfaceAccountSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodInterfaceAccountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInterfaceAccountSetMessagePayloadBuilder of(
            final PaymentMethodInterfaceAccountSetMessagePayload template) {
        PaymentMethodInterfaceAccountSetMessagePayloadBuilder builder = new PaymentMethodInterfaceAccountSetMessagePayloadBuilder();
        builder.interfaceAccount = template.getInterfaceAccount();
        builder.oldInterfaceAccount = template.getOldInterfaceAccount();
        return builder;
    }

}
