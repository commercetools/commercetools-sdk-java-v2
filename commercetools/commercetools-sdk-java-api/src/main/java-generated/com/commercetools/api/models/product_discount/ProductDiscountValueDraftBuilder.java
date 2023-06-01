package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountValueDraftBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of ProductDiscountValueDraftBuilder
     * @return builder 
     */
    public static ProductDiscountValueDraftBuilder of() {
        return new ProductDiscountValueDraftBuilder();
    }

}
