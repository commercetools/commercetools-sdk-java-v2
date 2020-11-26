package com.commercetools.api.models.customer;


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
public final class CustomerEmailVerifyImpl implements CustomerEmailVerify {

    private Long version;
    
    private String tokenValue;

    @JsonCreator
    CustomerEmailVerifyImpl(@JsonProperty("version") final Long version, @JsonProperty("tokenValue") final String tokenValue) {
        this.version = version;
        this.tokenValue = tokenValue;
    }
    public CustomerEmailVerifyImpl() {
    }

    
    public Long getVersion(){
        return this.version;
    }
    
    
    public String getTokenValue(){
        return this.tokenValue;
    }

    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setTokenValue(final String tokenValue){
        this.tokenValue = tokenValue;
    }

}
