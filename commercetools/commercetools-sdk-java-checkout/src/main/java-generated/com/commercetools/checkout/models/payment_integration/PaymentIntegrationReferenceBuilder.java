
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationReference paymentIntegrationReference = PaymentIntegrationReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationReferenceBuilder implements Builder<PaymentIntegrationReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced Payment Integration.</p>
     * @param id value to be set
     * @return Builder
     */

    public PaymentIntegrationReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Payment Integration.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds PaymentIntegrationReference with checking for non-null required values
     * @return PaymentIntegrationReference
     */
    public PaymentIntegrationReference build() {
        Objects.requireNonNull(id, PaymentIntegrationReference.class + ": id is missing");
        return new PaymentIntegrationReferenceImpl(id);
    }

    /**
     * builds PaymentIntegrationReference without checking for non-null required values
     * @return PaymentIntegrationReference
     */
    public PaymentIntegrationReference buildUnchecked() {
        return new PaymentIntegrationReferenceImpl(id);
    }

    /**
     * factory method for an instance of PaymentIntegrationReferenceBuilder
     * @return builder
     */
    public static PaymentIntegrationReferenceBuilder of() {
        return new PaymentIntegrationReferenceBuilder();
    }

    /**
     * create builder for PaymentIntegrationReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationReferenceBuilder of(final PaymentIntegrationReference template) {
        PaymentIntegrationReferenceBuilder builder = new PaymentIntegrationReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
