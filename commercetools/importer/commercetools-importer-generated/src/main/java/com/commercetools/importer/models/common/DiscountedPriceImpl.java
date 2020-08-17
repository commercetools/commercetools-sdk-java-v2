package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.common.ProductDiscountKeyReference;
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
public final class DiscountedPriceImpl implements DiscountedPrice {

    private com.commercetools.importer.models.common.Money value;
    
    private com.commercetools.importer.models.common.ProductDiscountKeyReference discount;

    @JsonCreator
    DiscountedPriceImpl(@JsonProperty("value") final com.commercetools.importer.models.common.Money value, @JsonProperty("discount") final com.commercetools.importer.models.common.ProductDiscountKeyReference discount) {
        this.value = value;
        this.discount = discount;
    }
    public DiscountedPriceImpl() {
       
    }

    
    public com.commercetools.importer.models.common.Money getValue(){
        return this.value;
    }
    
    /**
    *  <p>Reference to a ProductDiscount.</p>
    */
    public com.commercetools.importer.models.common.ProductDiscountKeyReference getDiscount(){
        return this.discount;
    }

    public void setValue(final com.commercetools.importer.models.common.Money value){
        this.value = value;
    }
    
    public void setDiscount(final com.commercetools.importer.models.common.ProductDiscountKeyReference discount){
        this.discount = discount;
    }

}
