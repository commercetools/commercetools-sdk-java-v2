
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class BusinessUnitStoreModeChangedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private BusinessUnitStoreModeChangedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static BusinessUnitStoreModeChangedMessageExpansionBuilderDsl of() {
        return new BusinessUnitStoreModeChangedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static BusinessUnitStoreModeChangedMessageExpansionBuilderDsl of(final List<String> path) {
        return new BusinessUnitStoreModeChangedMessageExpansionBuilderDsl(path);
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
