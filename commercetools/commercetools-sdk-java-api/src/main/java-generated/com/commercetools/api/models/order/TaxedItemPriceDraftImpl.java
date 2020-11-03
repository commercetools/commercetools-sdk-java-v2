package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Money;
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
public final class TaxedItemPriceDraftImpl implements TaxedItemPriceDraft {

    private com.commercetools.api.models.common.Money totalNet;
    
    private com.commercetools.api.models.common.Money totalGross;

    @JsonCreator
    TaxedItemPriceDraftImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.Money totalNet, @JsonProperty("totalGross") final com.commercetools.api.models.common.Money totalGross) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
    }
    public TaxedItemPriceDraftImpl() {
       
    }

    
    public com.commercetools.api.models.common.Money getTotalNet(){
        return this.totalNet;
    }
    
    
    public com.commercetools.api.models.common.Money getTotalGross(){
        return this.totalGross;
    }

    public void setTotalNet(final com.commercetools.api.models.common.Money totalNet){
        this.totalNet = totalNet;
    }
    
    public void setTotalGross(final com.commercetools.api.models.common.Money totalGross){
        this.totalGross = totalGross;
    }

}
