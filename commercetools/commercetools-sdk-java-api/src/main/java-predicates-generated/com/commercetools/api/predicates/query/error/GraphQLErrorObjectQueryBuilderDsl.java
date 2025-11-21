
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLErrorObjectQueryBuilderDsl {
    public GraphQLErrorObjectQueryBuilderDsl() {
    }

    public static GraphQLErrorObjectQueryBuilderDsl of() {
        return new GraphQLErrorObjectQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLErrorObjectQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLErrorObjectQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asAnonymousIdAlreadyInUse(
            Function<com.commercetools.api.predicates.query.error.GraphQLAnonymousIdAlreadyInUseErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLAnonymousIdAlreadyInUseErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLAnonymousIdAlreadyInUseErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asAssociateMissingPermission(
            Function<com.commercetools.api.predicates.query.error.GraphQLAssociateMissingPermissionErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLAssociateMissingPermissionErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLAssociateMissingPermissionErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asAttributeDefinitionAlreadyExists(
            Function<com.commercetools.api.predicates.query.error.GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl
                    .of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asAttributeDefinitionTypeConflict(
            Function<com.commercetools.api.predicates.query.error.GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl
                    .of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asAttributeNameDoesNotExist(
            Function<com.commercetools.api.predicates.query.error.GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asBadGateway(
            Function<com.commercetools.api.predicates.query.error.GraphQLBadGatewayErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLBadGatewayErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLBadGatewayErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asConcurrentModification(
            Function<com.commercetools.api.predicates.query.error.GraphQLConcurrentModificationErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLConcurrentModificationErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLConcurrentModificationErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asContentTooLarge(
            Function<com.commercetools.api.predicates.query.error.GraphQLContentTooLargeErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLContentTooLargeErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLContentTooLargeErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asCountryNotConfiguredInStore(
            Function<com.commercetools.api.predicates.query.error.GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asDiscountCodeNonApplicable(
            Function<com.commercetools.api.predicates.query.error.GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asDuplicateAttributeValue(
            Function<com.commercetools.api.predicates.query.error.GraphQLDuplicateAttributeValueErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLDuplicateAttributeValueErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLDuplicateAttributeValueErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asDuplicateAttributeValues(
            Function<com.commercetools.api.predicates.query.error.GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asDuplicateEnumValues(
            Function<com.commercetools.api.predicates.query.error.GraphQLDuplicateEnumValuesErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLDuplicateEnumValuesErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLDuplicateEnumValuesErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asDuplicateField(
            Function<com.commercetools.api.predicates.query.error.GraphQLDuplicateFieldErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLDuplicateFieldErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLDuplicateFieldErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asDuplicateFieldWithConflictingResource(
            Function<com.commercetools.api.predicates.query.error.GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl
                    .of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asDuplicatePriceKey(
            Function<com.commercetools.api.predicates.query.error.GraphQLDuplicatePriceKeyErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLDuplicatePriceKeyErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLDuplicatePriceKeyErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asDuplicatePriceScope(
            Function<com.commercetools.api.predicates.query.error.GraphQLDuplicatePriceScopeErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLDuplicatePriceScopeErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLDuplicatePriceScopeErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asDuplicateStandalonePriceScope(
            Function<com.commercetools.api.predicates.query.error.GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asDuplicateVariantValues(
            Function<com.commercetools.api.predicates.query.error.GraphQLDuplicateVariantValuesErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLDuplicateVariantValuesErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLDuplicateVariantValuesErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asEditPreviewFailed(
            Function<com.commercetools.api.predicates.query.error.GraphQLEditPreviewFailedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLEditPreviewFailedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLEditPreviewFailedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asEnumKeyAlreadyExists(
            Function<com.commercetools.api.predicates.query.error.GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asEnumKeyDoesNotExist(
            Function<com.commercetools.api.predicates.query.error.GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asEnumValueIsUsed(
            Function<com.commercetools.api.predicates.query.error.GraphQLEnumValueIsUsedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLEnumValueIsUsedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLEnumValueIsUsedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asEnumValuesMustMatch(
            Function<com.commercetools.api.predicates.query.error.GraphQLEnumValuesMustMatchErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLEnumValuesMustMatchErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLEnumValuesMustMatchErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asExpiredCustomerEmailToken(
            Function<com.commercetools.api.predicates.query.error.GraphQLExpiredCustomerEmailTokenErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLExpiredCustomerEmailTokenErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLExpiredCustomerEmailTokenErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asExpiredCustomerPasswordToken(
            Function<com.commercetools.api.predicates.query.error.GraphQLExpiredCustomerPasswordTokenErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLExpiredCustomerPasswordTokenErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLExpiredCustomerPasswordTokenErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asExtensionBadResponse(
            Function<com.commercetools.api.predicates.query.error.GraphQLExtensionBadResponseErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLExtensionBadResponseErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLExtensionBadResponseErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asExtensionNoResponse(
            Function<com.commercetools.api.predicates.query.error.GraphQLExtensionNoResponseErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLExtensionNoResponseErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLExtensionNoResponseErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asExtensionPredicateEvaluationFailed(
            Function<com.commercetools.api.predicates.query.error.GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl
                    .of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asExtensionUpdateActionsFailed(
            Function<com.commercetools.api.predicates.query.error.GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asExternalOAuthFailed(
            Function<com.commercetools.api.predicates.query.error.GraphQLExternalOAuthFailedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLExternalOAuthFailedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLExternalOAuthFailedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asFeatureRemoved(
            Function<com.commercetools.api.predicates.query.error.GraphQLFeatureRemovedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLFeatureRemovedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLFeatureRemovedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asGeneral(
            Function<com.commercetools.api.predicates.query.error.GraphQLGeneralErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLGeneralErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLGeneralErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInsufficientScope(
            Function<com.commercetools.api.predicates.query.error.GraphQLInsufficientScopeErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInsufficientScopeErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLInsufficientScopeErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInternalConstraintViolated(
            Function<com.commercetools.api.predicates.query.error.GraphQLInternalConstraintViolatedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInternalConstraintViolatedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLInternalConstraintViolatedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInvalidCredentials(
            Function<com.commercetools.api.predicates.query.error.GraphQLInvalidCredentialsErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInvalidCredentialsErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLInvalidCredentialsErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInvalidCurrentPassword(
            Function<com.commercetools.api.predicates.query.error.GraphQLInvalidCurrentPasswordErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInvalidCurrentPasswordErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLInvalidCurrentPasswordErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInvalidField(
            Function<com.commercetools.api.predicates.query.error.GraphQLInvalidFieldErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInvalidFieldErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLInvalidFieldErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInvalidInput(
            Function<com.commercetools.api.predicates.query.error.GraphQLInvalidInputErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInvalidInputErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLInvalidInputErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInvalidItemShippingDetails(
            Function<com.commercetools.api.predicates.query.error.GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInvalidJsonInput(
            Function<com.commercetools.api.predicates.query.error.GraphQLInvalidJsonInputErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInvalidJsonInputErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLInvalidJsonInputErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInvalidOperation(
            Function<com.commercetools.api.predicates.query.error.GraphQLInvalidOperationErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInvalidOperationErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLInvalidOperationErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInvalidSubject(
            Function<com.commercetools.api.predicates.query.error.GraphQLInvalidSubjectErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInvalidSubjectErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLInvalidSubjectErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asInvalidToken(
            Function<com.commercetools.api.predicates.query.error.GraphQLInvalidTokenErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLInvalidTokenErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLInvalidTokenErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asLanguageUsedInStores(
            Function<com.commercetools.api.predicates.query.error.GraphQLLanguageUsedInStoresErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLLanguageUsedInStoresErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLLanguageUsedInStoresErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asLockedField(
            Function<com.commercetools.api.predicates.query.error.GraphQLLockedFieldErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLLockedFieldErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLLockedFieldErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asMatchingPriceNotFound(
            Function<com.commercetools.api.predicates.query.error.GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asMaxCartDiscountsReached(
            Function<com.commercetools.api.predicates.query.error.GraphQLMaxCartDiscountsReachedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLMaxCartDiscountsReachedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLMaxCartDiscountsReachedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asMaxDiscountGroupsReached(
            Function<com.commercetools.api.predicates.query.error.GraphQLMaxDiscountGroupsReachedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLMaxDiscountGroupsReachedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLMaxDiscountGroupsReachedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asMaxResourceLimitExceeded(
            Function<com.commercetools.api.predicates.query.error.GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asMaxStoreReferencesReached(
            Function<com.commercetools.api.predicates.query.error.GraphQLMaxStoreReferencesReachedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLMaxStoreReferencesReachedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLMaxStoreReferencesReachedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asMissingRoleOnChannel(
            Function<com.commercetools.api.predicates.query.error.GraphQLMissingRoleOnChannelErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLMissingRoleOnChannelErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLMissingRoleOnChannelErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asMissingTaxRateForCountry(
            Function<com.commercetools.api.predicates.query.error.GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asMoneyOverflow(
            Function<com.commercetools.api.predicates.query.error.GraphQLMoneyOverflowErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLMoneyOverflowErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLMoneyOverflowErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asNoMatchingProductDiscountFound(
            Function<com.commercetools.api.predicates.query.error.GraphQLNoMatchingProductDiscountFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLNoMatchingProductDiscountFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLNoMatchingProductDiscountFoundErrorQueryBuilderDsl
                    .of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asObjectNotFound(
            Function<com.commercetools.api.predicates.query.error.GraphQLObjectNotFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLObjectNotFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLObjectNotFoundErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asOutOfStock(
            Function<com.commercetools.api.predicates.query.error.GraphQLOutOfStockErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLOutOfStockErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLOutOfStockErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asOverCapacity(
            Function<com.commercetools.api.predicates.query.error.GraphQLOverCapacityErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLOverCapacityErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLOverCapacityErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asOverlappingStandalonePriceValidity(
            Function<com.commercetools.api.predicates.query.error.GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl
                    .of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asPendingOperation(
            Function<com.commercetools.api.predicates.query.error.GraphQLPendingOperationErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLPendingOperationErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLPendingOperationErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asPriceChanged(
            Function<com.commercetools.api.predicates.query.error.GraphQLPriceChangedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLPriceChangedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLPriceChangedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asProductAssignmentMissing(
            Function<com.commercetools.api.predicates.query.error.GraphQLProductAssignmentMissingErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLProductAssignmentMissingErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLProductAssignmentMissingErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asProductPresentWithDifferentVariantSelection(
            Function<com.commercetools.api.predicates.query.error.GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl
                    .of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asProjectNotConfiguredForLanguages(
            Function<com.commercetools.api.predicates.query.error.GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl
                    .of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asQueryComplexityLimitExceeded(
            Function<com.commercetools.api.predicates.query.error.GraphQLQueryComplexityLimitExceededErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLQueryComplexityLimitExceededErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLQueryComplexityLimitExceededErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asQueryTimedOut(
            Function<com.commercetools.api.predicates.query.error.GraphQLQueryTimedOutErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLQueryTimedOutErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLQueryTimedOutErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asRecurringOrderFailure(
            Function<com.commercetools.api.predicates.query.error.GraphQLRecurringOrderFailureErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLRecurringOrderFailureErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLRecurringOrderFailureErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asReferenceExists(
            Function<com.commercetools.api.predicates.query.error.GraphQLReferenceExistsErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLReferenceExistsErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLReferenceExistsErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asReferencedResourceNotFound(
            Function<com.commercetools.api.predicates.query.error.GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asRequiredField(
            Function<com.commercetools.api.predicates.query.error.GraphQLRequiredFieldErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLRequiredFieldErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLRequiredFieldErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asResourceNotFound(
            Function<com.commercetools.api.predicates.query.error.GraphQLResourceNotFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLResourceNotFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLResourceNotFoundErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asResourceSizeLimitExceeded(
            Function<com.commercetools.api.predicates.query.error.GraphQLResourceSizeLimitExceededErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLResourceSizeLimitExceededErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLResourceSizeLimitExceededErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asSearchDeactivated(
            Function<com.commercetools.api.predicates.query.error.GraphQLSearchDeactivatedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLSearchDeactivatedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLSearchDeactivatedErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asSearchExecutionFailure(
            Function<com.commercetools.api.predicates.query.error.GraphQLSearchExecutionFailureErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLSearchExecutionFailureErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLSearchExecutionFailureErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asSearchFacetPathNotFound(
            Function<com.commercetools.api.predicates.query.error.GraphQLSearchFacetPathNotFoundErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLSearchFacetPathNotFoundErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLSearchFacetPathNotFoundErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asSearchIndexingInProgress(
            Function<com.commercetools.api.predicates.query.error.GraphQLSearchIndexingInProgressErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLSearchIndexingInProgressErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.error.GraphQLSearchIndexingInProgressErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asSearchNotReady(
            Function<com.commercetools.api.predicates.query.error.GraphQLSearchNotReadyErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLSearchNotReadyErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLSearchNotReadyErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asSemanticError(
            Function<com.commercetools.api.predicates.query.error.GraphQLSemanticErrorErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLSemanticErrorErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLSemanticErrorErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asShippingMethodDoesNotMatchCart(
            Function<com.commercetools.api.predicates.query.error.GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl
                    .of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asStoreCartDiscountsLimitReached(
            Function<com.commercetools.api.predicates.query.error.GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.error.GraphQLStoreCartDiscountsLimitReachedErrorQueryBuilderDsl
                    .of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLErrorObjectQueryBuilderDsl> asSyntaxError(
            Function<com.commercetools.api.predicates.query.error.GraphQLSyntaxErrorErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLSyntaxErrorErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.GraphQLSyntaxErrorErrorQueryBuilderDsl.of()),
            GraphQLErrorObjectQueryBuilderDsl::of);
    }
}
