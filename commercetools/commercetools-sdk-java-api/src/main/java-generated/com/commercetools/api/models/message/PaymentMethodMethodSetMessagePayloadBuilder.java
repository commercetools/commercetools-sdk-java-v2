
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodMethodSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodMethodSetMessagePayload paymentMethodMethodSetMessagePayload = PaymentMethodMethodSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodMethodSetMessagePayloadBuilder implements Builder<PaymentMethodMethodSetMessagePayload> {

    @Nullable
    private String method;

    @Nullable
    private String oldMethod;

    /**
     *  <p>Payment Method after the Set Method update action.</p>
     * @param method value to be set
     * @return Builder
     */

    public PaymentMethodMethodSetMessagePayloadBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    /**
     *  <p>Payment Method before the Set Method update action.</p>
     * @param oldMethod value to be set
     * @return Builder
     */

    public PaymentMethodMethodSetMessagePayloadBuilder oldMethod(@Nullable final String oldMethod) {
        this.oldMethod = oldMethod;
        return this;
    }

    /**
     *  <p>Payment Method after the Set Method update action.</p>
     * @return method
     */

    @Nullable
    public String getMethod() {
        return this.method;
    }

    /**
     *  <p>Payment Method before the Set Method update action.</p>
     * @return oldMethod
     */

    @Nullable
    public String getOldMethod() {
        return this.oldMethod;
    }

    /**
     * builds PaymentMethodMethodSetMessagePayload with checking for non-null required values
     * @return PaymentMethodMethodSetMessagePayload
     */
    public PaymentMethodMethodSetMessagePayload build() {
        return new PaymentMethodMethodSetMessagePayloadImpl(method, oldMethod);
    }

    /**
     * builds PaymentMethodMethodSetMessagePayload without checking for non-null required values
     * @return PaymentMethodMethodSetMessagePayload
     */
    public PaymentMethodMethodSetMessagePayload buildUnchecked() {
        return new PaymentMethodMethodSetMessagePayloadImpl(method, oldMethod);
    }

    /**
     * factory method for an instance of PaymentMethodMethodSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodMethodSetMessagePayloadBuilder of() {
        return new PaymentMethodMethodSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodMethodSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodMethodSetMessagePayloadBuilder of(final PaymentMethodMethodSetMessagePayload template) {
        PaymentMethodMethodSetMessagePayloadBuilder builder = new PaymentMethodMethodSetMessagePayloadBuilder();
        builder.method = template.getMethod();
        builder.oldMethod = template.getOldMethod();
        return builder;
    }

}
