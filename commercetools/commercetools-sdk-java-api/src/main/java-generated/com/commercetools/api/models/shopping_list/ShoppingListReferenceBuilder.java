
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListReferenceBuilder implements Builder<ShoppingListReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.shopping_list.ShoppingList obj;

    public ShoppingListReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ShoppingListReferenceBuilder obj(
            Function<com.commercetools.api.models.shopping_list.ShoppingListBuilder, com.commercetools.api.models.shopping_list.ShoppingListBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.shopping_list.ShoppingListBuilder.of()).build();
        return this;
    }

    public ShoppingListReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.shopping_list.ShoppingList obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.shopping_list.ShoppingList getObj() {
        return this.obj;
    }

    public ShoppingListReference build() {
        Objects.requireNonNull(id, ShoppingListReference.class + ": id is missing");
        return new ShoppingListReferenceImpl(id, obj);
    }

    /**
     * builds ShoppingListReference without checking for non null required values
     */
    public ShoppingListReference buildUnchecked() {
        return new ShoppingListReferenceImpl(id, obj);
    }

    public static ShoppingListReferenceBuilder of() {
        return new ShoppingListReferenceBuilder();
    }

    public static ShoppingListReferenceBuilder of(final ShoppingListReference template) {
        ShoppingListReferenceBuilder builder = new ShoppingListReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
