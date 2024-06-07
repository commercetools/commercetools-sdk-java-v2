
package com.commercetools.api.predicates.expansion.product;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductVariantExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductVariantExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductVariantExpansionBuilderDsl of() {
        return new ProductVariantExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductVariantExpansionBuilderDsl of(final List<String> path) {
        return new ProductVariantExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl prices() {
        return com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl
                .of(appendOne(path, "prices[*]"));
    }

    public com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl prices(long index) {
        return com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl
                .of(appendOne(path, "prices[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.product.AttributeExpansionBuilderDsl attributes() {
        return com.commercetools.api.predicates.expansion.product.AttributeExpansionBuilderDsl
                .of(appendOne(path, "attributes[*]"));
    }

    public com.commercetools.api.predicates.expansion.product.AttributeExpansionBuilderDsl attributes(long index) {
        return com.commercetools.api.predicates.expansion.product.AttributeExpansionBuilderDsl
                .of(appendOne(path, "attributes[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl price() {
        return com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl.of(appendOne(path, "price"));
    }

    public com.commercetools.api.predicates.expansion.common.ScopedPriceExpansionBuilderDsl scopedPrice() {
        return com.commercetools.api.predicates.expansion.common.ScopedPriceExpansionBuilderDsl
                .of(appendOne(path, "scopedPrice"));
    }
}
