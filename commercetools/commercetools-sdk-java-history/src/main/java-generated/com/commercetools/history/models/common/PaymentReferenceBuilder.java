
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentReference paymentReference = PaymentReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentReferenceBuilder implements Builder<PaymentReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public PaymentReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds PaymentReference with checking for non-null required values
     * @return PaymentReference
     */
    public PaymentReference build() {
        Objects.requireNonNull(id, PaymentReference.class + ": id is missing");
        return new PaymentReferenceImpl(id);
    }

    /**
     * builds PaymentReference without checking for non-null required values
     * @return PaymentReference
     */
    public PaymentReference buildUnchecked() {
        return new PaymentReferenceImpl(id);
    }

    /**
     * factory method for an instance of PaymentReferenceBuilder
     * @return builder
     */
    public static PaymentReferenceBuilder of() {
        return new PaymentReferenceBuilder();
    }

    /**
     * create builder for PaymentReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentReferenceBuilder of(final PaymentReference template) {
        PaymentReferenceBuilder builder = new PaymentReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
