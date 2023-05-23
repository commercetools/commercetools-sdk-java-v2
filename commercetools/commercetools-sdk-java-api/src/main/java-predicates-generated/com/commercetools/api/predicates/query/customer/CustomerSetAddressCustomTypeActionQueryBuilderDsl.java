
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerSetAddressCustomTypeActionQueryBuilderDsl {
    public CustomerSetAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static CustomerSetAddressCustomTypeActionQueryBuilderDsl of() {
        return new CustomerSetAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetAddressCustomTypeActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerSetAddressCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            CustomerSetAddressCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerSetAddressCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            CustomerSetAddressCustomTypeActionQueryBuilderDsl::of);
    }

}
