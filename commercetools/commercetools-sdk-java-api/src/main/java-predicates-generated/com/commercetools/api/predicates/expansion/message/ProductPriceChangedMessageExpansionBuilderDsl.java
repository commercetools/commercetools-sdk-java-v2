
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductPriceChangedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductPriceChangedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductPriceChangedMessageExpansionBuilderDsl of() {
        return new ProductPriceChangedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductPriceChangedMessageExpansionBuilderDsl of(final List<String> path) {
        return new ProductPriceChangedMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl oldPrice() {
        return com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl
                .of(appendOne(path, "oldPrice"));
    }

    public com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl newPrice() {
        return com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl
                .of(appendOne(path, "newPrice"));
    }

    public com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl oldStagedPrice() {
        return com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl
                .of(appendOne(path, "oldStagedPrice"));
    }
}
