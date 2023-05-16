
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypeSetDescriptionActionQueryBuilderDsl {
    public TypeSetDescriptionActionQueryBuilderDsl() {
    }

    public static TypeSetDescriptionActionQueryBuilderDsl of() {
        return new TypeSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeSetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeSetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TypeSetDescriptionActionQueryBuilderDsl::of);
    }

}
