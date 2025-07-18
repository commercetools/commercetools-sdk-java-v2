
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class PaymentMethodCustomTypeSetMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private PaymentMethodCustomTypeSetMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static PaymentMethodCustomTypeSetMessageExpansionBuilderDsl of() {
        return new PaymentMethodCustomTypeSetMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static PaymentMethodCustomTypeSetMessageExpansionBuilderDsl of(final List<String> path) {
        return new PaymentMethodCustomTypeSetMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl customFields() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "customFields"));
    }
}
