
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetSlugActionBuilder implements Builder<ShoppingListSetSlugAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    public ShoppingListSetSlugActionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

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

    /**
     * builds ShoppingListSetSlugAction without checking for non null required values
     */
    public ShoppingListSetSlugAction buildUnchecked() {
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
