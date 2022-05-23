
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartReference cartReference = CartReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartReferenceBuilder implements Builder<CartReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.cart.Cart obj;

    /**
     <*  <p>Platform-generated unique identifier of the referenced Cart.</p>>
     */

    public CartReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>Contains the representation of the expanded Cart. Only present in responses to requests with Reference Expansion for Carts.</p>>
     */

    public CartReferenceBuilder obj(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.CartBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.cart.CartBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Contains the representation of the expanded Cart. Only present in responses to requests with Reference Expansion for Carts.</p>>
     */

    public CartReferenceBuilder obj(@Nullable final com.commercetools.api.models.cart.Cart obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.cart.Cart getObj() {
        return this.obj;
    }

    public CartReference build() {
        Objects.requireNonNull(id, CartReference.class + ": id is missing");
        return new CartReferenceImpl(id, obj);
    }

    /**
     * builds CartReference without checking for non null required values
     */
    public CartReference buildUnchecked() {
        return new CartReferenceImpl(id, obj);
    }

    public static CartReferenceBuilder of() {
        return new CartReferenceBuilder();
    }

    public static CartReferenceBuilder of(final CartReference template) {
        CartReferenceBuilder builder = new CartReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
