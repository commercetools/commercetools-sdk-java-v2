
package com.commercetools.api.models.recurrence_policy;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicySetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySetDescriptionAction recurrencePolicySetDescriptionAction = RecurrencePolicySetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicySetDescriptionActionBuilder implements Builder<RecurrencePolicySetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public RecurrencePolicySetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public RecurrencePolicySetDescriptionActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public RecurrencePolicySetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     * builds RecurrencePolicySetDescriptionAction with checking for non-null required values
     * @return RecurrencePolicySetDescriptionAction
     */
    public RecurrencePolicySetDescriptionAction build() {
        return new RecurrencePolicySetDescriptionActionImpl(description);
    }

    /**
     * builds RecurrencePolicySetDescriptionAction without checking for non-null required values
     * @return RecurrencePolicySetDescriptionAction
     */
    public RecurrencePolicySetDescriptionAction buildUnchecked() {
        return new RecurrencePolicySetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of RecurrencePolicySetDescriptionActionBuilder
     * @return builder
     */
    public static RecurrencePolicySetDescriptionActionBuilder of() {
        return new RecurrencePolicySetDescriptionActionBuilder();
    }

    /**
     * create builder for RecurrencePolicySetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicySetDescriptionActionBuilder of(final RecurrencePolicySetDescriptionAction template) {
        RecurrencePolicySetDescriptionActionBuilder builder = new RecurrencePolicySetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
