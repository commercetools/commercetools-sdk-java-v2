
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDisplayInfoDescriptionUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDisplayInfoDescriptionUpdateAction setDisplayInfoDescriptionUpdateAction = SetDisplayInfoDescriptionUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDisplayInfoDescriptionUpdateActionBuilder implements Builder<SetDisplayInfoDescriptionUpdateAction> {

    @Nullable
    private com.commercetools.checkout.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public SetDisplayInfoDescriptionUpdateActionBuilder description(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public SetDisplayInfoDescriptionUpdateActionBuilder withDescription(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public SetDisplayInfoDescriptionUpdateActionBuilder description(
            @Nullable final com.commercetools.checkout.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.checkout.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     * builds SetDisplayInfoDescriptionUpdateAction with checking for non-null required values
     * @return SetDisplayInfoDescriptionUpdateAction
     */
    public SetDisplayInfoDescriptionUpdateAction build() {
        return new SetDisplayInfoDescriptionUpdateActionImpl(description);
    }

    /**
     * builds SetDisplayInfoDescriptionUpdateAction without checking for non-null required values
     * @return SetDisplayInfoDescriptionUpdateAction
     */
    public SetDisplayInfoDescriptionUpdateAction buildUnchecked() {
        return new SetDisplayInfoDescriptionUpdateActionImpl(description);
    }

    /**
     * factory method for an instance of SetDisplayInfoDescriptionUpdateActionBuilder
     * @return builder
     */
    public static SetDisplayInfoDescriptionUpdateActionBuilder of() {
        return new SetDisplayInfoDescriptionUpdateActionBuilder();
    }

    /**
     * create builder for SetDisplayInfoDescriptionUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDisplayInfoDescriptionUpdateActionBuilder of(
            final SetDisplayInfoDescriptionUpdateAction template) {
        SetDisplayInfoDescriptionUpdateActionBuilder builder = new SetDisplayInfoDescriptionUpdateActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
