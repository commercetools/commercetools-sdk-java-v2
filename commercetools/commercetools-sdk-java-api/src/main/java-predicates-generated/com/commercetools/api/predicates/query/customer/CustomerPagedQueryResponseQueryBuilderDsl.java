package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerPagedQueryResponseQueryBuilderDsl  {
    public CustomerPagedQueryResponseQueryBuilderDsl() {
    }

    public static CustomerPagedQueryResponseQueryBuilderDsl of() {
        return new CustomerPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CustomerPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, CustomerPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CustomerPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, CustomerPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CustomerPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, CustomerPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CustomerPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, CustomerPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomerPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl.of())),
            CustomerPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CustomerPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, CustomerPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
