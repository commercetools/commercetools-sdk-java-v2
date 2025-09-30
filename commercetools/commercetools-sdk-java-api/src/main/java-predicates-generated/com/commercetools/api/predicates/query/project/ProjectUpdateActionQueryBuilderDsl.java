
package com.commercetools.api.predicates.query.project;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProjectUpdateActionQueryBuilderDsl {
    public ProjectUpdateActionQueryBuilderDsl() {
    }

    public static ProjectUpdateActionQueryBuilderDsl of() {
        return new ProjectUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeBusinessUnitSearchStatus(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl
                    .of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeMyBusinessUnitStatusOnCreation(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl
                    .of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeCartsConfiguration(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeCartsConfigurationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeCartsConfigurationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectChangeCartsConfigurationActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeCountries(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeCountriesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeCountriesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.project.ProjectChangeCountriesActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeCountryTaxRateFallbackEnabled(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl
                    .of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeCurrencies(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeCurrenciesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeCurrenciesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.project.ProjectChangeCurrenciesActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeCustomerSearchStatus(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeCustomerSearchStatusActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeCustomerSearchStatusActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectChangeCustomerSearchStatusActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeLanguages(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeLanguagesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeLanguagesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.project.ProjectChangeLanguagesActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeMessagesConfiguration(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeMessagesConfigurationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeMessagesConfigurationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectChangeMessagesConfigurationActionQueryBuilderDsl
                    .of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.project.ProjectChangeNameActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeOrderSearchStatus(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeOrderSearchStatusActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeOrderSearchStatusActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectChangeOrderSearchStatusActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangePriceRoundingMode(
            Function<com.commercetools.api.predicates.query.project.ProjectChangePriceRoundingModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangePriceRoundingModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectChangePriceRoundingModeActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeProductSearchIndexingEnabled(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl
                    .of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeShoppingListsConfiguration(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl
                    .of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asChangeTaxRoundingMode(
            Function<com.commercetools.api.predicates.query.project.ProjectChangeTaxRoundingModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectChangeTaxRoundingModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.project.ProjectChangeTaxRoundingModeActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asSetMyBusinessUnitAssociateRoleOnCreation(
            Function<com.commercetools.api.predicates.query.project.ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectSetBusinessUnitAssociateRoleOnCreationActionQueryBuilderDsl
                    .of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asSetDiscountsConfiguration(
            Function<com.commercetools.api.predicates.query.project.ProjectSetDiscountsConfigurationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectSetDiscountsConfigurationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectSetDiscountsConfigurationActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asSetExternalOAuth(
            Function<com.commercetools.api.predicates.query.project.ProjectSetExternalOAuthActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectSetExternalOAuthActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.project.ProjectSetExternalOAuthActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProjectUpdateActionQueryBuilderDsl> asSetShippingRateInputType(
            Function<com.commercetools.api.predicates.query.project.ProjectSetShippingRateInputTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectSetShippingRateInputTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.project.ProjectSetShippingRateInputTypeActionQueryBuilderDsl.of()),
            ProjectUpdateActionQueryBuilderDsl::of);
    }
}
