package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OutOfStockErrorQueryBuilderDsl  {
    public OutOfStockErrorQueryBuilderDsl() {
    }

    public static OutOfStockErrorQueryBuilderDsl of() {
        return new OutOfStockErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OutOfStockErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, OutOfStockErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OutOfStockErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, OutOfStockErrorQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<OutOfStockErrorQueryBuilderDsl> lineItems() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
        p -> new CombinationQueryPredicate<>(p, OutOfStockErrorQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<OutOfStockErrorQueryBuilderDsl> skus() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("skus")),
        p -> new CombinationQueryPredicate<>(p, OutOfStockErrorQueryBuilderDsl::of));
    }
    
}
