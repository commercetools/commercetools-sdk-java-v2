
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodKeySetMessagePayload paymentMethodKeySetMessagePayload = PaymentMethodKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodKeySetMessagePayloadBuilder implements Builder<PaymentMethodKeySetMessagePayload> {

    @Nullable
    private String key;

    @Nullable
    private String oldKey;

    /**
     *  <p><code>key</code> value of the PaymentMethod after the Set Key update action.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentMethodKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>key</code> value of the PaymentMethod before the Set Key update action.</p>
     * @param oldKey value to be set
     * @return Builder
     */

    public PaymentMethodKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
        return this;
    }

    /**
     *  <p><code>key</code> value of the PaymentMethod after the Set Key update action.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>key</code> value of the PaymentMethod before the Set Key update action.</p>
     * @return oldKey
     */

    @Nullable
    public String getOldKey() {
        return this.oldKey;
    }

    /**
     * builds PaymentMethodKeySetMessagePayload with checking for non-null required values
     * @return PaymentMethodKeySetMessagePayload
     */
    public PaymentMethodKeySetMessagePayload build() {
        return new PaymentMethodKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * builds PaymentMethodKeySetMessagePayload without checking for non-null required values
     * @return PaymentMethodKeySetMessagePayload
     */
    public PaymentMethodKeySetMessagePayload buildUnchecked() {
        return new PaymentMethodKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * factory method for an instance of PaymentMethodKeySetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodKeySetMessagePayloadBuilder of() {
        return new PaymentMethodKeySetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodKeySetMessagePayloadBuilder of(final PaymentMethodKeySetMessagePayload template) {
        PaymentMethodKeySetMessagePayloadBuilder builder = new PaymentMethodKeySetMessagePayloadBuilder();
        builder.key = template.getKey();
        builder.oldKey = template.getOldKey();
        return builder;
    }

}
