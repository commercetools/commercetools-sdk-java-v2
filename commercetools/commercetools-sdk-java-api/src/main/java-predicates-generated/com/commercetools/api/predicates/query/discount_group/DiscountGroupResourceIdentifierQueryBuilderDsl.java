
package com.commercetools.api.predicates.query.discount_group;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupResourceIdentifierQueryBuilderDsl {
    public DiscountGroupResourceIdentifierQueryBuilderDsl() {
    }

    public static DiscountGroupResourceIdentifierQueryBuilderDsl of() {
        return new DiscountGroupResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupResourceIdentifierQueryBuilderDsl::of));
    }

}
