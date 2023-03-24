
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUpdate cartUpdate = CartUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartUpdateBuilder implements Builder<CartUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.cart.CartUpdateAction> actions;

    /**
     *  <p>Expected version of the Cart on which the changes apply. If the expected version does not match the actual version, a 409 Conflict is returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public CartUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param actions value to be set
     * @return Builder
     */

    public CartUpdateBuilder actions(final com.commercetools.api.models.cart.CartUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param actions value to be set
     * @return Builder
     */

    public CartUpdateBuilder actions(final java.util.List<com.commercetools.api.models.cart.CartUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param actions value to be set
     * @return Builder
     */

    public CartUpdateBuilder plusActions(final com.commercetools.api.models.cart.CartUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public CartUpdateBuilder plusActions(
            Function<com.commercetools.api.models.cart.CartUpdateActionBuilder, Builder<? extends com.commercetools.api.models.cart.CartUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.cart.CartUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public CartUpdateBuilder withActions(
            Function<com.commercetools.api.models.cart.CartUpdateActionBuilder, Builder<? extends com.commercetools.api.models.cart.CartUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.cart.CartUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.cart.CartUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds CartUpdate with checking for non-null required values
     * @return CartUpdate
     */
    public CartUpdate build() {
        Objects.requireNonNull(version, CartUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CartUpdate.class + ": actions is missing");
        return new CartUpdateImpl(version, actions);
    }

    /**
     * builds CartUpdate without checking for non-null required values
     * @return CartUpdate
     */
    public CartUpdate buildUnchecked() {
        return new CartUpdateImpl(version, actions);
    }

    public static CartUpdateBuilder of() {
        return new CartUpdateBuilder();
    }

    public static CartUpdateBuilder of(final CartUpdate template) {
        CartUpdateBuilder builder = new CartUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
