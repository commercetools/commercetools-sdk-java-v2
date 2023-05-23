
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeSetTypeQueryBuilderDsl {
    public AttributeSetTypeQueryBuilderDsl() {
    }

    public static AttributeSetTypeQueryBuilderDsl of() {
        return new AttributeSetTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeSetTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeSetTypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeSetTypeQueryBuilderDsl> elementType(
            Function<com.commercetools.api.predicates.query.product_type.AttributeTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("elementType"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_type.AttributeTypeQueryBuilderDsl.of())),
            AttributeSetTypeQueryBuilderDsl::of);
    }

}
