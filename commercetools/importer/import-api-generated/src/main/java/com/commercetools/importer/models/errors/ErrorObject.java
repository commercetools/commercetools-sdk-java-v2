package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.AccessDeniedError;
import com.commercetools.importer.models.errors.ConcurrentModificationError;
import com.commercetools.importer.models.errors.ContentionError;
import com.commercetools.importer.models.errors.DuplicateAttributeValueError;
import com.commercetools.importer.models.errors.DuplicateAttributeValuesError;
import com.commercetools.importer.models.errors.DuplicateFieldError;
import com.commercetools.importer.models.errors.DuplicateVariantValuesError;
import com.commercetools.importer.models.errors.GenericError;
import com.commercetools.importer.models.errors.InsufficientScopeError;
import com.commercetools.importer.models.errors.InvalidCredentialsError;
import com.commercetools.importer.models.errors.InvalidFieldError;
import com.commercetools.importer.models.errors.InvalidInput;
import com.commercetools.importer.models.errors.InvalidJsonInput;
import com.commercetools.importer.models.errors.InvalidOperation;
import com.commercetools.importer.models.errors.InvalidScopeError;
import com.commercetools.importer.models.errors.InvalidStateTransitionError;
import com.commercetools.importer.models.errors.InvalidTokenError;
import com.commercetools.importer.models.errors.RequiredFieldError;
import com.commercetools.importer.models.errors.ResourceCreationError;
import com.commercetools.importer.models.errors.ResourceDeletionError;
import com.commercetools.importer.models.errors.ResourceNotFoundError;
import com.commercetools.importer.models.errors.ResourceUpdateError;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>An error.</p>
*/
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.AccessDeniedErrorImpl.class, name = "access_denied"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.InvalidScopeErrorImpl.class, name = "invalid_scope"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.InvalidOperationImpl.class, name = "InvalidOperation"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.DuplicateAttributeValueErrorImpl.class, name = "DuplicateAttributeValue"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.DuplicateAttributeValuesErrorImpl.class, name = "DuplicateAttributeValues"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.DuplicateFieldErrorImpl.class, name = "DuplicateField"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.DuplicateVariantValuesErrorImpl.class, name = "DuplicateVariantValues"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.InsufficientScopeErrorImpl.class, name = "insufficient_scope"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.InvalidCredentialsErrorImpl.class, name = "InvalidCredentials"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.InvalidTokenErrorImpl.class, name = "invalid_token"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.InvalidFieldErrorImpl.class, name = "InvalidField"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.InvalidJsonInputImpl.class, name = "InvalidJsonInput"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.InvalidInputImpl.class, name = "InvalidInput"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.ResourceNotFoundErrorImpl.class, name = "ResourceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.ResourceCreationErrorImpl.class, name = "ResourceCreation"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.ResourceUpdateErrorImpl.class, name = "ResourceUpdate"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.ResourceDeletionErrorImpl.class, name = "ResourceDeletion"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.RequiredFieldErrorImpl.class, name = "RequiredField"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.InvalidStateTransitionErrorImpl.class, name = "InvalidTransition"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.ConcurrentModificationErrorImpl.class, name = "ConcurrentModification"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.ContentionErrorImpl.class, name = "Contention"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.errors.GenericErrorImpl.class, name = "Generic")
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
   


}