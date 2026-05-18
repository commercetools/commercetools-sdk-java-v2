
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDisplayInfoLogoUrlUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDisplayInfoLogoUrlUpdateAction setDisplayInfoLogoUrlUpdateAction = SetDisplayInfoLogoUrlUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDisplayInfoLogoUrlUpdateActionBuilder implements Builder<SetDisplayInfoLogoUrlUpdateAction> {

    @Nullable
    private com.commercetools.checkout.models.common.LocalizedString logoUrl;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the logoUrl value
     * @return Builder
     */

    public SetDisplayInfoLogoUrlUpdateActionBuilder logoUrl(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.logoUrl = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the logoUrl value
     * @return Builder
     */

    public SetDisplayInfoLogoUrlUpdateActionBuilder withLogoUrl(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.logoUrl = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param logoUrl value to be set
     * @return Builder
     */

    public SetDisplayInfoLogoUrlUpdateActionBuilder logoUrl(
            @Nullable final com.commercetools.checkout.models.common.LocalizedString logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return logoUrl
     */

    @Nullable
    public com.commercetools.checkout.models.common.LocalizedString getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * builds SetDisplayInfoLogoUrlUpdateAction with checking for non-null required values
     * @return SetDisplayInfoLogoUrlUpdateAction
     */
    public SetDisplayInfoLogoUrlUpdateAction build() {
        return new SetDisplayInfoLogoUrlUpdateActionImpl(logoUrl);
    }

    /**
     * builds SetDisplayInfoLogoUrlUpdateAction without checking for non-null required values
     * @return SetDisplayInfoLogoUrlUpdateAction
     */
    public SetDisplayInfoLogoUrlUpdateAction buildUnchecked() {
        return new SetDisplayInfoLogoUrlUpdateActionImpl(logoUrl);
    }

    /**
     * factory method for an instance of SetDisplayInfoLogoUrlUpdateActionBuilder
     * @return builder
     */
    public static SetDisplayInfoLogoUrlUpdateActionBuilder of() {
        return new SetDisplayInfoLogoUrlUpdateActionBuilder();
    }

    /**
     * create builder for SetDisplayInfoLogoUrlUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDisplayInfoLogoUrlUpdateActionBuilder of(final SetDisplayInfoLogoUrlUpdateAction template) {
        SetDisplayInfoLogoUrlUpdateActionBuilder builder = new SetDisplayInfoLogoUrlUpdateActionBuilder();
        builder.logoUrl = template.getLogoUrl();
        return builder;
    }

}
