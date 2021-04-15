
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.cart.Cart obj;

    public CartReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

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
