
package com.commercetools.api.predicates.query.business_unit_search;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitSearchResultQueryBuilderDsl {
    public BusinessUnitSearchResultQueryBuilderDsl() {
    }

    public static BusinessUnitSearchResultQueryBuilderDsl of() {
        return new BusinessUnitSearchResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSearchResultQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSearchResultQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<BusinessUnitSearchResultQueryBuilderDsl> relevance() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("relevance")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSearchResultQueryBuilderDsl::of));
    }

}
