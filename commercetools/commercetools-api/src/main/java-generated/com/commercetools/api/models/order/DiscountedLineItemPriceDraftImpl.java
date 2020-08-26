package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.DiscountedLineItemPortion;
import com.commercetools.api.models.common.Money;
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
public final class DiscountedLineItemPriceDraftImpl implements DiscountedLineItemPriceDraft {

    private com.commercetools.api.models.common.Money value;
    
    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts;

    @JsonCreator
    DiscountedLineItemPriceDraftImpl(@JsonProperty("value") final com.commercetools.api.models.common.Money value, @JsonProperty("includedDiscounts") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts) {
        this.value = value;
        this.includedDiscounts = includedDiscounts;
    }
    public DiscountedLineItemPriceDraftImpl() {
       
    }

    
    public com.commercetools.api.models.common.Money getValue(){
        return this.value;
    }
    
    
    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> getIncludedDiscounts(){
        return this.includedDiscounts;
    }

    public void setValue(final com.commercetools.api.models.common.Money value){
        this.value = value;
    }
    
    public void setIncludedDiscounts(final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts){
        this.includedDiscounts = includedDiscounts;
    }

}
