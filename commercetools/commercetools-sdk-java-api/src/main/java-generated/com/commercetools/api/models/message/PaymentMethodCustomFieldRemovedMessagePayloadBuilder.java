
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomFieldRemovedMessagePayload paymentMethodCustomFieldRemovedMessagePayload = PaymentMethodCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodCustomFieldRemovedMessagePayloadBuilder
        implements Builder<PaymentMethodCustomFieldRemovedMessagePayload> {

    private String name;

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodCustomFieldRemovedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds PaymentMethodCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return PaymentMethodCustomFieldRemovedMessagePayload
     */
    public PaymentMethodCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(name, PaymentMethodCustomFieldRemovedMessagePayload.class + ": name is missing");
        return new PaymentMethodCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * builds PaymentMethodCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return PaymentMethodCustomFieldRemovedMessagePayload
     */
    public PaymentMethodCustomFieldRemovedMessagePayload buildUnchecked() {
        return new PaymentMethodCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of PaymentMethodCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodCustomFieldRemovedMessagePayloadBuilder of() {
        return new PaymentMethodCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomFieldRemovedMessagePayloadBuilder of(
            final PaymentMethodCustomFieldRemovedMessagePayload template) {
        PaymentMethodCustomFieldRemovedMessagePayloadBuilder builder = new PaymentMethodCustomFieldRemovedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
