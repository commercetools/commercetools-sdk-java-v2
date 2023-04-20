
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountValueBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     * factory method for an instance of ProductDiscountValueBuilder
     * @return builder
     */
    public static ProductDiscountValueBuilder of() {
        return new ProductDiscountValueBuilder();
    }

}
