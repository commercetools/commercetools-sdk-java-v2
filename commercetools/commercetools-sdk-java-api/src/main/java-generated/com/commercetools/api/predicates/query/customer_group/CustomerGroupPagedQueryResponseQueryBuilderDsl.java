
package com.commercetools.api.predicates.query.customer_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupPagedQueryResponseQueryBuilderDsl {
    public CustomerGroupPagedQueryResponseQueryBuilderDsl() {
    }

    public static CustomerGroupPagedQueryResponseQueryBuilderDsl of() {
        return new CustomerGroupPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CustomerGroupPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerGroupPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerGroupPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerGroupPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl.of())),
            CustomerGroupPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerGroupPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupPagedQueryResponseQueryBuilderDsl::of));
    }
}
