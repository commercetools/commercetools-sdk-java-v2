
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountUpdate cartDiscountUpdate = CartDiscountUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountUpdateBuilder implements Builder<CartDiscountUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction> actions;

    /**
     *  <p>Expected version of the CartDiscount on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public CartDiscountUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     * @param actions value to be set
     * @return Builder
     */

    public CartDiscountUpdateBuilder actions(
            final com.commercetools.api.models.cart_discount.CartDiscountUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     * @param actions value to be set
     * @return Builder
     */

    public CartDiscountUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     * @param actions value to be set
     * @return Builder
     */

    public CartDiscountUpdateBuilder plusActions(
            final com.commercetools.api.models.cart_discount.CartDiscountUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public CartDiscountUpdateBuilder plusActions(
            Function<com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public CartDiscountUpdateBuilder withActions(
            Function<com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the CartDiscount on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds CartDiscountUpdate with checking for non-null required values
     * @return CartDiscountUpdate
     */
    public CartDiscountUpdate build() {
        Objects.requireNonNull(version, CartDiscountUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CartDiscountUpdate.class + ": actions is missing");
        return new CartDiscountUpdateImpl(version, actions);
    }

    /**
     * builds CartDiscountUpdate without checking for non-null required values
     * @return CartDiscountUpdate
     */
    public CartDiscountUpdate buildUnchecked() {
        return new CartDiscountUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of CartDiscountUpdateBuilder
     * @return builder
     */
    public static CartDiscountUpdateBuilder of() {
        return new CartDiscountUpdateBuilder();
    }

    /**
     * create builder for CartDiscountUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountUpdateBuilder of(final CartDiscountUpdate template) {
        CartDiscountUpdateBuilder builder = new CartDiscountUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
