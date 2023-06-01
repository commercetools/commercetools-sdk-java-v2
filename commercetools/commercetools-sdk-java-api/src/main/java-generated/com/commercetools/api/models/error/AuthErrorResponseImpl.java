package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ErrorResponse;
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
 *  <p>Represents errors related to authentication and authorization in a format conforming to the OAuth 2.0 specification.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AuthErrorResponseImpl implements AuthErrorResponse, ModelBase {

    
    private Integer statusCode;
    
    
    private String message;
    
    
    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;
    
    
    private String error;
    
    
    private String errorDescription;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AuthErrorResponseImpl(@JsonProperty("statusCode") final Integer statusCode, @JsonProperty("message") final String message, @JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.ErrorObject> errors, @JsonProperty("error") final String error, @JsonProperty("error_description") final String errorDescription) {
        this.statusCode = statusCode;
        this.message = message;
        this.errors = errors;
        this.error = error;
        this.errorDescription = errorDescription;
    }
    /**
     * create empty instance
     */
    public AuthErrorResponseImpl() {
    }

    /**
     *  <p>HTTP status code corresponding to the error.</p>
     */
    
    public Integer getStatusCode(){
        return this.statusCode;
    }
    
    /**
     *  <p>First error message in the <code>errors</code> array.</p>
     */
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     */
    
    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors(){
        return this.errors;
    }
    
    /**
     *  <p>Error code as per the OAuth 2.0 specification. For example: <code>"access_denied"</code>.</p>
     */
    
    public String getError(){
        return this.error;
    }
    
    /**
     *  <p>Plain text description of the first error.</p>
     */
    
    public String getErrorDescription(){
        return this.errorDescription;
    }

    
    public void setStatusCode(final Integer statusCode){
        this.statusCode = statusCode;
    }
    
    
    public void setMessage(final String message){
        this.message = message;
    }
    
    
    public void setErrors(final com.commercetools.api.models.error.ErrorObject ...errors){
       this.errors = new ArrayList<>(Arrays.asList(errors));
    }
    
    
    public void setErrors(final java.util.List<com.commercetools.api.models.error.ErrorObject> errors){
       this.errors = errors;
    }
    
    
    public void setError(final String error){
        this.error = error;
    }
    
    
    public void setErrorDescription(final String errorDescription){
        this.errorDescription = errorDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AuthErrorResponseImpl that = (AuthErrorResponseImpl) o;
    
        return new EqualsBuilder()
                .append(statusCode, that.statusCode)
                .append(message, that.message)
                .append(errors, that.errors)
                .append(error, that.error)
                .append(errorDescription, that.errorDescription)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(statusCode)
            .append(message)
            .append(errors)
            .append(error)
            .append(errorDescription)
            .toHashCode();
    }

}
