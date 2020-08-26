package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
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


/**
*  <p>Invalid JSON input has been sent to the service. Either the JSON is syntactically not correct, or the JSON does not
*  conform to the expected shape (e.g. is missing a required field). The client application should validate the input
*  according to the constraints described in the error message before sending the request.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidJsonInputImpl implements InvalidJsonInput {

    private String code;
    
    private String message;

    @JsonCreator
    InvalidJsonInputImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = "InvalidJsonInput";
    }
    public InvalidJsonInputImpl() {
       
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
