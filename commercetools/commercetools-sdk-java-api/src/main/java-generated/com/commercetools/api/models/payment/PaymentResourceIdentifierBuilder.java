
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
     <*  <p>Platform-generated unique identifier of the referenced Payment. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public PaymentResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>User-defined unique identifier of the referenced Payment. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public PaymentResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public PaymentResourceIdentifier build() {
        return new PaymentResourceIdentifierImpl(id, key);
    }

    /**
     * builds PaymentResourceIdentifier without checking for non null required values
     */
    public PaymentResourceIdentifier buildUnchecked() {
        return new PaymentResourceIdentifierImpl(id, key);
    }

    public static PaymentResourceIdentifierBuilder of() {
        return new PaymentResourceIdentifierBuilder();
    }

    public static PaymentResourceIdentifierBuilder of(final PaymentResourceIdentifier template) {
        PaymentResourceIdentifierBuilder builder = new PaymentResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
