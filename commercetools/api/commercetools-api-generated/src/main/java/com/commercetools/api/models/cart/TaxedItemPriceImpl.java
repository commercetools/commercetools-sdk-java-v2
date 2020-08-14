package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.TypedMoney;
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
public final class TaxedItemPriceImpl implements TaxedItemPrice {

    private com.commercetools.api.models.common.TypedMoney totalNet;
    
    private com.commercetools.api.models.common.TypedMoney totalGross;

    @JsonCreator
    TaxedItemPriceImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.TypedMoney totalNet, @JsonProperty("totalGross") final com.commercetools.api.models.common.TypedMoney totalGross) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
    }
    public TaxedItemPriceImpl() {
       
    }

    
    public com.commercetools.api.models.common.TypedMoney getTotalNet(){
        return this.totalNet;
    }
    
    /**
    *  <p>TaxedItemPrice fields can not be used in query predicates.</p>
    */
    public com.commercetools.api.models.common.TypedMoney getTotalGross(){
        return this.totalGross;
    }

    public void setTotalNet(final com.commercetools.api.models.common.TypedMoney totalNet){
        this.totalNet = totalNet;
    }
    
    public void setTotalGross(final com.commercetools.api.models.common.TypedMoney totalGross){
        this.totalGross = totalGross;
    }

}
