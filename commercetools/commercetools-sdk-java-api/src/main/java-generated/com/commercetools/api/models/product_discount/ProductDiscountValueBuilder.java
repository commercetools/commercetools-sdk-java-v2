
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductDiscountValueBuilder {

    public com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteBuilder absoluteBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteBuilder.of();
    }

    public com.commercetools.api.models.product_discount.ProductDiscountValueExternalBuilder externalBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueExternalBuilder.of();
    }

    public com.commercetools.api.models.product_discount.ProductDiscountValueRelativeBuilder relativeBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueRelativeBuilder.of();
    }

    public static ProductDiscountValueBuilder of() {
        return new ProductDiscountValueBuilder();
    }
}
