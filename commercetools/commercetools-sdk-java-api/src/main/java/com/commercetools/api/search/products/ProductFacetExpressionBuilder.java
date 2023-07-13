
package com.commercetools.api.search.products;

public class ProductFacetExpressionBuilder {
    public CategoriesFacetExpressionBuilder categories() {
        return new CategoriesFacetExpressionBuilder();
    }

    public ReviewRatingStatisticsFacetExpressionBuilder reviewRatingStatistics() {
        return new ReviewRatingStatisticsFacetExpressionBuilder();
    }

    public static ProductFacetExpressionBuilder of() {
        return new ProductFacetExpressionBuilder();
    }

    public static class CategoriesFacetExpressionBuilder {

        PathExpression expression;

        public CategoriesFacetExpressionBuilder() {
            this.expression = PathExpression.of("categories");
        }

        public CategoryTermFilterExpression id() {
            return CategoryTermFilterExpression.of(expression.add("id"));
        }
    }

    public static class ReviewRatingStatisticsFacetExpressionBuilder {
        PathExpression expression;

        public ReviewRatingStatisticsFacetExpressionBuilder() {
            this.expression = PathExpression.of("reviewRatingStatistics");
        }

        public TermFilterExpression<Long> averageRating() {
            return TermFilterExpression.of(expression.add("averageRating"), TermFormatter::format);
        }

        public TermFilterExpression<Long> highestRating() {
            return TermFilterExpression.of(expression.add("highestRating"), TermFormatter::format);
        }

        public TermFilterExpression<Long> lowestRating() {
            return TermFilterExpression.of(expression.add("lowestRating"), TermFormatter::format);
        }

        public TermFilterExpression<Long> count() {
            return TermFilterExpression.of(expression.add("count"), TermFormatter::format);
        }
    }
}
