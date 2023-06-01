package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValueAbsolute;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternal;
import com.commercetools.api.models.product_discount.ProductDiscountValueRelative;
import com.commercetools.api.models.product_discount.ProductDiscountValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountValueBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
