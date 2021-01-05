package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountChangeSortOrderActionImpl.class)
public interface ProductDiscountChangeSortOrderAction extends ProductDiscountUpdateAction {

    /**
    *  <p>The string must contain a number between 0 and 1.
    *  A discount with greater sortOrder is prioritized higher than a discount with lower sortOrder.</p>
    */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    public void setSortOrder(final String sortOrder);

    public static ProductDiscountChangeSortOrderAction of(){
        return new ProductDiscountChangeSortOrderActionImpl();
    }
    

    public static ProductDiscountChangeSortOrderAction of(final ProductDiscountChangeSortOrderAction template) {
        ProductDiscountChangeSortOrderActionImpl instance = new ProductDiscountChangeSortOrderActionImpl();
        instance.setSortOrder(template.getSortOrder());
        return instance;
    }

    public static ProductDiscountChangeSortOrderActionBuilder builder(){
        return ProductDiscountChangeSortOrderActionBuilder.of();
    }
    
    public static ProductDiscountChangeSortOrderActionBuilder builder(final ProductDiscountChangeSortOrderAction template){
        return ProductDiscountChangeSortOrderActionBuilder.of(template);
    }
    

    default <T> T withProductDiscountChangeSortOrderAction(Function<ProductDiscountChangeSortOrderAction, T> helper) {
        return helper.apply(this);
    }
}
