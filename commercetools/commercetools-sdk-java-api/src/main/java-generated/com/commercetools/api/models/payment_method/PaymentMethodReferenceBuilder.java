
package com.commercetools.api.models.payment_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    @Nullable
    private com.commercetools.api.models.payment_method.PaymentMethod obj;

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
     *  <p>Contains the representation of the expanded PaymentMethod. Only present in responses to requests with <span>Reference Expansion</span> for PaymentMethods.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public PaymentMethodReferenceBuilder obj(
            Function<com.commercetools.api.models.payment_method.PaymentMethodBuilder, com.commercetools.api.models.payment_method.PaymentMethodBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded PaymentMethod. Only present in responses to requests with <span>Reference Expansion</span> for PaymentMethods.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public PaymentMethodReferenceBuilder withObj(
            Function<com.commercetools.api.models.payment_method.PaymentMethodBuilder, com.commercetools.api.models.payment_method.PaymentMethod> builder) {
        this.obj = builder.apply(com.commercetools.api.models.payment_method.PaymentMethodBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded PaymentMethod. Only present in responses to requests with <span>Reference Expansion</span> for PaymentMethods.</p>
     * @param obj value to be set
     * @return Builder
     */

    public PaymentMethodReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethod obj) {
        this.obj = obj;
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
     *  <p>Contains the representation of the expanded PaymentMethod. Only present in responses to requests with <span>Reference Expansion</span> for PaymentMethods.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.payment_method.PaymentMethod getObj() {
        return this.obj;
    }

    /**
     * builds PaymentMethodReference with checking for non-null required values
     * @return PaymentMethodReference
     */
    public PaymentMethodReference build() {
        Objects.requireNonNull(id, PaymentMethodReference.class + ": id is missing");
        return new PaymentMethodReferenceImpl(id, obj);
    }

    /**
     * builds PaymentMethodReference without checking for non-null required values
     * @return PaymentMethodReference
     */
    public PaymentMethodReference buildUnchecked() {
        return new PaymentMethodReferenceImpl(id, obj);
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
        builder.obj = template.getObj();
        return builder;
    }

}
