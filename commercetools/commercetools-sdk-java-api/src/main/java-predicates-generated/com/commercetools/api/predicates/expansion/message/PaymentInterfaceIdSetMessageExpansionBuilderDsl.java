
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class PaymentInterfaceIdSetMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private PaymentInterfaceIdSetMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static PaymentInterfaceIdSetMessageExpansionBuilderDsl of() {
        return new PaymentInterfaceIdSetMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static PaymentInterfaceIdSetMessageExpansionBuilderDsl of(final List<String> path) {
        return new PaymentInterfaceIdSetMessageExpansionBuilderDsl(path);
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
