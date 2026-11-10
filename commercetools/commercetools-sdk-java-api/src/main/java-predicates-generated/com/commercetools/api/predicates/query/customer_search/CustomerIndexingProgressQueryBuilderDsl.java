
package com.commercetools.api.predicates.query.customer_search;

import com.commercetools.api.predicates.query.*;

public class CustomerIndexingProgressQueryBuilderDsl {
    public CustomerIndexingProgressQueryBuilderDsl() {
    }

    public static CustomerIndexingProgressQueryBuilderDsl of() {
        return new CustomerIndexingProgressQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CustomerIndexingProgressQueryBuilderDsl> indexed() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("indexed")),
            p -> new CombinationQueryPredicate<>(p, CustomerIndexingProgressQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerIndexingProgressQueryBuilderDsl> failed() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("failed")),
            p -> new CombinationQueryPredicate<>(p, CustomerIndexingProgressQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerIndexingProgressQueryBuilderDsl> estimatedTotal() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("estimatedTotal")),
            p -> new CombinationQueryPredicate<>(p, CustomerIndexingProgressQueryBuilderDsl::of));
    }

}
