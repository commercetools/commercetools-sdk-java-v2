package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
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
public final class MyCartSetCountryActionImpl implements MyCartSetCountryAction {

    private String action;
    
    private String country;

    @JsonCreator
    MyCartSetCountryActionImpl(@JsonProperty("country") final String country) {
        this.country = country;
        this.action = "setCountry";
    }
    public MyCartSetCountryActionImpl() {
        this.action = "setCountry";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCountry(){
        return this.country;
    }

    public void setCountry(final String country){
        this.country = country;
    }

}
