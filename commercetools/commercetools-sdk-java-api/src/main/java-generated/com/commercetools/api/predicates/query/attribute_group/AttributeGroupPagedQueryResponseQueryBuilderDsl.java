
package com.commercetools.api.predicates.query.attribute_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeGroupPagedQueryResponseQueryBuilderDsl {
    public AttributeGroupPagedQueryResponseQueryBuilderDsl() {
    }

    public static AttributeGroupPagedQueryResponseQueryBuilderDsl of() {
        return new AttributeGroupPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<AttributeGroupPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<AttributeGroupPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<AttributeGroupPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<AttributeGroupPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeGroupPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl.of())),
            AttributeGroupPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AttributeGroupPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupPagedQueryResponseQueryBuilderDsl::of));
    }
}
