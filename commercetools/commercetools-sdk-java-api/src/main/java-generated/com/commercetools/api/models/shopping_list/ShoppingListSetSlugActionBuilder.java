
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetSlugActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    public ShoppingListSetSlugActionBuilder slug(
            @Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    public ShoppingListSetSlugAction build() {
        return new ShoppingListSetSlugActionImpl(slug);
    }

    public static ShoppingListSetSlugActionBuilder of() {
        return new ShoppingListSetSlugActionBuilder();
    }

    public static ShoppingListSetSlugActionBuilder of(final ShoppingListSetSlugAction template) {
        ShoppingListSetSlugActionBuilder builder = new ShoppingListSetSlugActionBuilder();
        builder.slug = template.getSlug();
        return builder;
    }

}
