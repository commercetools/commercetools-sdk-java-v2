
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl {
    public MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl of() {
        return new MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl::of));
    }
}
