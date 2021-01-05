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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.AccessDeniedErrorImpl.class, name = "access_denied"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.AnonymousIdAlreadyInUseErrorImpl.class, name = "AnonymousIdAlreadyInUse"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsErrorImpl.class, name = "AttributeDefinitionAlreadyExists"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.AttributeDefinitionTypeConflictErrorImpl.class, name = "AttributeDefinitionTypeConflict"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.AttributeNameDoesNotExistErrorImpl.class, name = "AttributeNameDoesNotExist"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ConcurrentModificationErrorImpl.class, name = "ConcurrentModification"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DiscountCodeNonApplicableErrorImpl.class, name = "DiscountCodeNonApplicable"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateAttributeValueErrorImpl.class, name = "DuplicateAttributeValue"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateAttributeValuesErrorImpl.class, name = "DuplicateAttributeValues"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateEnumValuesErrorImpl.class, name = "DuplicateEnumValues"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateFieldErrorImpl.class, name = "DuplicateField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceErrorImpl.class, name = "DuplicateFieldWithConflictingResource"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicatePriceScopeErrorImpl.class, name = "DuplicatePriceScope"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateVariantValuesErrorImpl.class, name = "DuplicateVariantValues"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.EditPreviewFailedErrorImpl.class, name = "EditPreviewFailed"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumKeyAlreadyExistsErrorImpl.class, name = "EnumKeyAlreadyExists"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumKeyDoesNotExistErrorImpl.class, name = "EnumKeyDoesNotExist"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumValueIsUsedErrorImpl.class, name = "EnumValueIsUsed"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumValuesMustMatchErrorImpl.class, name = "EnumValuesMustMatch"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionBadResponseErrorImpl.class, name = "ExtensionBadResponse"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionNoResponseErrorImpl.class, name = "ExtensionNoResponse"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionUpdateActionsFailedErrorImpl.class, name = "ExtensionUpdateActionsFailed"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExternalOAuthFailedErrorImpl.class, name = "ExternalOAuthFailed"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.FeatureRemovedErrorImpl.class, name = "FeatureRemoved"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.GeneralErrorImpl.class, name = "General"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InsufficientScopeErrorImpl.class, name = "insufficient_scope"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InternalConstraintViolatedErrorImpl.class, name = "InternalConstraintViolated"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidCredentialsErrorImpl.class, name = "InvalidCredentials"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidCurrentPasswordErrorImpl.class, name = "InvalidCurrentPassword"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidFieldErrorImpl.class, name = "InvalidField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidInputErrorImpl.class, name = "InvalidInput"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidItemShippingDetailsErrorImpl.class, name = "InvalidItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidJsonInputErrorImpl.class, name = "InvalidJsonInput"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidOperationErrorImpl.class, name = "InvalidOperation"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidSubjectErrorImpl.class, name = "InvalidSubject"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidTokenErrorImpl.class, name = "invalid_token"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.LanguageUsedInStoresErrorImpl.class, name = "LanguageUsedInStores"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.MatchingPriceNotFoundErrorImpl.class, name = "MatchingPriceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.MaxResourceLimitExceededErrorImpl.class, name = "MaxResourceLimitExceeded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.MissingRoleOnChannelErrorImpl.class, name = "MissingRoleOnChannel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.MissingTaxRateForCountryErrorImpl.class, name = "MissingTaxRateForCountry"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorImpl.class, name = "NoMatchingProductDiscountFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.NotEnabledErrorImpl.class, name = "NotEnabled"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ObjectNotFoundErrorImpl.class, name = "ObjectNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.OutOfStockErrorImpl.class, name = "OutOfStock"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.OverCapacityErrorImpl.class, name = "OverCapacity"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.PendingOperationErrorImpl.class, name = "PendingOperation"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.PriceChangedErrorImpl.class, name = "PriceChanged"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesErrorImpl.class, name = "ProjectNotConfiguredForLanguages"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.QueryComplexityLimitExceededErrorImpl.class, name = "QueryComplexityLimitExceeded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.QueryTimedOutErrorImpl.class, name = "QueryTimedOut"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ReferenceExistsErrorImpl.class, name = "ReferenceExists"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ReferencedResourceNotFoundErrorImpl.class, name = "ReferencedResourceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.RequiredFieldErrorImpl.class, name = "RequiredField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ResourceNotFoundErrorImpl.class, name = "ResourceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ResourceSizeLimitExceededErrorImpl.class, name = "ResourceSizeLimitExceeded"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.SearchExecutionFailureErrorImpl.class, name = "SearchExecutionFailure"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.SearchFacetPathNotFoundErrorImpl.class, name = "SearchFacetPathNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.SemanticErrorErrorImpl.class, name = "SemanticError"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartErrorImpl.class, name = "ShippingMethodDoesNotMatchCart"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.SyntaxErrorErrorImpl.class, name = "SyntaxError"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.error.WeakPasswordErrorImpl.class, name = "WeakPassword")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "code",
    defaultImpl = ErrorObjectImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ErrorObject  {

    
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
