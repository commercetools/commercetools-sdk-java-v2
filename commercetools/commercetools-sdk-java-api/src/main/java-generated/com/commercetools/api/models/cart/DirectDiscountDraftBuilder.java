
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
     *
     */

    public DirectDiscountDraftBuilder value(final com.commercetools.api.models.cart_discount.CartDiscountValue value) {
        this.value = value;
        return this;
    }

    /**
     *
     */

    public DirectDiscountDraftBuilder value(
            Function<com.commercetools.api.models.cart_discount.CartDiscountValueBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountValue>> builder) {
        this.value = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Empty when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget is set.</p>
     */

    public DirectDiscountDraftBuilder target(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Empty when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget is set.</p>
     */

    public DirectDiscountDraftBuilder target(
            Function<com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountTarget>> builder) {
        this.target = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder.of()).build();
        return this;
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValue getValue() {
        return this.value;
    }

    @Nullable
    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    public DirectDiscountDraft build() {
        Objects.requireNonNull(value, DirectDiscountDraft.class + ": value is missing");
        return new DirectDiscountDraftImpl(value, target);
    }

    /**
     * builds DirectDiscountDraft without checking for non null required values
     */
    public DirectDiscountDraft buildUnchecked() {
        return new DirectDiscountDraftImpl(value, target);
    }

    public static DirectDiscountDraftBuilder of() {
        return new DirectDiscountDraftBuilder();
    }

    public static DirectDiscountDraftBuilder of(final DirectDiscountDraft template) {
        DirectDiscountDraftBuilder builder = new DirectDiscountDraftBuilder();
        builder.value = template.getValue();
        builder.target = template.getTarget();
        return builder;
    }

}
