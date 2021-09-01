
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListResourceIdentifierBuilder implements Builder<ShoppingListResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public ShoppingListResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public ShoppingListResourceIdentifierBuilder key(@Nullable final String key) {
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

    public ShoppingListResourceIdentifier build() {
        return new ShoppingListResourceIdentifierImpl(id, key);
    }

    /**
     * builds ShoppingListResourceIdentifier without checking for non null required values
     */
    public ShoppingListResourceIdentifier buildUnchecked() {
        return new ShoppingListResourceIdentifierImpl(id, key);
    }

    public static ShoppingListResourceIdentifierBuilder of() {
        return new ShoppingListResourceIdentifierBuilder();
    }

    public static ShoppingListResourceIdentifierBuilder of(final ShoppingListResourceIdentifier template) {
        ShoppingListResourceIdentifierBuilder builder = new ShoppingListResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
