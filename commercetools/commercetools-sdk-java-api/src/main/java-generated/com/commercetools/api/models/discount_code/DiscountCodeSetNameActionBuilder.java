
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetNameAction discountCodeSetNameAction = DiscountCodeSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetNameActionBuilder implements Builder<DiscountCodeSetNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public DiscountCodeSetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public DiscountCodeSetNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds DiscountCodeSetNameAction with checking for non-null required values
     * @return DiscountCodeSetNameAction
     */
    public DiscountCodeSetNameAction build() {
        return new DiscountCodeSetNameActionImpl(name);
    }

    /**
     * builds DiscountCodeSetNameAction without checking for non-null required values
     * @return DiscountCodeSetNameAction
     */
    public DiscountCodeSetNameAction buildUnchecked() {
        return new DiscountCodeSetNameActionImpl(name);
    }

    public static DiscountCodeSetNameActionBuilder of() {
        return new DiscountCodeSetNameActionBuilder();
    }

    public static DiscountCodeSetNameActionBuilder of(final DiscountCodeSetNameAction template) {
        DiscountCodeSetNameActionBuilder builder = new DiscountCodeSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
