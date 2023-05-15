
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class PriceChangedErrorQueryBuilderDsl {
    public PriceChangedErrorQueryBuilderDsl() {
    }

    public static PriceChangedErrorQueryBuilderDsl of() {
        return new PriceChangedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PriceChangedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, PriceChangedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PriceChangedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, PriceChangedErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<PriceChangedErrorQueryBuilderDsl> lineItems() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, PriceChangedErrorQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<PriceChangedErrorQueryBuilderDsl> shipping() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipping")),
            p -> new CombinationQueryPredicate<>(p, PriceChangedErrorQueryBuilderDsl::of));
    }
}
