package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>An invalid JSON input has been sent to the service. Either the JSON is syntactically incorrect or the JSON has an unexpected shape, for example, a required field is missing. The client application should validate the input according to the constraints described in the error message before sending the request again.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InvalidJsonInputImpl implements InvalidJsonInput, ModelBase {

    
    private String code;
    
    
    private String message;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InvalidJsonInputImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code =  INVALID_JSON_INPUT;
    }
    /**
     * create empty instance
     */
    public InvalidJsonInputImpl() {
        this.code =  INVALID_JSON_INPUT;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *
     */
    
    public String getMessage(){
        return this.message;
    }

    
    public void setMessage(final String message){
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        InvalidJsonInputImpl that = (InvalidJsonInputImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .toHashCode();
    }

}
