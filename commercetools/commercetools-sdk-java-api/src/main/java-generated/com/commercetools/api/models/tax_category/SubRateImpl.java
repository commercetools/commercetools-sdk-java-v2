package com.commercetools.api.models.tax_category;


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
public final class SubRateImpl implements SubRate {

    private String name;
    
    private Double amount;

    @JsonCreator
    SubRateImpl(@JsonProperty("name") final String name, @JsonProperty("amount") final Double amount) {
        this.name = name;
        this.amount = amount;
    }
    public SubRateImpl() {
       
    }

    
    public String getName(){
        return this.name;
    }
    
    
    public Double getAmount(){
        return this.amount;
    }

    public void setName(final String name){
        this.name = name;
    }
    
    public void setAmount(final Double amount){
        this.amount = amount;
    }

}
