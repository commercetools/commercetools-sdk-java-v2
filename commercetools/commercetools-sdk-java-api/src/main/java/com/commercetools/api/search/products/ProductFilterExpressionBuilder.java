
package com.commercetools.api.search.products;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Locale;

import javax.money.CurrencyUnit;

import com.commercetools.api.models.Identifiable;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.state.State;
import com.commercetools.api.models.tax_category.TaxCategory;

public class ProductFilterExpressionBuilder {

    public CategoriesFilterExpressionBuilder categories() {
        return new CategoriesFilterExpressionBuilder();
    }

    public ReferencableFilterExpressionBuilder<ProductType> productType() {
        return new ReferencableFilterExpressionBuilder<>("productType");
    }

    public ReferencableFilterExpressionBuilder<TaxCategory> taxCategory() {
        return new ReferencableFilterExpressionBuilder<>("taxCategory");
    }

    public ReferencableFilterExpressionBuilder<State> state() {
        return new ReferencableFilterExpressionBuilder<>("state");
    }

    public TermFilterExpressionBuilder<String> key() {
        return TermFilterExpressionBuilder.of(PathExpression.of("key"), TermFormatter::format);
    }

    public VariantsFilterExpressionBuilder variants() {
        return new VariantsFilterExpressionBuilder();
    }

    public ReviewRatingStatisticsFilterExpressionBuilder reviewRatingStatistics() {
        return new ReviewRatingStatisticsFilterExpressionBuilder();
    }

    public RangeFilterExpressionBuilder<ZonedDateTime> createdAt() {
        return RangeFilterExpressionBuilder.of(PathExpression.of("createdAt"), TermFormatter::format);
    }

    public RangeFilterExpressionBuilder<ZonedDateTime> lastModifiedAt() {
        return RangeFilterExpressionBuilder.of(PathExpression.of("lastModifiedAt"), TermFormatter::format);
    }

    public TermFilterExpressionBuilder<String> searchKeywords(Locale locale) {
        return searchKeywords(locale.toLanguageTag());
    }

    public TermFilterExpressionBuilder<String> searchKeywords(String locale) {
        return TermFilterExpressionBuilder.of(PathExpression.of("searchKeywords").add(locale).add("text"),
            TermFormatter::format);
    }

    public static ProductFilterExpressionBuilder of() {
        return new ProductFilterExpressionBuilder();
    }

    public static class CategoriesFilterExpressionBuilder {

        PathExpression expression;

        public CategoriesFilterExpressionBuilder() {
            this.expression = PathExpression.of("categories");
        }

        public CategoryTermFilterExpressionBuilder id() {
            return CategoryTermFilterExpressionBuilder.of(expression.add("id"));
        }

        public FilterExpression exists() {
            return new ExistsTermFilterExpression(expression).exists();
        }

        public FilterExpression missing() {
            return new ExistsTermFilterExpression(expression).missing();
        }
    }

    public static class ReferencableFilterExpressionBuilder<T> {

        PathExpression expression;

        public ReferencableFilterExpressionBuilder(String path) {
            this.expression = PathExpression.of(ConstantExpression.of(path));
        }

        public ReferencableFilterExpressionBuilder(PathExpression expression) {
            this.expression = PathExpression.of(expression);
        }

        public ReferencableTermFilterExpressionBuilder<T> id() {
            return ReferencableTermFilterExpressionBuilder.of(expression.add("id"));
        }

        public FilterExpression exists() {
            return new ExistsTermFilterExpression(expression).exists();
        }

        public FilterExpression missing() {
            return new ExistsTermFilterExpression(expression).missing();
        }
    }

    public static class VariantsFilterExpressionBuilder {
        PathExpression expression;

        public VariantsFilterExpressionBuilder() {
            this.expression = PathExpression.of("variants");
        }

        public TermFilterExpressionBuilder<String> key() {
            return TermFilterExpressionBuilder.of(expression.add("key"), TermFormatter::format);
        }

        public TermFilterExpressionBuilder<String> sku() {
            return TermFilterExpressionBuilder.of(expression.add("sku"), TermFormatter::format);
        }

        public PriceFilterExpressionBuilder price() {
            return new PriceFilterExpressionBuilder(expression.add("price"));
        }

        public TermFilterExpressionBuilder<Boolean> scopedPriceDiscounted() {
            return TermFilterExpressionBuilder.of(expression.add("scopedPriceDiscounted"), TermFormatter::format);
        }

        public ScopedPriceFilterExpressionBuilder scopedPrice() {
            return new ScopedPriceFilterExpressionBuilder(expression.add("scopedPrice"));
        }

        public ExistsTermFilterExpressionBuilder prices() {
            return ExistsTermFilterExpressionBuilder.of(expression.add("prices"));
        }

