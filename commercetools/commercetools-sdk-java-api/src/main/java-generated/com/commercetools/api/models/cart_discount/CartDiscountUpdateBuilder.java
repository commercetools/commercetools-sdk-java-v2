
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
     *  <p>Expected version of the CartDiscount on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     */

    public CartDiscountUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     */

    public CartDiscountUpdateBuilder actions(
            final com.commercetools.api.models.cart_discount.CartDiscountUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     */

    public CartDiscountUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
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
     */

    public CartDiscountUpdateBuilder withActions(
            Function<com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction> getActions() {
        return this.actions;
    }

    public CartDiscountUpdate build() {
        Objects.requireNonNull(version, CartDiscountUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CartDiscountUpdate.class + ": actions is missing");
        return new CartDiscountUpdateImpl(version, actions);
    }

    /**
     * builds CartDiscountUpdate without checking for non null required values
     */
    public CartDiscountUpdate buildUnchecked() {
        return new CartDiscountUpdateImpl(version, actions);
    }

    public static CartDiscountUpdateBuilder of() {
        return new CartDiscountUpdateBuilder();
    }

    public static CartDiscountUpdateBuilder of(final CartDiscountUpdate template) {
        CartDiscountUpdateBuilder builder = new CartDiscountUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
