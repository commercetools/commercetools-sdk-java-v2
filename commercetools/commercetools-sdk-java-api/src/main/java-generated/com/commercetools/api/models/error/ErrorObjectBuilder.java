package com.commercetools.api.models.error;

import com.commercetools.api.models.error.AnonymousIdAlreadyInUseError;
import com.commercetools.api.models.error.AssociateMissingPermissionError;
import com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsError;
import com.commercetools.api.models.error.AttributeDefinitionTypeConflictError;
import com.commercetools.api.models.error.AttributeNameDoesNotExistError;
import com.commercetools.api.models.error.BadGatewayError;
import com.commercetools.api.models.error.ConcurrentModificationError;
import com.commercetools.api.models.error.CountryNotConfiguredInStoreError;
import com.commercetools.api.models.error.DiscountCodeNonApplicableError;
import com.commercetools.api.models.error.DuplicateAttributeValueError;
import com.commercetools.api.models.error.DuplicateAttributeValuesError;
import com.commercetools.api.models.error.DuplicateEnumValuesError;
import com.commercetools.api.models.error.DuplicateFieldError;
import com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceError;
import com.commercetools.api.models.error.DuplicatePriceKeyError;
import com.commercetools.api.models.error.DuplicatePriceScopeError;
import com.commercetools.api.models.error.DuplicateStandalonePriceScopeError;
import com.commercetools.api.models.error.DuplicateVariantValuesError;
import com.commercetools.api.models.error.EditPreviewFailedError;
import com.commercetools.api.models.error.EnumKeyAlreadyExistsError;
import com.commercetools.api.models.error.EnumKeyDoesNotExistError;
import com.commercetools.api.models.error.EnumValueIsUsedError;
import com.commercetools.api.models.error.EnumValuesMustMatchError;
import com.commercetools.api.models.error.ExtensionBadResponseError;
import com.commercetools.api.models.error.ExtensionNoResponseError;
import com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedError;
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
import com.commercetools.api.models.error.MoneyOverflowError;
import com.commercetools.api.models.error.NoMatchingProductDiscountFoundError;
import com.commercetools.api.models.error.NotEnabledError;
import com.commercetools.api.models.error.ObjectNotFoundError;
import com.commercetools.api.models.error.OutOfStockError;
import com.commercetools.api.models.error.OverCapacityError;
import com.commercetools.api.models.error.OverlappingStandalonePriceValidityError;
import com.commercetools.api.models.error.PendingOperationError;
import com.commercetools.api.models.error.PriceChangedError;
import com.commercetools.api.models.error.ProductAssignmentMissingError;
import com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionError;
import com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesError;
import com.commercetools.api.models.error.QueryComplexityLimitExceededError;
import com.commercetools.api.models.error.QueryTimedOutError;
import com.commercetools.api.models.error.ReferenceExistsError;
import com.commercetools.api.models.error.ReferencedResourceNotFoundError;
import com.commercetools.api.models.error.RequiredFieldError;
import com.commercetools.api.models.error.ResourceNotFoundError;
import com.commercetools.api.models.error.ResourceSizeLimitExceededError;
import com.commercetools.api.models.error.SearchDeactivatedError;
import com.commercetools.api.models.error.SearchExecutionFailureError;
import com.commercetools.api.models.error.SearchFacetPathNotFoundError;
import com.commercetools.api.models.error.SearchIndexingInProgressError;
import com.commercetools.api.models.error.SemanticErrorError;
import com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartError;
import com.commercetools.api.models.error.SyntaxErrorError;
import java.lang.Object;
import com.commercetools.api.models.error.ErrorObject;
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

    public com.commercetools.api.models.error.AnonymousIdAlreadyInUseErrorBuilder anonymousIdAlreadyInUseBuilder() {
       return com.commercetools.api.models.error.AnonymousIdAlreadyInUseErrorBuilder.of();
    }
    public com.commercetools.api.models.error.AssociateMissingPermissionErrorBuilder associateMissingPermissionBuilder() {
       return com.commercetools.api.models.error.AssociateMissingPermissionErrorBuilder.of();
    }
    public com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsErrorBuilder attributeDefinitionAlreadyExistsBuilder() {
       return com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsErrorBuilder.of();
    }
    public com.commercetools.api.models.error.AttributeDefinitionTypeConflictErrorBuilder attributeDefinitionTypeConflictBuilder() {
       return com.commercetools.api.models.error.AttributeDefinitionTypeConflictErrorBuilder.of();
    }
    public com.commercetools.api.models.error.AttributeNameDoesNotExistErrorBuilder attributeNameDoesNotExistBuilder() {
       return com.commercetools.api.models.error.AttributeNameDoesNotExistErrorBuilder.of();
    }
    public com.commercetools.api.models.error.BadGatewayErrorBuilder badGatewayBuilder() {
       return com.commercetools.api.models.error.BadGatewayErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ConcurrentModificationErrorBuilder concurrentModificationBuilder() {
       return com.commercetools.api.models.error.ConcurrentModificationErrorBuilder.of();
    }
    public com.commercetools.api.models.error.CountryNotConfiguredInStoreErrorBuilder countryNotConfiguredInStoreBuilder() {
       return com.commercetools.api.models.error.CountryNotConfiguredInStoreErrorBuilder.of();
    }
    public com.commercetools.api.models.error.DiscountCodeNonApplicableErrorBuilder discountCodeNonApplicableBuilder() {
       return com.commercetools.api.models.error.DiscountCodeNonApplicableErrorBuilder.of();
    }
    public com.commercetools.api.models.error.DuplicateAttributeValueErrorBuilder duplicateAttributeValueBuilder() {
       return com.commercetools.api.models.error.DuplicateAttributeValueErrorBuilder.of();
    }
    public com.commercetools.api.models.error.DuplicateAttributeValuesErrorBuilder duplicateAttributeValuesBuilder() {
       return com.commercetools.api.models.error.DuplicateAttributeValuesErrorBuilder.of();
    }
    public com.commercetools.api.models.error.DuplicateEnumValuesErrorBuilder duplicateEnumValuesBuilder() {
       return com.commercetools.api.models.error.DuplicateEnumValuesErrorBuilder.of();
    }
    public com.commercetools.api.models.error.DuplicateFieldErrorBuilder duplicateFieldBuilder() {
       return com.commercetools.api.models.error.DuplicateFieldErrorBuilder.of();
    }
    public com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceErrorBuilder duplicateFieldWithConflictingResourceBuilder() {
       return com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceErrorBuilder.of();
    }
    public com.commercetools.api.models.error.DuplicatePriceKeyErrorBuilder duplicatePriceKeyBuilder() {
       return com.commercetools.api.models.error.DuplicatePriceKeyErrorBuilder.of();
    }
    public com.commercetools.api.models.error.DuplicatePriceScopeErrorBuilder duplicatePriceScopeBuilder() {
       return com.commercetools.api.models.error.DuplicatePriceScopeErrorBuilder.of();
    }
    public com.commercetools.api.models.error.DuplicateStandalonePriceScopeErrorBuilder duplicateStandalonePriceScopeBuilder() {
       return com.commercetools.api.models.error.DuplicateStandalonePriceScopeErrorBuilder.of();
    }
    public com.commercetools.api.models.error.DuplicateVariantValuesErrorBuilder duplicateVariantValuesBuilder() {
       return com.commercetools.api.models.error.DuplicateVariantValuesErrorBuilder.of();
    }
    public com.commercetools.api.models.error.EditPreviewFailedErrorBuilder editPreviewFailedBuilder() {
       return com.commercetools.api.models.error.EditPreviewFailedErrorBuilder.of();
    }
    public com.commercetools.api.models.error.EnumKeyAlreadyExistsErrorBuilder enumKeyAlreadyExistsBuilder() {
       return com.commercetools.api.models.error.EnumKeyAlreadyExistsErrorBuilder.of();
    }
    public com.commercetools.api.models.error.EnumKeyDoesNotExistErrorBuilder enumKeyDoesNotExistBuilder() {
       return com.commercetools.api.models.error.EnumKeyDoesNotExistErrorBuilder.of();
    }
    public com.commercetools.api.models.error.EnumValueIsUsedErrorBuilder enumValueIsUsedBuilder() {
       return com.commercetools.api.models.error.EnumValueIsUsedErrorBuilder.of();
    }
    public com.commercetools.api.models.error.EnumValuesMustMatchErrorBuilder enumValuesMustMatchBuilder() {
       return com.commercetools.api.models.error.EnumValuesMustMatchErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ExtensionBadResponseErrorBuilder extensionBadResponseBuilder() {
       return com.commercetools.api.models.error.ExtensionBadResponseErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ExtensionNoResponseErrorBuilder extensionNoResponseBuilder() {
       return com.commercetools.api.models.error.ExtensionNoResponseErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedErrorBuilder extensionPredicateEvaluationFailedBuilder() {
       return com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ExtensionUpdateActionsFailedErrorBuilder extensionUpdateActionsFailedBuilder() {
       return com.commercetools.api.models.error.ExtensionUpdateActionsFailedErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ExternalOAuthFailedErrorBuilder externalOAuthFailedBuilder() {
       return com.commercetools.api.models.error.ExternalOAuthFailedErrorBuilder.of();
    }
    public com.commercetools.api.models.error.FeatureRemovedErrorBuilder featureRemovedBuilder() {
       return com.commercetools.api.models.error.FeatureRemovedErrorBuilder.of();
    }
    public com.commercetools.api.models.error.GeneralErrorBuilder generalBuilder() {
       return com.commercetools.api.models.error.GeneralErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InsufficientScopeErrorBuilder insufficientScopeBuilder() {
       return com.commercetools.api.models.error.InsufficientScopeErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InternalConstraintViolatedErrorBuilder internalConstraintViolatedBuilder() {
       return com.commercetools.api.models.error.InternalConstraintViolatedErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InvalidCredentialsErrorBuilder invalidCredentialsBuilder() {
       return com.commercetools.api.models.error.InvalidCredentialsErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InvalidCurrentPasswordErrorBuilder invalidCurrentPasswordBuilder() {
       return com.commercetools.api.models.error.InvalidCurrentPasswordErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InvalidFieldErrorBuilder invalidFieldBuilder() {
       return com.commercetools.api.models.error.InvalidFieldErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InvalidInputErrorBuilder invalidInputBuilder() {
       return com.commercetools.api.models.error.InvalidInputErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InvalidItemShippingDetailsErrorBuilder invalidItemShippingDetailsBuilder() {
       return com.commercetools.api.models.error.InvalidItemShippingDetailsErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InvalidJsonInputErrorBuilder invalidJsonInputBuilder() {
       return com.commercetools.api.models.error.InvalidJsonInputErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InvalidOperationErrorBuilder invalidOperationBuilder() {
       return com.commercetools.api.models.error.InvalidOperationErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InvalidSubjectErrorBuilder invalidSubjectBuilder() {
       return com.commercetools.api.models.error.InvalidSubjectErrorBuilder.of();
    }
    public com.commercetools.api.models.error.InvalidTokenErrorBuilder invalidTokenBuilder() {
       return com.commercetools.api.models.error.InvalidTokenErrorBuilder.of();
    }
    public com.commercetools.api.models.error.LanguageUsedInStoresErrorBuilder languageUsedInStoresBuilder() {
       return com.commercetools.api.models.error.LanguageUsedInStoresErrorBuilder.of();
    }
    public com.commercetools.api.models.error.MatchingPriceNotFoundErrorBuilder matchingPriceNotFoundBuilder() {
       return com.commercetools.api.models.error.MatchingPriceNotFoundErrorBuilder.of();
    }
    public com.commercetools.api.models.error.MaxResourceLimitExceededErrorBuilder maxResourceLimitExceededBuilder() {
       return com.commercetools.api.models.error.MaxResourceLimitExceededErrorBuilder.of();
    }
    public com.commercetools.api.models.error.MissingRoleOnChannelErrorBuilder missingRoleOnChannelBuilder() {
       return com.commercetools.api.models.error.MissingRoleOnChannelErrorBuilder.of();
    }
    public com.commercetools.api.models.error.MissingTaxRateForCountryErrorBuilder missingTaxRateForCountryBuilder() {
       return com.commercetools.api.models.error.MissingTaxRateForCountryErrorBuilder.of();
    }
    public com.commercetools.api.models.error.MoneyOverflowErrorBuilder moneyOverflowBuilder() {
       return com.commercetools.api.models.error.MoneyOverflowErrorBuilder.of();
    }
    public com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorBuilder noMatchingProductDiscountFoundBuilder() {
       return com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorBuilder.of();
    }
    public com.commercetools.api.models.error.NotEnabledErrorBuilder notEnabledBuilder() {
       return com.commercetools.api.models.error.NotEnabledErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ObjectNotFoundErrorBuilder objectNotFoundBuilder() {
       return com.commercetools.api.models.error.ObjectNotFoundErrorBuilder.of();
    }
    public com.commercetools.api.models.error.OutOfStockErrorBuilder outOfStockBuilder() {
       return com.commercetools.api.models.error.OutOfStockErrorBuilder.of();
    }
    public com.commercetools.api.models.error.OverCapacityErrorBuilder overCapacityBuilder() {
       return com.commercetools.api.models.error.OverCapacityErrorBuilder.of();
    }
    public com.commercetools.api.models.error.OverlappingStandalonePriceValidityErrorBuilder overlappingStandalonePriceValidityBuilder() {
       return com.commercetools.api.models.error.OverlappingStandalonePriceValidityErrorBuilder.of();
    }
    public com.commercetools.api.models.error.PendingOperationErrorBuilder pendingOperationBuilder() {
       return com.commercetools.api.models.error.PendingOperationErrorBuilder.of();
    }
    public com.commercetools.api.models.error.PriceChangedErrorBuilder priceChangedBuilder() {
       return com.commercetools.api.models.error.PriceChangedErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ProductAssignmentMissingErrorBuilder productAssignmentMissingBuilder() {
       return com.commercetools.api.models.error.ProductAssignmentMissingErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionErrorBuilder productPresentWithDifferentVariantSelectionBuilder() {
       return com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesErrorBuilder projectNotConfiguredForLanguagesBuilder() {
       return com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesErrorBuilder.of();
    }
    public com.commercetools.api.models.error.QueryComplexityLimitExceededErrorBuilder queryComplexityLimitExceededBuilder() {
       return com.commercetools.api.models.error.QueryComplexityLimitExceededErrorBuilder.of();
    }
    public com.commercetools.api.models.error.QueryTimedOutErrorBuilder queryTimedOutBuilder() {
       return com.commercetools.api.models.error.QueryTimedOutErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ReferenceExistsErrorBuilder referenceExistsBuilder() {
       return com.commercetools.api.models.error.ReferenceExistsErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ReferencedResourceNotFoundErrorBuilder referencedResourceNotFoundBuilder() {
       return com.commercetools.api.models.error.ReferencedResourceNotFoundErrorBuilder.of();
    }
    public com.commercetools.api.models.error.RequiredFieldErrorBuilder requiredFieldBuilder() {
       return com.commercetools.api.models.error.RequiredFieldErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ResourceNotFoundErrorBuilder resourceNotFoundBuilder() {
       return com.commercetools.api.models.error.ResourceNotFoundErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ResourceSizeLimitExceededErrorBuilder resourceSizeLimitExceededBuilder() {
       return com.commercetools.api.models.error.ResourceSizeLimitExceededErrorBuilder.of();
    }
    public com.commercetools.api.models.error.SearchDeactivatedErrorBuilder searchDeactivatedBuilder() {
       return com.commercetools.api.models.error.SearchDeactivatedErrorBuilder.of();
    }
    public com.commercetools.api.models.error.SearchExecutionFailureErrorBuilder searchExecutionFailureBuilder() {
       return com.commercetools.api.models.error.SearchExecutionFailureErrorBuilder.of();
    }
    public com.commercetools.api.models.error.SearchFacetPathNotFoundErrorBuilder searchFacetPathNotFoundBuilder() {
       return com.commercetools.api.models.error.SearchFacetPathNotFoundErrorBuilder.of();
    }
    public com.commercetools.api.models.error.SearchIndexingInProgressErrorBuilder searchIndexingInProgressBuilder() {
       return com.commercetools.api.models.error.SearchIndexingInProgressErrorBuilder.of();
    }
    public com.commercetools.api.models.error.SemanticErrorErrorBuilder semanticErrorBuilder() {
       return com.commercetools.api.models.error.SemanticErrorErrorBuilder.of();
    }
    public com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartErrorBuilder shippingMethodDoesNotMatchCartBuilder() {
       return com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartErrorBuilder.of();
    }
    public com.commercetools.api.models.error.SyntaxErrorErrorBuilder syntaxErrorBuilder() {
       return com.commercetools.api.models.error.SyntaxErrorErrorBuilder.of();
    }

    /**
     * factory method for an instance of ErrorObjectBuilder
     * @return builder 
     */
    public static ErrorObjectBuilder of() {
        return new ErrorObjectBuilder();
    }

}