        public AvailabilityFilterExpressionBuilder availability() {
            return new AvailabilityFilterExpressionBuilder(expression.add("availability"));
        }

        public AttributeFilterExpressionBuilder attribute(String name) {
            return new AttributeFilterExpressionBuilder(expression.add("attributes").add(name));
        }
    }

    public static class ReviewRatingStatisticsFilterExpressionBuilder {
        PathExpression expression;

        public ReviewRatingStatisticsFilterExpressionBuilder() {
            this.expression = PathExpression.of("reviewRatingStatistics");
        }

        public RangeFilterExpressionBuilder<Long> averageRating() {
            return RangeFilterExpressionBuilder.of(expression.add("averageRating"), TermFormatter::format);
        }

        public RangeFilterExpressionBuilder<Long> highestRating() {
            return RangeFilterExpressionBuilder.of(expression.add("highestRating"), TermFormatter::format);
        }

        public RangeFilterExpressionBuilder<Long> lowestRating() {
            return RangeFilterExpressionBuilder.of(expression.add("lowestRating"), TermFormatter::format);
        }

        public RangeFilterExpressionBuilder<Long> count() {
            return RangeFilterExpressionBuilder.of(expression.add("count"), TermFormatter::format);
        }
    }

    public static class AvailabilityFilterExpressionBuilder {
        PathExpression expression;

        public AvailabilityFilterExpressionBuilder(PathExpression expression) {
            this.expression = expression;
        }

        public TermFilterExpressionBuilder<Boolean> isOnStock() {
            return TermFilterExpressionBuilder.of(expression.add("isOnStock"), TermFormatter::format);
        }

        public RangeFilterExpressionBuilder<Long> availableQuantity() {
            return RangeFilterExpressionBuilder.of(expression.add("availableQuantity"), TermFormatter::format);
        }

        public AvailabilityFilterExpressionBuilder channel(Identifiable<Channel> channel) {
            return channel(channel.getId());
        }

        public AvailabilityFilterExpressionBuilder channel(String channel) {
            return new AvailabilityFilterExpressionBuilder(expression.add("channels").add(channel));
        }

        public ReferencableTermFilterExpressionBuilder<Channel> isOnStockInChannels() {
            return ReferencableTermFilterExpressionBuilder.of(expression.add("isOnStockInChannels"));
        }
    }

    public static class PriceFilterExpressionBuilder {
        PathExpression expression;

        public PriceFilterExpressionBuilder(PathExpression expression) {
            this.expression = expression;
        }

        public RangeFilterExpressionBuilder<Long> centAmount() {
            return RangeFilterExpressionBuilder.of(expression.add("centAmount"), TermFormatter::format);
        }

        public TermFilterExpression<String> currencyCode() {
            return TermFilterExpression.of(expression.add("currencyCode"), TermFormatter::format);
        }

        public TermFilterExpression<CurrencyUnit> currency() {
            return TermFilterExpression.of(expression.add("currencyCode"), TermFormatter::format);
        }
    }

    public static class ScopedPriceFilterExpressionBuilder {
        PathExpression expression;

        public ScopedPriceFilterExpressionBuilder(PathExpression expression) {
            this.expression = PathExpression.of(expression);
        }

        public PriceFilterExpressionBuilder value() {
            return new PriceFilterExpressionBuilder(expression.add("value"));
        }

        public PriceFilterExpressionBuilder currentValue() {
            return new PriceFilterExpressionBuilder(expression.add("currentValue"));
        }

        public DiscountedPriceFilterExpressionBuilder discounted() {
            return new DiscountedPriceFilterExpressionBuilder(expression.add("discounted"));
        }

        public TermFilterExpression<CurrencyUnit> currency() {
            return TermFilterExpression.of(expression.add("currencyCode"), TermFormatter::format);
        }

    }

    public static class DiscountedPriceFilterExpressionBuilder {
        PathExpression expression;

        public DiscountedPriceFilterExpressionBuilder(PathExpression expression) {
            this.expression = PathExpression.of(expression);
        }

        public PriceFilterExpressionBuilder value() {
            return new PriceFilterExpressionBuilder(expression.add("value"));
        }

    }

    public static class CategoryTermFilterExpressionBuilder {

        PathExpression expression;

        public CategoryTermFilterExpressionBuilder(PathExpression expression) {
            this.expression = expression;
        }

        public CategoryTermFilterExpression is(String value) {
            return CategoryTermFilterExpression.of(expression).is(value);
        }

        public CategoryTermFilterExpression is(Identifiable<Category> value) {
            return is(value.getId());
        }

        public CategoryTermFilterExpression subTree(String value) {
            return CategoryTermFilterExpression.of(expression).subTree(value);
        }

