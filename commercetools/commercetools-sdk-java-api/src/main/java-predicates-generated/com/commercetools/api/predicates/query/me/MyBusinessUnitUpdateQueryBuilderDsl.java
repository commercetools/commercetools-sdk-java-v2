
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitUpdateQueryBuilderDsl {
    public MyBusinessUnitUpdateQueryBuilderDsl() {
    }

    public static MyBusinessUnitUpdateQueryBuilderDsl of() {
        return new MyBusinessUnitUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MyBusinessUnitUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.me.MyBusinessUnitUpdateActionQueryBuilderDsl.of())),
            MyBusinessUnitUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyBusinessUnitUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitUpdateQueryBuilderDsl::of));
    }

}
