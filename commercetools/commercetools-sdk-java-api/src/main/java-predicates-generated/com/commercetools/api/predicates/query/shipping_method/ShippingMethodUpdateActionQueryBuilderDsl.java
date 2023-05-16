
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodUpdateActionQueryBuilderDsl {
    public ShippingMethodUpdateActionQueryBuilderDsl() {
    }

    public static ShippingMethodUpdateActionQueryBuilderDsl of() {
        return new ShippingMethodUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asAddShippingRate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodAddShippingRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodAddShippingRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodAddShippingRateActionQueryBuilderDsl
                    .of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asAddZone(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodAddZoneActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodAddZoneActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.shipping_method.ShippingMethodAddZoneActionQueryBuilderDsl.of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asChangeIsDefault(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodChangeIsDefaultActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodChangeIsDefaultActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodChangeIsDefaultActionQueryBuilderDsl
                    .of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodChangeNameActionQueryBuilderDsl.of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asChangeTaxCategory(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodChangeTaxCategoryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodChangeTaxCategoryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodChangeTaxCategoryActionQueryBuilderDsl
                    .of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asRemoveShippingRate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodRemoveShippingRateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodRemoveShippingRateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodRemoveShippingRateActionQueryBuilderDsl
                    .of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asRemoveZone(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodRemoveZoneActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodRemoveZoneActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodRemoveZoneActionQueryBuilderDsl.of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetCustomFieldActionQueryBuilderDsl
                    .of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetCustomTypeActionQueryBuilderDsl
                    .of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetDescriptionActionQueryBuilderDsl
                    .of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetKeyActionQueryBuilderDsl.of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asSetLocalizedDescription(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl
                    .of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asSetLocalizedName(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetLocalizedNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetLocalizedNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetLocalizedNameActionQueryBuilderDsl
                    .of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodUpdateActionQueryBuilderDsl> asSetPredicate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetPredicateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetPredicateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shipping_method.ShippingMethodSetPredicateActionQueryBuilderDsl
                    .of()),
            ShippingMethodUpdateActionQueryBuilderDsl::of);
    }
}
