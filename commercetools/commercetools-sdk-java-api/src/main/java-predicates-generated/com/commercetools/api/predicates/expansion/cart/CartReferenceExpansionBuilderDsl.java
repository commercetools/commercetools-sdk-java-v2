
package com.commercetools.api.predicates.expansion.cart;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CartReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CartReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CartReferenceExpansionBuilderDsl of() {
        return new CartReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static CartReferenceExpansionBuilderDsl of(final List<String> path) {
        return new CartReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.cart.CartExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.cart.CartExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
