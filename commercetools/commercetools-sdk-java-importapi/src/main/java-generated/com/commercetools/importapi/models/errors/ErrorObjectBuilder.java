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
import com.commercetools.importapi.models.errors.ErrorObject;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ErrorObjectBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ErrorObjectBuilder {

    public com.commercetools.importapi.models.errors.AccessDeniedErrorBuilder accessDeniedBuilder() {
       return com.commercetools.importapi.models.errors.AccessDeniedErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.ConcurrentModificationErrorBuilder concurrentModificationBuilder() {
       return com.commercetools.importapi.models.errors.ConcurrentModificationErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.ContentionErrorBuilder contentionBuilder() {
       return com.commercetools.importapi.models.errors.ContentionErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.DuplicateAttributeValueErrorBuilder duplicateAttributeValueBuilder() {
       return com.commercetools.importapi.models.errors.DuplicateAttributeValueErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.DuplicateAttributeValuesErrorBuilder duplicateAttributeValuesBuilder() {
       return com.commercetools.importapi.models.errors.DuplicateAttributeValuesErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.DuplicateFieldErrorBuilder duplicateFieldBuilder() {
       return com.commercetools.importapi.models.errors.DuplicateFieldErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.DuplicateVariantValuesErrorBuilder duplicateVariantValuesBuilder() {
       return com.commercetools.importapi.models.errors.DuplicateVariantValuesErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.GenericErrorBuilder genericBuilder() {
       return com.commercetools.importapi.models.errors.GenericErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.InsufficientScopeErrorBuilder insufficientScopeBuilder() {
       return com.commercetools.importapi.models.errors.InsufficientScopeErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.InvalidCredentialsErrorBuilder invalidCredentialsBuilder() {
       return com.commercetools.importapi.models.errors.InvalidCredentialsErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.InvalidFieldErrorBuilder invalidFieldBuilder() {
       return com.commercetools.importapi.models.errors.InvalidFieldErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.InvalidInputBuilder invalidInputBuilder() {
       return com.commercetools.importapi.models.errors.InvalidInputBuilder.of();
    }
    public com.commercetools.importapi.models.errors.InvalidJsonInputBuilder invalidJsonInputBuilder() {
       return com.commercetools.importapi.models.errors.InvalidJsonInputBuilder.of();
    }
    public com.commercetools.importapi.models.errors.InvalidOperationBuilder invalidOperationBuilder() {
       return com.commercetools.importapi.models.errors.InvalidOperationBuilder.of();
    }
    public com.commercetools.importapi.models.errors.InvalidScopeErrorBuilder invalidScopeBuilder() {
       return com.commercetools.importapi.models.errors.InvalidScopeErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.InvalidStateTransitionErrorBuilder invalidTransitionBuilder() {
       return com.commercetools.importapi.models.errors.InvalidStateTransitionErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.InvalidTokenErrorBuilder invalidTokenBuilder() {
       return com.commercetools.importapi.models.errors.InvalidTokenErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.RequiredFieldErrorBuilder requiredFieldBuilder() {
       return com.commercetools.importapi.models.errors.RequiredFieldErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.ResourceCreationErrorBuilder resourceCreationBuilder() {
       return com.commercetools.importapi.models.errors.ResourceCreationErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.ResourceDeletionErrorBuilder resourceDeletionBuilder() {
       return com.commercetools.importapi.models.errors.ResourceDeletionErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.ResourceNotFoundErrorBuilder resourceNotFoundBuilder() {
       return com.commercetools.importapi.models.errors.ResourceNotFoundErrorBuilder.of();
    }
    public com.commercetools.importapi.models.errors.ResourceUpdateErrorBuilder resourceUpdateBuilder() {
       return com.commercetools.importapi.models.errors.ResourceUpdateErrorBuilder.of();
    }

    /**
     * factory method for an instance of ErrorObjectBuilder
     * @return builder 
     */
    public static ErrorObjectBuilder of() {
        return new ErrorObjectBuilder();
    }

}
