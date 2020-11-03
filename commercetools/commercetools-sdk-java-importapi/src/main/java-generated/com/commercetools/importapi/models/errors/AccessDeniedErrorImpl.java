package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
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
public final class AccessDeniedErrorImpl implements AccessDeniedError {

    private String code;
    
    private String message;

    @JsonCreator
    AccessDeniedErrorImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = "access_denied";
    }
    public AccessDeniedErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    /**
    *  <p>The error's description.</p>
    */
    public String getMessage(){
        return this.message;
    }

    public void setMessage(final String message){
        this.message = message;
    }

}
