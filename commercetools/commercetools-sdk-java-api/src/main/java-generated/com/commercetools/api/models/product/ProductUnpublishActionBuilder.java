
package com.commercetools.api.models.product;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductUnpublishAction;
import com.commercetools.api.models.product.ProductUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductUnpublishActionBuilder {

    public ProductUnpublishAction build() {
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
