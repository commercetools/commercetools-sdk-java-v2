
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl {
    public ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl() {
    }

    public static ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl of() {
        return new ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")), p -> new CombinationQueryPredicate<>(p,
                ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")), p -> new CombinationQueryPredicate<>(p,
                ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl> prefix() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prefix")),
            p -> new CombinationQueryPredicate<>(p,
                ProductSearchSuggestionCompletionExpressionValueQueryBuilderDsl::of));
    }

}
