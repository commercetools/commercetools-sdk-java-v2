
package com.commercetools.api.predicates.query.business_unit_search;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitIndexingProgressQueryBuilderDsl {
    public BusinessUnitIndexingProgressQueryBuilderDsl() {
    }

    public static BusinessUnitIndexingProgressQueryBuilderDsl of() {
        return new BusinessUnitIndexingProgressQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<BusinessUnitIndexingProgressQueryBuilderDsl> indexed() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("indexed")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitIndexingProgressQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitIndexingProgressQueryBuilderDsl> failed() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("failed")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitIndexingProgressQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitIndexingProgressQueryBuilderDsl> estimatedTotal() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("estimatedTotal")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitIndexingProgressQueryBuilderDsl::of));
    }

}
