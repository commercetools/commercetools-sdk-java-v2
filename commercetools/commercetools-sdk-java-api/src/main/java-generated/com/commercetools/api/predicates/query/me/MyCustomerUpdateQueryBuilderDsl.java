
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCustomerUpdateQueryBuilderDsl {
    public MyCustomerUpdateQueryBuilderDsl() {
    }

    public static MyCustomerUpdateQueryBuilderDsl of() {
        return new MyCustomerUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MyCustomerUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCustomerUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.me.MyCustomerUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerUpdateActionQueryBuilderDsl.of())),
            MyCustomerUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyCustomerUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerUpdateQueryBuilderDsl::of));
    }
}
