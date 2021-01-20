
package com.commercetools.api.models.product_discount;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraft;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountValueExternalDraftBuilder {

    public ProductDiscountValueExternalDraft build() {
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
