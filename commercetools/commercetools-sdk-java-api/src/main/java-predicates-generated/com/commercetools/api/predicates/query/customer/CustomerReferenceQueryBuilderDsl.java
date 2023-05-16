
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerReferenceQueryBuilderDsl {
    public CustomerReferenceQueryBuilderDsl() {
    }

    public static CustomerReferenceQueryBuilderDsl of() {
        return new CustomerReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, CustomerReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl.of())),
            CustomerReferenceQueryBuilderDsl::of);
    }

}
