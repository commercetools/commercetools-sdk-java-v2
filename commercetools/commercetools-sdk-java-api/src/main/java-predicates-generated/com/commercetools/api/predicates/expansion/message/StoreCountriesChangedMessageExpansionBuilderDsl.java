
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class StoreCountriesChangedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private StoreCountriesChangedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static StoreCountriesChangedMessageExpansionBuilderDsl of() {
        return new StoreCountriesChangedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static StoreCountriesChangedMessageExpansionBuilderDsl of(final List<String> path) {
        return new StoreCountriesChangedMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl resource() {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "resource"));
    }
}
