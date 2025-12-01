
package com.commercetools.checkout.models.application;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPaymentReturnUrlUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPaymentReturnUrlUpdateAction setPaymentReturnUrlUpdateAction = SetPaymentReturnUrlUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPaymentReturnUrlUpdateActionBuilder implements Builder<SetPaymentReturnUrlUpdateAction> {

    @Nullable
    private String paymentReturnUrl;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param paymentReturnUrl value to be set
     * @return Builder
     */

    public SetPaymentReturnUrlUpdateActionBuilder paymentReturnUrl(@Nullable final String paymentReturnUrl) {
        this.paymentReturnUrl = paymentReturnUrl;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return paymentReturnUrl
     */

    @Nullable
    public String getPaymentReturnUrl() {
        return this.paymentReturnUrl;
    }

    /**
     * builds SetPaymentReturnUrlUpdateAction with checking for non-null required values
     * @return SetPaymentReturnUrlUpdateAction
     */
    public SetPaymentReturnUrlUpdateAction build() {
        return new SetPaymentReturnUrlUpdateActionImpl(paymentReturnUrl);
    }

    /**
     * builds SetPaymentReturnUrlUpdateAction without checking for non-null required values
     * @return SetPaymentReturnUrlUpdateAction
     */
    public SetPaymentReturnUrlUpdateAction buildUnchecked() {
        return new SetPaymentReturnUrlUpdateActionImpl(paymentReturnUrl);
    }

    /**
     * factory method for an instance of SetPaymentReturnUrlUpdateActionBuilder
     * @return builder
     */
    public static SetPaymentReturnUrlUpdateActionBuilder of() {
        return new SetPaymentReturnUrlUpdateActionBuilder();
    }

    /**
     * create builder for SetPaymentReturnUrlUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPaymentReturnUrlUpdateActionBuilder of(final SetPaymentReturnUrlUpdateAction template) {
        SetPaymentReturnUrlUpdateActionBuilder builder = new SetPaymentReturnUrlUpdateActionBuilder();
        builder.paymentReturnUrl = template.getPaymentReturnUrl();
        return builder;
    }

}
