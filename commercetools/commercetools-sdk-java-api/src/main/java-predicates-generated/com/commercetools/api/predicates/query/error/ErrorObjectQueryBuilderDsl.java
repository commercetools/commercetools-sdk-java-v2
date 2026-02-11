
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ErrorObjectQueryBuilderDsl {
    public ErrorObjectQueryBuilderDsl() {
    }

    public static ErrorObjectQueryBuilderDsl of() {
        return new ErrorObjectQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ErrorObjectQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ErrorObjectQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ErrorObjectQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ErrorObjectQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asAnonymousIdAlreadyInUse(
            Function<com.commercetools.api.predicates.query.error.AnonymousIdAlreadyInUseErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.AnonymousIdAlreadyInUseErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.AnonymousIdAlreadyInUseErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asAssociateMissingPermission(
            Function<com.commercetools.api.predicates.query.error.AssociateMissingPermissionErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.AssociateMissingPermissionErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.AssociateMissingPermissionErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asAttributeDefinitionAlreadyExists(
            Function<com.commercetools.api.predicates.query.error.AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asAttributeDefinitionTypeConflict(
            Function<com.commercetools.api.predicates.query.error.AttributeDefinitionTypeConflictErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.AttributeDefinitionTypeConflictErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.AttributeDefinitionTypeConflictErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asAttributeNameDoesNotExist(
            Function<com.commercetools.api.predicates.query.error.AttributeNameDoesNotExistErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.AttributeNameDoesNotExistErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.AttributeNameDoesNotExistErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asBadGateway(
            Function<com.commercetools.api.predicates.query.error.BadGatewayErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.BadGatewayErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.BadGatewayErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asConcurrentModification(
            Function<com.commercetools.api.predicates.query.error.ConcurrentModificationErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ConcurrentModificationErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ConcurrentModificationErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asContentTooLarge(
            Function<com.commercetools.api.predicates.query.error.ContentTooLargeErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ContentTooLargeErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ContentTooLargeErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asCountryNotConfiguredInStore(
            Function<com.commercetools.api.predicates.query.error.CountryNotConfiguredInStoreErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.CountryNotConfiguredInStoreErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.CountryNotConfiguredInStoreErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asDiscountCodeNonApplicable(
            Function<com.commercetools.api.predicates.query.error.DiscountCodeNonApplicableErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.DiscountCodeNonApplicableErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.DiscountCodeNonApplicableErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asDuplicateAttributeValue(
            Function<com.commercetools.api.predicates.query.error.DuplicateAttributeValueErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.DuplicateAttributeValueErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.DuplicateAttributeValueErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asDuplicateAttributeValues(
            Function<com.commercetools.api.predicates.query.error.DuplicateAttributeValuesErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.DuplicateAttributeValuesErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.DuplicateAttributeValuesErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asDuplicateEnumValues(
            Function<com.commercetools.api.predicates.query.error.DuplicateEnumValuesErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.DuplicateEnumValuesErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.DuplicateEnumValuesErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asDuplicateField(
            Function<com.commercetools.api.predicates.query.error.DuplicateFieldErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.DuplicateFieldErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.DuplicateFieldErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asDuplicateFieldWithConflictingResource(
            Function<com.commercetools.api.predicates.query.error.DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl
                    .of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asDuplicatePriceKey(
            Function<com.commercetools.api.predicates.query.error.DuplicatePriceKeyErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.DuplicatePriceKeyErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.DuplicatePriceKeyErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asDuplicatePriceScope(
            Function<com.commercetools.api.predicates.query.error.DuplicatePriceScopeErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.DuplicatePriceScopeErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.DuplicatePriceScopeErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asDuplicateStandalonePriceScope(
            Function<com.commercetools.api.predicates.query.error.DuplicateStandalonePriceScopeErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.DuplicateStandalonePriceScopeErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.DuplicateStandalonePriceScopeErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asDuplicateVariantValues(
            Function<com.commercetools.api.predicates.query.error.DuplicateVariantValuesErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.DuplicateVariantValuesErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.DuplicateVariantValuesErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asEditPreviewFailed(
            Function<com.commercetools.api.predicates.query.error.EditPreviewFailedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.EditPreviewFailedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.EditPreviewFailedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asEnumKeyAlreadyExists(
            Function<com.commercetools.api.predicates.query.error.EnumKeyAlreadyExistsErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.EnumKeyAlreadyExistsErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.EnumKeyAlreadyExistsErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asEnumKeyDoesNotExist(
            Function<com.commercetools.api.predicates.query.error.EnumKeyDoesNotExistErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.EnumKeyDoesNotExistErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.EnumKeyDoesNotExistErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asEnumValueIsUsed(
            Function<com.commercetools.api.predicates.query.error.EnumValueIsUsedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.EnumValueIsUsedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.EnumValueIsUsedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asEnumValuesMustMatch(
            Function<com.commercetools.api.predicates.query.error.EnumValuesMustMatchErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.EnumValuesMustMatchErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.EnumValuesMustMatchErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asExactLockConflict(
            Function<com.commercetools.api.predicates.query.error.ExactLockConflictErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExactLockConflictErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ExactLockConflictErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asExpiredCustomerEmailToken(
            Function<com.commercetools.api.predicates.query.error.ExpiredCustomerEmailTokenErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExpiredCustomerEmailTokenErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ExpiredCustomerEmailTokenErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asExpiredCustomerPasswordToken(
            Function<com.commercetools.api.predicates.query.error.ExpiredCustomerPasswordTokenErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExpiredCustomerPasswordTokenErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.ExpiredCustomerPasswordTokenErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asExtensionBadResponse(
            Function<com.commercetools.api.predicates.query.error.ExtensionBadResponseErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExtensionBadResponseErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ExtensionBadResponseErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asExtensionNoResponse(
            Function<com.commercetools.api.predicates.query.error.ExtensionNoResponseErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExtensionNoResponseErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ExtensionNoResponseErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asExtensionPredicateEvaluationFailed(
            Function<com.commercetools.api.predicates.query.error.ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asExtensionUpdateActionsFailed(
            Function<com.commercetools.api.predicates.query.error.ExtensionUpdateActionsFailedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExtensionUpdateActionsFailedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.ExtensionUpdateActionsFailedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asExternalOAuthFailed(
            Function<com.commercetools.api.predicates.query.error.ExternalOAuthFailedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExternalOAuthFailedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ExternalOAuthFailedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asFeatureRemoved(
            Function<com.commercetools.api.predicates.query.error.FeatureRemovedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.FeatureRemovedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.FeatureRemovedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asGeneral(
            Function<com.commercetools.api.predicates.query.error.GeneralErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GeneralErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GeneralErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInsufficientScope(
            Function<com.commercetools.api.predicates.query.error.InsufficientScopeErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InsufficientScopeErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InsufficientScopeErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInternalConstraintViolated(
            Function<com.commercetools.api.predicates.query.error.InternalConstraintViolatedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InternalConstraintViolatedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InternalConstraintViolatedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInvalidCredentials(
            Function<com.commercetools.api.predicates.query.error.InvalidCredentialsErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InvalidCredentialsErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InvalidCredentialsErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInvalidCurrentPassword(
            Function<com.commercetools.api.predicates.query.error.InvalidCurrentPasswordErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InvalidCurrentPasswordErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InvalidCurrentPasswordErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInvalidField(
            Function<com.commercetools.api.predicates.query.error.InvalidFieldErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InvalidFieldErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InvalidFieldErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInvalidInput(
            Function<com.commercetools.api.predicates.query.error.InvalidInputErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InvalidInputErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InvalidInputErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInvalidItemShippingDetails(
            Function<com.commercetools.api.predicates.query.error.InvalidItemShippingDetailsErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InvalidItemShippingDetailsErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InvalidItemShippingDetailsErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInvalidJsonInput(
            Function<com.commercetools.api.predicates.query.error.InvalidJsonInputErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InvalidJsonInputErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InvalidJsonInputErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInvalidOperation(
            Function<com.commercetools.api.predicates.query.error.InvalidOperationErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InvalidOperationErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InvalidOperationErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInvalidSubject(
            Function<com.commercetools.api.predicates.query.error.InvalidSubjectErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InvalidSubjectErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InvalidSubjectErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asInvalidToken(
            Function<com.commercetools.api.predicates.query.error.InvalidTokenErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.InvalidTokenErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.InvalidTokenErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asLanguageUsedInStores(
            Function<com.commercetools.api.predicates.query.error.LanguageUsedInStoresErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.LanguageUsedInStoresErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.LanguageUsedInStoresErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asLockedField(
            Function<com.commercetools.api.predicates.query.error.LockedFieldErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.LockedFieldErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.LockedFieldErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asMatchingPriceNotFound(
            Function<com.commercetools.api.predicates.query.error.MatchingPriceNotFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.MatchingPriceNotFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.MatchingPriceNotFoundErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asMaxCartDiscountsReached(
            Function<com.commercetools.api.predicates.query.error.MaxCartDiscountsReachedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.MaxCartDiscountsReachedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.MaxCartDiscountsReachedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asMaxDiscountGroupsReached(
            Function<com.commercetools.api.predicates.query.error.MaxDiscountGroupsReachedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.MaxDiscountGroupsReachedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.MaxDiscountGroupsReachedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asMaxResourceLimitExceeded(
            Function<com.commercetools.api.predicates.query.error.MaxResourceLimitExceededErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.MaxResourceLimitExceededErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.MaxResourceLimitExceededErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asMaxStoreReferencesReached(
            Function<com.commercetools.api.predicates.query.error.MaxStoreReferencesReachedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.MaxStoreReferencesReachedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.MaxStoreReferencesReachedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asMissingRoleOnChannel(
            Function<com.commercetools.api.predicates.query.error.MissingRoleOnChannelErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.MissingRoleOnChannelErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.MissingRoleOnChannelErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asMissingTaxRateForCountry(
            Function<com.commercetools.api.predicates.query.error.MissingTaxRateForCountryErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.MissingTaxRateForCountryErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.MissingTaxRateForCountryErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asMoneyOverflow(
            Function<com.commercetools.api.predicates.query.error.MoneyOverflowErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.MoneyOverflowErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.MoneyOverflowErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asNoMatchingProductDiscountFound(
            Function<com.commercetools.api.predicates.query.error.NoMatchingProductDiscountFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.NoMatchingProductDiscountFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.NoMatchingProductDiscountFoundErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asObjectNotFound(
            Function<com.commercetools.api.predicates.query.error.ObjectNotFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ObjectNotFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ObjectNotFoundErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asOutOfStock(
            Function<com.commercetools.api.predicates.query.error.OutOfStockErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.OutOfStockErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.OutOfStockErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asOverCapacity(
            Function<com.commercetools.api.predicates.query.error.OverCapacityErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.OverCapacityErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.OverCapacityErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asOverlappingStandalonePriceValidity(
            Function<com.commercetools.api.predicates.query.error.OverlappingStandalonePriceValidityErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.OverlappingStandalonePriceValidityErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.OverlappingStandalonePriceValidityErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asPendingOperation(
            Function<com.commercetools.api.predicates.query.error.PendingOperationErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.PendingOperationErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.PendingOperationErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asPriceChanged(
            Function<com.commercetools.api.predicates.query.error.PriceChangedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.PriceChangedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.PriceChangedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asProductAssignmentMissing(
            Function<com.commercetools.api.predicates.query.error.ProductAssignmentMissingErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ProductAssignmentMissingErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ProductAssignmentMissingErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asProductPresentWithDifferentVariantSelection(
            Function<com.commercetools.api.predicates.query.error.ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl
                    .of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asProjectNotConfiguredForLanguages(
            Function<com.commercetools.api.predicates.query.error.ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asQueryComplexityLimitExceeded(
            Function<com.commercetools.api.predicates.query.error.QueryComplexityLimitExceededErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.QueryComplexityLimitExceededErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.QueryComplexityLimitExceededErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asQueryTimedOut(
            Function<com.commercetools.api.predicates.query.error.QueryTimedOutErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.QueryTimedOutErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.QueryTimedOutErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asRecurringOrderFailure(
            Function<com.commercetools.api.predicates.query.error.RecurringOrderFailureErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.RecurringOrderFailureErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.RecurringOrderFailureErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asReferenceExists(
            Function<com.commercetools.api.predicates.query.error.ReferenceExistsErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ReferenceExistsErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ReferenceExistsErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asReferencedResourceNotFound(
            Function<com.commercetools.api.predicates.query.error.ReferencedResourceNotFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ReferencedResourceNotFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ReferencedResourceNotFoundErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asRequiredField(
            Function<com.commercetools.api.predicates.query.error.RequiredFieldErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.RequiredFieldErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.RequiredFieldErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asResourceNotFound(
            Function<com.commercetools.api.predicates.query.error.ResourceNotFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ResourceNotFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ResourceNotFoundErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asResourceSizeLimitExceeded(
            Function<com.commercetools.api.predicates.query.error.ResourceSizeLimitExceededErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ResourceSizeLimitExceededErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ResourceSizeLimitExceededErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asSearchDeactivated(
            Function<com.commercetools.api.predicates.query.error.SearchDeactivatedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.SearchDeactivatedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.SearchDeactivatedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asSearchExecutionFailure(
            Function<com.commercetools.api.predicates.query.error.SearchExecutionFailureErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.SearchExecutionFailureErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.SearchExecutionFailureErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asSearchFacetPathNotFound(
            Function<com.commercetools.api.predicates.query.error.SearchFacetPathNotFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.SearchFacetPathNotFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.SearchFacetPathNotFoundErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asSearchIndexingInProgress(
            Function<com.commercetools.api.predicates.query.error.SearchIndexingInProgressErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.SearchIndexingInProgressErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.SearchIndexingInProgressErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asSearchNotReady(
            Function<com.commercetools.api.predicates.query.error.SearchNotReadyErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.SearchNotReadyErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.SearchNotReadyErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asSemanticError(
            Function<com.commercetools.api.predicates.query.error.SemanticErrorErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.SemanticErrorErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.SemanticErrorErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asShippingMethodDoesNotMatchCart(
            Function<com.commercetools.api.predicates.query.error.ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asStoreCartDiscountsLimitReached(
            Function<com.commercetools.api.predicates.query.error.StoreCartDiscountsLimitReachedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.StoreCartDiscountsLimitReachedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.StoreCartDiscountsLimitReachedErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asSyntaxError(
            Function<com.commercetools.api.predicates.query.error.SyntaxErrorErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.SyntaxErrorErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.SyntaxErrorErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ErrorObjectQueryBuilderDsl> asValidityLockConflict(
            Function<com.commercetools.api.predicates.query.error.ValidityLockConflictErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ValidityLockConflictErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.ValidityLockConflictErrorQueryBuilderDsl.of()),
            ErrorObjectQueryBuilderDsl::of);
    }
}
