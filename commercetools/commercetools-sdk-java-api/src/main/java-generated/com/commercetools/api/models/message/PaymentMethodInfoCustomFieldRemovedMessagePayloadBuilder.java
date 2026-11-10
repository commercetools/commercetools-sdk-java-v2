
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomFieldRemovedMessagePayload paymentMethodInfoCustomFieldRemovedMessagePayload = PaymentMethodInfoCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder
        implements Builder<PaymentMethodInfoCustomFieldRemovedMessagePayload> {

    private String name;

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder name(final String name) {
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
     * builds PaymentMethodInfoCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return PaymentMethodInfoCustomFieldRemovedMessagePayload
     */
    public PaymentMethodInfoCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(name, PaymentMethodInfoCustomFieldRemovedMessagePayload.class + ": name is missing");
        return new PaymentMethodInfoCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * builds PaymentMethodInfoCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return PaymentMethodInfoCustomFieldRemovedMessagePayload
     */
    public PaymentMethodInfoCustomFieldRemovedMessagePayload buildUnchecked() {
        return new PaymentMethodInfoCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder of() {
        return new PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodInfoCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder of(
            final PaymentMethodInfoCustomFieldRemovedMessagePayload template) {
        PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder builder = new PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
