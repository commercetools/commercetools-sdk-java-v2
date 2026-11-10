
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    @Nullable
    private com.commercetools.api.models.payment.Payment obj;

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
     *  <p>Contains the representation of the expanded Payment. Only present in responses to requests with <span>Reference Expansion</span> for Payments.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public PaymentReferenceBuilder obj(
            Function<com.commercetools.api.models.payment.PaymentBuilder, com.commercetools.api.models.payment.PaymentBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.payment.PaymentBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Payment. Only present in responses to requests with <span>Reference Expansion</span> for Payments.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public PaymentReferenceBuilder withObj(
            Function<com.commercetools.api.models.payment.PaymentBuilder, com.commercetools.api.models.payment.Payment> builder) {
        this.obj = builder.apply(com.commercetools.api.models.payment.PaymentBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Payment. Only present in responses to requests with <span>Reference Expansion</span> for Payments.</p>
     * @param obj value to be set
     * @return Builder
     */

    public PaymentReferenceBuilder obj(@Nullable final com.commercetools.api.models.payment.Payment obj) {
        this.obj = obj;
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
     *  <p>Contains the representation of the expanded Payment. Only present in responses to requests with <span>Reference Expansion</span> for Payments.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.payment.Payment getObj() {
        return this.obj;
    }

    /**
     * builds PaymentReference with checking for non-null required values
     * @return PaymentReference
     */
    public PaymentReference build() {
        Objects.requireNonNull(id, PaymentReference.class + ": id is missing");
        return new PaymentReferenceImpl(id, obj);
    }

    /**
     * builds PaymentReference without checking for non-null required values
     * @return PaymentReference
     */
    public PaymentReference buildUnchecked() {
        return new PaymentReferenceImpl(id, obj);
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
        builder.obj = template.getObj();
        return builder;
    }

}
