
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartSetCustomTypeActionQueryBuilderDsl {
    public MyCartSetCustomTypeActionQueryBuilderDsl() {
    }

    public static MyCartSetCustomTypeActionQueryBuilderDsl of() {
        return new MyCartSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            MyCartSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            MyCartSetCustomTypeActionQueryBuilderDsl::of);
    }

}
