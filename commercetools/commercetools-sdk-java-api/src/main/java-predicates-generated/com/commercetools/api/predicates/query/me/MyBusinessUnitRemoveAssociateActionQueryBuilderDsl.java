
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitRemoveAssociateActionQueryBuilderDsl {
    public MyBusinessUnitRemoveAssociateActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitRemoveAssociateActionQueryBuilderDsl of() {
        return new MyBusinessUnitRemoveAssociateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitRemoveAssociateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitRemoveAssociateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyBusinessUnitRemoveAssociateActionQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            MyBusinessUnitRemoveAssociateActionQueryBuilderDsl::of);
    }

}
