
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.AccessDeniedErrorImpl.class, name = AccessDeniedError.ACCESS_DENIED),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ConcurrentModificationErrorImpl.class, name = ConcurrentModificationError.CONCURRENT_MODIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ContentionErrorImpl.class, name = ContentionError.CONTENTION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.DuplicateAttributeValueErrorImpl.class, name = DuplicateAttributeValueError.DUPLICATE_ATTRIBUTE_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.DuplicateAttributeValuesErrorImpl.class, name = DuplicateAttributeValuesError.DUPLICATE_ATTRIBUTE_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.DuplicateFieldErrorImpl.class, name = DuplicateFieldError.DUPLICATE_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.DuplicateVariantValuesErrorImpl.class, name = DuplicateVariantValuesError.DUPLICATE_VARIANT_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.GenericErrorImpl.class, name = GenericError.GENERIC),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InsufficientScopeErrorImpl.class, name = InsufficientScopeError.INSUFFICIENT_SCOPE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidCredentialsErrorImpl.class, name = InvalidCredentialsError.INVALID_CREDENTIALS),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidFieldErrorImpl.class, name = InvalidFieldError.INVALID_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidInputImpl.class, name = InvalidInput.INVALID_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidJsonInputImpl.class, name = InvalidJsonInput.INVALID_JSON_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidOperationImpl.class, name = InvalidOperation.INVALID_OPERATION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidScopeErrorImpl.class, name = InvalidScopeError.INVALID_SCOPE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidStateTransitionErrorImpl.class, name = InvalidStateTransitionError.INVALID_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidTokenErrorImpl.class, name = InvalidTokenError.INVALID_TOKEN),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.RequiredFieldErrorImpl.class, name = RequiredFieldError.REQUIRED_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceCreationErrorImpl.class, name = ResourceCreationError.RESOURCE_CREATION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceDeletionErrorImpl.class, name = ResourceDeletionError.RESOURCE_DELETION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceNotFoundErrorImpl.class, name = ResourceNotFoundError.RESOURCE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceUpdateErrorImpl.class, name = ResourceUpdateError.RESOURCE_UPDATE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = ErrorObjectImpl.class, visible = true)
@JsonDeserialize(as = ErrorObjectImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ErrorObject {

    @NotNull
    @JsonProperty("code")
    public String getCode();

    @NotNull
    @JsonProperty("message")
    public String getMessage();

    public void setMessage(final String message);

    default <T> T withErrorObject(Function<ErrorObject, T> helper) {
        return helper.apply(this);
    }
}
