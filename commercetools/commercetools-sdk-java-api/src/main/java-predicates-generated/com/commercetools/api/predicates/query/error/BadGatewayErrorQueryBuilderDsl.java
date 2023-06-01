package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BadGatewayErrorQueryBuilderDsl  {
    public BadGatewayErrorQueryBuilderDsl() {
    }

    public static BadGatewayErrorQueryBuilderDsl of() {
        return new BadGatewayErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BadGatewayErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, BadGatewayErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BadGatewayErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, BadGatewayErrorQueryBuilderDsl::of));
    }
    
}
