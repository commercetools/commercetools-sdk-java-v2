
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductRevertStagedVariantChangesActionBuilder
        implements Builder<ProductRevertStagedVariantChangesAction> {

    private Long variantId;

    public ProductRevertStagedVariantChangesActionBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public ProductRevertStagedVariantChangesAction build() {
        Objects.requireNonNull(variantId, ProductRevertStagedVariantChangesAction.class + ": variantId is missing");
        return new ProductRevertStagedVariantChangesActionImpl(variantId);
    }

    /**
     * builds ProductRevertStagedVariantChangesAction without checking for non null required values
     */
    public ProductRevertStagedVariantChangesAction buildUnchecked() {
        return new ProductRevertStagedVariantChangesActionImpl(variantId);
    }

    public static ProductRevertStagedVariantChangesActionBuilder of() {
        return new ProductRevertStagedVariantChangesActionBuilder();
    }

    public static ProductRevertStagedVariantChangesActionBuilder of(
            final ProductRevertStagedVariantChangesAction template) {
        ProductRevertStagedVariantChangesActionBuilder builder = new ProductRevertStagedVariantChangesActionBuilder();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
