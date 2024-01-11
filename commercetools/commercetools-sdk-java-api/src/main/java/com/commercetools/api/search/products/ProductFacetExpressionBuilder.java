
package com.commercetools.api.search.products;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class ProductFacetExpressionBuilder {
    public CategoriesFacetExpressionBuilder categories() {
        return new CategoriesFacetExpressionBuilder();
    }

    public VariantsFacetExpressionBuilder variants() {
        return new VariantsFacetExpressionBuilder();
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

        public CategoryTermFacetExpression id() {
            return CategoryTermFacetExpression.of(expression.add("id"));
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

    public static class VariantsFacetExpressionBuilder {

        PathExpression expression;

        public VariantsFacetExpressionBuilder() {
            this.expression = PathExpression.of("variants");
        }

        public AttributesFacetExpressionBuilder attribute() {
            return new AttributesFacetExpressionBuilder(expression);
        }
    }

    public static class AttributesFacetExpressionBuilder {
        PathExpression expression;

        public AttributesFacetExpressionBuilder(PathExpression expression) {
            this.expression = expression.add("attributes");
        }

        public TermFacetExpression<String> ofText(final String name) {
            return TermFacetExpression.of(expression.add(name), TermFormatter::format);
        }
        public TermFacetExpression<LocalDate> ofDate(final String name) {
            return TermFacetExpression.of(expression.add(name), TermFormatter::format);
        }
        public TermFacetExpression<LocalTime> ofTime(final String name) {
            return TermFacetExpression.of(expression.add(name), TermFormatter::format);
        }
        public TermFacetExpression<ZonedDateTime> ofDatetime(final String name) {
            return TermFacetExpression.of(expression.add(name), TermFormatter::format);
        }
        public TermFacetExpression<Boolean> ofBool(final String name) {
            return TermFacetExpression.of(expression.add(name), TermFormatter::format);
        }
        public TermFacetExpression<Double> ofNumber(final String name) {
            return TermFacetExpression.of(expression.add(name), TermFormatter::format);
        }
        public TermFacetExpression<Long> ofLong(final String name) {
            return TermFacetExpression.of(expression.add(name), TermFormatter::format);
        }

        public TermFacetExpression<String> ofLocalizedString(final String name, final String language) {
            return TermFacetExpression.of(expression.add(name).add(language), TermFormatter::format);
        }

        public AttributesEnumFacetExpressionBuilder ofEnum(final String name) {
            return new AttributesEnumFacetExpressionBuilder(expression);
        }
    }

    public static class AttributesEnumFacetExpressionBuilder {
        PathExpression expression;

        public AttributesEnumFacetExpressionBuilder(final PathExpression expression) {
            this.expression = expression;
        }

        public TermFacetExpression<String> key() {
            return TermFacetExpression.of(expression.add("key"), TermFormatter::format);
        }
        public TermFacetExpression<String> label() {
            return TermFacetExpression.of(expression.add("label"), TermFormatter::format);
        }
        public TermFacetExpression<String> label(final String language) {
            return TermFacetExpression.of(expression.add("label").add(language), TermFormatter::format);
        }
    }

    public static class AttributesMoneyFacetExpressionBuilder {
        PathExpression expression;

        public AttributesMoneyFacetExpressionBuilder(final PathExpression expression) {
            this.expression = expression;
        }

        public TermFacetExpression<String> centAmount() {
            return TermFacetExpression.of(expression.add("centAmount"), TermFormatter::format);
        }
        public TermFacetExpression<String> currencyCode() {
            return TermFacetExpression.of(expression.add("currencyCode"), TermFormatter::format);
        }
    }
}
