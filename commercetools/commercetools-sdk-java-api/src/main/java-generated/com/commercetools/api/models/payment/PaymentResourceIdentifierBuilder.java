
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentResourceIdentifier paymentResourceIdentifier = PaymentResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentResourceIdentifierBuilder implements Builder<PaymentResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced Payment. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public PaymentResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Payment. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Payment. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Payment. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds PaymentResourceIdentifier with checking for non-null required values
     * @return PaymentResourceIdentifier
     */
    public PaymentResourceIdentifier build() {
        return new PaymentResourceIdentifierImpl(id, key);
    }

    /**
     * builds PaymentResourceIdentifier without checking for non-null required values
     * @return PaymentResourceIdentifier
     */
    public PaymentResourceIdentifier buildUnchecked() {
        return new PaymentResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of PaymentResourceIdentifierBuilder
     * @return builder
     */
    public static PaymentResourceIdentifierBuilder of() {
        return new PaymentResourceIdentifierBuilder();
    }

    /**
     * create builder for PaymentResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentResourceIdentifierBuilder of(final PaymentResourceIdentifier template) {
        PaymentResourceIdentifierBuilder builder = new PaymentResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
