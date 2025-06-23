
package com.commercetools.api.models.discount_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSetDescriptionAction discountGroupSetDescriptionAction = DiscountGroupSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupSetDescriptionActionBuilder implements Builder<DiscountGroupSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountGroupSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public DiscountGroupSetDescriptionActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public DiscountGroupSetDescriptionActionBuilder description(
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
     * builds DiscountGroupSetDescriptionAction with checking for non-null required values
     * @return DiscountGroupSetDescriptionAction
     */
    public DiscountGroupSetDescriptionAction build() {
        return new DiscountGroupSetDescriptionActionImpl(description);
    }

    /**
     * builds DiscountGroupSetDescriptionAction without checking for non-null required values
     * @return DiscountGroupSetDescriptionAction
     */
    public DiscountGroupSetDescriptionAction buildUnchecked() {
        return new DiscountGroupSetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of DiscountGroupSetDescriptionActionBuilder
     * @return builder
     */
    public static DiscountGroupSetDescriptionActionBuilder of() {
        return new DiscountGroupSetDescriptionActionBuilder();
    }

    /**
     * create builder for DiscountGroupSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSetDescriptionActionBuilder of(final DiscountGroupSetDescriptionAction template) {
        DiscountGroupSetDescriptionActionBuilder builder = new DiscountGroupSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
