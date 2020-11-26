package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
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
public final class PriceChangedErrorImpl implements PriceChangedError {

    private String code;
    
    private String message;
    
    private java.util.List<String> lineItems;
    
    private Boolean shipping;

    @JsonCreator
    PriceChangedErrorImpl(@JsonProperty("message") final String message, @JsonProperty("lineItems") final java.util.List<String> lineItems, @JsonProperty("shipping") final Boolean shipping) {
        this.message = message;
        this.lineItems = lineItems;
        this.shipping = shipping;
        this.code = "PriceChanged";
    }
    public PriceChangedErrorImpl() {
        this.code = "PriceChanged";
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public java.util.List<String> getLineItems(){
        return this.lineItems;
    }
    
    
    public Boolean getShipping(){
        return this.shipping;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setLineItems(final String ...lineItems){
       this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }
    
    public void setLineItems(final java.util.List<String> lineItems){
       this.lineItems = lineItems;
    }
    
    public void setShipping(final Boolean shipping){
        this.shipping = shipping;
    }

}
