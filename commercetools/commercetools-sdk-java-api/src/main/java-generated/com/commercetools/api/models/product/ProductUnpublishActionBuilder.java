
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductUnpublishActionBuilder implements Builder<ProductUnpublishAction> {

    public ProductUnpublishAction build() {
        return new ProductUnpublishActionImpl();
    }

    /**
     * builds ProductUnpublishAction without checking for non null required values
     */
    public ProductUnpublishAction buildUnchecked() {
        return new ProductUnpublishActionImpl();
    }

    public static ProductUnpublishActionBuilder of() {
        return new ProductUnpublishActionBuilder();
    }

    public static ProductUnpublishActionBuilder of(final ProductUnpublishAction template) {
        ProductUnpublishActionBuilder builder = new ProductUnpublishActionBuilder();
        return builder;
    }

}
