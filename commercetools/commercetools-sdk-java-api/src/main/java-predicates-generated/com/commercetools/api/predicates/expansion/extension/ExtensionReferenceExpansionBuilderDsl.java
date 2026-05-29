
package com.commercetools.api.predicates.expansion.extension;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ExtensionReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ExtensionReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ExtensionReferenceExpansionBuilderDsl of() {
        return new ExtensionReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ExtensionReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ExtensionReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.extension.ExtensionExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.extension.ExtensionExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
