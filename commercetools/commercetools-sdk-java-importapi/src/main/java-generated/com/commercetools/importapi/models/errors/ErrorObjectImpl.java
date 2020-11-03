package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.AccessDeniedError;
import com.commercetools.importapi.models.errors.ConcurrentModificationError;
import com.commercetools.importapi.models.errors.ContentionError;
import com.commercetools.importapi.models.errors.DuplicateAttributeValueError;
import com.commercetools.importapi.models.errors.DuplicateAttributeValuesError;
import com.commercetools.importapi.models.errors.DuplicateFieldError;
import com.commercetools.importapi.models.errors.DuplicateVariantValuesError;
import com.commercetools.importapi.models.errors.GenericError;
import com.commercetools.importapi.models.errors.InsufficientScopeError;
import com.commercetools.importapi.models.errors.InvalidCredentialsError;
import com.commercetools.importapi.models.errors.InvalidFieldError;
import com.commercetools.importapi.models.errors.InvalidInput;
import com.commercetools.importapi.models.errors.InvalidJsonInput;
import com.commercetools.importapi.models.errors.InvalidOperation;
import com.commercetools.importapi.models.errors.InvalidScopeError;
import com.commercetools.importapi.models.errors.InvalidStateTransitionError;
import com.commercetools.importapi.models.errors.InvalidTokenError;
import com.commercetools.importapi.models.errors.RequiredFieldError;
import com.commercetools.importapi.models.errors.ResourceCreationError;
import com.commercetools.importapi.models.errors.ResourceDeletionError;
import com.commercetools.importapi.models.errors.ResourceNotFoundError;
import com.commercetools.importapi.models.errors.ResourceUpdateError;
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


/**
*  <p>An error.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ErrorObjectImpl implements ErrorObject {

    private String code;
    
    private String message;

    @JsonCreator
    ErrorObjectImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = "null";
    }
    public ErrorObjectImpl() {
       
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
