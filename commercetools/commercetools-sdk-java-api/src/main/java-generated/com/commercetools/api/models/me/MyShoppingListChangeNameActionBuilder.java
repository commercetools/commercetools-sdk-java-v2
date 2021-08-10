
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListChangeNameActionBuilder implements Builder<MyShoppingListChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    public MyShoppingListChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public MyShoppingListChangeNameAction build() {
        Objects.requireNonNull(name);
        return new MyShoppingListChangeNameActionImpl(name);
    }

    /**
     * builds MyShoppingListChangeNameAction without checking for non null required values
     */
    public MyShoppingListChangeNameAction buildUnchecked() {
        return new MyShoppingListChangeNameActionImpl(name);
    }

    public static MyShoppingListChangeNameActionBuilder of() {
        return new MyShoppingListChangeNameActionBuilder();
    }

    public static MyShoppingListChangeNameActionBuilder of(final MyShoppingListChangeNameAction template) {
        MyShoppingListChangeNameActionBuilder builder = new MyShoppingListChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
