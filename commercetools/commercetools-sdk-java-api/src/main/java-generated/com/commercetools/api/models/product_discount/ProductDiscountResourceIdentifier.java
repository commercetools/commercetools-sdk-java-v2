package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierImpl;

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
@JsonDeserialize(as = ProductDiscountResourceIdentifierImpl.class)
public interface ProductDiscountResourceIdentifier extends ResourceIdentifier {



    public static ProductDiscountResourceIdentifier of(){
        return new ProductDiscountResourceIdentifierImpl();
    }
    

    public static ProductDiscountResourceIdentifier of(final ProductDiscountResourceIdentifier template) {
        ProductDiscountResourceIdentifierImpl instance = new ProductDiscountResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductDiscountResourceIdentifierBuilder builder(){
        return ProductDiscountResourceIdentifierBuilder.of();
    }
    
    public static ProductDiscountResourceIdentifierBuilder builder(final ProductDiscountResourceIdentifier template){
        return ProductDiscountResourceIdentifierBuilder.of(template);
    }
    

    default <T> T withProductDiscountResourceIdentifier(Function<ProductDiscountResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
