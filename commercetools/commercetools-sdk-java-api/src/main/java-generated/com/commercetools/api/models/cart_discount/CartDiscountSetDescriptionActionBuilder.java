
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetDescriptionAction cartDiscountSetDescriptionAction = CartDiscountSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetDescriptionActionBuilder implements Builder<CartDiscountSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CartDiscountSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CartDiscountSetDescriptionActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public CartDiscountSetDescriptionActionBuilder description(
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
     * builds CartDiscountSetDescriptionAction with checking for non-null required values
     * @return CartDiscountSetDescriptionAction
     */
    public CartDiscountSetDescriptionAction build() {
        return new CartDiscountSetDescriptionActionImpl(description);
    }

    /**
     * builds CartDiscountSetDescriptionAction without checking for non-null required values
     * @return CartDiscountSetDescriptionAction
     */
    public CartDiscountSetDescriptionAction buildUnchecked() {
        return new CartDiscountSetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of CartDiscountSetDescriptionActionBuilder
     * @return builder
     */
    public static CartDiscountSetDescriptionActionBuilder of() {
        return new CartDiscountSetDescriptionActionBuilder();
    }

    /**
     * create builder for CartDiscountSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetDescriptionActionBuilder of(final CartDiscountSetDescriptionAction template) {
        CartDiscountSetDescriptionActionBuilder builder = new CartDiscountSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
