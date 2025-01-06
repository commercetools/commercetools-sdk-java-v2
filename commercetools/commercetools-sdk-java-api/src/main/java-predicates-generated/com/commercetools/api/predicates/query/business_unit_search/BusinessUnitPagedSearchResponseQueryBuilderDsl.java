
package com.commercetools.api.predicates.query.business_unit_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitPagedSearchResponseQueryBuilderDsl {
    public BusinessUnitPagedSearchResponseQueryBuilderDsl() {
    }

    public static BusinessUnitPagedSearchResponseQueryBuilderDsl of() {
        return new BusinessUnitPagedSearchResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<BusinessUnitPagedSearchResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitPagedSearchResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitPagedSearchResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitPagedSearchResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitPagedSearchResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitPagedSearchResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitPagedSearchResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.business_unit_search.BusinessUnitSearchResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit_search.BusinessUnitSearchResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("results"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit_search.BusinessUnitSearchResultQueryBuilderDsl
                            .of())),
            BusinessUnitPagedSearchResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitPagedSearchResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitPagedSearchResponseQueryBuilderDsl::of));
    }

}
