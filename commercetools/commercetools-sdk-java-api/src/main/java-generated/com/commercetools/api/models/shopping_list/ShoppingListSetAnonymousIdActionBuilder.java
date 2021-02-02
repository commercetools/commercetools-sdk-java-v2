
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetAnonymousIdActionBuilder {

    @Nullable
    private String anonymousId;

    public ShoppingListSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public ShoppingListSetAnonymousIdAction build() {
        return new ShoppingListSetAnonymousIdActionImpl(anonymousId);
    }

    public static ShoppingListSetAnonymousIdActionBuilder of() {
        return new ShoppingListSetAnonymousIdActionBuilder();
    }

    public static ShoppingListSetAnonymousIdActionBuilder of(final ShoppingListSetAnonymousIdAction template) {
        ShoppingListSetAnonymousIdActionBuilder builder = new ShoppingListSetAnonymousIdActionBuilder();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
