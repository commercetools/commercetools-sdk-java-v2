
package com.commercetools.api.predicates.query.attribute_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeGroupSetDescriptionActionQueryBuilderDsl {
    public AttributeGroupSetDescriptionActionQueryBuilderDsl() {
    }

    public static AttributeGroupSetDescriptionActionQueryBuilderDsl of() {
        return new AttributeGroupSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupSetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeGroupSetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeGroupSetDescriptionActionQueryBuilderDsl::of);
    }

}
