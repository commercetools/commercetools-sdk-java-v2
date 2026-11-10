
package com.commercetools.api.predicates.query.customer_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerPagedSearchResponseQueryBuilderDsl {
    public CustomerPagedSearchResponseQueryBuilderDsl() {
    }

    public static CustomerPagedSearchResponseQueryBuilderDsl of() {
        return new CustomerPagedSearchResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CustomerPagedSearchResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, CustomerPagedSearchResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerPagedSearchResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, CustomerPagedSearchResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerPagedSearchResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, CustomerPagedSearchResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerPagedSearchResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.customer_search.CustomerSearchResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_search.CustomerSearchResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("results"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_search.CustomerSearchResultQueryBuilderDsl.of())),
            CustomerPagedSearchResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerPagedSearchResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, CustomerPagedSearchResponseQueryBuilderDsl::of));
    }

}
