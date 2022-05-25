
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetAnonymousIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetAnonymousIdAction paymentSetAnonymousIdAction = PaymentSetAnonymousIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetAnonymousIdActionBuilder implements Builder<PaymentSetAnonymousIdAction> {

    @Nullable
    private String anonymousId;

    /**
     *  <p>Anonymous ID of the anonymous customer that this payment belongs to. If this field is not set any existing <code>anonymousId</code> is removed.</p>
     */

    public PaymentSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public PaymentSetAnonymousIdAction build() {
        return new PaymentSetAnonymousIdActionImpl(anonymousId);
    }

    /**
     * builds PaymentSetAnonymousIdAction without checking for non null required values
     */
    public PaymentSetAnonymousIdAction buildUnchecked() {
        return new PaymentSetAnonymousIdActionImpl(anonymousId);
    }

    public static PaymentSetAnonymousIdActionBuilder of() {
        return new PaymentSetAnonymousIdActionBuilder();
    }

    public static PaymentSetAnonymousIdActionBuilder of(final PaymentSetAnonymousIdAction template) {
        PaymentSetAnonymousIdActionBuilder builder = new PaymentSetAnonymousIdActionBuilder();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
