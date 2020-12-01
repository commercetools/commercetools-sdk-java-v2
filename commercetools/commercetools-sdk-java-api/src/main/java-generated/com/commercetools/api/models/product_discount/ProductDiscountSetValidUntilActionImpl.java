package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import java.time.ZonedDateTime;
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
public final class ProductDiscountSetValidUntilActionImpl implements ProductDiscountSetValidUntilAction {

    private String action;
    
    private java.time.ZonedDateTime validUntil;

    @JsonCreator
    ProductDiscountSetValidUntilActionImpl(@JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        this.action = "setValidUntil";
    }
    public ProductDiscountSetValidUntilActionImpl() {
        this.action = "setValidUntil";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>The time from which the discount should be ineffective.
    *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
    */
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil){
        this.validUntil = validUntil;
    }

}
