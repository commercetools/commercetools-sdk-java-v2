
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceUpdateActionQueryBuilderDsl {
    public StandalonePriceUpdateActionQueryBuilderDsl() {
    }

    public static StandalonePriceUpdateActionQueryBuilderDsl of() {
        return new StandalonePriceUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asAddPriceTier(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceAddPriceTierActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceAddPriceTierActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceAddPriceTierActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asApplyStagedChanges(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceApplyStagedChangesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceApplyStagedChangesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceApplyStagedChangesActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asChangeActive(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceChangeActiveActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceChangeActiveActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceChangeActiveActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asChangeValue(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceChangeValueActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceChangeValueActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceChangeValueActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asRemovePriceTier(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceRemovePriceTierActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceRemovePriceTierActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceRemovePriceTierActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asRemoveStagedChanges(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceRemoveStagedChangesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceRemoveStagedChangesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceRemoveStagedChangesActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetCustomFieldActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetCustomTypeActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asSetDiscountedPrice(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetDiscountedPriceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetDiscountedPriceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetDiscountedPriceActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetKeyActionQueryBuilderDsl.of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asSetPriceTiers(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetPriceTiersActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetPriceTiersActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetPriceTiersActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asSetValidFrom(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetValidFromActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetValidFromActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetValidFromActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asSetValidFromAndUntil(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceUpdateActionQueryBuilderDsl> asSetValidUntil(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetValidUntilActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetValidUntilActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.standalone_price.StandalonePriceSetValidUntilActionQueryBuilderDsl
                    .of()),
            StandalonePriceUpdateActionQueryBuilderDsl::of);
    }
}
