
package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeResourceIdentifierQueryBuilderDsl {
    public DiscountCodeResourceIdentifierQueryBuilderDsl() {
    }

    public static DiscountCodeResourceIdentifierQueryBuilderDsl of() {
        return new DiscountCodeResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeResourceIdentifierQueryBuilderDsl::of));
    }

}
