
package com.commercetools.api.models.discount_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupSetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSetNameAction discountGroupSetNameAction = DiscountGroupSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupSetNameActionBuilder implements Builder<DiscountGroupSetNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>New value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountGroupSetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountGroupSetNameActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>New value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public DiscountGroupSetNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>New value to set. If empty, any existing value will be removed.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds DiscountGroupSetNameAction with checking for non-null required values
     * @return DiscountGroupSetNameAction
     */
    public DiscountGroupSetNameAction build() {
        return new DiscountGroupSetNameActionImpl(name);
    }

    /**
     * builds DiscountGroupSetNameAction without checking for non-null required values
     * @return DiscountGroupSetNameAction
     */
    public DiscountGroupSetNameAction buildUnchecked() {
        return new DiscountGroupSetNameActionImpl(name);
    }

    /**
     * factory method for an instance of DiscountGroupSetNameActionBuilder
     * @return builder
     */
    public static DiscountGroupSetNameActionBuilder of() {
        return new DiscountGroupSetNameActionBuilder();
    }

    /**
     * create builder for DiscountGroupSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSetNameActionBuilder of(final DiscountGroupSetNameAction template) {
        DiscountGroupSetNameActionBuilder builder = new DiscountGroupSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
