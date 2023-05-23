
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyPaymentUpdateQueryBuilderDsl {
    public MyPaymentUpdateQueryBuilderDsl() {
    }

    public static MyPaymentUpdateQueryBuilderDsl of() {
        return new MyPaymentUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MyPaymentUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyPaymentUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.me.MyPaymentUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(com.commercetools.api.predicates.query.me.MyPaymentUpdateActionQueryBuilderDsl.of())),
            MyPaymentUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyPaymentUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentUpdateQueryBuilderDsl::of));
    }

}