        public CategoryTermFilterExpression subTree(Identifiable<Category> value) {
            return subTree(value.getId());
        }

        public CategoryTermFilterExpression isIn(Iterable<String> values) {
            return CategoryTermFilterExpression.of(expression).isIn(values);
        }

        public CategoryTermFilterExpression containsAny(Iterable<Identifiable<Category>> values) {
            return CategoryTermFilterExpression.of(expression).containsAny(values);
        }

        public static CategoryTermFilterExpressionBuilder of(PathExpression expression) {
            return new CategoryTermFilterExpressionBuilder(expression);
        }
    }

    public static class ReferencableTermFilterExpressionBuilder<T> {

        PathExpression expression;

        public ReferencableTermFilterExpressionBuilder(PathExpression expression) {
            this.expression = expression;
        }

        public ReferenceableTermFilterExpression<T> is(String value) {
            return ReferenceableTermFilterExpression.<T> of(expression).is(value);
        }

        public ReferenceableTermFilterExpression<T> is(Identifiable<Category> value) {
            return is(value.getId());
        }

        public ReferenceableTermFilterExpression<T> isIn(Iterable<String> values) {
            return ReferenceableTermFilterExpression.<T> of(expression).isIn(values);
        }

        public ReferenceableTermFilterExpression<T> containsAny(Iterable<Identifiable<T>> values) {
            return ReferenceableTermFilterExpression.<T> of(expression).containsAny(values);
        }

        public static <T> ReferencableTermFilterExpressionBuilder<T> of(PathExpression expression) {
            return new ReferencableTermFilterExpressionBuilder<>(expression);
        }
    }

    public static class AttributeFilterExpressionBuilder {
        PathExpression expression;

        public AttributeFilterExpressionBuilder(PathExpression expression) {
            this.expression = expression;
        }

        public FilterExpression exists() {
            return new ExistsTermFilterExpression(expression).exists();
        }

        public FilterExpression missing() {
            return new ExistsTermFilterExpression(expression).missing();
        }

        public TermFilterExpressionBuilder<Boolean> asBoolean() {
            return new TermFilterExpressionBuilder<>(expression, TermFormatter::format);
        }

        public RangeFilterExpressionBuilder<Long> asLong() {
            return new RangeFilterExpressionBuilder<>(expression, TermFormatter::format);
        }

        public RangeFilterExpressionBuilder<Double> asDouble() {
            return new RangeFilterExpressionBuilder<>(expression, TermFormatter::format);
        }

        public TermFilterExpressionBuilder<String> asString() {
            return new TermFilterExpressionBuilder<>(expression, TermFormatter::format);
        }

        public RangeFilterExpressionBuilder<ZonedDateTime> asDateTime() {
            return new RangeFilterExpressionBuilder<>(expression, TermFormatter::format);
        }

        public RangeFilterExpressionBuilder<LocalDate> asDate() {
            return new RangeFilterExpressionBuilder<>(expression, TermFormatter::format);
        }

        public RangeFilterExpressionBuilder<LocalTime> asTime() {
            return new RangeFilterExpressionBuilder<>(expression, TermFormatter::format);
        }

        public PriceFilterExpressionBuilder asMoney() {
            return new PriceFilterExpressionBuilder(expression);
        }

        public <T> AttributeReferenceTermFilterExpressionBuilder asReference() {
            return new AttributeReferenceTermFilterExpressionBuilder(expression);
        }

        public <T> EnumTermFilterExpressionBuilder asEnum() {
            return new EnumTermFilterExpressionBuilder(expression);
        }
    }

    public static class EnumTermFilterExpressionBuilder {
        PathExpression expression;

        public EnumTermFilterExpressionBuilder(PathExpression expression) {
            this.expression = PathExpression.of(expression);
        }

        public TermFilterExpressionBuilder<String> key() {
            return new TermFilterExpressionBuilder<>(expression.add("key"), TermFormatter::format);
        }
    }

    public static class AttributeReferenceTermFilterExpressionBuilder {

        PathExpression expression;

        public AttributeReferenceTermFilterExpressionBuilder(PathExpression expression) {
            this.expression = PathExpression.of(expression);
        }

        public ReferencableTermFilterExpressionBuilder<?> id() {
            return new ReferencableFilterExpressionBuilder<>(expression).id();
        }

        public TermFilterExpressionBuilder<String> typeId() {
            return TermFilterExpressionBuilder.of(expression.add("typeId"), TermFormatter::format);
        }

        public static AttributeReferenceTermFilterExpressionBuilder of(PathExpression expression) {
            return new AttributeReferenceTermFilterExpressionBuilder(expression);
        }
    }
}
