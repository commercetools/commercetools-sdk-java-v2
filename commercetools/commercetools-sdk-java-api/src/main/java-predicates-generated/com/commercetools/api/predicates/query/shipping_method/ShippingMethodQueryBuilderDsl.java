
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodQueryBuilderDsl {
    public ShippingMethodQueryBuilderDsl() {
    }

    public static ShippingMethodQueryBuilderDsl of() {
        return new ShippingMethodQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShippingMethodQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ShippingMethodQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ShippingMethodQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ShippingMethodQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ShippingMethodQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ShippingMethodQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodQueryBuilderDsl> localizedName(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("localizedName"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShippingMethodQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ShippingMethodQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodQueryBuilderDsl> localizedDescription(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("localizedDescription"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShippingMethodQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl.of())),
            ShippingMethodQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodQueryBuilderDsl> zoneRates(
            Function<com.commercetools.api.predicates.query.shipping_method.ZoneRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ZoneRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("zoneRates"))
                .inner(fn.apply(com.commercetools.api.predicates.query.shipping_method.ZoneRateQueryBuilderDsl.of())),
            ShippingMethodQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShippingMethodQueryBuilderDsl> zoneRates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("zoneRates")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ShippingMethodQueryBuilderDsl> isDefault() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isDefault")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ShippingMethodQueryBuilderDsl::of);
    }

}
