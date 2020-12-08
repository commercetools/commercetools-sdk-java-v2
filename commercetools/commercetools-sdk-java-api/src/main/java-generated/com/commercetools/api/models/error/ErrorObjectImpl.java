package com.commercetools.api.models.error;

import com.commercetools.api.models.error.AccessDeniedError;
import com.commercetools.api.models.error.AnonymousIdAlreadyInUseError;
import com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsError;
import com.commercetools.api.models.error.AttributeDefinitionTypeConflictError;
import com.commercetools.api.models.error.AttributeNameDoesNotExistError;
import com.commercetools.api.models.error.ConcurrentModificationError;
import com.commercetools.api.models.error.DiscountCodeNonApplicableError;
import com.commercetools.api.models.error.DuplicateAttributeValueError;
import com.commercetools.api.models.error.DuplicateAttributeValuesError;
import com.commercetools.api.models.error.DuplicateEnumValuesError;
import com.commercetools.api.models.error.DuplicateFieldError;
import com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceError;
import com.commercetools.api.models.error.DuplicatePriceScopeError;
import com.commercetools.api.models.error.DuplicateVariantValuesError;
import com.commercetools.api.models.error.EditPreviewFailedError;
import com.commercetools.api.models.error.EnumKeyAlreadyExistsError;
import com.commercetools.api.models.error.EnumKeyDoesNotExistError;
import com.commercetools.api.models.error.EnumValueIsUsedError;
import com.commercetools.api.models.error.EnumValuesMustMatchError;
import com.commercetools.api.models.error.ExtensionBadResponseError;
import com.commercetools.api.models.error.ExtensionNoResponseError;
import com.commercetools.api.models.error.ExtensionUpdateActionsFailedError;
import com.commercetools.api.models.error.ExternalOAuthFailedError;
import com.commercetools.api.models.error.FeatureRemovedError;
import com.commercetools.api.models.error.GeneralError;
import com.commercetools.api.models.error.InsufficientScopeError;
import com.commercetools.api.models.error.InternalConstraintViolatedError;
import com.commercetools.api.models.error.InvalidCredentialsError;
import com.commercetools.api.models.error.InvalidCurrentPasswordError;
import com.commercetools.api.models.error.InvalidFieldError;
import com.commercetools.api.models.error.InvalidInputError;
import com.commercetools.api.models.error.InvalidItemShippingDetailsError;
import com.commercetools.api.models.error.InvalidJsonInputError;
import com.commercetools.api.models.error.InvalidOperationError;
import com.commercetools.api.models.error.InvalidSubjectError;
import com.commercetools.api.models.error.InvalidTokenError;
import com.commercetools.api.models.error.LanguageUsedInStoresError;
import com.commercetools.api.models.error.MatchingPriceNotFoundError;
import com.commercetools.api.models.error.MaxResourceLimitExceededError;
import com.commercetools.api.models.error.MissingRoleOnChannelError;
import com.commercetools.api.models.error.MissingTaxRateForCountryError;
import com.commercetools.api.models.error.NoMatchingProductDiscountFoundError;
import com.commercetools.api.models.error.NotEnabledError;
import com.commercetools.api.models.error.ObjectNotFoundError;
import com.commercetools.api.models.error.OutOfStockError;
import com.commercetools.api.models.error.OverCapacityError;
import com.commercetools.api.models.error.PendingOperationError;
import com.commercetools.api.models.error.PriceChangedError;
import com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesError;
import com.commercetools.api.models.error.QueryComplexityLimitExceededError;
import com.commercetools.api.models.error.QueryTimedOutError;
import com.commercetools.api.models.error.ReferenceExistsError;
import com.commercetools.api.models.error.ReferencedResourceNotFoundError;
import com.commercetools.api.models.error.RequiredFieldError;
import com.commercetools.api.models.error.ResourceNotFoundError;
import com.commercetools.api.models.error.ResourceSizeLimitExceededError;
import com.commercetools.api.models.error.SearchExecutionFailureError;
import com.commercetools.api.models.error.SearchFacetPathNotFoundError;
import com.commercetools.api.models.error.SemanticErrorError;
import com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartError;
import com.commercetools.api.models.error.SyntaxErrorError;
import com.commercetools.api.models.error.WeakPasswordError;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ErrorObjectImpl implements ErrorObject {

    private String code;
    
    private String message;

    @JsonCreator
    ErrorObjectImpl(@JsonProperty("code") final String code, @JsonProperty("message") final String message) {
        this.code = code;
        this.message = message;
    }
    public ErrorObjectImpl() {
    }

    
    public String getCode(){
        return this.code;
    }
    
    
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
