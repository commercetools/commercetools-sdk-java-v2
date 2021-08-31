
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountValueExternalDraftBuilder implements Builder<ProductDiscountValueExternalDraft> {

    public ProductDiscountValueExternalDraft build() {
        return new ProductDiscountValueExternalDraftImpl();
    }

    /**
     * builds ProductDiscountValueExternalDraft without checking for non null required values
     */
    public ProductDiscountValueExternalDraft buildUnchecked() {
        return new ProductDiscountValueExternalDraftImpl();
    }

    public static ProductDiscountValueExternalDraftBuilder of() {
        return new ProductDiscountValueExternalDraftBuilder();
    }

    public static ProductDiscountValueExternalDraftBuilder of(final ProductDiscountValueExternalDraft template) {
        ProductDiscountValueExternalDraftBuilder builder = new ProductDiscountValueExternalDraftBuilder();
        return builder;
    }

}
