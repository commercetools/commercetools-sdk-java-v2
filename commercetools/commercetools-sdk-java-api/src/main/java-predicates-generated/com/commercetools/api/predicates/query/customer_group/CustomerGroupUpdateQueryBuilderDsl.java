
package com.commercetools.api.predicates.query.customer_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupUpdateQueryBuilderDsl {
    public CustomerGroupUpdateQueryBuilderDsl() {
    }

    public static CustomerGroupUpdateQueryBuilderDsl of() {
        return new CustomerGroupUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CustomerGroupUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupUpdateActionQueryBuilderDsl
                            .of())),
            CustomerGroupUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerGroupUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupUpdateQueryBuilderDsl::of));
    }

}
