
package com.commercetools.api.models.recurrence_policy;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicySetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySetNameAction recurrencePolicySetNameAction = RecurrencePolicySetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicySetNameActionBuilder implements Builder<RecurrencePolicySetNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public RecurrencePolicySetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public RecurrencePolicySetNameActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public RecurrencePolicySetNameActionBuilder name(
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
     * builds RecurrencePolicySetNameAction with checking for non-null required values
     * @return RecurrencePolicySetNameAction
     */
    public RecurrencePolicySetNameAction build() {
        return new RecurrencePolicySetNameActionImpl(name);
    }

    /**
     * builds RecurrencePolicySetNameAction without checking for non-null required values
     * @return RecurrencePolicySetNameAction
     */
    public RecurrencePolicySetNameAction buildUnchecked() {
        return new RecurrencePolicySetNameActionImpl(name);
    }

    /**
     * factory method for an instance of RecurrencePolicySetNameActionBuilder
     * @return builder
     */
    public static RecurrencePolicySetNameActionBuilder of() {
        return new RecurrencePolicySetNameActionBuilder();
    }

    /**
     * create builder for RecurrencePolicySetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicySetNameActionBuilder of(final RecurrencePolicySetNameAction template) {
        RecurrencePolicySetNameActionBuilder builder = new RecurrencePolicySetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
