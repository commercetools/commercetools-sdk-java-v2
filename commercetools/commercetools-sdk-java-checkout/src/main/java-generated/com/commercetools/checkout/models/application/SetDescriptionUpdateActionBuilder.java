
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDescriptionUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDescriptionUpdateAction setDescriptionUpdateAction = SetDescriptionUpdateAction.builder()
 *             .description(descriptionBuilder -> descriptionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDescriptionUpdateActionBuilder implements Builder<SetDescriptionUpdateAction> {

    private com.commercetools.checkout.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public SetDescriptionUpdateActionBuilder description(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public SetDescriptionUpdateActionBuilder withDescription(
            Function<com.commercetools.checkout.models.common.LocalizedStringBuilder, com.commercetools.checkout.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.checkout.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public SetDescriptionUpdateActionBuilder description(
            final com.commercetools.checkout.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    public com.commercetools.checkout.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     * builds SetDescriptionUpdateAction with checking for non-null required values
     * @return SetDescriptionUpdateAction
     */
    public SetDescriptionUpdateAction build() {
        Objects.requireNonNull(description, SetDescriptionUpdateAction.class + ": description is missing");
        return new SetDescriptionUpdateActionImpl(description);
    }

    /**
     * builds SetDescriptionUpdateAction without checking for non-null required values
     * @return SetDescriptionUpdateAction
     */
    public SetDescriptionUpdateAction buildUnchecked() {
        return new SetDescriptionUpdateActionImpl(description);
    }

    /**
     * factory method for an instance of SetDescriptionUpdateActionBuilder
     * @return builder
     */
    public static SetDescriptionUpdateActionBuilder of() {
        return new SetDescriptionUpdateActionBuilder();
    }

    /**
     * create builder for SetDescriptionUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDescriptionUpdateActionBuilder of(final SetDescriptionUpdateAction template) {
        SetDescriptionUpdateActionBuilder builder = new SetDescriptionUpdateActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
