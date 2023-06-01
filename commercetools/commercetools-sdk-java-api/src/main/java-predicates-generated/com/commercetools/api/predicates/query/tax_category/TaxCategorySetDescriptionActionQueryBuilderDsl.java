package com.commercetools.api.predicates.query.tax_category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TaxCategorySetDescriptionActionQueryBuilderDsl  {
    public TaxCategorySetDescriptionActionQueryBuilderDsl() {
    }

    public static TaxCategorySetDescriptionActionQueryBuilderDsl of() {
        return new TaxCategorySetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategorySetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, TaxCategorySetDescriptionActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TaxCategorySetDescriptionActionQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
        p -> new CombinationQueryPredicate<>(p, TaxCategorySetDescriptionActionQueryBuilderDsl::of));
    }
    
}
