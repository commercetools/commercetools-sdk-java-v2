
package com.commercetools.checkout.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodReference paymentMethodReference = PaymentMethodReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodReferenceBuilder implements Builder<PaymentMethodReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public PaymentMethodReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds PaymentMethodReference with checking for non-null required values
     * @return PaymentMethodReference
     */
    public PaymentMethodReference build() {
        Objects.requireNonNull(id, PaymentMethodReference.class + ": id is missing");
        return new PaymentMethodReferenceImpl(id);
    }

    /**
     * builds PaymentMethodReference without checking for non-null required values
     * @return PaymentMethodReference
     */
    public PaymentMethodReference buildUnchecked() {
        return new PaymentMethodReferenceImpl(id);
    }

    /**
     * factory method for an instance of PaymentMethodReferenceBuilder
     * @return builder
     */
    public static PaymentMethodReferenceBuilder of() {
        return new PaymentMethodReferenceBuilder();
    }

    /**
     * create builder for PaymentMethodReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodReferenceBuilder of(final PaymentMethodReference template) {
        PaymentMethodReferenceBuilder builder = new PaymentMethodReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
