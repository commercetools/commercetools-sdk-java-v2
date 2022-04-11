
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductDiscountValueDraftBuilder {

    public com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraftBuilder absoluteBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraftBuilder.of();
    }

    public com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraftBuilder externalBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraftBuilder.of();
    }

    public com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraftBuilder relativeBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraftBuilder.of();
    }

    public static ProductDiscountValueDraftBuilder of() {
        return new ProductDiscountValueDraftBuilder();
    }
}
