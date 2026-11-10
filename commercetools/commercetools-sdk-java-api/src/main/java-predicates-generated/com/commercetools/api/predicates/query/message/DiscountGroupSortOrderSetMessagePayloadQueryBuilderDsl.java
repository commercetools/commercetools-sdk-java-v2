
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl {
    public DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl() {
    }

    public static DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl of() {
        return new DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl> oldSortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldSortOrder")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl::of));
    }

}
