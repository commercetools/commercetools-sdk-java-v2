
package com.commercetools.api.predicates.expansion.store;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class StoreReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private StoreReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static StoreReferenceExpansionBuilderDsl of() {
        return new StoreReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static StoreReferenceExpansionBuilderDsl of(final List<String> path) {
        return new StoreReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.store.StoreExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.store.StoreExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
