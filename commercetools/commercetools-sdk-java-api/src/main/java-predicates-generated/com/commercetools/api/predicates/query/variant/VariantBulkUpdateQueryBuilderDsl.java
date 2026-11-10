
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantBulkUpdateQueryBuilderDsl {
    public VariantBulkUpdateQueryBuilderDsl() {
    }

    public static VariantBulkUpdateQueryBuilderDsl of() {
        return new VariantBulkUpdateQueryBuilderDsl();
    }

    public CombinationQueryPredicate<VariantBulkUpdateQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.variant.VariantBulkUpdateItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantBulkUpdateItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.variant.VariantBulkUpdateItemQueryBuilderDsl.of())),
            VariantBulkUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantBulkUpdateQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantBulkUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.variant.VariantUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.variant.VariantUpdateActionQueryBuilderDsl.of())),
            VariantBulkUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantBulkUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateQueryBuilderDsl::of));
    }

}
