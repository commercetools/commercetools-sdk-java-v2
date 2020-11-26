package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValue;
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
public final class ProductDiscountValueRelativeImpl implements ProductDiscountValueRelative {

    private String type;
    
    private Long permyriad;

    @JsonCreator
    ProductDiscountValueRelativeImpl(@JsonProperty("permyriad") final Long permyriad) {
        this.permyriad = permyriad;
        this.type = "relative";
    }
    public ProductDiscountValueRelativeImpl() {
        this.type = "relative";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public Long getPermyriad(){
        return this.permyriad;
    }

    public void setPermyriad(final Long permyriad){
        this.permyriad = permyriad;
    }

}
