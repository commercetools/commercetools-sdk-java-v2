
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeNameAction cartDiscountChangeNameAction = CartDiscountChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountChangeNameActionBuilder implements Builder<CartDiscountChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>New value to set.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CartDiscountChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CartDiscountChangeNameActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @param name value to be set
     * @return Builder
     */

    public CartDiscountChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds CartDiscountChangeNameAction with checking for non-null required values
     * @return CartDiscountChangeNameAction
     */
    public CartDiscountChangeNameAction build() {
        Objects.requireNonNull(name, CartDiscountChangeNameAction.class + ": name is missing");
        return new CartDiscountChangeNameActionImpl(name);
    }

    /**
     * builds CartDiscountChangeNameAction without checking for non-null required values
     * @return CartDiscountChangeNameAction
     */
    public CartDiscountChangeNameAction buildUnchecked() {
        return new CartDiscountChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of CartDiscountChangeNameActionBuilder
     * @return builder
     */
    public static CartDiscountChangeNameActionBuilder of() {
        return new CartDiscountChangeNameActionBuilder();
    }

    /**
     * create builder for CartDiscountChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeNameActionBuilder of(final CartDiscountChangeNameAction template) {
        CartDiscountChangeNameActionBuilder builder = new CartDiscountChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
