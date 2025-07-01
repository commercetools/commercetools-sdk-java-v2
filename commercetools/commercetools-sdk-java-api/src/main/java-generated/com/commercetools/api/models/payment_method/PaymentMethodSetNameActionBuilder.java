
package com.commercetools.api.models.payment_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodSetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetNameAction paymentMethodSetNameAction = PaymentMethodSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetNameActionBuilder implements Builder<PaymentMethodSetNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodSetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodSetNameActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodSetNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds PaymentMethodSetNameAction with checking for non-null required values
     * @return PaymentMethodSetNameAction
     */
    public PaymentMethodSetNameAction build() {
        return new PaymentMethodSetNameActionImpl(name);
    }

    /**
     * builds PaymentMethodSetNameAction without checking for non-null required values
     * @return PaymentMethodSetNameAction
     */
    public PaymentMethodSetNameAction buildUnchecked() {
        return new PaymentMethodSetNameActionImpl(name);
    }

    /**
     * factory method for an instance of PaymentMethodSetNameActionBuilder
     * @return builder
     */
    public static PaymentMethodSetNameActionBuilder of() {
        return new PaymentMethodSetNameActionBuilder();
    }

    /**
     * create builder for PaymentMethodSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetNameActionBuilder of(final PaymentMethodSetNameAction template) {
        PaymentMethodSetNameActionBuilder builder = new PaymentMethodSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
