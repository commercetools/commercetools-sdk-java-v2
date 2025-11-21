
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDisplayInfoPayButtonTextUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDisplayInfoPayButtonTextUpdateAction setDisplayInfoPayButtonTextUpdateAction = SetDisplayInfoPayButtonTextUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDisplayInfoPayButtonTextUpdateActionBuilder
        implements Builder<SetDisplayInfoPayButtonTextUpdateAction> {

    @Nullable
    private com.commercetools.checkout.models.common.LocalizedString payButtonText;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the payButtonText value
     * @return Builder
     */

    public SetDisplayInfoPayButtonTextUpdateActionBuilder payButtonText(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.payButtonText = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the payButtonText value
     * @return Builder
     */

    public SetDisplayInfoPayButtonTextUpdateActionBuilder withPayButtonText(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.payButtonText = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param payButtonText value to be set
     * @return Builder
     */

    public SetDisplayInfoPayButtonTextUpdateActionBuilder payButtonText(
            @Nullable final com.commercetools.checkout.models.common.LocalizedString payButtonText) {
        this.payButtonText = payButtonText;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return payButtonText
     */

    @Nullable
    public com.commercetools.checkout.models.common.LocalizedString getPayButtonText() {
        return this.payButtonText;
    }

    /**
     * builds SetDisplayInfoPayButtonTextUpdateAction with checking for non-null required values
     * @return SetDisplayInfoPayButtonTextUpdateAction
     */
    public SetDisplayInfoPayButtonTextUpdateAction build() {
        return new SetDisplayInfoPayButtonTextUpdateActionImpl(payButtonText);
    }

    /**
     * builds SetDisplayInfoPayButtonTextUpdateAction without checking for non-null required values
     * @return SetDisplayInfoPayButtonTextUpdateAction
     */
    public SetDisplayInfoPayButtonTextUpdateAction buildUnchecked() {
        return new SetDisplayInfoPayButtonTextUpdateActionImpl(payButtonText);
    }

    /**
     * factory method for an instance of SetDisplayInfoPayButtonTextUpdateActionBuilder
     * @return builder
     */
    public static SetDisplayInfoPayButtonTextUpdateActionBuilder of() {
        return new SetDisplayInfoPayButtonTextUpdateActionBuilder();
    }

    /**
     * create builder for SetDisplayInfoPayButtonTextUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDisplayInfoPayButtonTextUpdateActionBuilder of(
            final SetDisplayInfoPayButtonTextUpdateAction template) {
        SetDisplayInfoPayButtonTextUpdateActionBuilder builder = new SetDisplayInfoPayButtonTextUpdateActionBuilder();
        builder.payButtonText = template.getPayButtonText();
        return builder;
    }

}
