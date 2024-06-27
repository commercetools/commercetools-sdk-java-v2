
package com.commercetools.api.predicates.query.customer_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerSearchRequestQueryBuilderDsl {
    public CustomerSearchRequestQueryBuilderDsl() {
    }

    public static CustomerSearchRequestQueryBuilderDsl of() {
        return new CustomerSearchRequestQueryBuilderDsl();
    }

    public CombinationQueryPredicate<CustomerSearchRequestQueryBuilderDsl> query(
            Function<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("query"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl.of())),
            CustomerSearchRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerSearchRequestQueryBuilderDsl> sort(
            Function<com.commercetools.api.predicates.query.search.SearchSortingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchSortingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("sort"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchSortingQueryBuilderDsl.of())),
            CustomerSearchRequestQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerSearchRequestQueryBuilderDsl> sort() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sort")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchRequestQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerSearchRequestQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchRequestQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerSearchRequestQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchRequestQueryBuilderDsl::of));
    }

}
