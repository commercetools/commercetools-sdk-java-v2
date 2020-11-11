package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValueAbsolute;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternal;
import com.commercetools.api.models.product_discount.ProductDiscountValueRelative;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountValueImpl implements ProductDiscountValue {

    private String type;

    @JsonCreator
    ProductDiscountValueImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    public ProductDiscountValueImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }


}
