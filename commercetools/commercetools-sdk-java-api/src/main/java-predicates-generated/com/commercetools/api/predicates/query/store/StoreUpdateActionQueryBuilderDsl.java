
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreUpdateActionQueryBuilderDsl {
    public StoreUpdateActionQueryBuilderDsl() {
    }

    public static StoreUpdateActionQueryBuilderDsl of() {
        return new StoreUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asAddCountry(
            Function<com.commercetools.api.predicates.query.store.StoreAddCountryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreAddCountryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreAddCountryActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asAddDistributionChannel(
            Function<com.commercetools.api.predicates.query.store.StoreAddDistributionChannelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreAddDistributionChannelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.store.StoreAddDistributionChannelActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asAddProductSelection(
            Function<com.commercetools.api.predicates.query.store.StoreAddProductSelectionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreAddProductSelectionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreAddProductSelectionActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asAddSupplyChannel(
            Function<com.commercetools.api.predicates.query.store.StoreAddSupplyChannelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreAddSupplyChannelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreAddSupplyChannelActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asChangeProductSelectionActive(
            Function<com.commercetools.api.predicates.query.store.StoreChangeProductSelectionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreChangeProductSelectionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.store.StoreChangeProductSelectionActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asRemoveCountry(
            Function<com.commercetools.api.predicates.query.store.StoreRemoveCountryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreRemoveCountryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreRemoveCountryActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asRemoveDistributionChannel(
            Function<com.commercetools.api.predicates.query.store.StoreRemoveDistributionChannelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreRemoveDistributionChannelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.store.StoreRemoveDistributionChannelActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asRemoveProductSelection(
            Function<com.commercetools.api.predicates.query.store.StoreRemoveProductSelectionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreRemoveProductSelectionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.store.StoreRemoveProductSelectionActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asRemoveSupplyChannel(
            Function<com.commercetools.api.predicates.query.store.StoreRemoveSupplyChannelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreRemoveSupplyChannelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreRemoveSupplyChannelActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetCheckoutUrlTemplate(
            Function<com.commercetools.api.predicates.query.store.StoreSetCheckoutUrlTemplateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetCheckoutUrlTemplateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.store.StoreSetCheckoutUrlTemplateActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetContactUrl(
            Function<com.commercetools.api.predicates.query.store.StoreSetContactUrlActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetContactUrlActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetContactUrlActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetCookiePolicyUrl(
            Function<com.commercetools.api.predicates.query.store.StoreSetCookiePolicyUrlActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetCookiePolicyUrlActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetCookiePolicyUrlActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetCountries(
            Function<com.commercetools.api.predicates.query.store.StoreSetCountriesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetCountriesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetCountriesActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.store.StoreSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetCustomFieldActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.store.StoreSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetCustomTypeActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetDistributionChannels(
            Function<com.commercetools.api.predicates.query.store.StoreSetDistributionChannelsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetDistributionChannelsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.store.StoreSetDistributionChannelsActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetFaqUrl(
            Function<com.commercetools.api.predicates.query.store.StoreSetFaqUrlActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetFaqUrlActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetFaqUrlActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetImprintUrl(
            Function<com.commercetools.api.predicates.query.store.StoreSetImprintUrlActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetImprintUrlActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetImprintUrlActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetLanguages(
            Function<com.commercetools.api.predicates.query.store.StoreSetLanguagesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetLanguagesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetLanguagesActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetName(
            Function<com.commercetools.api.predicates.query.store.StoreSetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetNameActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetOrderUrlTemplate(
            Function<com.commercetools.api.predicates.query.store.StoreSetOrderUrlTemplateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetOrderUrlTemplateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetOrderUrlTemplateActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetPrivacyPolicyUrl(
            Function<com.commercetools.api.predicates.query.store.StoreSetPrivacyPolicyUrlActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetPrivacyPolicyUrlActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetPrivacyPolicyUrlActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetProductSelections(
            Function<com.commercetools.api.predicates.query.store.StoreSetProductSelectionsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetProductSelectionsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetProductSelectionsActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetRefundPolicyUrl(
            Function<com.commercetools.api.predicates.query.store.StoreSetRefundPolicyUrlActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetRefundPolicyUrlActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetRefundPolicyUrlActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetShippingPolicyUrl(
            Function<com.commercetools.api.predicates.query.store.StoreSetShippingPolicyUrlActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetShippingPolicyUrlActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetShippingPolicyUrlActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetSupplyChannels(
            Function<com.commercetools.api.predicates.query.store.StoreSetSupplyChannelsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetSupplyChannelsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetSupplyChannelsActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreUpdateActionQueryBuilderDsl> asSetTermsOfServiceUrl(
            Function<com.commercetools.api.predicates.query.store.StoreSetTermsOfServiceUrlActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreSetTermsOfServiceUrlActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreSetTermsOfServiceUrlActionQueryBuilderDsl.of()),
            StoreUpdateActionQueryBuilderDsl::of);
    }
}
