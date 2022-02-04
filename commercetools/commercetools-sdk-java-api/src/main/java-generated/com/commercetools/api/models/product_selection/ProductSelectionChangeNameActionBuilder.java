
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionChangeNameActionBuilder implements Builder<ProductSelectionChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    public ProductSelectionChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductSelectionChangeNameActionBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public ProductSelectionChangeNameAction build() {
        Objects.requireNonNull(name, ProductSelectionChangeNameAction.class + ": name is missing");
        return new ProductSelectionChangeNameActionImpl(name);
    }

    /**
     * builds ProductSelectionChangeNameAction without checking for non null required values
     */
    public ProductSelectionChangeNameAction buildUnchecked() {
        return new ProductSelectionChangeNameActionImpl(name);
    }

    public static ProductSelectionChangeNameActionBuilder of() {
        return new ProductSelectionChangeNameActionBuilder();
    }

    public static ProductSelectionChangeNameActionBuilder of(final ProductSelectionChangeNameAction template) {
        ProductSelectionChangeNameActionBuilder builder = new ProductSelectionChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
