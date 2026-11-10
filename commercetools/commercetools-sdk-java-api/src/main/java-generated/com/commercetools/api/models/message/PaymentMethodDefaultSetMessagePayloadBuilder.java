
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodDefaultSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodDefaultSetMessagePayload paymentMethodDefaultSetMessagePayload = PaymentMethodDefaultSetMessagePayload.builder()
 *             .default(true)
 *             .oldDefault(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodDefaultSetMessagePayloadBuilder implements Builder<PaymentMethodDefaultSetMessagePayload> {

    private Boolean _default;

    private Boolean oldDefault;

    /**
     *  <p>Default Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetDefaultAction" rel="nofollow">Set Default</a> update action.</p>
     * @param _default value to be set
     * @return Builder
     */

    public PaymentMethodDefaultSetMessagePayloadBuilder _default(final Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     *  <p>Default Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetDefaultAction" rel="nofollow">Set Default</a> update action.</p>
     * @param oldDefault value to be set
     * @return Builder
     */

    public PaymentMethodDefaultSetMessagePayloadBuilder oldDefault(final Boolean oldDefault) {
        this.oldDefault = oldDefault;
        return this;
    }

    /**
     *  <p>Default Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetDefaultAction" rel="nofollow">Set Default</a> update action.</p>
     * @return default
     */

    public Boolean getDefault() {
        return this._default;
    }

    /**
     *  <p>Default Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetDefaultAction" rel="nofollow">Set Default</a> update action.</p>
     * @return oldDefault
     */

    public Boolean getOldDefault() {
        return this.oldDefault;
    }

    /**
     * builds PaymentMethodDefaultSetMessagePayload with checking for non-null required values
     * @return PaymentMethodDefaultSetMessagePayload
     */
    public PaymentMethodDefaultSetMessagePayload build() {
        Objects.requireNonNull(_default, PaymentMethodDefaultSetMessagePayload.class + ": default is missing");
        Objects.requireNonNull(oldDefault, PaymentMethodDefaultSetMessagePayload.class + ": oldDefault is missing");
        return new PaymentMethodDefaultSetMessagePayloadImpl(_default, oldDefault);
    }

    /**
     * builds PaymentMethodDefaultSetMessagePayload without checking for non-null required values
     * @return PaymentMethodDefaultSetMessagePayload
     */
    public PaymentMethodDefaultSetMessagePayload buildUnchecked() {
        return new PaymentMethodDefaultSetMessagePayloadImpl(_default, oldDefault);
    }

    /**
     * factory method for an instance of PaymentMethodDefaultSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodDefaultSetMessagePayloadBuilder of() {
        return new PaymentMethodDefaultSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodDefaultSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodDefaultSetMessagePayloadBuilder of(
            final PaymentMethodDefaultSetMessagePayload template) {
        PaymentMethodDefaultSetMessagePayloadBuilder builder = new PaymentMethodDefaultSetMessagePayloadBuilder();
        builder._default = template.getDefault();
        builder.oldDefault = template.getOldDefault();
        return builder;
    }

}
