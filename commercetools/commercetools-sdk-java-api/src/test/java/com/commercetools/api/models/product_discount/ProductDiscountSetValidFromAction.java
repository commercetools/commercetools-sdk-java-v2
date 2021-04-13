package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidFromActionImpl;

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
@JsonDeserialize(as = ProductDiscountSetValidFromActionImpl.class)
public interface ProductDiscountSetValidFromAction extends ProductDiscountUpdateAction {

    String SET_VALID_FROM = "setValidFrom";

    /**
    *  <p>The time from which the discount should be effective.
    *  Please take Eventual Consistency into account for calculated product discount values.</p>
    */
    
    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    
    public void setValidFrom(final ZonedDateTime validFrom);
    

    public static ProductDiscountSetValidFromAction of(){
        return new ProductDiscountSetValidFromActionImpl();
    }
    

    public static ProductDiscountSetValidFromAction of(final ProductDiscountSetValidFromAction template) {
        ProductDiscountSetValidFromActionImpl instance = new ProductDiscountSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    public static ProductDiscountSetValidFromActionBuilder builder(){
        return ProductDiscountSetValidFromActionBuilder.of();
    }
    
    public static ProductDiscountSetValidFromActionBuilder builder(final ProductDiscountSetValidFromAction template){
        return ProductDiscountSetValidFromActionBuilder.of(template);
    }
    

    default <T> T withProductDiscountSetValidFromAction(Function<ProductDiscountSetValidFromAction, T> helper) {
        return helper.apply(this);
    }
}
