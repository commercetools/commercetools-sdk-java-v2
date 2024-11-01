
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ErrorObject
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ErrorObject errorObject = ErrorObject.accessDeniedBuilder()
 *             message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
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
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidFieldsUpdateErrorImpl.class, name = InvalidFieldsUpdateError.INVALID_FIELD_UPDATE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidInputImpl.class, name = InvalidInput.INVALID_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidJsonInputImpl.class, name = InvalidJsonInput.INVALID_JSON_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidOperationImpl.class, name = InvalidOperation.INVALID_OPERATION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidScopeErrorImpl.class, name = InvalidScopeError.INVALID_SCOPE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidStateTransitionErrorImpl.class, name = InvalidStateTransitionError.INVALID_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.InvalidTokenErrorImpl.class, name = InvalidTokenError.INVALID_TOKEN),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.NewMasterVariantAdditionNotAllowedErrorImpl.class, name = NewMasterVariantAdditionNotAllowedError.NEW_MASTER_VARIANT_ADDITION_NOT_ALLOWED),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ReferencedResourceNotFoundImpl.class, name = ReferencedResourceNotFound.REFERENCED_RESOURCE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.RequiredFieldErrorImpl.class, name = RequiredFieldError.REQUIRED_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceCreationErrorImpl.class, name = ResourceCreationError.RESOURCE_CREATION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceDeletionErrorImpl.class, name = ResourceDeletionError.RESOURCE_DELETION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceNotFoundErrorImpl.class, name = ResourceNotFoundError.RESOURCE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.errors.ResourceUpdateErrorImpl.class, name = ResourceUpdateError.RESOURCE_UPDATE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = ErrorObjectImpl.class, visible = true)
@JsonDeserialize(as = ErrorObjectImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ErrorObject {

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     * set message
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method to create a deep copy of ErrorObject
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ErrorObject deepCopy(@Nullable final ErrorObject template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.importapi.models.errors.AccessDeniedError) {
            return com.commercetools.importapi.models.errors.AccessDeniedError
                    .deepCopy((com.commercetools.importapi.models.errors.AccessDeniedError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.ConcurrentModificationError) {
            return com.commercetools.importapi.models.errors.ConcurrentModificationError
                    .deepCopy((com.commercetools.importapi.models.errors.ConcurrentModificationError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.ContentionError) {
            return com.commercetools.importapi.models.errors.ContentionError
                    .deepCopy((com.commercetools.importapi.models.errors.ContentionError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.DuplicateAttributeValueError) {
            return com.commercetools.importapi.models.errors.DuplicateAttributeValueError
                    .deepCopy((com.commercetools.importapi.models.errors.DuplicateAttributeValueError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.DuplicateAttributeValuesError) {
            return com.commercetools.importapi.models.errors.DuplicateAttributeValuesError
                    .deepCopy((com.commercetools.importapi.models.errors.DuplicateAttributeValuesError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.DuplicateFieldError) {
            return com.commercetools.importapi.models.errors.DuplicateFieldError
                    .deepCopy((com.commercetools.importapi.models.errors.DuplicateFieldError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.DuplicateVariantValuesError) {
            return com.commercetools.importapi.models.errors.DuplicateVariantValuesError
                    .deepCopy((com.commercetools.importapi.models.errors.DuplicateVariantValuesError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.GenericError) {
            return com.commercetools.importapi.models.errors.GenericError
                    .deepCopy((com.commercetools.importapi.models.errors.GenericError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.InsufficientScopeError) {
            return com.commercetools.importapi.models.errors.InsufficientScopeError
                    .deepCopy((com.commercetools.importapi.models.errors.InsufficientScopeError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.InvalidCredentialsError) {
            return com.commercetools.importapi.models.errors.InvalidCredentialsError
                    .deepCopy((com.commercetools.importapi.models.errors.InvalidCredentialsError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.InvalidFieldError) {
            return com.commercetools.importapi.models.errors.InvalidFieldError
                    .deepCopy((com.commercetools.importapi.models.errors.InvalidFieldError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.InvalidFieldsUpdateError) {
            return com.commercetools.importapi.models.errors.InvalidFieldsUpdateError
                    .deepCopy((com.commercetools.importapi.models.errors.InvalidFieldsUpdateError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.InvalidInput) {
            return com.commercetools.importapi.models.errors.InvalidInput
                    .deepCopy((com.commercetools.importapi.models.errors.InvalidInput) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.InvalidJsonInput) {
            return com.commercetools.importapi.models.errors.InvalidJsonInput
                    .deepCopy((com.commercetools.importapi.models.errors.InvalidJsonInput) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.InvalidOperation) {
            return com.commercetools.importapi.models.errors.InvalidOperation
                    .deepCopy((com.commercetools.importapi.models.errors.InvalidOperation) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.InvalidScopeError) {
            return com.commercetools.importapi.models.errors.InvalidScopeError
                    .deepCopy((com.commercetools.importapi.models.errors.InvalidScopeError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.InvalidStateTransitionError) {
            return com.commercetools.importapi.models.errors.InvalidStateTransitionError
                    .deepCopy((com.commercetools.importapi.models.errors.InvalidStateTransitionError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.InvalidTokenError) {
            return com.commercetools.importapi.models.errors.InvalidTokenError
                    .deepCopy((com.commercetools.importapi.models.errors.InvalidTokenError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.NewMasterVariantAdditionNotAllowedError) {
            return com.commercetools.importapi.models.errors.NewMasterVariantAdditionNotAllowedError.deepCopy(
                (com.commercetools.importapi.models.errors.NewMasterVariantAdditionNotAllowedError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.ReferencedResourceNotFound) {
            return com.commercetools.importapi.models.errors.ReferencedResourceNotFound
                    .deepCopy((com.commercetools.importapi.models.errors.ReferencedResourceNotFound) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.RequiredFieldError) {
            return com.commercetools.importapi.models.errors.RequiredFieldError
                    .deepCopy((com.commercetools.importapi.models.errors.RequiredFieldError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.ResourceCreationError) {
            return com.commercetools.importapi.models.errors.ResourceCreationError
                    .deepCopy((com.commercetools.importapi.models.errors.ResourceCreationError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.ResourceDeletionError) {
            return com.commercetools.importapi.models.errors.ResourceDeletionError
                    .deepCopy((com.commercetools.importapi.models.errors.ResourceDeletionError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.ResourceNotFoundError) {
            return com.commercetools.importapi.models.errors.ResourceNotFoundError
                    .deepCopy((com.commercetools.importapi.models.errors.ResourceNotFoundError) template);
        }
        if (template instanceof com.commercetools.importapi.models.errors.ResourceUpdateError) {
            return com.commercetools.importapi.models.errors.ResourceUpdateError
                    .deepCopy((com.commercetools.importapi.models.errors.ResourceUpdateError) template);
        }
        ErrorObjectImpl instance = new ErrorObjectImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder for accessDenied subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.AccessDeniedErrorBuilder accessDeniedBuilder() {
        return com.commercetools.importapi.models.errors.AccessDeniedErrorBuilder.of();
    }

    /**
     * builder for concurrentModification subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.ConcurrentModificationErrorBuilder concurrentModificationBuilder() {
        return com.commercetools.importapi.models.errors.ConcurrentModificationErrorBuilder.of();
    }

    /**
     * builder for contention subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.ContentionErrorBuilder contentionBuilder() {
        return com.commercetools.importapi.models.errors.ContentionErrorBuilder.of();
    }

    /**
     * builder for duplicateAttributeValue subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.DuplicateAttributeValueErrorBuilder duplicateAttributeValueBuilder() {
        return com.commercetools.importapi.models.errors.DuplicateAttributeValueErrorBuilder.of();
    }

    /**
     * builder for duplicateAttributeValues subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.DuplicateAttributeValuesErrorBuilder duplicateAttributeValuesBuilder() {
        return com.commercetools.importapi.models.errors.DuplicateAttributeValuesErrorBuilder.of();
    }

    /**
     * builder for duplicateField subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.DuplicateFieldErrorBuilder duplicateFieldBuilder() {
        return com.commercetools.importapi.models.errors.DuplicateFieldErrorBuilder.of();
    }

    /**
     * builder for duplicateVariantValues subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.DuplicateVariantValuesErrorBuilder duplicateVariantValuesBuilder() {
        return com.commercetools.importapi.models.errors.DuplicateVariantValuesErrorBuilder.of();
    }

    /**
     * builder for generic subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.GenericErrorBuilder genericBuilder() {
        return com.commercetools.importapi.models.errors.GenericErrorBuilder.of();
    }

    /**
     * builder for insufficientScope subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.InsufficientScopeErrorBuilder insufficientScopeBuilder() {
        return com.commercetools.importapi.models.errors.InsufficientScopeErrorBuilder.of();
    }

    /**
     * builder for invalidCredentials subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.InvalidCredentialsErrorBuilder invalidCredentialsBuilder() {
        return com.commercetools.importapi.models.errors.InvalidCredentialsErrorBuilder.of();
    }

    /**
     * builder for invalidField subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.InvalidFieldErrorBuilder invalidFieldBuilder() {
        return com.commercetools.importapi.models.errors.InvalidFieldErrorBuilder.of();
    }

    /**
     * builder for invalidFieldUpdate subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.InvalidFieldsUpdateErrorBuilder invalidFieldUpdateBuilder() {
        return com.commercetools.importapi.models.errors.InvalidFieldsUpdateErrorBuilder.of();
    }

    /**
     * builder for invalidInput subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.InvalidInputBuilder invalidInputBuilder() {
        return com.commercetools.importapi.models.errors.InvalidInputBuilder.of();
    }

    /**
     * builder for invalidJsonInput subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.InvalidJsonInputBuilder invalidJsonInputBuilder() {
        return com.commercetools.importapi.models.errors.InvalidJsonInputBuilder.of();
    }

    /**
     * builder for invalidOperation subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.InvalidOperationBuilder invalidOperationBuilder() {
        return com.commercetools.importapi.models.errors.InvalidOperationBuilder.of();
    }

    /**
     * builder for invalidScope subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.InvalidScopeErrorBuilder invalidScopeBuilder() {
        return com.commercetools.importapi.models.errors.InvalidScopeErrorBuilder.of();
    }

    /**
     * builder for invalidTransition subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.InvalidStateTransitionErrorBuilder invalidTransitionBuilder() {
        return com.commercetools.importapi.models.errors.InvalidStateTransitionErrorBuilder.of();
    }

    /**
     * builder for invalidToken subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.InvalidTokenErrorBuilder invalidTokenBuilder() {
        return com.commercetools.importapi.models.errors.InvalidTokenErrorBuilder.of();
    }

    /**
     * builder for newMasterVariantAdditionNotAllowed subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.NewMasterVariantAdditionNotAllowedErrorBuilder newMasterVariantAdditionNotAllowedBuilder() {
        return com.commercetools.importapi.models.errors.NewMasterVariantAdditionNotAllowedErrorBuilder.of();
    }

    /**
     * builder for referencedResourceNotFound subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.ReferencedResourceNotFoundBuilder referencedResourceNotFoundBuilder() {
        return com.commercetools.importapi.models.errors.ReferencedResourceNotFoundBuilder.of();
    }

    /**
     * builder for requiredField subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.RequiredFieldErrorBuilder requiredFieldBuilder() {
        return com.commercetools.importapi.models.errors.RequiredFieldErrorBuilder.of();
    }

    /**
     * builder for resourceCreation subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.ResourceCreationErrorBuilder resourceCreationBuilder() {
        return com.commercetools.importapi.models.errors.ResourceCreationErrorBuilder.of();
    }

    /**
     * builder for resourceDeletion subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.ResourceDeletionErrorBuilder resourceDeletionBuilder() {
        return com.commercetools.importapi.models.errors.ResourceDeletionErrorBuilder.of();
    }

    /**
     * builder for resourceNotFound subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.ResourceNotFoundErrorBuilder resourceNotFoundBuilder() {
        return com.commercetools.importapi.models.errors.ResourceNotFoundErrorBuilder.of();
    }

    /**
     * builder for resourceUpdate subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.errors.ResourceUpdateErrorBuilder resourceUpdateBuilder() {
        return com.commercetools.importapi.models.errors.ResourceUpdateErrorBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withErrorObject(Function<ErrorObject, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ErrorObject> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ErrorObject>() {
            @Override
            public String toString() {
                return "TypeReference<ErrorObject>";
            }
        };
    }
}
