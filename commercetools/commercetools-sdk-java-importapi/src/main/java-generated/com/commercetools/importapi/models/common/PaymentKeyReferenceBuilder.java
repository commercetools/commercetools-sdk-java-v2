
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentKeyReference paymentKeyReference = PaymentKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentKeyReferenceBuilder implements Builder<PaymentKeyReference> {

    private String key;

    /**
     *  <p>User-defined unique identifier of the referenced Payment.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Payment.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds PaymentKeyReference with checking for non-null required values
     * @return PaymentKeyReference
     */
    public PaymentKeyReference build() {
        Objects.requireNonNull(key, PaymentKeyReference.class + ": key is missing");
        return new PaymentKeyReferenceImpl(key);
    }

    /**
     * builds PaymentKeyReference without checking for non-null required values
     * @return PaymentKeyReference
     */
    public PaymentKeyReference buildUnchecked() {
        return new PaymentKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of PaymentKeyReferenceBuilder
     * @return builder
     */
    public static PaymentKeyReferenceBuilder of() {
        return new PaymentKeyReferenceBuilder();
    }

    /**
     * create builder for PaymentKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentKeyReferenceBuilder of(final PaymentKeyReference template) {
        PaymentKeyReferenceBuilder builder = new PaymentKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
