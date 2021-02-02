
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.AccessDeniedErrorImpl.class, name = AccessDeniedError.ACCESS_DENIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.AnonymousIdAlreadyInUseErrorImpl.class, name = AnonymousIdAlreadyInUseError.ANONYMOUS_ID_ALREADY_IN_USE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsErrorImpl.class, name = AttributeDefinitionAlreadyExistsError.ATTRIBUTE_DEFINITION_ALREADY_EXISTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.AttributeDefinitionTypeConflictErrorImpl.class, name = AttributeDefinitionTypeConflictError.ATTRIBUTE_DEFINITION_TYPE_CONFLICT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.AttributeNameDoesNotExistErrorImpl.class, name = AttributeNameDoesNotExistError.ATTRIBUTE_NAME_DOES_NOT_EXIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ConcurrentModificationErrorImpl.class, name = ConcurrentModificationError.CONCURRENT_MODIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DiscountCodeNonApplicableErrorImpl.class, name = DiscountCodeNonApplicableError.DISCOUNT_CODE_NON_APPLICABLE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateAttributeValueErrorImpl.class, name = DuplicateAttributeValueError.DUPLICATE_ATTRIBUTE_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateAttributeValuesErrorImpl.class, name = DuplicateAttributeValuesError.DUPLICATE_ATTRIBUTE_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateEnumValuesErrorImpl.class, name = DuplicateEnumValuesError.DUPLICATE_ENUM_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateFieldErrorImpl.class, name = DuplicateFieldError.DUPLICATE_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceErrorImpl.class, name = DuplicateFieldWithConflictingResourceError.DUPLICATE_FIELD_WITH_CONFLICTING_RESOURCE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicatePriceScopeErrorImpl.class, name = DuplicatePriceScopeError.DUPLICATE_PRICE_SCOPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateVariantValuesErrorImpl.class, name = DuplicateVariantValuesError.DUPLICATE_VARIANT_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.EditPreviewFailedErrorImpl.class, name = EditPreviewFailedError.EDIT_PREVIEW_FAILED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumKeyAlreadyExistsErrorImpl.class, name = EnumKeyAlreadyExistsError.ENUM_KEY_ALREADY_EXISTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumKeyDoesNotExistErrorImpl.class, name = EnumKeyDoesNotExistError.ENUM_KEY_DOES_NOT_EXIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumValueIsUsedErrorImpl.class, name = EnumValueIsUsedError.ENUM_VALUE_IS_USED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumValuesMustMatchErrorImpl.class, name = EnumValuesMustMatchError.ENUM_VALUES_MUST_MATCH),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionBadResponseErrorImpl.class, name = ExtensionBadResponseError.EXTENSION_BAD_RESPONSE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionNoResponseErrorImpl.class, name = ExtensionNoResponseError.EXTENSION_NO_RESPONSE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionUpdateActionsFailedErrorImpl.class, name = ExtensionUpdateActionsFailedError.EXTENSION_UPDATE_ACTIONS_FAILED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExternalOAuthFailedErrorImpl.class, name = ExternalOAuthFailedError.EXTERNAL_O_AUTH_FAILED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.FeatureRemovedErrorImpl.class, name = FeatureRemovedError.FEATURE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GeneralErrorImpl.class, name = GeneralError.GENERAL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InsufficientScopeErrorImpl.class, name = InsufficientScopeError.INSUFFICIENT_SCOPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InternalConstraintViolatedErrorImpl.class, name = InternalConstraintViolatedError.INTERNAL_CONSTRAINT_VIOLATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidCredentialsErrorImpl.class, name = InvalidCredentialsError.INVALID_CREDENTIALS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidCurrentPasswordErrorImpl.class, name = InvalidCurrentPasswordError.INVALID_CURRENT_PASSWORD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidFieldErrorImpl.class, name = InvalidFieldError.INVALID_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidInputErrorImpl.class, name = InvalidInputError.INVALID_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidItemShippingDetailsErrorImpl.class, name = InvalidItemShippingDetailsError.INVALID_ITEM_SHIPPING_DETAILS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidJsonInputErrorImpl.class, name = InvalidJsonInputError.INVALID_JSON_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidOperationErrorImpl.class, name = InvalidOperationError.INVALID_OPERATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidSubjectErrorImpl.class, name = InvalidSubjectError.INVALID_SUBJECT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.InvalidTokenErrorImpl.class, name = InvalidTokenError.INVALID_TOKEN),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.LanguageUsedInStoresErrorImpl.class, name = LanguageUsedInStoresError.LANGUAGE_USED_IN_STORES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.MatchingPriceNotFoundErrorImpl.class, name = MatchingPriceNotFoundError.MATCHING_PRICE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.MaxResourceLimitExceededErrorImpl.class, name = MaxResourceLimitExceededError.MAX_RESOURCE_LIMIT_EXCEEDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.MissingRoleOnChannelErrorImpl.class, name = MissingRoleOnChannelError.MISSING_ROLE_ON_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.MissingTaxRateForCountryErrorImpl.class, name = MissingTaxRateForCountryError.MISSING_TAX_RATE_FOR_COUNTRY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorImpl.class, name = NoMatchingProductDiscountFoundError.NO_MATCHING_PRODUCT_DISCOUNT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.NotEnabledErrorImpl.class, name = NotEnabledError.NOT_ENABLED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ObjectNotFoundErrorImpl.class, name = ObjectNotFoundError.OBJECT_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.OutOfStockErrorImpl.class, name = OutOfStockError.OUT_OF_STOCK),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.OverCapacityErrorImpl.class, name = OverCapacityError.OVER_CAPACITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.PendingOperationErrorImpl.class, name = PendingOperationError.PENDING_OPERATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.PriceChangedErrorImpl.class, name = PriceChangedError.PRICE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesErrorImpl.class, name = ProjectNotConfiguredForLanguagesError.PROJECT_NOT_CONFIGURED_FOR_LANGUAGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.QueryComplexityLimitExceededErrorImpl.class, name = QueryComplexityLimitExceededError.QUERY_COMPLEXITY_LIMIT_EXCEEDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.QueryTimedOutErrorImpl.class, name = QueryTimedOutError.QUERY_TIMED_OUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ReferenceExistsErrorImpl.class, name = ReferenceExistsError.REFERENCE_EXISTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ReferencedResourceNotFoundErrorImpl.class, name = ReferencedResourceNotFoundError.REFERENCED_RESOURCE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.RequiredFieldErrorImpl.class, name = RequiredFieldError.REQUIRED_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ResourceNotFoundErrorImpl.class, name = ResourceNotFoundError.RESOURCE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ResourceSizeLimitExceededErrorImpl.class, name = ResourceSizeLimitExceededError.RESOURCE_SIZE_LIMIT_EXCEEDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.SearchExecutionFailureErrorImpl.class, name = SearchExecutionFailureError.SEARCH_EXECUTION_FAILURE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.SearchFacetPathNotFoundErrorImpl.class, name = SearchFacetPathNotFoundError.SEARCH_FACET_PATH_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.SemanticErrorErrorImpl.class, name = SemanticErrorError.SEMANTIC_ERROR),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartErrorImpl.class, name = ShippingMethodDoesNotMatchCartError.SHIPPING_METHOD_DOES_NOT_MATCH_CART),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.SyntaxErrorErrorImpl.class, name = SyntaxErrorError.SYNTAX_ERROR),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.WeakPasswordErrorImpl.class, name = WeakPasswordError.WEAK_PASSWORD) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = ErrorObjectImpl.class, visible = true)
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
