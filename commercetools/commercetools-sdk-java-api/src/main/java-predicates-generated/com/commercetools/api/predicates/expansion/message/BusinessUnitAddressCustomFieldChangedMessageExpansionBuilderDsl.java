
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class BusinessUnitAddressCustomFieldChangedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private BusinessUnitAddressCustomFieldChangedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static BusinessUnitAddressCustomFieldChangedMessageExpansionBuilderDsl of() {
        return new BusinessUnitAddressCustomFieldChangedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static BusinessUnitAddressCustomFieldChangedMessageExpansionBuilderDsl of(final List<String> path) {
        return new BusinessUnitAddressCustomFieldChangedMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.ObjectExpansionDsl value() {
        return com.commercetools.api.predicates.expansion.ObjectExpansionDsl.of(appendOne(path, "value"));
    }

    public com.commercetools.api.predicates.expansion.ObjectExpansionDsl oldValue() {
        return com.commercetools.api.predicates.expansion.ObjectExpansionDsl.of(appendOne(path, "oldValue"));
    }
}
