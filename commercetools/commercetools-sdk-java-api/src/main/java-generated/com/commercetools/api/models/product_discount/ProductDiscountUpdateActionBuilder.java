package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeNameAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangePredicateAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeValueAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetKeyAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilAction;
import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountUpdateActionBuilder {

    public com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveActionBuilder changeIsActiveBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveActionBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountChangeNameActionBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountChangePredicateActionBuilder changePredicateBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountChangePredicateActionBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderActionBuilder changeSortOrderBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderActionBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountChangeValueActionBuilder changeValueBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountChangeValueActionBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionActionBuilder setDescriptionBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionActionBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountSetKeyActionBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountSetValidFromActionBuilder setValidFromBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountSetValidFromActionBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilActionBuilder setValidFromAndUntilBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilActionBuilder.of();
    }
    public com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilActionBuilder setValidUntilBuilder() {
       return com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilActionBuilder.of();
    }

    /**
     * factory method for an instance of ProductDiscountUpdateActionBuilder
     * @return builder 
     */
    public static ProductDiscountUpdateActionBuilder of() {
        return new ProductDiscountUpdateActionBuilder();
    }

}
