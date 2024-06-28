
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents a single error.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLErrorObject graphQLErrorObject = GraphQLErrorObject.anonymousIdAlreadyInUseBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLAnonymousIdAlreadyInUseErrorImpl.class, name = GraphQLAnonymousIdAlreadyInUseError.ANONYMOUS_ID_ALREADY_IN_USE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLAssociateMissingPermissionErrorImpl.class, name = GraphQLAssociateMissingPermissionError.ASSOCIATE_MISSING_PERMISSION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLAttributeDefinitionAlreadyExistsErrorImpl.class, name = GraphQLAttributeDefinitionAlreadyExistsError.ATTRIBUTE_DEFINITION_ALREADY_EXISTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLAttributeDefinitionTypeConflictErrorImpl.class, name = GraphQLAttributeDefinitionTypeConflictError.ATTRIBUTE_DEFINITION_TYPE_CONFLICT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLAttributeNameDoesNotExistErrorImpl.class, name = GraphQLAttributeNameDoesNotExistError.ATTRIBUTE_NAME_DOES_NOT_EXIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLBadGatewayErrorImpl.class, name = GraphQLBadGatewayError.BAD_GATEWAY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLConcurrentModificationErrorImpl.class, name = GraphQLConcurrentModificationError.CONCURRENT_MODIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLContentTooLargeErrorImpl.class, name = GraphQLContentTooLargeError.CONTENT_TOO_LARGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLCountryNotConfiguredInStoreErrorImpl.class, name = GraphQLCountryNotConfiguredInStoreError.COUNTRY_NOT_CONFIGURED_IN_STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLDiscountCodeNonApplicableErrorImpl.class, name = GraphQLDiscountCodeNonApplicableError.DISCOUNT_CODE_NON_APPLICABLE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLDuplicateAttributeValueErrorImpl.class, name = GraphQLDuplicateAttributeValueError.DUPLICATE_ATTRIBUTE_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLDuplicateAttributeValuesErrorImpl.class, name = GraphQLDuplicateAttributeValuesError.DUPLICATE_ATTRIBUTE_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLDuplicateEnumValuesErrorImpl.class, name = GraphQLDuplicateEnumValuesError.DUPLICATE_ENUM_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLDuplicateFieldErrorImpl.class, name = GraphQLDuplicateFieldError.DUPLICATE_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLDuplicateFieldWithConflictingResourceErrorImpl.class, name = GraphQLDuplicateFieldWithConflictingResourceError.DUPLICATE_FIELD_WITH_CONFLICTING_RESOURCE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLDuplicatePriceKeyErrorImpl.class, name = GraphQLDuplicatePriceKeyError.DUPLICATE_PRICE_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLDuplicatePriceScopeErrorImpl.class, name = GraphQLDuplicatePriceScopeError.DUPLICATE_PRICE_SCOPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLDuplicateStandalonePriceScopeErrorImpl.class, name = GraphQLDuplicateStandalonePriceScopeError.DUPLICATE_STANDALONE_PRICE_SCOPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLDuplicateVariantValuesErrorImpl.class, name = GraphQLDuplicateVariantValuesError.DUPLICATE_VARIANT_VALUES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLEditPreviewFailedErrorImpl.class, name = GraphQLEditPreviewFailedError.EDIT_PREVIEW_FAILED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLEnumKeyAlreadyExistsErrorImpl.class, name = GraphQLEnumKeyAlreadyExistsError.ENUM_KEY_ALREADY_EXISTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLEnumKeyDoesNotExistErrorImpl.class, name = GraphQLEnumKeyDoesNotExistError.ENUM_KEY_DOES_NOT_EXIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLEnumValueIsUsedErrorImpl.class, name = GraphQLEnumValueIsUsedError.ENUM_VALUE_IS_USED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLEnumValuesMustMatchErrorImpl.class, name = GraphQLEnumValuesMustMatchError.ENUM_VALUES_MUST_MATCH),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLExtensionBadResponseErrorImpl.class, name = GraphQLExtensionBadResponseError.EXTENSION_BAD_RESPONSE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLExtensionNoResponseErrorImpl.class, name = GraphQLExtensionNoResponseError.EXTENSION_NO_RESPONSE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLExtensionPredicateEvaluationFailedErrorImpl.class, name = GraphQLExtensionPredicateEvaluationFailedError.EXTENSION_PREDICATE_EVALUATION_FAILED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLExtensionUpdateActionsFailedErrorImpl.class, name = GraphQLExtensionUpdateActionsFailedError.EXTENSION_UPDATE_ACTIONS_FAILED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLExternalOAuthFailedErrorImpl.class, name = GraphQLExternalOAuthFailedError.EXTERNAL_O_AUTH_FAILED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLFeatureRemovedErrorImpl.class, name = GraphQLFeatureRemovedError.FEATURE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLGeneralErrorImpl.class, name = GraphQLGeneralError.GENERAL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInsufficientScopeErrorImpl.class, name = GraphQLInsufficientScopeError.INSUFFICIENT_SCOPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInternalConstraintViolatedErrorImpl.class, name = GraphQLInternalConstraintViolatedError.INTERNAL_CONSTRAINT_VIOLATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInvalidCredentialsErrorImpl.class, name = GraphQLInvalidCredentialsError.INVALID_CREDENTIALS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInvalidCurrentPasswordErrorImpl.class, name = GraphQLInvalidCurrentPasswordError.INVALID_CURRENT_PASSWORD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInvalidFieldErrorImpl.class, name = GraphQLInvalidFieldError.INVALID_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInvalidInputErrorImpl.class, name = GraphQLInvalidInputError.INVALID_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInvalidItemShippingDetailsErrorImpl.class, name = GraphQLInvalidItemShippingDetailsError.INVALID_ITEM_SHIPPING_DETAILS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInvalidJsonInputErrorImpl.class, name = GraphQLInvalidJsonInputError.INVALID_JSON_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInvalidOperationErrorImpl.class, name = GraphQLInvalidOperationError.INVALID_OPERATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInvalidSubjectErrorImpl.class, name = GraphQLInvalidSubjectError.INVALID_SUBJECT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLInvalidTokenErrorImpl.class, name = GraphQLInvalidTokenError.INVALID_TOKEN),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLLanguageUsedInStoresErrorImpl.class, name = GraphQLLanguageUsedInStoresError.LANGUAGE_USED_IN_STORES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLLockedFieldErrorImpl.class, name = GraphQLLockedFieldError.LOCKED_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLMatchingPriceNotFoundErrorImpl.class, name = GraphQLMatchingPriceNotFoundError.MATCHING_PRICE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLMaxCartDiscountsReachedErrorImpl.class, name = GraphQLMaxCartDiscountsReachedError.MAX_CART_DISCOUNTS_REACHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLMaxResourceLimitExceededErrorImpl.class, name = GraphQLMaxResourceLimitExceededError.MAX_RESOURCE_LIMIT_EXCEEDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLMaxStoreReferencesReachedErrorImpl.class, name = GraphQLMaxStoreReferencesReachedError.MAX_STORE_REFERENCES_REACHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLMissingRoleOnChannelErrorImpl.class, name = GraphQLMissingRoleOnChannelError.MISSING_ROLE_ON_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLMissingTaxRateForCountryErrorImpl.class, name = GraphQLMissingTaxRateForCountryError.MISSING_TAX_RATE_FOR_COUNTRY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLMoneyOverflowErrorImpl.class, name = GraphQLMoneyOverflowError.MONEY_OVERFLOW),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLNoMatchingProductDiscountFoundErrorImpl.class, name = GraphQLNoMatchingProductDiscountFoundError.NO_MATCHING_PRODUCT_DISCOUNT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLObjectNotFoundErrorImpl.class, name = GraphQLObjectNotFoundError.OBJECT_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLOutOfStockErrorImpl.class, name = GraphQLOutOfStockError.OUT_OF_STOCK),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLOverCapacityErrorImpl.class, name = GraphQLOverCapacityError.OVER_CAPACITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLOverlappingStandalonePriceValidityErrorImpl.class, name = GraphQLOverlappingStandalonePriceValidityError.OVERLAPPING_STANDALONE_PRICE_VALIDITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLPendingOperationErrorImpl.class, name = GraphQLPendingOperationError.PENDING_OPERATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLPriceChangedErrorImpl.class, name = GraphQLPriceChangedError.PRICE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLProductAssignmentMissingErrorImpl.class, name = GraphQLProductAssignmentMissingError.PRODUCT_ASSIGNMENT_MISSING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLProductPresentWithDifferentVariantSelectionErrorImpl.class, name = GraphQLProductPresentWithDifferentVariantSelectionError.PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLProjectNotConfiguredForLanguagesErrorImpl.class, name = GraphQLProjectNotConfiguredForLanguagesError.PROJECT_NOT_CONFIGURED_FOR_LANGUAGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLQueryComplexityLimitExceededErrorImpl.class, name = GraphQLQueryComplexityLimitExceededError.QUERY_COMPLEXITY_LIMIT_EXCEEDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLQueryTimedOutErrorImpl.class, name = GraphQLQueryTimedOutError.QUERY_TIMED_OUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLReferenceExistsErrorImpl.class, name = GraphQLReferenceExistsError.REFERENCE_EXISTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLReferencedResourceNotFoundErrorImpl.class, name = GraphQLReferencedResourceNotFoundError.REFERENCED_RESOURCE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLRequiredFieldErrorImpl.class, name = GraphQLRequiredFieldError.REQUIRED_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLResourceNotFoundErrorImpl.class, name = GraphQLResourceNotFoundError.RESOURCE_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLResourceSizeLimitExceededErrorImpl.class, name = GraphQLResourceSizeLimitExceededError.RESOURCE_SIZE_LIMIT_EXCEEDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLSearchDeactivatedErrorImpl.class, name = GraphQLSearchDeactivatedError.SEARCH_DEACTIVATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLSearchExecutionFailureErrorImpl.class, name = GraphQLSearchExecutionFailureError.SEARCH_EXECUTION_FAILURE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLSearchFacetPathNotFoundErrorImpl.class, name = GraphQLSearchFacetPathNotFoundError.SEARCH_FACET_PATH_NOT_FOUND),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLSearchIndexingInProgressErrorImpl.class, name = GraphQLSearchIndexingInProgressError.SEARCH_INDEXING_IN_PROGRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLSemanticErrorErrorImpl.class, name = GraphQLSemanticErrorError.SEMANTIC_ERROR),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLShippingMethodDoesNotMatchCartErrorImpl.class, name = GraphQLShippingMethodDoesNotMatchCartError.SHIPPING_METHOD_DOES_NOT_MATCH_CART),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLStoreCartDiscountsLimitReachedErrorImpl.class, name = GraphQLStoreCartDiscountsLimitReachedError.STORE_CART_DISCOUNTS_LIMIT_REACHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.error.GraphQLSyntaxErrorErrorImpl.class, name = GraphQLSyntaxErrorError.SYNTAX_ERROR) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = GraphQLErrorObjectImpl.class, visible = true)
@JsonDeserialize(as = GraphQLErrorObjectImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface GraphQLErrorObject {

    /**
     *  <p>Error identifier.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Error-specific additional fields.</p>
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, Object> values();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, Object value);

    /**
     * factory method to create a deep copy of GraphQLErrorObject
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLErrorObject deepCopy(@Nullable final GraphQLErrorObject template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLAnonymousIdAlreadyInUseError) {
            return com.commercetools.api.models.error.GraphQLAnonymousIdAlreadyInUseError
                    .deepCopy((com.commercetools.api.models.error.GraphQLAnonymousIdAlreadyInUseError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLAssociateMissingPermissionError) {
            return com.commercetools.api.models.error.GraphQLAssociateMissingPermissionError
                    .deepCopy((com.commercetools.api.models.error.GraphQLAssociateMissingPermissionError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLAttributeDefinitionAlreadyExistsError) {
            return com.commercetools.api.models.error.GraphQLAttributeDefinitionAlreadyExistsError.deepCopy(
                (com.commercetools.api.models.error.GraphQLAttributeDefinitionAlreadyExistsError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLAttributeDefinitionTypeConflictError) {
            return com.commercetools.api.models.error.GraphQLAttributeDefinitionTypeConflictError.deepCopy(
                (com.commercetools.api.models.error.GraphQLAttributeDefinitionTypeConflictError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLAttributeNameDoesNotExistError) {
            return com.commercetools.api.models.error.GraphQLAttributeNameDoesNotExistError
                    .deepCopy((com.commercetools.api.models.error.GraphQLAttributeNameDoesNotExistError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLBadGatewayError) {
            return com.commercetools.api.models.error.GraphQLBadGatewayError
                    .deepCopy((com.commercetools.api.models.error.GraphQLBadGatewayError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLConcurrentModificationError) {
            return com.commercetools.api.models.error.GraphQLConcurrentModificationError
                    .deepCopy((com.commercetools.api.models.error.GraphQLConcurrentModificationError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLContentTooLargeError) {
            return com.commercetools.api.models.error.GraphQLContentTooLargeError
                    .deepCopy((com.commercetools.api.models.error.GraphQLContentTooLargeError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLCountryNotConfiguredInStoreError) {
            return com.commercetools.api.models.error.GraphQLCountryNotConfiguredInStoreError
                    .deepCopy((com.commercetools.api.models.error.GraphQLCountryNotConfiguredInStoreError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLDiscountCodeNonApplicableError) {
            return com.commercetools.api.models.error.GraphQLDiscountCodeNonApplicableError
                    .deepCopy((com.commercetools.api.models.error.GraphQLDiscountCodeNonApplicableError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLDuplicateAttributeValueError) {
            return com.commercetools.api.models.error.GraphQLDuplicateAttributeValueError
                    .deepCopy((com.commercetools.api.models.error.GraphQLDuplicateAttributeValueError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLDuplicateAttributeValuesError) {
            return com.commercetools.api.models.error.GraphQLDuplicateAttributeValuesError
                    .deepCopy((com.commercetools.api.models.error.GraphQLDuplicateAttributeValuesError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLDuplicateEnumValuesError) {
            return com.commercetools.api.models.error.GraphQLDuplicateEnumValuesError
                    .deepCopy((com.commercetools.api.models.error.GraphQLDuplicateEnumValuesError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLDuplicateFieldError) {
            return com.commercetools.api.models.error.GraphQLDuplicateFieldError
                    .deepCopy((com.commercetools.api.models.error.GraphQLDuplicateFieldError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLDuplicateFieldWithConflictingResourceError) {
            return com.commercetools.api.models.error.GraphQLDuplicateFieldWithConflictingResourceError.deepCopy(
                (com.commercetools.api.models.error.GraphQLDuplicateFieldWithConflictingResourceError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLDuplicatePriceKeyError) {
            return com.commercetools.api.models.error.GraphQLDuplicatePriceKeyError
                    .deepCopy((com.commercetools.api.models.error.GraphQLDuplicatePriceKeyError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLDuplicatePriceScopeError) {
            return com.commercetools.api.models.error.GraphQLDuplicatePriceScopeError
                    .deepCopy((com.commercetools.api.models.error.GraphQLDuplicatePriceScopeError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLDuplicateStandalonePriceScopeError) {
            return com.commercetools.api.models.error.GraphQLDuplicateStandalonePriceScopeError
                    .deepCopy((com.commercetools.api.models.error.GraphQLDuplicateStandalonePriceScopeError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLDuplicateVariantValuesError) {
            return com.commercetools.api.models.error.GraphQLDuplicateVariantValuesError
                    .deepCopy((com.commercetools.api.models.error.GraphQLDuplicateVariantValuesError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLEditPreviewFailedError) {
            return com.commercetools.api.models.error.GraphQLEditPreviewFailedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLEditPreviewFailedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLEnumKeyAlreadyExistsError) {
            return com.commercetools.api.models.error.GraphQLEnumKeyAlreadyExistsError
                    .deepCopy((com.commercetools.api.models.error.GraphQLEnumKeyAlreadyExistsError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLEnumKeyDoesNotExistError) {
            return com.commercetools.api.models.error.GraphQLEnumKeyDoesNotExistError
                    .deepCopy((com.commercetools.api.models.error.GraphQLEnumKeyDoesNotExistError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLEnumValueIsUsedError) {
            return com.commercetools.api.models.error.GraphQLEnumValueIsUsedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLEnumValueIsUsedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLEnumValuesMustMatchError) {
            return com.commercetools.api.models.error.GraphQLEnumValuesMustMatchError
                    .deepCopy((com.commercetools.api.models.error.GraphQLEnumValuesMustMatchError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLExtensionBadResponseError) {
            return com.commercetools.api.models.error.GraphQLExtensionBadResponseError
                    .deepCopy((com.commercetools.api.models.error.GraphQLExtensionBadResponseError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLExtensionNoResponseError) {
            return com.commercetools.api.models.error.GraphQLExtensionNoResponseError
                    .deepCopy((com.commercetools.api.models.error.GraphQLExtensionNoResponseError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLExtensionPredicateEvaluationFailedError) {
            return com.commercetools.api.models.error.GraphQLExtensionPredicateEvaluationFailedError.deepCopy(
                (com.commercetools.api.models.error.GraphQLExtensionPredicateEvaluationFailedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLExtensionUpdateActionsFailedError) {
            return com.commercetools.api.models.error.GraphQLExtensionUpdateActionsFailedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLExtensionUpdateActionsFailedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLExternalOAuthFailedError) {
            return com.commercetools.api.models.error.GraphQLExternalOAuthFailedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLExternalOAuthFailedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLFeatureRemovedError) {
            return com.commercetools.api.models.error.GraphQLFeatureRemovedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLFeatureRemovedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLGeneralError) {
            return com.commercetools.api.models.error.GraphQLGeneralError
                    .deepCopy((com.commercetools.api.models.error.GraphQLGeneralError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInsufficientScopeError) {
            return com.commercetools.api.models.error.GraphQLInsufficientScopeError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInsufficientScopeError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInternalConstraintViolatedError) {
            return com.commercetools.api.models.error.GraphQLInternalConstraintViolatedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInternalConstraintViolatedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInvalidCredentialsError) {
            return com.commercetools.api.models.error.GraphQLInvalidCredentialsError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInvalidCredentialsError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInvalidCurrentPasswordError) {
            return com.commercetools.api.models.error.GraphQLInvalidCurrentPasswordError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInvalidCurrentPasswordError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInvalidFieldError) {
            return com.commercetools.api.models.error.GraphQLInvalidFieldError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInvalidFieldError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInvalidInputError) {
            return com.commercetools.api.models.error.GraphQLInvalidInputError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInvalidInputError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInvalidItemShippingDetailsError) {
            return com.commercetools.api.models.error.GraphQLInvalidItemShippingDetailsError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInvalidItemShippingDetailsError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInvalidJsonInputError) {
            return com.commercetools.api.models.error.GraphQLInvalidJsonInputError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInvalidJsonInputError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInvalidOperationError) {
            return com.commercetools.api.models.error.GraphQLInvalidOperationError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInvalidOperationError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInvalidSubjectError) {
            return com.commercetools.api.models.error.GraphQLInvalidSubjectError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInvalidSubjectError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLInvalidTokenError) {
            return com.commercetools.api.models.error.GraphQLInvalidTokenError
                    .deepCopy((com.commercetools.api.models.error.GraphQLInvalidTokenError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLLanguageUsedInStoresError) {
            return com.commercetools.api.models.error.GraphQLLanguageUsedInStoresError
                    .deepCopy((com.commercetools.api.models.error.GraphQLLanguageUsedInStoresError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLLockedFieldError) {
            return com.commercetools.api.models.error.GraphQLLockedFieldError
                    .deepCopy((com.commercetools.api.models.error.GraphQLLockedFieldError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLMatchingPriceNotFoundError) {
            return com.commercetools.api.models.error.GraphQLMatchingPriceNotFoundError
                    .deepCopy((com.commercetools.api.models.error.GraphQLMatchingPriceNotFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLMaxCartDiscountsReachedError) {
            return com.commercetools.api.models.error.GraphQLMaxCartDiscountsReachedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLMaxCartDiscountsReachedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLMaxResourceLimitExceededError) {
            return com.commercetools.api.models.error.GraphQLMaxResourceLimitExceededError
                    .deepCopy((com.commercetools.api.models.error.GraphQLMaxResourceLimitExceededError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLMaxStoreReferencesReachedError) {
            return com.commercetools.api.models.error.GraphQLMaxStoreReferencesReachedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLMaxStoreReferencesReachedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLMissingRoleOnChannelError) {
            return com.commercetools.api.models.error.GraphQLMissingRoleOnChannelError
                    .deepCopy((com.commercetools.api.models.error.GraphQLMissingRoleOnChannelError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLMissingTaxRateForCountryError) {
            return com.commercetools.api.models.error.GraphQLMissingTaxRateForCountryError
                    .deepCopy((com.commercetools.api.models.error.GraphQLMissingTaxRateForCountryError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLMoneyOverflowError) {
            return com.commercetools.api.models.error.GraphQLMoneyOverflowError
                    .deepCopy((com.commercetools.api.models.error.GraphQLMoneyOverflowError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLNoMatchingProductDiscountFoundError) {
            return com.commercetools.api.models.error.GraphQLNoMatchingProductDiscountFoundError
                    .deepCopy((com.commercetools.api.models.error.GraphQLNoMatchingProductDiscountFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLObjectNotFoundError) {
            return com.commercetools.api.models.error.GraphQLObjectNotFoundError
                    .deepCopy((com.commercetools.api.models.error.GraphQLObjectNotFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLOutOfStockError) {
            return com.commercetools.api.models.error.GraphQLOutOfStockError
                    .deepCopy((com.commercetools.api.models.error.GraphQLOutOfStockError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLOverCapacityError) {
            return com.commercetools.api.models.error.GraphQLOverCapacityError
                    .deepCopy((com.commercetools.api.models.error.GraphQLOverCapacityError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLOverlappingStandalonePriceValidityError) {
            return com.commercetools.api.models.error.GraphQLOverlappingStandalonePriceValidityError.deepCopy(
                (com.commercetools.api.models.error.GraphQLOverlappingStandalonePriceValidityError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLPendingOperationError) {
            return com.commercetools.api.models.error.GraphQLPendingOperationError
                    .deepCopy((com.commercetools.api.models.error.GraphQLPendingOperationError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLPriceChangedError) {
            return com.commercetools.api.models.error.GraphQLPriceChangedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLPriceChangedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLProductAssignmentMissingError) {
            return com.commercetools.api.models.error.GraphQLProductAssignmentMissingError
                    .deepCopy((com.commercetools.api.models.error.GraphQLProductAssignmentMissingError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLProductPresentWithDifferentVariantSelectionError) {
            return com.commercetools.api.models.error.GraphQLProductPresentWithDifferentVariantSelectionError.deepCopy(
                (com.commercetools.api.models.error.GraphQLProductPresentWithDifferentVariantSelectionError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLProjectNotConfiguredForLanguagesError) {
            return com.commercetools.api.models.error.GraphQLProjectNotConfiguredForLanguagesError.deepCopy(
                (com.commercetools.api.models.error.GraphQLProjectNotConfiguredForLanguagesError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLQueryComplexityLimitExceededError) {
            return com.commercetools.api.models.error.GraphQLQueryComplexityLimitExceededError
                    .deepCopy((com.commercetools.api.models.error.GraphQLQueryComplexityLimitExceededError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLQueryTimedOutError) {
            return com.commercetools.api.models.error.GraphQLQueryTimedOutError
                    .deepCopy((com.commercetools.api.models.error.GraphQLQueryTimedOutError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLReferenceExistsError) {
            return com.commercetools.api.models.error.GraphQLReferenceExistsError
                    .deepCopy((com.commercetools.api.models.error.GraphQLReferenceExistsError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLReferencedResourceNotFoundError) {
            return com.commercetools.api.models.error.GraphQLReferencedResourceNotFoundError
                    .deepCopy((com.commercetools.api.models.error.GraphQLReferencedResourceNotFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLRequiredFieldError) {
            return com.commercetools.api.models.error.GraphQLRequiredFieldError
                    .deepCopy((com.commercetools.api.models.error.GraphQLRequiredFieldError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLResourceNotFoundError) {
            return com.commercetools.api.models.error.GraphQLResourceNotFoundError
                    .deepCopy((com.commercetools.api.models.error.GraphQLResourceNotFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLResourceSizeLimitExceededError) {
            return com.commercetools.api.models.error.GraphQLResourceSizeLimitExceededError
                    .deepCopy((com.commercetools.api.models.error.GraphQLResourceSizeLimitExceededError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLSearchDeactivatedError) {
            return com.commercetools.api.models.error.GraphQLSearchDeactivatedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLSearchDeactivatedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLSearchExecutionFailureError) {
            return com.commercetools.api.models.error.GraphQLSearchExecutionFailureError
                    .deepCopy((com.commercetools.api.models.error.GraphQLSearchExecutionFailureError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLSearchFacetPathNotFoundError) {
            return com.commercetools.api.models.error.GraphQLSearchFacetPathNotFoundError
                    .deepCopy((com.commercetools.api.models.error.GraphQLSearchFacetPathNotFoundError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLSearchIndexingInProgressError) {
            return com.commercetools.api.models.error.GraphQLSearchIndexingInProgressError
                    .deepCopy((com.commercetools.api.models.error.GraphQLSearchIndexingInProgressError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLSemanticErrorError) {
            return com.commercetools.api.models.error.GraphQLSemanticErrorError
                    .deepCopy((com.commercetools.api.models.error.GraphQLSemanticErrorError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLShippingMethodDoesNotMatchCartError) {
            return com.commercetools.api.models.error.GraphQLShippingMethodDoesNotMatchCartError
                    .deepCopy((com.commercetools.api.models.error.GraphQLShippingMethodDoesNotMatchCartError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLStoreCartDiscountsLimitReachedError) {
            return com.commercetools.api.models.error.GraphQLStoreCartDiscountsLimitReachedError
                    .deepCopy((com.commercetools.api.models.error.GraphQLStoreCartDiscountsLimitReachedError) template);
        }
        if (template instanceof com.commercetools.api.models.error.GraphQLSyntaxErrorError) {
            return com.commercetools.api.models.error.GraphQLSyntaxErrorError
                    .deepCopy((com.commercetools.api.models.error.GraphQLSyntaxErrorError) template);
        }
        GraphQLErrorObjectImpl instance = new GraphQLErrorObjectImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder for anonymousIdAlreadyInUse subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLAnonymousIdAlreadyInUseErrorBuilder anonymousIdAlreadyInUseBuilder() {
        return com.commercetools.api.models.error.GraphQLAnonymousIdAlreadyInUseErrorBuilder.of();
    }

    /**
     * builder for associateMissingPermission subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLAssociateMissingPermissionErrorBuilder associateMissingPermissionBuilder() {
        return com.commercetools.api.models.error.GraphQLAssociateMissingPermissionErrorBuilder.of();
    }

    /**
     * builder for attributeDefinitionAlreadyExists subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLAttributeDefinitionAlreadyExistsErrorBuilder attributeDefinitionAlreadyExistsBuilder() {
        return com.commercetools.api.models.error.GraphQLAttributeDefinitionAlreadyExistsErrorBuilder.of();
    }

    /**
     * builder for attributeDefinitionTypeConflict subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLAttributeDefinitionTypeConflictErrorBuilder attributeDefinitionTypeConflictBuilder() {
        return com.commercetools.api.models.error.GraphQLAttributeDefinitionTypeConflictErrorBuilder.of();
    }

    /**
     * builder for attributeNameDoesNotExist subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLAttributeNameDoesNotExistErrorBuilder attributeNameDoesNotExistBuilder() {
        return com.commercetools.api.models.error.GraphQLAttributeNameDoesNotExistErrorBuilder.of();
    }

    /**
     * builder for badGateway subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLBadGatewayErrorBuilder badGatewayBuilder() {
        return com.commercetools.api.models.error.GraphQLBadGatewayErrorBuilder.of();
    }

    /**
     * builder for concurrentModification subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLConcurrentModificationErrorBuilder concurrentModificationBuilder() {
        return com.commercetools.api.models.error.GraphQLConcurrentModificationErrorBuilder.of();
    }

    /**
     * builder for contentTooLarge subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLContentTooLargeErrorBuilder contentTooLargeBuilder() {
        return com.commercetools.api.models.error.GraphQLContentTooLargeErrorBuilder.of();
    }

    /**
     * builder for countryNotConfiguredInStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLCountryNotConfiguredInStoreErrorBuilder countryNotConfiguredInStoreBuilder() {
        return com.commercetools.api.models.error.GraphQLCountryNotConfiguredInStoreErrorBuilder.of();
    }

    /**
     * builder for discountCodeNonApplicable subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLDiscountCodeNonApplicableErrorBuilder discountCodeNonApplicableBuilder() {
        return com.commercetools.api.models.error.GraphQLDiscountCodeNonApplicableErrorBuilder.of();
    }

    /**
     * builder for duplicateAttributeValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLDuplicateAttributeValueErrorBuilder duplicateAttributeValueBuilder() {
        return com.commercetools.api.models.error.GraphQLDuplicateAttributeValueErrorBuilder.of();
    }

    /**
     * builder for duplicateAttributeValues subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLDuplicateAttributeValuesErrorBuilder duplicateAttributeValuesBuilder() {
        return com.commercetools.api.models.error.GraphQLDuplicateAttributeValuesErrorBuilder.of();
    }

    /**
     * builder for duplicateEnumValues subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLDuplicateEnumValuesErrorBuilder duplicateEnumValuesBuilder() {
        return com.commercetools.api.models.error.GraphQLDuplicateEnumValuesErrorBuilder.of();
    }

    /**
     * builder for duplicateField subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLDuplicateFieldErrorBuilder duplicateFieldBuilder() {
        return com.commercetools.api.models.error.GraphQLDuplicateFieldErrorBuilder.of();
    }

    /**
     * builder for duplicateFieldWithConflictingResource subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLDuplicateFieldWithConflictingResourceErrorBuilder duplicateFieldWithConflictingResourceBuilder() {
        return com.commercetools.api.models.error.GraphQLDuplicateFieldWithConflictingResourceErrorBuilder.of();
    }

    /**
     * builder for duplicatePriceKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLDuplicatePriceKeyErrorBuilder duplicatePriceKeyBuilder() {
        return com.commercetools.api.models.error.GraphQLDuplicatePriceKeyErrorBuilder.of();
    }

    /**
     * builder for duplicatePriceScope subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLDuplicatePriceScopeErrorBuilder duplicatePriceScopeBuilder() {
        return com.commercetools.api.models.error.GraphQLDuplicatePriceScopeErrorBuilder.of();
    }

    /**
     * builder for duplicateStandalonePriceScope subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLDuplicateStandalonePriceScopeErrorBuilder duplicateStandalonePriceScopeBuilder() {
        return com.commercetools.api.models.error.GraphQLDuplicateStandalonePriceScopeErrorBuilder.of();
    }

    /**
     * builder for duplicateVariantValues subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLDuplicateVariantValuesErrorBuilder duplicateVariantValuesBuilder() {
        return com.commercetools.api.models.error.GraphQLDuplicateVariantValuesErrorBuilder.of();
    }

    /**
     * builder for editPreviewFailed subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLEditPreviewFailedErrorBuilder editPreviewFailedBuilder() {
        return com.commercetools.api.models.error.GraphQLEditPreviewFailedErrorBuilder.of();
    }

    /**
     * builder for enumKeyAlreadyExists subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLEnumKeyAlreadyExistsErrorBuilder enumKeyAlreadyExistsBuilder() {
        return com.commercetools.api.models.error.GraphQLEnumKeyAlreadyExistsErrorBuilder.of();
    }

    /**
     * builder for enumKeyDoesNotExist subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLEnumKeyDoesNotExistErrorBuilder enumKeyDoesNotExistBuilder() {
        return com.commercetools.api.models.error.GraphQLEnumKeyDoesNotExistErrorBuilder.of();
    }

    /**
     * builder for enumValueIsUsed subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLEnumValueIsUsedErrorBuilder enumValueIsUsedBuilder() {
        return com.commercetools.api.models.error.GraphQLEnumValueIsUsedErrorBuilder.of();
    }

    /**
     * builder for enumValuesMustMatch subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLEnumValuesMustMatchErrorBuilder enumValuesMustMatchBuilder() {
        return com.commercetools.api.models.error.GraphQLEnumValuesMustMatchErrorBuilder.of();
    }

    /**
     * builder for extensionBadResponse subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLExtensionBadResponseErrorBuilder extensionBadResponseBuilder() {
        return com.commercetools.api.models.error.GraphQLExtensionBadResponseErrorBuilder.of();
    }

    /**
     * builder for extensionNoResponse subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLExtensionNoResponseErrorBuilder extensionNoResponseBuilder() {
        return com.commercetools.api.models.error.GraphQLExtensionNoResponseErrorBuilder.of();
    }

    /**
     * builder for extensionPredicateEvaluationFailed subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLExtensionPredicateEvaluationFailedErrorBuilder extensionPredicateEvaluationFailedBuilder() {
        return com.commercetools.api.models.error.GraphQLExtensionPredicateEvaluationFailedErrorBuilder.of();
    }

    /**
     * builder for extensionUpdateActionsFailed subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLExtensionUpdateActionsFailedErrorBuilder extensionUpdateActionsFailedBuilder() {
        return com.commercetools.api.models.error.GraphQLExtensionUpdateActionsFailedErrorBuilder.of();
    }

    /**
     * builder for externalOAuthFailed subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLExternalOAuthFailedErrorBuilder externalOAuthFailedBuilder() {
        return com.commercetools.api.models.error.GraphQLExternalOAuthFailedErrorBuilder.of();
    }

    /**
     * builder for featureRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLFeatureRemovedErrorBuilder featureRemovedBuilder() {
        return com.commercetools.api.models.error.GraphQLFeatureRemovedErrorBuilder.of();
    }

    /**
     * builder for general subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLGeneralErrorBuilder generalBuilder() {
        return com.commercetools.api.models.error.GraphQLGeneralErrorBuilder.of();
    }

    /**
     * builder for insufficientScope subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInsufficientScopeErrorBuilder insufficientScopeBuilder() {
        return com.commercetools.api.models.error.GraphQLInsufficientScopeErrorBuilder.of();
    }

    /**
     * builder for internalConstraintViolated subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInternalConstraintViolatedErrorBuilder internalConstraintViolatedBuilder() {
        return com.commercetools.api.models.error.GraphQLInternalConstraintViolatedErrorBuilder.of();
    }

    /**
     * builder for invalidCredentials subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInvalidCredentialsErrorBuilder invalidCredentialsBuilder() {
        return com.commercetools.api.models.error.GraphQLInvalidCredentialsErrorBuilder.of();
    }

    /**
     * builder for invalidCurrentPassword subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInvalidCurrentPasswordErrorBuilder invalidCurrentPasswordBuilder() {
        return com.commercetools.api.models.error.GraphQLInvalidCurrentPasswordErrorBuilder.of();
    }

    /**
     * builder for invalidField subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInvalidFieldErrorBuilder invalidFieldBuilder() {
        return com.commercetools.api.models.error.GraphQLInvalidFieldErrorBuilder.of();
    }

    /**
     * builder for invalidInput subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInvalidInputErrorBuilder invalidInputBuilder() {
        return com.commercetools.api.models.error.GraphQLInvalidInputErrorBuilder.of();
    }

    /**
     * builder for invalidItemShippingDetails subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInvalidItemShippingDetailsErrorBuilder invalidItemShippingDetailsBuilder() {
        return com.commercetools.api.models.error.GraphQLInvalidItemShippingDetailsErrorBuilder.of();
    }

    /**
     * builder for invalidJsonInput subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInvalidJsonInputErrorBuilder invalidJsonInputBuilder() {
        return com.commercetools.api.models.error.GraphQLInvalidJsonInputErrorBuilder.of();
    }

    /**
     * builder for invalidOperation subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInvalidOperationErrorBuilder invalidOperationBuilder() {
        return com.commercetools.api.models.error.GraphQLInvalidOperationErrorBuilder.of();
    }

    /**
     * builder for invalidSubject subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInvalidSubjectErrorBuilder invalidSubjectBuilder() {
        return com.commercetools.api.models.error.GraphQLInvalidSubjectErrorBuilder.of();
    }

    /**
     * builder for invalidToken subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLInvalidTokenErrorBuilder invalidTokenBuilder() {
        return com.commercetools.api.models.error.GraphQLInvalidTokenErrorBuilder.of();
    }

    /**
     * builder for languageUsedInStores subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLLanguageUsedInStoresErrorBuilder languageUsedInStoresBuilder() {
        return com.commercetools.api.models.error.GraphQLLanguageUsedInStoresErrorBuilder.of();
    }

    /**
     * builder for lockedField subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLLockedFieldErrorBuilder lockedFieldBuilder() {
        return com.commercetools.api.models.error.GraphQLLockedFieldErrorBuilder.of();
    }

    /**
     * builder for matchingPriceNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLMatchingPriceNotFoundErrorBuilder matchingPriceNotFoundBuilder() {
        return com.commercetools.api.models.error.GraphQLMatchingPriceNotFoundErrorBuilder.of();
    }

    /**
     * builder for maxCartDiscountsReached subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLMaxCartDiscountsReachedErrorBuilder maxCartDiscountsReachedBuilder() {
        return com.commercetools.api.models.error.GraphQLMaxCartDiscountsReachedErrorBuilder.of();
    }

    /**
     * builder for maxResourceLimitExceeded subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLMaxResourceLimitExceededErrorBuilder maxResourceLimitExceededBuilder() {
        return com.commercetools.api.models.error.GraphQLMaxResourceLimitExceededErrorBuilder.of();
    }

    /**
     * builder for maxStoreReferencesReached subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLMaxStoreReferencesReachedErrorBuilder maxStoreReferencesReachedBuilder() {
        return com.commercetools.api.models.error.GraphQLMaxStoreReferencesReachedErrorBuilder.of();
    }

    /**
     * builder for missingRoleOnChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLMissingRoleOnChannelErrorBuilder missingRoleOnChannelBuilder() {
        return com.commercetools.api.models.error.GraphQLMissingRoleOnChannelErrorBuilder.of();
    }

    /**
     * builder for missingTaxRateForCountry subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLMissingTaxRateForCountryErrorBuilder missingTaxRateForCountryBuilder() {
        return com.commercetools.api.models.error.GraphQLMissingTaxRateForCountryErrorBuilder.of();
    }

    /**
     * builder for moneyOverflow subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLMoneyOverflowErrorBuilder moneyOverflowBuilder() {
        return com.commercetools.api.models.error.GraphQLMoneyOverflowErrorBuilder.of();
    }

    /**
     * builder for noMatchingProductDiscountFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLNoMatchingProductDiscountFoundErrorBuilder noMatchingProductDiscountFoundBuilder() {
        return com.commercetools.api.models.error.GraphQLNoMatchingProductDiscountFoundErrorBuilder.of();
    }

    /**
     * builder for objectNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLObjectNotFoundErrorBuilder objectNotFoundBuilder() {
        return com.commercetools.api.models.error.GraphQLObjectNotFoundErrorBuilder.of();
    }

    /**
     * builder for outOfStock subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLOutOfStockErrorBuilder outOfStockBuilder() {
        return com.commercetools.api.models.error.GraphQLOutOfStockErrorBuilder.of();
    }

    /**
     * builder for overCapacity subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLOverCapacityErrorBuilder overCapacityBuilder() {
        return com.commercetools.api.models.error.GraphQLOverCapacityErrorBuilder.of();
    }

    /**
     * builder for overlappingStandalonePriceValidity subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLOverlappingStandalonePriceValidityErrorBuilder overlappingStandalonePriceValidityBuilder() {
        return com.commercetools.api.models.error.GraphQLOverlappingStandalonePriceValidityErrorBuilder.of();
    }

    /**
     * builder for pendingOperation subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLPendingOperationErrorBuilder pendingOperationBuilder() {
        return com.commercetools.api.models.error.GraphQLPendingOperationErrorBuilder.of();
    }

    /**
     * builder for priceChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLPriceChangedErrorBuilder priceChangedBuilder() {
        return com.commercetools.api.models.error.GraphQLPriceChangedErrorBuilder.of();
    }

    /**
     * builder for productAssignmentMissing subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLProductAssignmentMissingErrorBuilder productAssignmentMissingBuilder() {
        return com.commercetools.api.models.error.GraphQLProductAssignmentMissingErrorBuilder.of();
    }

    /**
     * builder for productPresentWithDifferentVariantSelection subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder productPresentWithDifferentVariantSelectionBuilder() {
        return com.commercetools.api.models.error.GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder.of();
    }

    /**
     * builder for projectNotConfiguredForLanguages subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLProjectNotConfiguredForLanguagesErrorBuilder projectNotConfiguredForLanguagesBuilder() {
        return com.commercetools.api.models.error.GraphQLProjectNotConfiguredForLanguagesErrorBuilder.of();
    }

    /**
     * builder for queryComplexityLimitExceeded subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLQueryComplexityLimitExceededErrorBuilder queryComplexityLimitExceededBuilder() {
        return com.commercetools.api.models.error.GraphQLQueryComplexityLimitExceededErrorBuilder.of();
    }

    /**
     * builder for queryTimedOut subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLQueryTimedOutErrorBuilder queryTimedOutBuilder() {
        return com.commercetools.api.models.error.GraphQLQueryTimedOutErrorBuilder.of();
    }

    /**
     * builder for referenceExists subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLReferenceExistsErrorBuilder referenceExistsBuilder() {
        return com.commercetools.api.models.error.GraphQLReferenceExistsErrorBuilder.of();
    }

    /**
     * builder for referencedResourceNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLReferencedResourceNotFoundErrorBuilder referencedResourceNotFoundBuilder() {
        return com.commercetools.api.models.error.GraphQLReferencedResourceNotFoundErrorBuilder.of();
    }

    /**
     * builder for requiredField subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLRequiredFieldErrorBuilder requiredFieldBuilder() {
        return com.commercetools.api.models.error.GraphQLRequiredFieldErrorBuilder.of();
    }

    /**
     * builder for resourceNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLResourceNotFoundErrorBuilder resourceNotFoundBuilder() {
        return com.commercetools.api.models.error.GraphQLResourceNotFoundErrorBuilder.of();
    }

    /**
     * builder for resourceSizeLimitExceeded subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLResourceSizeLimitExceededErrorBuilder resourceSizeLimitExceededBuilder() {
        return com.commercetools.api.models.error.GraphQLResourceSizeLimitExceededErrorBuilder.of();
    }

    /**
     * builder for searchDeactivated subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLSearchDeactivatedErrorBuilder searchDeactivatedBuilder() {
        return com.commercetools.api.models.error.GraphQLSearchDeactivatedErrorBuilder.of();
    }

    /**
     * builder for searchExecutionFailure subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLSearchExecutionFailureErrorBuilder searchExecutionFailureBuilder() {
        return com.commercetools.api.models.error.GraphQLSearchExecutionFailureErrorBuilder.of();
    }

    /**
     * builder for searchFacetPathNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLSearchFacetPathNotFoundErrorBuilder searchFacetPathNotFoundBuilder() {
        return com.commercetools.api.models.error.GraphQLSearchFacetPathNotFoundErrorBuilder.of();
    }

    /**
     * builder for searchIndexingInProgress subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLSearchIndexingInProgressErrorBuilder searchIndexingInProgressBuilder() {
        return com.commercetools.api.models.error.GraphQLSearchIndexingInProgressErrorBuilder.of();
    }

    /**
     * builder for semanticError subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLSemanticErrorErrorBuilder semanticErrorBuilder() {
        return com.commercetools.api.models.error.GraphQLSemanticErrorErrorBuilder.of();
    }

    /**
     * builder for shippingMethodDoesNotMatchCart subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLShippingMethodDoesNotMatchCartErrorBuilder shippingMethodDoesNotMatchCartBuilder() {
        return com.commercetools.api.models.error.GraphQLShippingMethodDoesNotMatchCartErrorBuilder.of();
    }

    /**
     * builder for storeCartDiscountsLimitReached subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLStoreCartDiscountsLimitReachedErrorBuilder storeCartDiscountsLimitReachedBuilder() {
        return com.commercetools.api.models.error.GraphQLStoreCartDiscountsLimitReachedErrorBuilder.of();
    }

    /**
     * builder for syntaxError subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLSyntaxErrorErrorBuilder syntaxErrorBuilder() {
        return com.commercetools.api.models.error.GraphQLSyntaxErrorErrorBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLErrorObject(Function<GraphQLErrorObject, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLErrorObject> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLErrorObject>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLErrorObject>";
            }
        };
    }
}
