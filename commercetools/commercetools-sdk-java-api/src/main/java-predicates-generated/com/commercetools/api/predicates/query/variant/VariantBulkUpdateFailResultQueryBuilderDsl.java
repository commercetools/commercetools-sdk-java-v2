
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantBulkUpdateFailResultQueryBuilderDsl {
    public VariantBulkUpdateFailResultQueryBuilderDsl() {
    }

    public static VariantBulkUpdateFailResultQueryBuilderDsl of() {
        return new VariantBulkUpdateFailResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateFailResultQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateFailResultQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateFailResultQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateFailResultQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateFailResultQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateFailResultQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantBulkUpdateFailResultQueryBuilderDsl> errors(
            Function<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("errors"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl.of())),
            VariantBulkUpdateFailResultQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantBulkUpdateFailResultQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateFailResultQueryBuilderDsl::of));
    }

}
