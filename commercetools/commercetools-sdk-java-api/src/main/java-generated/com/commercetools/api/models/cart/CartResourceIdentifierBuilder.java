
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartResourceIdentifierBuilder implements Builder<CartResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public CartResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public CartResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CartResourceIdentifier build() {
        return new CartResourceIdentifierImpl(id, key);
    }

    /**
     * builds CartResourceIdentifier without checking for non null required values
     */
    public CartResourceIdentifier buildUnchecked() {
        return new CartResourceIdentifierImpl(id, key);
    }

    public static CartResourceIdentifierBuilder of() {
        return new CartResourceIdentifierBuilder();
    }

    public static CartResourceIdentifierBuilder of(final CartResourceIdentifier template) {
        CartResourceIdentifierBuilder builder = new CartResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
