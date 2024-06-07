
package com.commercetools.api.predicates.expansion.extension;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ExtensionExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ExtensionExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ExtensionExpansionBuilderDsl of() {
        return new ExtensionExpansionBuilderDsl(Collections.emptyList());
    }

    public static ExtensionExpansionBuilderDsl of(final List<String> path) {
        return new ExtensionExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }
}
