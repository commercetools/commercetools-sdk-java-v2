
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
 *  <p>Base representation of an error response containing common fields to all errors.</p>
 *  <p>An error response may contain additional fields depending on the type of an error, for example, <code>attribute</code> in DuplicateAttributeValueError.</p>
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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = ErrorObjectImpl.class, visible = true)
@JsonDeserialize(as = ErrorObjectImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ErrorObject {

    /**
     *  <p>An error identifier.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    public ErrorObject copyDeep();

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

        if (!(template instanceof ErrorObjectImpl)) {
            return template.copyDeep();
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
