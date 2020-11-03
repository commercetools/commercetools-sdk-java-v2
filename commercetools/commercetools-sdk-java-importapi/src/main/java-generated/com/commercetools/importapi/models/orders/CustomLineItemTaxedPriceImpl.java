package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.TypedMoney;
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
public final class CustomLineItemTaxedPriceImpl implements CustomLineItemTaxedPrice {

    private com.commercetools.importapi.models.common.TypedMoney totalNet;
    
    private com.commercetools.importapi.models.common.TypedMoney totalGross;

    @JsonCreator
    CustomLineItemTaxedPriceImpl(@JsonProperty("totalNet") final com.commercetools.importapi.models.common.TypedMoney totalNet, @JsonProperty("totalGross") final com.commercetools.importapi.models.common.TypedMoney totalGross) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
    }
    public CustomLineItemTaxedPriceImpl() {
       
    }

    
    public com.commercetools.importapi.models.common.TypedMoney getTotalNet(){
        return this.totalNet;
    }
    
    
    public com.commercetools.importapi.models.common.TypedMoney getTotalGross(){
        return this.totalGross;
    }

    public void setTotalNet(final com.commercetools.importapi.models.common.TypedMoney totalNet){
        this.totalNet = totalNet;
    }
    
    public void setTotalGross(final com.commercetools.importapi.models.common.TypedMoney totalGross){
        this.totalGross = totalGross;
    }

}
