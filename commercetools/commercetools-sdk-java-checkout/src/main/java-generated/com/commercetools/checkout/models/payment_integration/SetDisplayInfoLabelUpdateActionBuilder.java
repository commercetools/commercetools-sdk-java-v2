
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDisplayInfoLabelUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDisplayInfoLabelUpdateAction setDisplayInfoLabelUpdateAction = SetDisplayInfoLabelUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDisplayInfoLabelUpdateActionBuilder implements Builder<SetDisplayInfoLabelUpdateAction> {

    @Nullable
    private com.commercetools.checkout.models.common.LocalizedString label;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public SetDisplayInfoLabelUpdateActionBuilder label(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the label value
     * @return Builder
     */

    public SetDisplayInfoLabelUpdateActionBuilder withLabel(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.label = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param label value to be set
     * @return Builder
     */

    public SetDisplayInfoLabelUpdateActionBuilder label(
            @Nullable final com.commercetools.checkout.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return label
     */

    @Nullable
    public com.commercetools.checkout.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     * builds SetDisplayInfoLabelUpdateAction with checking for non-null required values
     * @return SetDisplayInfoLabelUpdateAction
     */
    public SetDisplayInfoLabelUpdateAction build() {
        return new SetDisplayInfoLabelUpdateActionImpl(label);
    }

    /**
     * builds SetDisplayInfoLabelUpdateAction without checking for non-null required values
     * @return SetDisplayInfoLabelUpdateAction
     */
    public SetDisplayInfoLabelUpdateAction buildUnchecked() {
        return new SetDisplayInfoLabelUpdateActionImpl(label);
    }

    /**
     * factory method for an instance of SetDisplayInfoLabelUpdateActionBuilder
     * @return builder
     */
    public static SetDisplayInfoLabelUpdateActionBuilder of() {
        return new SetDisplayInfoLabelUpdateActionBuilder();
    }

    /**
     * create builder for SetDisplayInfoLabelUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDisplayInfoLabelUpdateActionBuilder of(final SetDisplayInfoLabelUpdateAction template) {
        SetDisplayInfoLabelUpdateActionBuilder builder = new SetDisplayInfoLabelUpdateActionBuilder();
        builder.label = template.getLabel();
        return builder;
    }

}
