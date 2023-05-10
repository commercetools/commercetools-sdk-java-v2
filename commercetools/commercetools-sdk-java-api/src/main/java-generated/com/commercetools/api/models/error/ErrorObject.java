
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Represents a single error. Multiple errors may be included in an ErrorResponse.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ErrorObject errorObject = ErrorObject.anonymousIdAlreadyInUseBuilder()
 *             message("{message}")
 *
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.AnonymousIdAlreadyInUseErrorImpl.class, name = AnonymousIdAlreadyInUseError.ANONYMOUS_ID_ALREADY_IN_USE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.AssociateMissingPermissionErrorImpl.class, name = AssociateMissingPermissionError.ASSOCIATE_MISSING_PERMISSION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsErrorImpl.class, name = AttributeDefinitionAlreadyExistsError.ATTRIBUTE_DEFINITION_ALREADY_EXISTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.AttributeDefinitionTypeConflictErrorImpl.class, name = AttributeDefinitionTypeConflictError.ATTRIBUTE_DEFINITION_TYPE_CONFLICT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.AttributeNameDoesNotExistErrorImpl.class, name = AttributeNameDoesNotExistError.ATTRIBUTE_NAME_DOES_NOT_EXIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.BadGatewayErrorImpl.class, name = BadGatewayError.BAD_GATEWAY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ConcurrentModificationErrorImpl.class, name = ConcurrentModificationError.CONCURRENT_MODIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.CountryNotConfiguredInStoreErrorImpl.class, name = CountryNotConfiguredInStoreError.COUNTRY_NOT_CONFIGURED_IN_STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DiscountCodeNonApplicableErrorImpl.class, name = DiscountCodeNonApplicableError.DISCOUNT_CODE_NON_APPLICABLE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateAttributeValueErrorImpl.class, name = DuplicateAttributeValueError.DUPLICATE_ATTRIBUTE_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateAttributeValuesErrorImpl.class, name = DuplicateAttributeValuesError.DUPLICATE_ATTRIBUTE_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateEnumValuesErrorImpl.class, name = DuplicateEnumValuesError.DUPLICATE_ENUM_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateFieldErrorImpl.class, name = DuplicateFieldError.DUPLICATE_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceErrorImpl.class, name = DuplicateFieldWithConflictingResourceError.DUPLICATE_FIELD_WITH_CONFLICTING_RESOURCE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicatePriceKeyErrorImpl.class, name = DuplicatePriceKeyError.DUPLICATE_PRICE_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicatePriceScopeErrorImpl.class, name = DuplicatePriceScopeError.DUPLICATE_PRICE_SCOPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateStandalonePriceScopeErrorImpl.class, name = DuplicateStandalonePriceScopeError.DUPLICATE_STANDALONE_PRICE_SCOPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.DuplicateVariantValuesErrorImpl.class, name = DuplicateVariantValuesError.DUPLICATE_VARIANT_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.EditPreviewFailedErrorImpl.class, name = EditPreviewFailedError.EDIT_PREVIEW_FAILED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumKeyAlreadyExistsErrorImpl.class, name = EnumKeyAlreadyExistsError.ENUM_KEY_ALREADY_EXISTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumKeyDoesNotExistErrorImpl.class, name = EnumKeyDoesNotExistError.ENUM_KEY_DOES_NOT_EXIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumValueIsUsedErrorImpl.class, name = EnumValueIsUsedError.ENUM_VALUE_IS_USED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.EnumValuesMustMatchErrorImpl.class, name = EnumValuesMustMatchError.ENUM_VALUES_MUST_MATCH),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionBadResponseErrorImpl.class, name = ExtensionBadResponseError.EXTENSION_BAD_RESPONSE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionNoResponseErrorImpl.class, name = ExtensionNoResponseError.EXTENSION_NO_RESPONSE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedErrorImpl.class, name = ExtensionPredicateEvaluationFailedError.EXTENSION_PREDICATE_EVALUATION_FAILED),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.OverlappingStandalonePriceValidityErrorImpl.class, name = OverlappingStandalonePriceValidityError.OVERLAPPING_STANDALONE_PRICE_VALIDITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.PendingOperationErrorImpl.class, name = PendingOperationError.PENDING_OPERATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.PriceChangedErrorImpl.class, name = PriceChangedError.PRICE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ProductAssignmentMissingErrorImpl.class, name = ProductAssignmentMissingError.PRODUCT_ASSIGNMENT_MISSING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionErrorImpl.class, name = ProductPresentWithDifferentVariantSelectionError.PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesErrorImpl.class, name = ProjectNotConfiguredForLanguagesError.PROJECT_NOT_CONFIGURED_FOR_LANGUAGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.QueryComplexityLimitExceededErrorImpl.class, name = QueryComplexityLimitExceededError.QUERY_COMPLEXITY_LIMIT_EXCEEDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.QueryTimedOutErrorImpl.class, name = QueryTimedOutError.QUERY_TIMED_OUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ReferenceExistsErrorImpl.class, name = ReferenceExistsError.REFERENCE_EXISTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ReferencedResourceNotFoundErrorImpl.class, name = ReferencedResourceNotFoundError.REFERENCED_RESOURCE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.RequiredFieldErrorImpl.class, name = RequiredFieldError.REQUIRED_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ResourceNotFoundErrorImpl.class, name = ResourceNotFoundError.RESOURCE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ResourceSizeLimitExceededErrorImpl.class, name = ResourceSizeLimitExceededError.RESOURCE_SIZE_LIMIT_EXCEEDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.SearchDeactivatedErrorImpl.class, name = SearchDeactivatedError.SEARCH_DEACTIVATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.SearchExecutionFailureErrorImpl.class, name = SearchExecutionFailureError.SEARCH_EXECUTION_FAILURE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.SearchFacetPathNotFoundErrorImpl.class, name = SearchFacetPathNotFoundError.SEARCH_FACET_PATH_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.SearchIndexingInProgressErrorImpl.class, name = SearchIndexingInProgressError.SEARCH_INDEXING_IN_PROGRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.SemanticErrorErrorImpl.class, name = SemanticErrorError.SEMANTIC_ERROR),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartErrorImpl.class, name = ShippingMethodDoesNotMatchCartError.SHIPPING_METHOD_DOES_NOT_MATCH_CART),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.SyntaxErrorErrorImpl.class, name = SyntaxErrorError.SYNTAX_ERROR) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = ErrorObjectImpl.class, visible = true)
@JsonDeserialize(as = ErrorObjectImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ErrorObject {

    /**
     *  <p>Error identifier.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Error-specific additional fields.</p>
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, Object> values();

    /**
     *  <p>Plain text description of the cause of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, Object value);

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
        if (template instanceof com.commercetools.api.models.error.AnonymousIdAlreadyInUseError) {
            return com.commercetools.api.models.error.AnonymousIdAlreadyInUseError
                    .deepCopy((com.commercetools.api.models.error.AnonymousIdAlreadyInUseError) template);
        }
        if (template instanceof com.commercetools.api.models.error.AssociateMissingPermissionError) {
            return com.commercetools.api.models.error.AssociateMissingPermissionError
                    .deepCopy((com.commercetools.api.models.error.AssociateMissingPermissionError) template);
        }
        if (template instanceof com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsError) {
            return com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsError
                    .deepCopy((com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsError) template);
        }
        if (template instanceof com.commercetools.api.models.error.AttributeDefinitionTypeConflictError) {
            return com.commercetools.api.models.error.AttributeDefinitionTypeConflictError
                    .deepCopy((com.commercetools.api.models.error.AttributeDefinitionTypeConflictError) template);
        }
        if (template instanceof com.commercetools.api.models.error.AttributeNameDoesNotExistError) {
            return com.commercetools.api.models.error.AttributeNameDoesNotExistError
                    .deepCopy((com.commercetools.api.models.error.AttributeNameDoesNotExistError) template);
        }
        if (template instanceof com.commercetools.api.models.error.BadGatewayError) {
            return com.commercetools.api.models.error.BadGatewayError
                    .deepCopy((com.commercetools.api.models.error.BadGatewayError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ConcurrentModificationError) {
            return com.commercetools.api.models.error.ConcurrentModificationError
                    .deepCopy((com.commercetools.api.models.error.ConcurrentModificationError) template);
        }
        if (template instanceof com.commercetools.api.models.error.CountryNotConfiguredInStoreError) {
            return com.commercetools.api.models.error.CountryNotConfiguredInStoreError
                    .deepCopy((com.commercetools.api.models.error.CountryNotConfiguredInStoreError) template);
        }
        if (template instanceof com.commercetools.api.models.error.DiscountCodeNonApplicableError) {
            return com.commercetools.api.models.error.DiscountCodeNonApplicableError
                    .deepCopy((com.commercetools.api.models.error.DiscountCodeNonApplicableError) template);
        }
        if (template instanceof com.commercetools.api.models.error.DuplicateAttributeValueError) {
            return com.commercetools.api.models.error.DuplicateAttributeValueError
                    .deepCopy((com.commercetools.api.models.error.DuplicateAttributeValueError) template);
        }
        if (template instanceof com.commercetools.api.models.error.DuplicateAttributeValuesError) {
            return com.commercetools.api.models.error.DuplicateAttributeValuesError
                    .deepCopy((com.commercetools.api.models.error.DuplicateAttributeValuesError) template);
        }
        if (template instanceof com.commercetools.api.models.error.DuplicateEnumValuesError) {
            return com.commercetools.api.models.error.DuplicateEnumValuesError
                    .deepCopy((com.commercetools.api.models.error.DuplicateEnumValuesError) template);
        }
        if (template instanceof com.commercetools.api.models.error.DuplicateFieldError) {
            return com.commercetools.api.models.error.DuplicateFieldError
                    .deepCopy((com.commercetools.api.models.error.DuplicateFieldError) template);
        }
        if (template instanceof com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceError) {
            return com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceError
                    .deepCopy((com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceError) template);
        }
        if (template instanceof com.commercetools.api.models.error.DuplicatePriceKeyError) {
            return com.commercetools.api.models.error.DuplicatePriceKeyError
                    .deepCopy((com.commercetools.api.models.error.DuplicatePriceKeyError) template);
        }
        if (template instanceof com.commercetools.api.models.error.DuplicatePriceScopeError) {
            return com.commercetools.api.models.error.DuplicatePriceScopeError
                    .deepCopy((com.commercetools.api.models.error.DuplicatePriceScopeError) template);
        }
        if (template instanceof com.commercetools.api.models.error.DuplicateStandalonePriceScopeError) {
            return com.commercetools.api.models.error.DuplicateStandalonePriceScopeError
                    .deepCopy((com.commercetools.api.models.error.DuplicateStandalonePriceScopeError) template);
        }
        if (template instanceof com.commercetools.api.models.error.DuplicateVariantValuesError) {
            return com.commercetools.api.models.error.DuplicateVariantValuesError
                    .deepCopy((com.commercetools.api.models.error.DuplicateVariantValuesError) template);
        }
        if (template instanceof com.commercetools.api.models.error.EditPreviewFailedError) {
            return com.commercetools.api.models.error.EditPreviewFailedError
                    .deepCopy((com.commercetools.api.models.error.EditPreviewFailedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.EnumKeyAlreadyExistsError) {
            return com.commercetools.api.models.error.EnumKeyAlreadyExistsError
                    .deepCopy((com.commercetools.api.models.error.EnumKeyAlreadyExistsError) template);
        }
        if (template instanceof com.commercetools.api.models.error.EnumKeyDoesNotExistError) {
            return com.commercetools.api.models.error.EnumKeyDoesNotExistError
                    .deepCopy((com.commercetools.api.models.error.EnumKeyDoesNotExistError) template);
        }
        if (template instanceof com.commercetools.api.models.error.EnumValueIsUsedError) {
            return com.commercetools.api.models.error.EnumValueIsUsedError
                    .deepCopy((com.commercetools.api.models.error.EnumValueIsUsedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.EnumValuesMustMatchError) {
            return com.commercetools.api.models.error.EnumValuesMustMatchError
                    .deepCopy((com.commercetools.api.models.error.EnumValuesMustMatchError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ExtensionBadResponseError) {
            return com.commercetools.api.models.error.ExtensionBadResponseError
                    .deepCopy((com.commercetools.api.models.error.ExtensionBadResponseError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ExtensionNoResponseError) {
            return com.commercetools.api.models.error.ExtensionNoResponseError
                    .deepCopy((com.commercetools.api.models.error.ExtensionNoResponseError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedError) {
            return com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedError
                    .deepCopy((com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ExtensionUpdateActionsFailedError) {
            return com.commercetools.api.models.error.ExtensionUpdateActionsFailedError
                    .deepCopy((com.commercetools.api.models.error.ExtensionUpdateActionsFailedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ExternalOAuthFailedError) {
            return com.commercetools.api.models.error.ExternalOAuthFailedError
                    .deepCopy((com.commercetools.api.models.error.ExternalOAuthFailedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.FeatureRemovedError) {
            return com.commercetools.api.models.error.FeatureRemovedError
                    .deepCopy((com.commercetools.api.models.error.FeatureRemovedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GeneralError) {
            return com.commercetools.api.models.error.GeneralError
                    .deepCopy((com.commercetools.api.models.error.GeneralError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InsufficientScopeError) {
            return com.commercetools.api.models.error.InsufficientScopeError
                    .deepCopy((com.commercetools.api.models.error.InsufficientScopeError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InternalConstraintViolatedError) {
            return com.commercetools.api.models.error.InternalConstraintViolatedError
                    .deepCopy((com.commercetools.api.models.error.InternalConstraintViolatedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InvalidCredentialsError) {
            return com.commercetools.api.models.error.InvalidCredentialsError
                    .deepCopy((com.commercetools.api.models.error.InvalidCredentialsError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InvalidCurrentPasswordError) {
            return com.commercetools.api.models.error.InvalidCurrentPasswordError
                    .deepCopy((com.commercetools.api.models.error.InvalidCurrentPasswordError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InvalidFieldError) {
            return com.commercetools.api.models.error.InvalidFieldError
                    .deepCopy((com.commercetools.api.models.error.InvalidFieldError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InvalidInputError) {
            return com.commercetools.api.models.error.InvalidInputError
                    .deepCopy((com.commercetools.api.models.error.InvalidInputError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InvalidItemShippingDetailsError) {
            return com.commercetools.api.models.error.InvalidItemShippingDetailsError
                    .deepCopy((com.commercetools.api.models.error.InvalidItemShippingDetailsError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InvalidJsonInputError) {
            return com.commercetools.api.models.error.InvalidJsonInputError
                    .deepCopy((com.commercetools.api.models.error.InvalidJsonInputError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InvalidOperationError) {
            return com.commercetools.api.models.error.InvalidOperationError
                    .deepCopy((com.commercetools.api.models.error.InvalidOperationError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InvalidSubjectError) {
            return com.commercetools.api.models.error.InvalidSubjectError
                    .deepCopy((com.commercetools.api.models.error.InvalidSubjectError) template);
        }
        if (template instanceof com.commercetools.api.models.error.InvalidTokenError) {
            return com.commercetools.api.models.error.InvalidTokenError
                    .deepCopy((com.commercetools.api.models.error.InvalidTokenError) template);
        }
        if (template instanceof com.commercetools.api.models.error.LanguageUsedInStoresError) {
            return com.commercetools.api.models.error.LanguageUsedInStoresError
                    .deepCopy((com.commercetools.api.models.error.LanguageUsedInStoresError) template);
        }
        if (template instanceof com.commercetools.api.models.error.MatchingPriceNotFoundError) {
            return com.commercetools.api.models.error.MatchingPriceNotFoundError
                    .deepCopy((com.commercetools.api.models.error.MatchingPriceNotFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.MaxResourceLimitExceededError) {
            return com.commercetools.api.models.error.MaxResourceLimitExceededError
                    .deepCopy((com.commercetools.api.models.error.MaxResourceLimitExceededError) template);
        }
        if (template instanceof com.commercetools.api.models.error.MissingRoleOnChannelError) {
            return com.commercetools.api.models.error.MissingRoleOnChannelError
                    .deepCopy((com.commercetools.api.models.error.MissingRoleOnChannelError) template);
        }
        if (template instanceof com.commercetools.api.models.error.MissingTaxRateForCountryError) {
            return com.commercetools.api.models.error.MissingTaxRateForCountryError
                    .deepCopy((com.commercetools.api.models.error.MissingTaxRateForCountryError) template);
        }
        if (template instanceof com.commercetools.api.models.error.NoMatchingProductDiscountFoundError) {
            return com.commercetools.api.models.error.NoMatchingProductDiscountFoundError
                    .deepCopy((com.commercetools.api.models.error.NoMatchingProductDiscountFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.NotEnabledError) {
            return com.commercetools.api.models.error.NotEnabledError
                    .deepCopy((com.commercetools.api.models.error.NotEnabledError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ObjectNotFoundError) {
            return com.commercetools.api.models.error.ObjectNotFoundError
                    .deepCopy((com.commercetools.api.models.error.ObjectNotFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.OutOfStockError) {
            return com.commercetools.api.models.error.OutOfStockError
                    .deepCopy((com.commercetools.api.models.error.OutOfStockError) template);
        }
        if (template instanceof com.commercetools.api.models.error.OverCapacityError) {
            return com.commercetools.api.models.error.OverCapacityError
                    .deepCopy((com.commercetools.api.models.error.OverCapacityError) template);
        }
        if (template instanceof com.commercetools.api.models.error.OverlappingStandalonePriceValidityError) {
            return com.commercetools.api.models.error.OverlappingStandalonePriceValidityError
                    .deepCopy((com.commercetools.api.models.error.OverlappingStandalonePriceValidityError) template);
        }
        if (template instanceof com.commercetools.api.models.error.PendingOperationError) {
            return com.commercetools.api.models.error.PendingOperationError
                    .deepCopy((com.commercetools.api.models.error.PendingOperationError) template);
        }
        if (template instanceof com.commercetools.api.models.error.PriceChangedError) {
            return com.commercetools.api.models.error.PriceChangedError
                    .deepCopy((com.commercetools.api.models.error.PriceChangedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ProductAssignmentMissingError) {
            return com.commercetools.api.models.error.ProductAssignmentMissingError
                    .deepCopy((com.commercetools.api.models.error.ProductAssignmentMissingError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionError) {
            return com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionError.deepCopy(
                (com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesError) {
            return com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesError
                    .deepCopy((com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesError) template);
        }
        if (template instanceof com.commercetools.api.models.error.QueryComplexityLimitExceededError) {
            return com.commercetools.api.models.error.QueryComplexityLimitExceededError
                    .deepCopy((com.commercetools.api.models.error.QueryComplexityLimitExceededError) template);
        }
        if (template instanceof com.commercetools.api.models.error.QueryTimedOutError) {
            return com.commercetools.api.models.error.QueryTimedOutError
                    .deepCopy((com.commercetools.api.models.error.QueryTimedOutError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ReferenceExistsError) {
            return com.commercetools.api.models.error.ReferenceExistsError
                    .deepCopy((com.commercetools.api.models.error.ReferenceExistsError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ReferencedResourceNotFoundError) {
            return com.commercetools.api.models.error.ReferencedResourceNotFoundError
                    .deepCopy((com.commercetools.api.models.error.ReferencedResourceNotFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.RequiredFieldError) {
            return com.commercetools.api.models.error.RequiredFieldError
                    .deepCopy((com.commercetools.api.models.error.RequiredFieldError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ResourceNotFoundError) {
            return com.commercetools.api.models.error.ResourceNotFoundError
                    .deepCopy((com.commercetools.api.models.error.ResourceNotFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ResourceSizeLimitExceededError) {
            return com.commercetools.api.models.error.ResourceSizeLimitExceededError
                    .deepCopy((com.commercetools.api.models.error.ResourceSizeLimitExceededError) template);
        }
        if (template instanceof com.commercetools.api.models.error.SearchDeactivatedError) {
            return com.commercetools.api.models.error.SearchDeactivatedError
                    .deepCopy((com.commercetools.api.models.error.SearchDeactivatedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.SearchExecutionFailureError) {
            return com.commercetools.api.models.error.SearchExecutionFailureError
                    .deepCopy((com.commercetools.api.models.error.SearchExecutionFailureError) template);
        }
        if (template instanceof com.commercetools.api.models.error.SearchFacetPathNotFoundError) {
            return com.commercetools.api.models.error.SearchFacetPathNotFoundError
                    .deepCopy((com.commercetools.api.models.error.SearchFacetPathNotFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.SearchIndexingInProgressError) {
            return com.commercetools.api.models.error.SearchIndexingInProgressError
                    .deepCopy((com.commercetools.api.models.error.SearchIndexingInProgressError) template);
        }
        if (template instanceof com.commercetools.api.models.error.SemanticErrorError) {
            return com.commercetools.api.models.error.SemanticErrorError
                    .deepCopy((com.commercetools.api.models.error.SemanticErrorError) template);
        }
        if (template instanceof com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartError) {
            return com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartError
                    .deepCopy((com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartError) template);
        }
        if (template instanceof com.commercetools.api.models.error.SyntaxErrorError) {
            return com.commercetools.api.models.error.SyntaxErrorError
                    .deepCopy((com.commercetools.api.models.error.SyntaxErrorError) template);
        }
        ErrorObjectImpl instance = new ErrorObjectImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder for anonymousIdAlreadyInUse subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.AnonymousIdAlreadyInUseErrorBuilder anonymousIdAlreadyInUseBuilder() {
        return com.commercetools.api.models.error.AnonymousIdAlreadyInUseErrorBuilder.of();
    }

    /**
     * builder for associateMissingPermission subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.AssociateMissingPermissionErrorBuilder associateMissingPermissionBuilder() {
        return com.commercetools.api.models.error.AssociateMissingPermissionErrorBuilder.of();
    }

    /**
     * builder for attributeDefinitionAlreadyExists subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsErrorBuilder attributeDefinitionAlreadyExistsBuilder() {
        return com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsErrorBuilder.of();
    }

    /**
     * builder for attributeDefinitionTypeConflict subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.AttributeDefinitionTypeConflictErrorBuilder attributeDefinitionTypeConflictBuilder() {
        return com.commercetools.api.models.error.AttributeDefinitionTypeConflictErrorBuilder.of();
    }

    /**
     * builder for attributeNameDoesNotExist subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.AttributeNameDoesNotExistErrorBuilder attributeNameDoesNotExistBuilder() {
        return com.commercetools.api.models.error.AttributeNameDoesNotExistErrorBuilder.of();
    }

    /**
     * builder for badGateway subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.BadGatewayErrorBuilder badGatewayBuilder() {
        return com.commercetools.api.models.error.BadGatewayErrorBuilder.of();
    }

    /**
     * builder for concurrentModification subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ConcurrentModificationErrorBuilder concurrentModificationBuilder() {
        return com.commercetools.api.models.error.ConcurrentModificationErrorBuilder.of();
    }

    /**
     * builder for countryNotConfiguredInStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.CountryNotConfiguredInStoreErrorBuilder countryNotConfiguredInStoreBuilder() {
        return com.commercetools.api.models.error.CountryNotConfiguredInStoreErrorBuilder.of();
    }

    /**
     * builder for discountCodeNonApplicable subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.DiscountCodeNonApplicableErrorBuilder discountCodeNonApplicableBuilder() {
        return com.commercetools.api.models.error.DiscountCodeNonApplicableErrorBuilder.of();
    }

    /**
     * builder for duplicateAttributeValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.DuplicateAttributeValueErrorBuilder duplicateAttributeValueBuilder() {
        return com.commercetools.api.models.error.DuplicateAttributeValueErrorBuilder.of();
    }

    /**
     * builder for duplicateAttributeValues subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.DuplicateAttributeValuesErrorBuilder duplicateAttributeValuesBuilder() {
        return com.commercetools.api.models.error.DuplicateAttributeValuesErrorBuilder.of();
    }

    /**
     * builder for duplicateEnumValues subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.DuplicateEnumValuesErrorBuilder duplicateEnumValuesBuilder() {
        return com.commercetools.api.models.error.DuplicateEnumValuesErrorBuilder.of();
    }

    /**
     * builder for duplicateField subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.DuplicateFieldErrorBuilder duplicateFieldBuilder() {
        return com.commercetools.api.models.error.DuplicateFieldErrorBuilder.of();
    }

    /**
     * builder for duplicateFieldWithConflictingResource subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceErrorBuilder duplicateFieldWithConflictingResourceBuilder() {
        return com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceErrorBuilder.of();
    }

    /**
     * builder for duplicatePriceKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.DuplicatePriceKeyErrorBuilder duplicatePriceKeyBuilder() {
        return com.commercetools.api.models.error.DuplicatePriceKeyErrorBuilder.of();
    }

    /**
     * builder for duplicatePriceScope subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.DuplicatePriceScopeErrorBuilder duplicatePriceScopeBuilder() {
        return com.commercetools.api.models.error.DuplicatePriceScopeErrorBuilder.of();
    }

    /**
     * builder for duplicateStandalonePriceScope subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.DuplicateStandalonePriceScopeErrorBuilder duplicateStandalonePriceScopeBuilder() {
        return com.commercetools.api.models.error.DuplicateStandalonePriceScopeErrorBuilder.of();
    }

    /**
     * builder for duplicateVariantValues subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.DuplicateVariantValuesErrorBuilder duplicateVariantValuesBuilder() {
        return com.commercetools.api.models.error.DuplicateVariantValuesErrorBuilder.of();
    }

    /**
     * builder for editPreviewFailed subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.EditPreviewFailedErrorBuilder editPreviewFailedBuilder() {
        return com.commercetools.api.models.error.EditPreviewFailedErrorBuilder.of();
    }

    /**
     * builder for enumKeyAlreadyExists subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.EnumKeyAlreadyExistsErrorBuilder enumKeyAlreadyExistsBuilder() {
        return com.commercetools.api.models.error.EnumKeyAlreadyExistsErrorBuilder.of();
    }

    /**
     * builder for enumKeyDoesNotExist subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.EnumKeyDoesNotExistErrorBuilder enumKeyDoesNotExistBuilder() {
        return com.commercetools.api.models.error.EnumKeyDoesNotExistErrorBuilder.of();
    }

    /**
     * builder for enumValueIsUsed subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.EnumValueIsUsedErrorBuilder enumValueIsUsedBuilder() {
        return com.commercetools.api.models.error.EnumValueIsUsedErrorBuilder.of();
    }

    /**
     * builder for enumValuesMustMatch subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.EnumValuesMustMatchErrorBuilder enumValuesMustMatchBuilder() {
        return com.commercetools.api.models.error.EnumValuesMustMatchErrorBuilder.of();
    }

    /**
     * builder for extensionBadResponse subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ExtensionBadResponseErrorBuilder extensionBadResponseBuilder() {
        return com.commercetools.api.models.error.ExtensionBadResponseErrorBuilder.of();
    }

    /**
     * builder for extensionNoResponse subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ExtensionNoResponseErrorBuilder extensionNoResponseBuilder() {
        return com.commercetools.api.models.error.ExtensionNoResponseErrorBuilder.of();
    }

    /**
     * builder for extensionPredicateEvaluationFailed subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedErrorBuilder extensionPredicateEvaluationFailedBuilder() {
        return com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedErrorBuilder.of();
    }

    /**
     * builder for extensionUpdateActionsFailed subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ExtensionUpdateActionsFailedErrorBuilder extensionUpdateActionsFailedBuilder() {
        return com.commercetools.api.models.error.ExtensionUpdateActionsFailedErrorBuilder.of();
    }

    /**
     * builder for externalOAuthFailed subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ExternalOAuthFailedErrorBuilder externalOAuthFailedBuilder() {
        return com.commercetools.api.models.error.ExternalOAuthFailedErrorBuilder.of();
    }

    /**
     * builder for featureRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.FeatureRemovedErrorBuilder featureRemovedBuilder() {
        return com.commercetools.api.models.error.FeatureRemovedErrorBuilder.of();
    }

    /**
     * builder for general subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GeneralErrorBuilder generalBuilder() {
        return com.commercetools.api.models.error.GeneralErrorBuilder.of();
    }

    /**
     * builder for insufficientScope subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InsufficientScopeErrorBuilder insufficientScopeBuilder() {
        return com.commercetools.api.models.error.InsufficientScopeErrorBuilder.of();
    }

    /**
     * builder for internalConstraintViolated subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InternalConstraintViolatedErrorBuilder internalConstraintViolatedBuilder() {
        return com.commercetools.api.models.error.InternalConstraintViolatedErrorBuilder.of();
    }

    /**
     * builder for invalidCredentials subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InvalidCredentialsErrorBuilder invalidCredentialsBuilder() {
        return com.commercetools.api.models.error.InvalidCredentialsErrorBuilder.of();
    }

    /**
     * builder for invalidCurrentPassword subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InvalidCurrentPasswordErrorBuilder invalidCurrentPasswordBuilder() {
        return com.commercetools.api.models.error.InvalidCurrentPasswordErrorBuilder.of();
    }

    /**
     * builder for invalidField subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InvalidFieldErrorBuilder invalidFieldBuilder() {
        return com.commercetools.api.models.error.InvalidFieldErrorBuilder.of();
    }

    /**
     * builder for invalidInput subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InvalidInputErrorBuilder invalidInputBuilder() {
        return com.commercetools.api.models.error.InvalidInputErrorBuilder.of();
    }

    /**
     * builder for invalidItemShippingDetails subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InvalidItemShippingDetailsErrorBuilder invalidItemShippingDetailsBuilder() {
        return com.commercetools.api.models.error.InvalidItemShippingDetailsErrorBuilder.of();
    }

    /**
     * builder for invalidJsonInput subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InvalidJsonInputErrorBuilder invalidJsonInputBuilder() {
        return com.commercetools.api.models.error.InvalidJsonInputErrorBuilder.of();
    }

    /**
     * builder for invalidOperation subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InvalidOperationErrorBuilder invalidOperationBuilder() {
        return com.commercetools.api.models.error.InvalidOperationErrorBuilder.of();
    }

    /**
     * builder for invalidSubject subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InvalidSubjectErrorBuilder invalidSubjectBuilder() {
        return com.commercetools.api.models.error.InvalidSubjectErrorBuilder.of();
    }

    /**
     * builder for invalidToken subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.InvalidTokenErrorBuilder invalidTokenBuilder() {
        return com.commercetools.api.models.error.InvalidTokenErrorBuilder.of();
    }

    /**
     * builder for languageUsedInStores subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.LanguageUsedInStoresErrorBuilder languageUsedInStoresBuilder() {
        return com.commercetools.api.models.error.LanguageUsedInStoresErrorBuilder.of();
    }

    /**
     * builder for matchingPriceNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.MatchingPriceNotFoundErrorBuilder matchingPriceNotFoundBuilder() {
        return com.commercetools.api.models.error.MatchingPriceNotFoundErrorBuilder.of();
    }

    /**
     * builder for maxResourceLimitExceeded subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.MaxResourceLimitExceededErrorBuilder maxResourceLimitExceededBuilder() {
        return com.commercetools.api.models.error.MaxResourceLimitExceededErrorBuilder.of();
    }

    /**
     * builder for missingRoleOnChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.MissingRoleOnChannelErrorBuilder missingRoleOnChannelBuilder() {
        return com.commercetools.api.models.error.MissingRoleOnChannelErrorBuilder.of();
    }

    /**
     * builder for missingTaxRateForCountry subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.MissingTaxRateForCountryErrorBuilder missingTaxRateForCountryBuilder() {
        return com.commercetools.api.models.error.MissingTaxRateForCountryErrorBuilder.of();
    }

    /**
     * builder for noMatchingProductDiscountFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorBuilder noMatchingProductDiscountFoundBuilder() {
        return com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorBuilder.of();
    }

    /**
     * builder for notEnabled subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.NotEnabledErrorBuilder notEnabledBuilder() {
        return com.commercetools.api.models.error.NotEnabledErrorBuilder.of();
    }

    /**
     * builder for objectNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ObjectNotFoundErrorBuilder objectNotFoundBuilder() {
        return com.commercetools.api.models.error.ObjectNotFoundErrorBuilder.of();
    }

    /**
     * builder for outOfStock subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.OutOfStockErrorBuilder outOfStockBuilder() {
        return com.commercetools.api.models.error.OutOfStockErrorBuilder.of();
    }

    /**
     * builder for overCapacity subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.OverCapacityErrorBuilder overCapacityBuilder() {
        return com.commercetools.api.models.error.OverCapacityErrorBuilder.of();
    }

    /**
     * builder for overlappingStandalonePriceValidity subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.OverlappingStandalonePriceValidityErrorBuilder overlappingStandalonePriceValidityBuilder() {
        return com.commercetools.api.models.error.OverlappingStandalonePriceValidityErrorBuilder.of();
    }

    /**
     * builder for pendingOperation subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.PendingOperationErrorBuilder pendingOperationBuilder() {
        return com.commercetools.api.models.error.PendingOperationErrorBuilder.of();
    }

    /**
     * builder for priceChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.PriceChangedErrorBuilder priceChangedBuilder() {
        return com.commercetools.api.models.error.PriceChangedErrorBuilder.of();
    }

    /**
     * builder for productAssignmentMissing subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ProductAssignmentMissingErrorBuilder productAssignmentMissingBuilder() {
        return com.commercetools.api.models.error.ProductAssignmentMissingErrorBuilder.of();
    }

    /**
     * builder for productPresentWithDifferentVariantSelection subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionErrorBuilder productPresentWithDifferentVariantSelectionBuilder() {
        return com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionErrorBuilder.of();
    }

    /**
     * builder for projectNotConfiguredForLanguages subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesErrorBuilder projectNotConfiguredForLanguagesBuilder() {
        return com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesErrorBuilder.of();
    }

    /**
     * builder for queryComplexityLimitExceeded subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.QueryComplexityLimitExceededErrorBuilder queryComplexityLimitExceededBuilder() {
        return com.commercetools.api.models.error.QueryComplexityLimitExceededErrorBuilder.of();
    }

    /**
     * builder for queryTimedOut subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.QueryTimedOutErrorBuilder queryTimedOutBuilder() {
        return com.commercetools.api.models.error.QueryTimedOutErrorBuilder.of();
    }

    /**
     * builder for referenceExists subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ReferenceExistsErrorBuilder referenceExistsBuilder() {
        return com.commercetools.api.models.error.ReferenceExistsErrorBuilder.of();
    }

    /**
     * builder for referencedResourceNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ReferencedResourceNotFoundErrorBuilder referencedResourceNotFoundBuilder() {
        return com.commercetools.api.models.error.ReferencedResourceNotFoundErrorBuilder.of();
    }

    /**
     * builder for requiredField subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.RequiredFieldErrorBuilder requiredFieldBuilder() {
        return com.commercetools.api.models.error.RequiredFieldErrorBuilder.of();
    }

    /**
     * builder for resourceNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ResourceNotFoundErrorBuilder resourceNotFoundBuilder() {
        return com.commercetools.api.models.error.ResourceNotFoundErrorBuilder.of();
    }

    /**
     * builder for resourceSizeLimitExceeded subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ResourceSizeLimitExceededErrorBuilder resourceSizeLimitExceededBuilder() {
        return com.commercetools.api.models.error.ResourceSizeLimitExceededErrorBuilder.of();
    }

    /**
     * builder for searchDeactivated subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.SearchDeactivatedErrorBuilder searchDeactivatedBuilder() {
        return com.commercetools.api.models.error.SearchDeactivatedErrorBuilder.of();
    }

    /**
     * builder for searchExecutionFailure subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.SearchExecutionFailureErrorBuilder searchExecutionFailureBuilder() {
        return com.commercetools.api.models.error.SearchExecutionFailureErrorBuilder.of();
    }

    /**
     * builder for searchFacetPathNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.SearchFacetPathNotFoundErrorBuilder searchFacetPathNotFoundBuilder() {
        return com.commercetools.api.models.error.SearchFacetPathNotFoundErrorBuilder.of();
    }

    /**
     * builder for searchIndexingInProgress subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.SearchIndexingInProgressErrorBuilder searchIndexingInProgressBuilder() {
        return com.commercetools.api.models.error.SearchIndexingInProgressErrorBuilder.of();
    }

    /**
     * builder for semanticError subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.SemanticErrorErrorBuilder semanticErrorBuilder() {
        return com.commercetools.api.models.error.SemanticErrorErrorBuilder.of();
    }

    /**
     * builder for shippingMethodDoesNotMatchCart subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartErrorBuilder shippingMethodDoesNotMatchCartBuilder() {
        return com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartErrorBuilder.of();
    }

    /**
     * builder for syntaxError subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.SyntaxErrorErrorBuilder syntaxErrorBuilder() {
        return com.commercetools.api.models.error.SyntaxErrorErrorBuilder.of();
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
