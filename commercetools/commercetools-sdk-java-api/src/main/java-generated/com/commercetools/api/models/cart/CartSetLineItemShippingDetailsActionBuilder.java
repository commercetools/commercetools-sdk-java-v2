
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemShippingDetailsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemShippingDetailsAction cartSetLineItemShippingDetailsAction = CartSetLineItemShippingDetailsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemShippingDetailsActionBuilder implements Builder<CartSetLineItemShippingDetailsAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public CartSetLineItemShippingDetailsActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public CartSetLineItemShippingDetailsActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CartSetLineItemShippingDetailsActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public CartSetLineItemShippingDetailsActionBuilder withShippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public CartSetLineItemShippingDetailsActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     * builds CartSetLineItemShippingDetailsAction with checking for non-null required values
     * @return CartSetLineItemShippingDetailsAction
     */
    public CartSetLineItemShippingDetailsAction build() {
        return new CartSetLineItemShippingDetailsActionImpl(lineItemId, lineItemKey, shippingDetails);
    }

    /**
     * builds CartSetLineItemShippingDetailsAction without checking for non-null required values
     * @return CartSetLineItemShippingDetailsAction
     */
    public CartSetLineItemShippingDetailsAction buildUnchecked() {
        return new CartSetLineItemShippingDetailsActionImpl(lineItemId, lineItemKey, shippingDetails);
    }

    /**
     * factory method for an instance of CartSetLineItemShippingDetailsActionBuilder
     * @return builder
     */
    public static CartSetLineItemShippingDetailsActionBuilder of() {
        return new CartSetLineItemShippingDetailsActionBuilder();
    }

    /**
     * create builder for CartSetLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemShippingDetailsActionBuilder of(final CartSetLineItemShippingDetailsAction template) {
        CartSetLineItemShippingDetailsActionBuilder builder = new CartSetLineItemShippingDetailsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
