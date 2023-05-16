
package com.commercetools.api.predicates.query.discount_code;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeReferenceQueryBuilderDsl {
    public DiscountCodeReferenceQueryBuilderDsl() {
    }

    public static DiscountCodeReferenceQueryBuilderDsl of() {
        return new DiscountCodeReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl.of())),
            DiscountCodeReferenceQueryBuilderDsl::of);
    }

}
