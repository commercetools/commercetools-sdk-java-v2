
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoInterfaceAccountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoInterfaceAccountAction myPaymentSetMethodInfoInterfaceAccountAction = MyPaymentSetMethodInfoInterfaceAccountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentSetMethodInfoInterfaceAccountActionBuilder
        implements Builder<MyPaymentSetMethodInfoInterfaceAccountAction> {

    @Nullable
    private String interfaceAccount;

    /**
     *  <p>New account or instance of the payment interface. If empty, any existing value will be removed.</p>
     * @param interfaceAccount value to be set
     * @return Builder
     */

    public MyPaymentSetMethodInfoInterfaceAccountActionBuilder interfaceAccount(
            @Nullable final String interfaceAccount) {
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
     * builds MyPaymentSetMethodInfoInterfaceAccountAction with checking for non-null required values
     * @return MyPaymentSetMethodInfoInterfaceAccountAction
     */
    public MyPaymentSetMethodInfoInterfaceAccountAction build() {
        return new MyPaymentSetMethodInfoInterfaceAccountActionImpl(interfaceAccount);
    }

    /**
     * builds MyPaymentSetMethodInfoInterfaceAccountAction without checking for non-null required values
     * @return MyPaymentSetMethodInfoInterfaceAccountAction
     */
    public MyPaymentSetMethodInfoInterfaceAccountAction buildUnchecked() {
        return new MyPaymentSetMethodInfoInterfaceAccountActionImpl(interfaceAccount);
    }

    /**
     * factory method for an instance of MyPaymentSetMethodInfoInterfaceAccountActionBuilder
     * @return builder
     */
    public static MyPaymentSetMethodInfoInterfaceAccountActionBuilder of() {
        return new MyPaymentSetMethodInfoInterfaceAccountActionBuilder();
    }

    /**
     * create builder for MyPaymentSetMethodInfoInterfaceAccountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoInterfaceAccountActionBuilder of(
            final MyPaymentSetMethodInfoInterfaceAccountAction template) {
        MyPaymentSetMethodInfoInterfaceAccountActionBuilder builder = new MyPaymentSetMethodInfoInterfaceAccountActionBuilder();
        builder.interfaceAccount = template.getInterfaceAccount();
        return builder;
    }

}
