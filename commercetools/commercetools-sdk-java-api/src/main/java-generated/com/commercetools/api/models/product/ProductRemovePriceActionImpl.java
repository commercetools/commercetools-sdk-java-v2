package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductRemovePriceActionImpl implements ProductRemovePriceAction {

    private String action;
    
    private String priceId;
    
    private Boolean staged;

    @JsonCreator
    ProductRemovePriceActionImpl(@JsonProperty("priceId") final String priceId, @JsonProperty("staged") final Boolean staged) {
        this.priceId = priceId;
        this.staged = staged;
        this.action = "removePrice";
    }
    public ProductRemovePriceActionImpl() {
        this.action = "removePrice";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>ID of the <a href="#price">Price</a></p>
    */
    public String getPriceId(){
        return this.priceId;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setPriceId(final String priceId){
        this.priceId = priceId;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}
