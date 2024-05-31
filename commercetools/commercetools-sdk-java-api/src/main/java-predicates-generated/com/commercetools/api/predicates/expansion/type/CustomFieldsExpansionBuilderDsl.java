
package com.commercetools.api.predicates.expansion.type;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CustomFieldsExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CustomFieldsExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CustomFieldsExpansionBuilderDsl of() {
        return new CustomFieldsExpansionBuilderDsl(Collections.emptyList());
    }

    public static CustomFieldsExpansionBuilderDsl of(final List<String> path) {
        return new CustomFieldsExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.type.TypeReferenceExpansionBuilderDsl type() {
        return com.commercetools.api.predicates.expansion.type.TypeReferenceExpansionBuilderDsl
                .of(appendOne(path, "type"));
    }

    public com.commercetools.api.predicates.expansion.type.FieldContainerExpansionBuilderDsl fields() {
        return com.commercetools.api.predicates.expansion.type.FieldContainerExpansionBuilderDsl
                .of(appendOne(path, "fields"));
    }
}
