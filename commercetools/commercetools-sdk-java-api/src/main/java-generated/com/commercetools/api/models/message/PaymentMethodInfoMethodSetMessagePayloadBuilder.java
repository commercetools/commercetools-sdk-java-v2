
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoMethodSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoMethodSetMessagePayload paymentMethodInfoMethodSetMessagePayload = PaymentMethodInfoMethodSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoMethodSetMessagePayloadBuilder
        implements Builder<PaymentMethodInfoMethodSetMessagePayload> {

    @Nullable
    private String method;

    @Nullable
    private String oldMethod;

    /**
     *  <p>Payment Method after the Set MethodInfo Method update action.</p>
     * @param method value to be set
     * @return Builder
     */

    public PaymentMethodInfoMethodSetMessagePayloadBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    /**
     *  <p>Payment Method before the Set MethodInfo Method update action.</p>
     * @param oldMethod value to be set
     * @return Builder
     */

    public PaymentMethodInfoMethodSetMessagePayloadBuilder oldMethod(@Nullable final String oldMethod) {
        this.oldMethod = oldMethod;
        return this;
    }

    /**
     *  <p>Payment Method after the Set MethodInfo Method update action.</p>
     * @return method
     */

    @Nullable
    public String getMethod() {
        return this.method;
    }

    /**
     *  <p>Payment Method before the Set MethodInfo Method update action.</p>
     * @return oldMethod
     */

    @Nullable
    public String getOldMethod() {
        return this.oldMethod;
    }

    /**
     * builds PaymentMethodInfoMethodSetMessagePayload with checking for non-null required values
     * @return PaymentMethodInfoMethodSetMessagePayload
     */
    public PaymentMethodInfoMethodSetMessagePayload build() {
        return new PaymentMethodInfoMethodSetMessagePayloadImpl(method, oldMethod);
    }

    /**
     * builds PaymentMethodInfoMethodSetMessagePayload without checking for non-null required values
     * @return PaymentMethodInfoMethodSetMessagePayload
     */
    public PaymentMethodInfoMethodSetMessagePayload buildUnchecked() {
        return new PaymentMethodInfoMethodSetMessagePayloadImpl(method, oldMethod);
    }

    /**
     * factory method for an instance of PaymentMethodInfoMethodSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodInfoMethodSetMessagePayloadBuilder of() {
        return new PaymentMethodInfoMethodSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodInfoMethodSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoMethodSetMessagePayloadBuilder of(
            final PaymentMethodInfoMethodSetMessagePayload template) {
        PaymentMethodInfoMethodSetMessagePayloadBuilder builder = new PaymentMethodInfoMethodSetMessagePayloadBuilder();
        builder.method = template.getMethod();
        builder.oldMethod = template.getOldMethod();
        return builder;
    }

}
