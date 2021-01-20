
package com.commercetools.api.models.product;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductRevertStagedChangesAction;
import com.commercetools.api.models.product.ProductUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductRevertStagedChangesActionBuilder {

    public ProductRevertStagedChangesAction build() {
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
