
package com.commercetools.api.predicates.query.business_unit_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitSearchRequestQueryBuilderDsl {
    public BusinessUnitSearchRequestQueryBuilderDsl() {
    }

    public static BusinessUnitSearchRequestQueryBuilderDsl of() {
        return new BusinessUnitSearchRequestQueryBuilderDsl();
    }

    public CombinationQueryPredicate<BusinessUnitSearchRequestQueryBuilderDsl> query(
            Function<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("query"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl.of())),
            BusinessUnitSearchRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitSearchRequestQueryBuilderDsl> sort(
            Function<com.commercetools.api.predicates.query.search.SearchSortingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchSortingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("sort"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchSortingQueryBuilderDsl.of())),
            BusinessUnitSearchRequestQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitSearchRequestQueryBuilderDsl> sort() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sort")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSearchRequestQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitSearchRequestQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSearchRequestQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitSearchRequestQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSearchRequestQueryBuilderDsl::of));
    }

}
