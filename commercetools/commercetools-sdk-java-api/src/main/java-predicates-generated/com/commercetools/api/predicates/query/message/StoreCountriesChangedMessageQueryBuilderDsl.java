
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreCountriesChangedMessageQueryBuilderDsl {
    public StoreCountriesChangedMessageQueryBuilderDsl() {
    }

    public static StoreCountriesChangedMessageQueryBuilderDsl of() {
        return new StoreCountriesChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreCountriesChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StoreCountriesChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreCountriesChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreCountriesChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCountriesChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreCountriesChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreCountriesChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreCountriesChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreCountriesChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCountriesChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreCountriesChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreCountriesChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreCountriesChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCountriesChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreCountriesChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreCountriesChangedMessageQueryBuilderDsl> addedCountries(
            Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addedCountries"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreCountriesChangedMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreCountriesChangedMessageQueryBuilderDsl> addedCountries() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedCountries")),
            p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCountriesChangedMessageQueryBuilderDsl> removedCountries(
            Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("removedCountries"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreCountriesChangedMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreCountriesChangedMessageQueryBuilderDsl> removedCountries() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedCountries")),
            p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessageQueryBuilderDsl::of));
    }

}
