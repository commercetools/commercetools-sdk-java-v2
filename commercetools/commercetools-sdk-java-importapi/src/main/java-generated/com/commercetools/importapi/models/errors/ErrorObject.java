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


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>An error.</p>
*/
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.AccessDeniedErrorImpl.class, name = "access_denied"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidScopeErrorImpl.class, name = "invalid_scope"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidOperationImpl.class, name = "InvalidOperation"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.DuplicateAttributeValueErrorImpl.class, name = "DuplicateAttributeValue"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.DuplicateAttributeValuesErrorImpl.class, name = "DuplicateAttributeValues"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.DuplicateFieldErrorImpl.class, name = "DuplicateField"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.DuplicateVariantValuesErrorImpl.class, name = "DuplicateVariantValues"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InsufficientScopeErrorImpl.class, name = "insufficient_scope"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidCredentialsErrorImpl.class, name = "InvalidCredentials"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidTokenErrorImpl.class, name = "invalid_token"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidFieldErrorImpl.class, name = "InvalidField"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidJsonInputImpl.class, name = "InvalidJsonInput"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidInputImpl.class, name = "InvalidInput"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceNotFoundErrorImpl.class, name = "ResourceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceCreationErrorImpl.class, name = "ResourceCreation"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceUpdateErrorImpl.class, name = "ResourceUpdate"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceDeletionErrorImpl.class, name = "ResourceDeletion"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.RequiredFieldErrorImpl.class, name = "RequiredField"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidStateTransitionErrorImpl.class, name = "InvalidTransition"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ConcurrentModificationErrorImpl.class, name = "ConcurrentModification"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ContentionErrorImpl.class, name = "Contention"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.GenericErrorImpl.class, name = "Generic")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "code",
    defaultImpl = ErrorObjectImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ErrorObject  {

    /**
    *  <p>The error's description.</p>
    */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    public void setMessage(final String message);



    default <T> T withErrorObject(Function<ErrorObject, T> helper) {
        return helper.apply(this);
    }
}
