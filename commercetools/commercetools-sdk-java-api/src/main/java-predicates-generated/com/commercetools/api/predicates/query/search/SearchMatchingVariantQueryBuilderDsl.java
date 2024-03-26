
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchMatchingVariantQueryBuilderDsl {
    public SearchMatchingVariantQueryBuilderDsl() {
    }

    public static SearchMatchingVariantQueryBuilderDsl of() {
        return new SearchMatchingVariantQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<SearchMatchingVariantQueryBuilderDsl> id() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, SearchMatchingVariantQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchMatchingVariantQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, SearchMatchingVariantQueryBuilderDsl::of));
    }

}
