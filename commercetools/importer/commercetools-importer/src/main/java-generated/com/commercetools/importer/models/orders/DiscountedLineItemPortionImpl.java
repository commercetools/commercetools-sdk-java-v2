package com.commercetools.importer.models.orders;

import com.commercetools.importer.models.common.CartDiscountKeyReference;
import com.commercetools.importer.models.common.Money;
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
public final class DiscountedLineItemPortionImpl implements DiscountedLineItemPortion {

    private com.commercetools.importer.models.common.CartDiscountKeyReference discount;
    
    private com.commercetools.importer.models.common.Money discountedAmount;

    @JsonCreator
    DiscountedLineItemPortionImpl(@JsonProperty("discount") final com.commercetools.importer.models.common.CartDiscountKeyReference discount, @JsonProperty("discountedAmount") final com.commercetools.importer.models.common.Money discountedAmount) {
        this.discount = discount;
        this.discountedAmount = discountedAmount;
    }
    public DiscountedLineItemPortionImpl() {
       
    }

    /**
    *  <p>References a cart discount by its key.</p>
    */
    public com.commercetools.importer.models.common.CartDiscountKeyReference getDiscount(){
        return this.discount;
    }
    
    
    public com.commercetools.importer.models.common.Money getDiscountedAmount(){
        return this.discountedAmount;
    }

    public void setDiscount(final com.commercetools.importer.models.common.CartDiscountKeyReference discount){
        this.discount = discount;
    }
    
    public void setDiscountedAmount(final com.commercetools.importer.models.common.Money discountedAmount){
        this.discountedAmount = discountedAmount;
    }

}
