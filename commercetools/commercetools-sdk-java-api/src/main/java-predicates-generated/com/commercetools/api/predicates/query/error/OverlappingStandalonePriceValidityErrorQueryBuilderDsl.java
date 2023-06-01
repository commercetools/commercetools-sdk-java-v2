package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OverlappingStandalonePriceValidityErrorQueryBuilderDsl  {
    public OverlappingStandalonePriceValidityErrorQueryBuilderDsl() {
    }

    public static OverlappingStandalonePriceValidityErrorQueryBuilderDsl of() {
        return new OverlappingStandalonePriceValidityErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> conflictingStandalonePrice(
        Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("conflictingStandalonePrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl.of())),
            OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
        p -> new CombinationQueryPredicate<>(p, OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
        p -> new CombinationQueryPredicate<>(p, OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> customerGroup(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customerGroup"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl.of())),
            OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> channel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("channel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of);
    }
    
    public DateTimeComparisonPredicateBuilder<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
        p -> new CombinationQueryPredicate<>(p, OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
        p -> new CombinationQueryPredicate<>(p, OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> conflictingValidFrom() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingValidFrom")),
        p -> new CombinationQueryPredicate<>(p, OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OverlappingStandalonePriceValidityErrorQueryBuilderDsl> conflictingValidUntil() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingValidUntil")),
        p -> new CombinationQueryPredicate<>(p, OverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }
    
}
