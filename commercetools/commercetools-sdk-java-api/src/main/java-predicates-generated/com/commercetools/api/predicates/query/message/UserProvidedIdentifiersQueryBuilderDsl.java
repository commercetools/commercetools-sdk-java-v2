
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class UserProvidedIdentifiersQueryBuilderDsl {
    public UserProvidedIdentifiersQueryBuilderDsl() {
    }

    public static UserProvidedIdentifiersQueryBuilderDsl of() {
        return new UserProvidedIdentifiersQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<UserProvidedIdentifiersQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, UserProvidedIdentifiersQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<UserProvidedIdentifiersQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
            p -> new CombinationQueryPredicate<>(p, UserProvidedIdentifiersQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<UserProvidedIdentifiersQueryBuilderDsl> orderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderNumber")),
            p -> new CombinationQueryPredicate<>(p, UserProvidedIdentifiersQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<UserProvidedIdentifiersQueryBuilderDsl> customerNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerNumber")),
            p -> new CombinationQueryPredicate<>(p, UserProvidedIdentifiersQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<UserProvidedIdentifiersQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, UserProvidedIdentifiersQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<UserProvidedIdentifiersQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            UserProvidedIdentifiersQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<UserProvidedIdentifiersQueryBuilderDsl> containerAndKey(
            Function<com.commercetools.api.predicates.query.message.ContainerAndKeyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ContainerAndKeyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("containerAndKey"))
                .inner(fn.apply(com.commercetools.api.predicates.query.message.ContainerAndKeyQueryBuilderDsl.of())),
            UserProvidedIdentifiersQueryBuilderDsl::of);
    }

}
