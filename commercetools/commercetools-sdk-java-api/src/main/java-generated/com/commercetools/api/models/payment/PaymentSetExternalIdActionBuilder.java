
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetExternalIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetExternalIdAction paymentSetExternalIdAction = PaymentSetExternalIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetExternalIdActionBuilder implements Builder<PaymentSetExternalIdAction> {

    @Nullable
    private String externalId;

    /**
     <>
     */

    public PaymentSetExternalIdActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    public PaymentSetExternalIdAction build() {
        return new PaymentSetExternalIdActionImpl(externalId);
    }

    /**
     * builds PaymentSetExternalIdAction without checking for non null required values
     */
    public PaymentSetExternalIdAction buildUnchecked() {
        return new PaymentSetExternalIdActionImpl(externalId);
    }

    public static PaymentSetExternalIdActionBuilder of() {
        return new PaymentSetExternalIdActionBuilder();
    }

    public static PaymentSetExternalIdActionBuilder of(final PaymentSetExternalIdAction template) {
        PaymentSetExternalIdActionBuilder builder = new PaymentSetExternalIdActionBuilder();
        builder.externalId = template.getExternalId();
        return builder;
    }

}
