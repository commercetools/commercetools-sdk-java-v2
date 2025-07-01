
package com.commercetools.api.models.payment_method;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodSetDefaultActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetDefaultAction paymentMethodSetDefaultAction = PaymentMethodSetDefaultAction.builder()
 *             .default(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetDefaultActionBuilder implements Builder<PaymentMethodSetDefaultAction> {

    private Boolean _default;

    /**
     *  <p>Value to set.</p>
     * @param _default value to be set
     * @return Builder
     */

    public PaymentMethodSetDefaultActionBuilder _default(final Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return default
     */

    public Boolean getDefault() {
        return this._default;
    }

    /**
     * builds PaymentMethodSetDefaultAction with checking for non-null required values
     * @return PaymentMethodSetDefaultAction
     */
    public PaymentMethodSetDefaultAction build() {
        Objects.requireNonNull(_default, PaymentMethodSetDefaultAction.class + ": default is missing");
        return new PaymentMethodSetDefaultActionImpl(_default);
    }

    /**
     * builds PaymentMethodSetDefaultAction without checking for non-null required values
     * @return PaymentMethodSetDefaultAction
     */
    public PaymentMethodSetDefaultAction buildUnchecked() {
        return new PaymentMethodSetDefaultActionImpl(_default);
    }

    /**
     * factory method for an instance of PaymentMethodSetDefaultActionBuilder
     * @return builder
     */
    public static PaymentMethodSetDefaultActionBuilder of() {
        return new PaymentMethodSetDefaultActionBuilder();
    }

    /**
     * create builder for PaymentMethodSetDefaultAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetDefaultActionBuilder of(final PaymentMethodSetDefaultAction template) {
        PaymentMethodSetDefaultActionBuilder builder = new PaymentMethodSetDefaultActionBuilder();
        builder._default = template.getDefault();
        return builder;
    }

}
