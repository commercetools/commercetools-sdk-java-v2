
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeLabelActionBuilder implements Builder<ProductTypeChangeLabelAction> {

    private String attributeName;

    private com.commercetools.api.models.common.LocalizedString label;

    public ProductTypeChangeLabelActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeChangeLabelActionBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductTypeChangeLabelActionBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public ProductTypeChangeLabelAction build() {
        Objects.requireNonNull(attributeName, ProductTypeChangeLabelAction.class + ": attributeName is missing");
        Objects.requireNonNull(label, ProductTypeChangeLabelAction.class + ": label is missing");
        return new ProductTypeChangeLabelActionImpl(attributeName, label);
    }

    /**
     * builds ProductTypeChangeLabelAction without checking for non null required values
     */
    public ProductTypeChangeLabelAction buildUnchecked() {
        return new ProductTypeChangeLabelActionImpl(attributeName, label);
    }

    public static ProductTypeChangeLabelActionBuilder of() {
        return new ProductTypeChangeLabelActionBuilder();
    }

    public static ProductTypeChangeLabelActionBuilder of(final ProductTypeChangeLabelAction template) {
        ProductTypeChangeLabelActionBuilder builder = new ProductTypeChangeLabelActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.label = template.getLabel();
        return builder;
    }

}
