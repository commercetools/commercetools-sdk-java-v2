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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OutOfStockErrorImpl implements OutOfStockError {

    private String code;
    
    private String message;
    
    private java.util.List<String> lineItems;
    
    private java.util.List<String> skus;

    @JsonCreator
    OutOfStockErrorImpl(@JsonProperty("message") final String message, @JsonProperty("lineItems") final java.util.List<String> lineItems, @JsonProperty("skus") final java.util.List<String> skus) {
        this.message = message;
        this.lineItems = lineItems;
        this.skus = skus;
        this.code = "OutOfStock";
    }
    public OutOfStockErrorImpl() {
        this.code = "OutOfStock";
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
    
    
    public java.util.List<String> getSkus(){
        return this.skus;
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
    
    public void setSkus(final String ...skus){
       this.skus = new ArrayList<>(Arrays.asList(skus));
    }
    
    public void setSkus(final java.util.List<String> skus){
       this.skus = skus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OutOfStockErrorImpl that = (OutOfStockErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(lineItems, that.lineItems)
                .append(skus, that.skus)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(lineItems)
            .append(skus)
            .toHashCode();
    }

}
