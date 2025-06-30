
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetDiscountGroupActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetDiscountGroupAction cartDiscountSetDiscountGroupAction = CartDiscountSetDiscountGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetDiscountGroupActionBuilder implements Builder<CartDiscountSetDiscountGroupAction> {

    @Nullable
    private com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier discountGroup;

    @Nullable
    private String sortOrder;

    /**
     *  <p>Reference to a DiscountGroup that the Cart Discount must belong to. If empty, any existing value will be removed.</p>
     * @param builder function to build the discountGroup value
     * @return Builder
     */

    public CartDiscountSetDiscountGroupActionBuilder discountGroup(
            Function<com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder, com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder> builder) {
        this.discountGroup = builder
                .apply(com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a DiscountGroup that the Cart Discount must belong to. If empty, any existing value will be removed.</p>
     * @param builder function to build the discountGroup value
     * @return Builder
     */

    public CartDiscountSetDiscountGroupActionBuilder withDiscountGroup(
            Function<com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder, com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier> builder) {
        this.discountGroup = builder
                .apply(com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a DiscountGroup that the Cart Discount must belong to. If empty, any existing value will be removed.</p>
     * @param discountGroup value to be set
     * @return Builder
     */

    public CartDiscountSetDiscountGroupActionBuilder discountGroup(
            @Nullable final com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier discountGroup) {
        this.discountGroup = discountGroup;
        return this;
    }

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>) that determines the order in which the CartDiscounts are applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>Required if <code>discountGroup</code> is absent. If <code>discountGroup</code> is set, the CartDiscount will use the sort order of the DiscountGroup.</p>
     * @param sortOrder value to be set
     * @return Builder
     */

    public CartDiscountSetDiscountGroupActionBuilder sortOrder(@Nullable final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <p>Reference to a DiscountGroup that the Cart Discount must belong to. If empty, any existing value will be removed.</p>
     * @return discountGroup
     */

    @Nullable
    public com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier getDiscountGroup() {
        return this.discountGroup;
    }

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>) that determines the order in which the CartDiscounts are applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>Required if <code>discountGroup</code> is absent. If <code>discountGroup</code> is set, the CartDiscount will use the sort order of the DiscountGroup.</p>
     * @return sortOrder
     */

    @Nullable
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * builds CartDiscountSetDiscountGroupAction with checking for non-null required values
     * @return CartDiscountSetDiscountGroupAction
     */
    public CartDiscountSetDiscountGroupAction build() {
        return new CartDiscountSetDiscountGroupActionImpl(discountGroup, sortOrder);
    }

    /**
     * builds CartDiscountSetDiscountGroupAction without checking for non-null required values
     * @return CartDiscountSetDiscountGroupAction
     */
    public CartDiscountSetDiscountGroupAction buildUnchecked() {
        return new CartDiscountSetDiscountGroupActionImpl(discountGroup, sortOrder);
    }

    /**
     * factory method for an instance of CartDiscountSetDiscountGroupActionBuilder
     * @return builder
     */
    public static CartDiscountSetDiscountGroupActionBuilder of() {
        return new CartDiscountSetDiscountGroupActionBuilder();
    }

    /**
     * create builder for CartDiscountSetDiscountGroupAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetDiscountGroupActionBuilder of(final CartDiscountSetDiscountGroupAction template) {
        CartDiscountSetDiscountGroupActionBuilder builder = new CartDiscountSetDiscountGroupActionBuilder();
        builder.discountGroup = template.getDiscountGroup();
        builder.sortOrder = template.getSortOrder();
        return builder;
    }

}
