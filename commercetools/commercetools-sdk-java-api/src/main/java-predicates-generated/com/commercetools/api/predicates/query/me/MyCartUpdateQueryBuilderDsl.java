
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartUpdateQueryBuilderDsl {
    public MyCartUpdateQueryBuilderDsl() {
    }

    public static MyCartUpdateQueryBuilderDsl of() {
        return new MyCartUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MyCartUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MyCartUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.me.MyCartUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCartUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.me.MyCartUpdateActionQueryBuilderDsl.of())),
            MyCartUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyCartUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, MyCartUpdateQueryBuilderDsl::of));
    }

}
