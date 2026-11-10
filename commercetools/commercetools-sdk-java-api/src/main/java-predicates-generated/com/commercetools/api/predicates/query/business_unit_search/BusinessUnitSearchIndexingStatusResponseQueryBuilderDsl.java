
package com.commercetools.api.predicates.query.business_unit_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl {
    public BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl() {
    }

    public static BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl of() {
        return new BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl> states(
            Function<com.commercetools.api.predicates.query.business_unit_search.BusinessUnitIndexingProgressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit_search.BusinessUnitIndexingProgressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("states"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit_search.BusinessUnitIndexingProgressQueryBuilderDsl
                            .of())),
            BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl> startedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("startedAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl> retryCount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("retryCount")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSearchIndexingStatusResponseQueryBuilderDsl::of));
    }

}
