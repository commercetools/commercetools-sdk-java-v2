
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class VariantCreatedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private VariantCreatedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static VariantCreatedMessageExpansionBuilderDsl of() {
        return new VariantCreatedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static VariantCreatedMessageExpansionBuilderDsl of(final List<String> path) {
        return new VariantCreatedMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.product.AttributeExpansionBuilderDsl attributes() {
        return com.commercetools.api.predicates.expansion.product.AttributeExpansionBuilderDsl
                .of(appendOne(path, "attributes[*]"));
    }

    public com.commercetools.api.predicates.expansion.product.AttributeExpansionBuilderDsl attributes(long index) {
        return com.commercetools.api.predicates.expansion.product.AttributeExpansionBuilderDsl
                .of(appendOne(path, "attributes[" + index + "]"));
    }
}
