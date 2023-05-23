
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DuplicateStandalonePriceScopeErrorQueryBuilderDsl {
    public DuplicateStandalonePriceScopeErrorQueryBuilderDsl() {
    }

    public static DuplicateStandalonePriceScopeErrorQueryBuilderDsl of() {
        return new DuplicateStandalonePriceScopeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DuplicateStandalonePriceScopeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, DuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DuplicateStandalonePriceScopeErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, DuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DuplicateStandalonePriceScopeErrorQueryBuilderDsl> conflictingStandalonePrice(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("conflictingStandalonePrice"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl
                            .of())),
            DuplicateStandalonePriceScopeErrorQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DuplicateStandalonePriceScopeErrorQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, DuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DuplicateStandalonePriceScopeErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, DuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DuplicateStandalonePriceScopeErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, DuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DuplicateStandalonePriceScopeErrorQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            DuplicateStandalonePriceScopeErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DuplicateStandalonePriceScopeErrorQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            DuplicateStandalonePriceScopeErrorQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<DuplicateStandalonePriceScopeErrorQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, DuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DuplicateStandalonePriceScopeErrorQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, DuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

}
