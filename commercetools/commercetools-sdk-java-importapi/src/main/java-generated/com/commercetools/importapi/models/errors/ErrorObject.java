
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

    public static com.commercetools.importapi.models.errors.AccessDeniedErrorBuilder accessDeniedBuilder() {
        return com.commercetools.importapi.models.errors.AccessDeniedErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.ConcurrentModificationErrorBuilder concurrentModificationBuilder() {
        return com.commercetools.importapi.models.errors.ConcurrentModificationErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.ContentionErrorBuilder contentionBuilder() {
        return com.commercetools.importapi.models.errors.ContentionErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.DuplicateAttributeValueErrorBuilder duplicateAttributeValueBuilder() {
        return com.commercetools.importapi.models.errors.DuplicateAttributeValueErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.DuplicateAttributeValuesErrorBuilder duplicateAttributeValuesBuilder() {
        return com.commercetools.importapi.models.errors.DuplicateAttributeValuesErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.DuplicateFieldErrorBuilder duplicateFieldBuilder() {
        return com.commercetools.importapi.models.errors.DuplicateFieldErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.DuplicateVariantValuesErrorBuilder duplicateVariantValuesBuilder() {
        return com.commercetools.importapi.models.errors.DuplicateVariantValuesErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.GenericErrorBuilder genericBuilder() {
        return com.commercetools.importapi.models.errors.GenericErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.InsufficientScopeErrorBuilder insufficientScopeBuilder() {
        return com.commercetools.importapi.models.errors.InsufficientScopeErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.InvalidCredentialsErrorBuilder invalidCredentialsBuilder() {
        return com.commercetools.importapi.models.errors.InvalidCredentialsErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.InvalidFieldErrorBuilder invalidFieldBuilder() {
        return com.commercetools.importapi.models.errors.InvalidFieldErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.InvalidInputBuilder invalidInputBuilder() {
        return com.commercetools.importapi.models.errors.InvalidInputBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.InvalidJsonInputBuilder invalidJsonInputBuilder() {
        return com.commercetools.importapi.models.errors.InvalidJsonInputBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.InvalidOperationBuilder invalidOperationBuilder() {
        return com.commercetools.importapi.models.errors.InvalidOperationBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.InvalidScopeErrorBuilder invalidScopeBuilder() {
        return com.commercetools.importapi.models.errors.InvalidScopeErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.InvalidStateTransitionErrorBuilder invalidTransitionBuilder() {
        return com.commercetools.importapi.models.errors.InvalidStateTransitionErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.InvalidTokenErrorBuilder invalidTokenBuilder() {
        return com.commercetools.importapi.models.errors.InvalidTokenErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.RequiredFieldErrorBuilder requiredFieldBuilder() {
        return com.commercetools.importapi.models.errors.RequiredFieldErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.ResourceCreationErrorBuilder resourceCreationBuilder() {
        return com.commercetools.importapi.models.errors.ResourceCreationErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.ResourceDeletionErrorBuilder resourceDeletionBuilder() {
        return com.commercetools.importapi.models.errors.ResourceDeletionErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.ResourceNotFoundErrorBuilder resourceNotFoundBuilder() {
        return com.commercetools.importapi.models.errors.ResourceNotFoundErrorBuilder.of();
    }

    public static com.commercetools.importapi.models.errors.ResourceUpdateErrorBuilder resourceUpdateBuilder() {
        return com.commercetools.importapi.models.errors.ResourceUpdateErrorBuilder.of();
    }

    default <T> T withErrorObject(Function<ErrorObject, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ErrorObject> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ErrorObject>() {
            @Override
            public String toString() {
                return "TypeReference<ErrorObject>";
            }
        };
    }
}
