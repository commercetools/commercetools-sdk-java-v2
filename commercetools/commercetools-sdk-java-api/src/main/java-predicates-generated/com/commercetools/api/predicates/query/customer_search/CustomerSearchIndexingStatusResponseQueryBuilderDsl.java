
package com.commercetools.api.predicates.query.customer_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerSearchIndexingStatusResponseQueryBuilderDsl {
    public CustomerSearchIndexingStatusResponseQueryBuilderDsl() {
    }

    public static CustomerSearchIndexingStatusResponseQueryBuilderDsl of() {
        return new CustomerSearchIndexingStatusResponseQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSearchIndexingStatusResponseQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchIndexingStatusResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerSearchIndexingStatusResponseQueryBuilderDsl> states(
            Function<com.commercetools.api.predicates.query.customer_search.CustomerIndexingProgressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_search.CustomerIndexingProgressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("states"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_search.CustomerIndexingProgressQueryBuilderDsl
                            .of())),
            CustomerSearchIndexingStatusResponseQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<CustomerSearchIndexingStatusResponseQueryBuilderDsl> startedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("startedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchIndexingStatusResponseQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerSearchIndexingStatusResponseQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchIndexingStatusResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerSearchIndexingStatusResponseQueryBuilderDsl> retryCount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("retryCount")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchIndexingStatusResponseQueryBuilderDsl::of));
    }

}
