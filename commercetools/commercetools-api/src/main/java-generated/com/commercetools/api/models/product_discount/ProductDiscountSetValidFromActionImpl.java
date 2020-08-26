package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountSetValidFromActionImpl implements ProductDiscountSetValidFromAction {

    private String action;
    
    private java.time.ZonedDateTime validFrom;

    @JsonCreator
    ProductDiscountSetValidFromActionImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        this.action = "setValidFrom";
    }
    public ProductDiscountSetValidFromActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>The time from which the discount should be effective.
    *  Please take Eventual Consistency into account for calculated product discount values.</p>
    */
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom){
        this.validFrom = validFrom;
    }

}
