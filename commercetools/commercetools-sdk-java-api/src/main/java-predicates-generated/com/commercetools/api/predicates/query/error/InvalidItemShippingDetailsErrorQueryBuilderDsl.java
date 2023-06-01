package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InvalidItemShippingDetailsErrorQueryBuilderDsl  {
    public InvalidItemShippingDetailsErrorQueryBuilderDsl() {
    }

    public static InvalidItemShippingDetailsErrorQueryBuilderDsl of() {
        return new InvalidItemShippingDetailsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InvalidItemShippingDetailsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, InvalidItemShippingDetailsErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<InvalidItemShippingDetailsErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, InvalidItemShippingDetailsErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<InvalidItemShippingDetailsErrorQueryBuilderDsl> subject() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("subject")),
        p -> new CombinationQueryPredicate<>(p, InvalidItemShippingDetailsErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<InvalidItemShippingDetailsErrorQueryBuilderDsl> itemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("itemId")),
        p -> new CombinationQueryPredicate<>(p, InvalidItemShippingDetailsErrorQueryBuilderDsl::of));
    }
    
}
