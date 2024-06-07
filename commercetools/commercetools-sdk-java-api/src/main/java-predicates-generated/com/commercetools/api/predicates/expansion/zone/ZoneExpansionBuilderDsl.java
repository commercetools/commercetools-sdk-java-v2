
package com.commercetools.api.predicates.expansion.zone;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ZoneExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ZoneExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ZoneExpansionBuilderDsl of() {
        return new ZoneExpansionBuilderDsl(Collections.emptyList());
    }

    public static ZoneExpansionBuilderDsl of(final List<String> path) {
        return new ZoneExpansionBuilderDsl(path);
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
