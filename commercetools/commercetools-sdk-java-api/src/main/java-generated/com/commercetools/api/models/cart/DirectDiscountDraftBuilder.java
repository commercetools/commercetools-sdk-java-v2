
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DirectDiscountDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DirectDiscountDraft directDiscountDraft = DirectDiscountDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DirectDiscountDraftBuilder implements Builder<DirectDiscountDraft> {

    private com.commercetools.api.models.cart_discount.CartDiscountValue value;

    @Nullable
    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    /**
     *  <p>Defines the effect the Discount will have.</p>
     * @param value value to be set
     * @return Builder
     */

    public DirectDiscountDraftBuilder value(final com.commercetools.api.models.cart_discount.CartDiscountValue value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Defines the effect the Discount will have.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public DirectDiscountDraftBuilder value(
            Function<com.commercetools.api.models.cart_discount.CartDiscountValueBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountValue>> builder) {
        this.value = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines what segment of the Cart will be discounted.</p>
     *  <p>If <code>value</code> is set to <code>giftLineItem</code>, this must not be set.</p>
     * @param target value to be set
     * @return Builder
     */

    public DirectDiscountDraftBuilder target(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Defines what segment of the Cart will be discounted.</p>
     *  <p>If <code>value</code> is set to <code>giftLineItem</code>, this must not be set.</p>
     * @param builder function to build the target value
     * @return Builder
     */

    public DirectDiscountDraftBuilder target(
            Function<com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountTarget>> builder) {
        this.target = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the effect the Discount will have.</p>
     * @return value
     */

    public com.commercetools.api.models.cart_discount.CartDiscountValue getValue() {
        return this.value;
    }

    /**
     *  <p>Defines what segment of the Cart will be discounted.</p>
     *  <p>If <code>value</code> is set to <code>giftLineItem</code>, this must not be set.</p>
     * @return target
     */

    @Nullable
    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    /**
     * builds DirectDiscountDraft with checking for non-null required values
     * @return DirectDiscountDraft
     */
    public DirectDiscountDraft build() {
        Objects.requireNonNull(value, DirectDiscountDraft.class + ": value is missing");
        return new DirectDiscountDraftImpl(value, target);
    }

    /**
     * builds DirectDiscountDraft without checking for non-null required values
     * @return DirectDiscountDraft
     */
    public DirectDiscountDraft buildUnchecked() {
        return new DirectDiscountDraftImpl(value, target);
    }

    /**
     * factory method for an instance of DirectDiscountDraftBuilder
     * @return builder
     */
    public static DirectDiscountDraftBuilder of() {
        return new DirectDiscountDraftBuilder();
    }

    /**
     * create builder for DirectDiscountDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DirectDiscountDraftBuilder of(final DirectDiscountDraft template) {
        DirectDiscountDraftBuilder builder = new DirectDiscountDraftBuilder();
        builder.value = template.getValue();
        builder.target = template.getTarget();
        return builder;
    }

}
