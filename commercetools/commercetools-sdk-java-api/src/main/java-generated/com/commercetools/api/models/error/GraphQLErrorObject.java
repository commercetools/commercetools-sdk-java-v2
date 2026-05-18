
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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "code", defaultImpl = GraphQLErrorObjectImpl.class, visible = true)
@JsonDeserialize(as = GraphQLErrorObjectImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface GraphQLErrorObject {

    /**
     *  <p>One of the error codes that is listed on the <span>Errors</span> page.</p>
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

    public GraphQLErrorObject copyDeep();

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

        if (!(template instanceof GraphQLErrorObjectImpl)) {
            return template.copyDeep();
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
     * builder for exactLockConflict subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLExactLockConflictErrorBuilder exactLockConflictBuilder() {
        return com.commercetools.api.models.error.GraphQLExactLockConflictErrorBuilder.of();
    }

    /**
     * builder for expiredCustomerEmailToken subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLExpiredCustomerEmailTokenErrorBuilder expiredCustomerEmailTokenBuilder() {
        return com.commercetools.api.models.error.GraphQLExpiredCustomerEmailTokenErrorBuilder.of();
    }

    /**
     * builder for expiredCustomerPasswordToken subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLExpiredCustomerPasswordTokenErrorBuilder expiredCustomerPasswordTokenBuilder() {
        return com.commercetools.api.models.error.GraphQLExpiredCustomerPasswordTokenErrorBuilder.of();
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
     * builder for maxDiscountGroupsReached subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLMaxDiscountGroupsReachedErrorBuilder maxDiscountGroupsReachedBuilder() {
        return com.commercetools.api.models.error.GraphQLMaxDiscountGroupsReachedErrorBuilder.of();
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
     * builder for recurringOrderFailure subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLRecurringOrderFailureErrorBuilder recurringOrderFailureBuilder() {
        return com.commercetools.api.models.error.GraphQLRecurringOrderFailureErrorBuilder.of();
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
     * builder for searchNotReady subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLSearchNotReadyErrorBuilder searchNotReadyBuilder() {
        return com.commercetools.api.models.error.GraphQLSearchNotReadyErrorBuilder.of();
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
     * builder for validityLockConflict subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.GraphQLValidityLockConflictErrorBuilder validityLockConflictBuilder() {
        return com.commercetools.api.models.error.GraphQLValidityLockConflictErrorBuilder.of();
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
