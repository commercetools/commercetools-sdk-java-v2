
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl {
    public MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl() {
    }

    public static MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl of() {
        return new MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl::of);
    }

}
