
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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public PaymentSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     * builds PaymentSetAnonymousIdAction with checking for non-null required values
     * @return PaymentSetAnonymousIdAction
     */
    public PaymentSetAnonymousIdAction build() {
        return new PaymentSetAnonymousIdActionImpl(anonymousId);
    }

    /**
     * builds PaymentSetAnonymousIdAction without checking for non-null required values
     * @return PaymentSetAnonymousIdAction
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
