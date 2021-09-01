
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductRevertStagedChangesActionBuilder implements Builder<ProductRevertStagedChangesAction> {

    public ProductRevertStagedChangesAction build() {
        return new ProductRevertStagedChangesActionImpl();
    }

    /**
     * builds ProductRevertStagedChangesAction without checking for non null required values
     */
    public ProductRevertStagedChangesAction buildUnchecked() {
        return new ProductRevertStagedChangesActionImpl();
    }

    public static ProductRevertStagedChangesActionBuilder of() {
        return new ProductRevertStagedChangesActionBuilder();
    }

    public static ProductRevertStagedChangesActionBuilder of(final ProductRevertStagedChangesAction template) {
        ProductRevertStagedChangesActionBuilder builder = new ProductRevertStagedChangesActionBuilder();
        return builder;
    }

}
