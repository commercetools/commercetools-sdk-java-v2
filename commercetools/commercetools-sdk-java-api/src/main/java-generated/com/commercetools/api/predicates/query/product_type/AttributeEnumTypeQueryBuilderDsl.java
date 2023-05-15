
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeEnumTypeQueryBuilderDsl {
    public AttributeEnumTypeQueryBuilderDsl() {
    }

    public static AttributeEnumTypeQueryBuilderDsl of() {
        return new AttributeEnumTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeEnumTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeEnumTypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeEnumTypeQueryBuilderDsl> values(
            Function<com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("values"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl.of())),
            AttributeEnumTypeQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AttributeEnumTypeQueryBuilderDsl> values() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("values")),
            p -> new CombinationQueryPredicate<>(p, AttributeEnumTypeQueryBuilderDsl::of));
    }
}
