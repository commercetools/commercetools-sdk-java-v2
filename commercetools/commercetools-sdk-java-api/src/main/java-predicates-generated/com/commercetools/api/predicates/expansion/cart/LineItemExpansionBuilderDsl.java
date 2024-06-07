
package com.commercetools.api.predicates.expansion.cart;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class LineItemExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private LineItemExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static LineItemExpansionBuilderDsl of() {
        return new LineItemExpansionBuilderDsl(Collections.emptyList());
    }

    public static LineItemExpansionBuilderDsl of(final List<String> path) {
        return new LineItemExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product_type.ProductTypeReferenceExpansionBuilderDsl productType() {
        return com.commercetools.api.predicates.expansion.product_type.ProductTypeReferenceExpansionBuilderDsl
                .of(appendOne(path, "productType"));
    }

    public com.commercetools.api.predicates.expansion.product.ProductVariantExpansionBuilderDsl variant() {
        return com.commercetools.api.predicates.expansion.product.ProductVariantExpansionBuilderDsl
                .of(appendOne(path, "variant"));
    }

    public com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl price() {
        return com.commercetools.api.predicates.expansion.common.PriceExpansionBuilderDsl.of(appendOne(path, "price"));
    }

    public com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl state() {
        return com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl
                .of(appendOne(path, "state[*]"));
    }

    public com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl state(long index) {
        return com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl
                .of(appendOne(path, "state[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl supplyChannel() {
        return com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl
                .of(appendOne(path, "supplyChannel"));
    }

    public com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl distributionChannel() {
        return com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl
                .of(appendOne(path, "distributionChannel"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
