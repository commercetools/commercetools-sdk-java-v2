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
 * ErrorObject
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ErrorObjectImpl implements ErrorObject, ModelBase {

    
    private String code;
    
    
    private String message;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ErrorObjectImpl(@JsonProperty("code") final String code, @JsonProperty("message") final String message) {
        this.code = code;
        this.message = message;
    }
    /**
     * create empty instance
     */
    public ErrorObjectImpl() {
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
    
        ErrorObjectImpl that = (ErrorObjectImpl) o;
    
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
