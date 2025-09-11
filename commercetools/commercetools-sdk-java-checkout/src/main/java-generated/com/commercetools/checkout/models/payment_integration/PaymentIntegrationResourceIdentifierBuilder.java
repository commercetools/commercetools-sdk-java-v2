
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationResourceIdentifier paymentIntegrationResourceIdentifier = PaymentIntegrationResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationResourceIdentifierBuilder implements Builder<PaymentIntegrationResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced Payment Integration. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public PaymentIntegrationResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Payment Integration. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentIntegrationResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Payment Integration. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Payment Integration. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds PaymentIntegrationResourceIdentifier with checking for non-null required values
     * @return PaymentIntegrationResourceIdentifier
     */
    public PaymentIntegrationResourceIdentifier build() {
        return new PaymentIntegrationResourceIdentifierImpl(id, key);
    }

    /**
     * builds PaymentIntegrationResourceIdentifier without checking for non-null required values
     * @return PaymentIntegrationResourceIdentifier
     */
    public PaymentIntegrationResourceIdentifier buildUnchecked() {
        return new PaymentIntegrationResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of PaymentIntegrationResourceIdentifierBuilder
     * @return builder
     */
    public static PaymentIntegrationResourceIdentifierBuilder of() {
        return new PaymentIntegrationResourceIdentifierBuilder();
    }

    /**
     * create builder for PaymentIntegrationResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationResourceIdentifierBuilder of(final PaymentIntegrationResourceIdentifier template) {
        PaymentIntegrationResourceIdentifierBuilder builder = new PaymentIntegrationResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
