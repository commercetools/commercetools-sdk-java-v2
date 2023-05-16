
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DuplicateAttributeValuesErrorQueryBuilderDsl {
    public DuplicateAttributeValuesErrorQueryBuilderDsl() {
    }

    public static DuplicateAttributeValuesErrorQueryBuilderDsl of() {
        return new DuplicateAttributeValuesErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DuplicateAttributeValuesErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, DuplicateAttributeValuesErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DuplicateAttributeValuesErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, DuplicateAttributeValuesErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DuplicateAttributeValuesErrorQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            DuplicateAttributeValuesErrorQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DuplicateAttributeValuesErrorQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, DuplicateAttributeValuesErrorQueryBuilderDsl::of));
    }

}
