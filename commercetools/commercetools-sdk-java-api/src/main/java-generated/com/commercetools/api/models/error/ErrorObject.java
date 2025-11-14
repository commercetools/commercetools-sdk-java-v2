
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
 *  <p>Represents a single error. Multiple errors may be included in an <a href="https://docs.commercetools.com/apis/ctp:api:type:ErrorResponse" rel="nofollow">ErrorResponse</a>.</p>
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
     * builder for contentTooLarge subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ContentTooLargeErrorBuilder contentTooLargeBuilder() {
        return com.commercetools.api.models.error.ContentTooLargeErrorBuilder.of();
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
     * builder for expiredCustomerEmailToken subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ExpiredCustomerEmailTokenErrorBuilder expiredCustomerEmailTokenBuilder() {
        return com.commercetools.api.models.error.ExpiredCustomerEmailTokenErrorBuilder.of();
    }

    /**
     * builder for expiredCustomerPasswordToken subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.ExpiredCustomerPasswordTokenErrorBuilder expiredCustomerPasswordTokenBuilder() {
        return com.commercetools.api.models.error.ExpiredCustomerPasswordTokenErrorBuilder.of();
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
     * builder for lockedField subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.LockedFieldErrorBuilder lockedFieldBuilder() {
        return com.commercetools.api.models.error.LockedFieldErrorBuilder.of();
    }

    /**
     * builder for matchingPriceNotFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.MatchingPriceNotFoundErrorBuilder matchingPriceNotFoundBuilder() {
        return com.commercetools.api.models.error.MatchingPriceNotFoundErrorBuilder.of();
    }

    /**
     * builder for maxCartDiscountsReached subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.MaxCartDiscountsReachedErrorBuilder maxCartDiscountsReachedBuilder() {
        return com.commercetools.api.models.error.MaxCartDiscountsReachedErrorBuilder.of();
    }

    /**
     * builder for maxDiscountGroupsReached subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.MaxDiscountGroupsReachedErrorBuilder maxDiscountGroupsReachedBuilder() {
        return com.commercetools.api.models.error.MaxDiscountGroupsReachedErrorBuilder.of();
    }

    /**
     * builder for maxResourceLimitExceeded subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.MaxResourceLimitExceededErrorBuilder maxResourceLimitExceededBuilder() {
        return com.commercetools.api.models.error.MaxResourceLimitExceededErrorBuilder.of();
    }

    /**
     * builder for maxStoreReferencesReached subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.MaxStoreReferencesReachedErrorBuilder maxStoreReferencesReachedBuilder() {
        return com.commercetools.api.models.error.MaxStoreReferencesReachedErrorBuilder.of();
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
     * builder for moneyOverflow subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.MoneyOverflowErrorBuilder moneyOverflowBuilder() {
        return com.commercetools.api.models.error.MoneyOverflowErrorBuilder.of();
    }

    /**
     * builder for noMatchingProductDiscountFound subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorBuilder noMatchingProductDiscountFoundBuilder() {
        return com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorBuilder.of();
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
     * builder for recurringOrderFailure subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder recurringOrderFailureBuilder() {
        return com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder.of();
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
     * builder for searchNotReady subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.SearchNotReadyErrorBuilder searchNotReadyBuilder() {
        return com.commercetools.api.models.error.SearchNotReadyErrorBuilder.of();
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
     * builder for storeCartDiscountsLimitReached subtype
     * @return builder
     */
    public static com.commercetools.api.models.error.StoreCartDiscountsLimitReachedErrorBuilder storeCartDiscountsLimitReachedBuilder() {
        return com.commercetools.api.models.error.StoreCartDiscountsLimitReachedErrorBuilder.of();
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
