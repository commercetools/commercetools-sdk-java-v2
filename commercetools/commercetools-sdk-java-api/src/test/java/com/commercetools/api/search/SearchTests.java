
package com.commercetools.api.search;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Locale;

import com.commercetools.api.client.ByProjectKeyProductProjectionsSearchGet;
import com.commercetools.api.client.ByProjectKeyProductProjectionsSearchPost;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.Identifiable;
import com.commercetools.api.models.common.DefaultCurrencyUnits;
import com.commercetools.api.search.products.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchTests {

    @Test
    public void getRequest() {
        ByProjectKeyProductProjectionsSearchGet searchResponse = ProjectApiRoot.of("test")
                .productProjections()
                .search()
                .get()
                .filter(f -> f.categories().id().is("abc"))
                .filterFacets(f -> f.categories().id().is("def"))
                .filterQuery(f -> f.categories().id().is("ghi"))
                .facet(f -> f.categories().id());

        Assertions.assertThat(searchResponse.createHttpRequest().getUri().getRawQuery())
                .isEqualTo(
                    "filter=categories.id%3A+%22abc%22&filter.facets=categories.id%3A+%22def%22&filter.query=categories.id%3A+%22ghi%22&facet=categories.id");
    }

    @Test
    public void postRequest() {
        ByProjectKeyProductProjectionsSearchPost searchResponse = ProjectApiRoot.of("test")
                .productProjections()
                .search()
                .post()
                .filter(f -> f.categories().id().is("abc"))
                .filterFacets(f -> f.categories().id().is("def"))
                .filterQuery(f -> f.categories().id().is("ghi"))
                .facet(f -> f.categories().id());

        Assertions.assertThat(searchResponse.createHttpRequest().getSecuredBody())
                .isEqualTo(
                    "filter=categories.id%3A+%22abc%22&filter.facets=categories.id%3A+%22def%22&filter.query=categories.id%3A+%22ghi%22&facet=categories.id");
    }

    @ParameterizedTest
    @MethodSource("filterExpressions")
    public void filterRender(FilterExpression searchExpression, String expectedPredicate) {
        Assertions.assertThat(searchExpression.render()).isEqualTo(expectedPredicate);
    }

    @ParameterizedTest
    @MethodSource("facetExpressions")
    public void facetRender(FilterExpression searchExpression, String expectedPredicate) {
        Assertions.assertThat(searchExpression.render()).isEqualTo(expectedPredicate);
    }

    public static Object[][] filterExpressions() {
        return new Object[][] { new Object[] { ProductFilterExpressionBuilder.of().key().is("foo"), "key: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of().key().exists(), "key: exists" },
                new Object[] { ProductFilterExpressionBuilder.of().key().missing(), "key: missing" },
                new Object[] { ProductFilterExpressionBuilder.of().categories().id().is("foo"),
                        "categories.id: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of().categories().id().is("foo").is("bar"),
                        "categories.id: \"foo\", \"bar\"" },
                new Object[] { ProductFilterExpressionBuilder.of().categories().id().subTree("foo"),
                        "categories.id: subTree(\"foo\")" },
                new Object[] { ProductFilterExpressionBuilder.of().categories().id().is("foo").subTree("bar"),
                        "categories.id: \"foo\", subTree(\"bar\")" },
                new Object[] { ProductFilterExpressionBuilder.of().categories().id().is("foo").subTree("bar").is("baz"),
                        "categories.id: \"foo\", subTree(\"bar\"), \"baz\"" },
                new Object[] { ProductFilterExpressionBuilder.of().categories().exists(), "categories: exists" },
                new Object[] { ProductFilterExpressionBuilder.of().categories().missing(), "categories: missing" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().key().is("foo"),
                        "variants.key: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().key().is("foo").is("bar"),
                        "variants.key: \"foo\", \"bar\"" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().key().exists(), "variants.key: exists" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().key().missing(),
                        "variants.key: missing" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().sku().is("foo"),
                        "variants.sku: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().sku().is("foo").is("bar"),
                        "variants.sku: \"foo\", \"bar\"" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().sku().exists(), "variants.sku: exists" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().sku().missing(),
                        "variants.sku: missing" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().prices().exists(),
                        "variants.prices: exists" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().prices().missing(),
                        "variants.prices: missing" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().price().centAmount().is(100L),
                        "variants.price.centAmount: 100" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().price().centAmount().rangeTo(100L),
                        "variants.price.centAmount: range (* to 100)" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().price().centAmount().rangeFrom(100L),
                        "variants.price.centAmount: range (100 to *)" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().price().centAmount().range(100L, 200L),
                        "variants.price.centAmount: range (100 to 200)" },
                new Object[] {
                        ProductFilterExpressionBuilder.of()
                                .variants()
                                .price()
                                .centAmount()
                                .rangeTo(100L)
                                .range(100L, 200L)
                                .rangeFrom(200L),
                        "variants.price.centAmount: range (* to 100), (100 to 200), (200 to *)" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().price().currencyCode().is("EUR"),
                        "variants.price.currencyCode: \"EUR\"" },
                new Object[] {
                        ProductFilterExpressionBuilder.of().variants().price().currency().is(DefaultCurrencyUnits.EUR),
                        "variants.price.currencyCode: \"EUR\"" },
                new Object[] {
                        ProductFilterExpressionBuilder.of().variants().scopedPrice().value().centAmount().is(100L),
                        "variants.scopedPrice.value.centAmount: 100" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .scopedPrice()
                        .currentValue()
                        .centAmount()
                        .is(100L), "variants.scopedPrice.currentValue.centAmount: 100" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .scopedPrice()
                        .discounted()
                        .value()
                        .centAmount()
                        .is(100L), "variants.scopedPrice.discounted.value.centAmount: 100" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().scopedPriceDiscounted().is(true),
                        "variants.scopedPriceDiscounted: true" },
                new Object[] { ProductFilterExpressionBuilder.of().productType().id().is("foo"),
                        "productType.id: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of().taxCategory().id().is("foo"),
                        "taxCategory.id: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of().taxCategory().exists(), "taxCategory: exists" },
                new Object[] { ProductFilterExpressionBuilder.of().taxCategory().missing(), "taxCategory: missing" },
                new Object[] { ProductFilterExpressionBuilder.of().state().id().is("foo"), "state.id: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of().state().exists(), "state: exists" },
                new Object[] { ProductFilterExpressionBuilder.of().state().missing(), "state: missing" },
                new Object[] { ProductFilterExpressionBuilder.of().reviewRatingStatistics().averageRating().is(100L),
                        "reviewRatingStatistics.averageRating: 100" },
                new Object[] {
                        ProductFilterExpressionBuilder.of().reviewRatingStatistics().averageRating().range(0L, 100L),
                        "reviewRatingStatistics.averageRating: range (0 to 100)" },
                new Object[] { ProductFilterExpressionBuilder.of().reviewRatingStatistics().lowestRating().is(100L),
                        "reviewRatingStatistics.lowestRating: 100" },
                new Object[] { ProductFilterExpressionBuilder.of().reviewRatingStatistics().highestRating().is(100L),
                        "reviewRatingStatistics.highestRating: 100" },
                new Object[] { ProductFilterExpressionBuilder.of().reviewRatingStatistics().count().is(100L),
                        "reviewRatingStatistics.count: 100" },
                new Object[] {
                        ProductFilterExpressionBuilder.of()
                                .createdAt()
                                .range(ZonedDateTime.parse("2015-06-04T12:27:55.344Z"),
                                    ZonedDateTime.parse("2015-06-04T13:27:55.344Z")),
                        "createdAt: range (\"2015-06-04T12:27:55.344Z\" to \"2015-06-04T13:27:55.344Z\")" },
                new Object[] {
                        ProductFilterExpressionBuilder.of()
                                .lastModifiedAt()
                                .range(ZonedDateTime.parse("2015-06-04T12:27:55.344Z"),
                                    ZonedDateTime.parse("2015-06-04T13:27:55.344Z")),
                        "lastModifiedAt: range (\"2015-06-04T12:27:55.344Z\" to \"2015-06-04T13:27:55.344Z\")" },
                new Object[] { ProductFilterExpressionBuilder.of().searchKeywords("en-US").is("foo"),
                        "searchKeywords.en-US.text: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of().searchKeywords(Locale.US).is("foo"),
                        "searchKeywords.en-US.text: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().availability().isOnStock().is(true),
                        "variants.availability.isOnStock: true" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .availability()
                        .availableQuantity()
                        .range(100L, 200L), "variants.availability.availableQuantity: range (100 to 200)" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .availability()
                        .channel(Identifiable.of("foo"))
                        .isOnStock()
                        .is(true), "variants.availability.channels.foo.isOnStock: true" },
                new Object[] {
                        ProductFilterExpressionBuilder.of()
                                .variants()
                                .availability()
                                .channel(Identifiable.of("foo"))
                                .availableQuantity()
                                .range(100L, 200L),
                        "variants.availability.channels.foo.availableQuantity: range (100 to 200)" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .availability()
                        .channel("foo")
                        .isOnStock()
                        .is(true), "variants.availability.channels.foo.isOnStock: true" },
                new Object[] {
                        ProductFilterExpressionBuilder.of()
                                .variants()
                                .availability()
                                .channel("foo")
                                .availableQuantity()
                                .range(100L, 200L),
                        "variants.availability.channels.foo.availableQuantity: range (100 to 200)" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .availability()
                        .isOnStockInChannels()
                        .is("foo")
                        .is("bar"), "variants.availability.isOnStockInChannels: \"foo\", \"bar\"" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .availability()
                        .isOnStockInChannels()
                        .is(Identifiable.of("foo"))
                        .is("bar"), "variants.availability.isOnStockInChannels: \"foo\", \"bar\"" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().attribute("foo").exists(),
                        "variants.attributes.foo: exists" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().attribute("foo").missing(),
                        "variants.attributes.foo: missing" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().attribute("foo").asBoolean().is(true),
                        "variants.attributes.foo: true" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().attribute("foo").asLong().is(100L),
                        "variants.attributes.foo: 100" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().attribute("foo").asLong().range(0L, 100L),
                        "variants.attributes.foo: range (0 to 100)" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().attribute("foo").asDouble().is(100.0),
                        "variants.attributes.foo: 100.0" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().attribute("foo").asDouble().is(100.0),
                        "variants.attributes.foo: 100.0" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().attribute("foo").asString().is("bar"),
                        "variants.attributes.foo: \"bar\"" },
                new Object[] {
                        ProductFilterExpressionBuilder.of()
                                .variants()
                                .attribute("foo")
                                .asDateTime()
                                .is(ZonedDateTime.parse("2015-06-04T12:27:55.344Z")),
                        "variants.attributes.foo: \"2015-06-04T12:27:55.344Z\"" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .attribute("foo")
                        .asDate()
                        .is(LocalDate.parse("2022-03-21")), "variants.attributes.foo: \"2022-03-21\"" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .attribute("foo")
                        .asTime()
                        .is(LocalTime.parse("12:34:32")), "variants.attributes.foo: \"12:34:32\"" },
                new Object[] {
                        ProductFilterExpressionBuilder.of().variants().attribute("foo").asMoney().centAmount().is(100L),
                        "variants.attributes.foo.centAmount: 100" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .attribute("foo")
                        .asMoney()
                        .currencyCode()
                        .is("EUR"), "variants.attributes.foo.currencyCode: \"EUR\"" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .attribute("foo")
                        .asMoney()
                        .currency()
                        .is(DefaultCurrencyUnits.EUR), "variants.attributes.foo.currencyCode: \"EUR\"" },
                new Object[] {
                        ProductFilterExpressionBuilder.of().variants().attribute("foo").asReference().id().is("foo"),
                        "variants.attributes.foo.id: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of()
                        .variants()
                        .attribute("foo")
                        .asReference()
                        .typeId()
                        .is("foo"), "variants.attributes.foo.typeId: \"foo\"" },
                new Object[] { ProductFilterExpressionBuilder.of().variants().attribute("foo").asEnum().key().is("foo"),
                        "variants.attributes.foo.key: \"foo\"" },

        };
    }

    public static Object[][] facetExpressions() {
        return new Object[][] {
                new Object[] { ProductFacetExpressionBuilder.of().categories().id().alias("cat"),
                        "categories.id as cat" },
                new Object[] { ProductFacetExpressionBuilder.of().categories().id().alias("cat").countingProducts(),
                        "categories.id as cat counting products" },
                new Object[] { ProductFacetExpressionBuilder.of().categories().id().countingProducts().alias("cat"),
                        "categories.id as cat counting products" },
                new Object[] {
                        ProductFacetExpressionBuilder.of().categories().id().countingProducts().alias("cat").is("foo"),
                        "categories.id: \"foo\" as cat counting products" },
                new Object[] { ProductFacetExpressionBuilder.of().categories().id(), "categories.id" },
                new Object[] { ProductFacetExpressionBuilder.of().categories().id().is("foo"),
                        "categories.id: \"foo\"" },
                new Object[] { ProductFacetExpressionBuilder.of().categories().id().is("foo").is("bar"),
                        "categories.id: \"foo\", \"bar\"" },
                new Object[] { ProductFacetExpressionBuilder.of().categories().id().subTree("foo"),
                        "categories.id: subTree(\"foo\")" },
                new Object[] { ProductFacetExpressionBuilder.of().categories().id().is("foo").subTree("bar"),
                        "categories.id: \"foo\", subTree(\"bar\")" },
                new Object[] { ProductFacetExpressionBuilder.of().categories().id().is("foo").subTree("bar").is("baz"),
                        "categories.id: \"foo\", subTree(\"bar\"), \"baz\"" },
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofText("test-text"),
                        "variants.attributes.test-text" },
                new Object[] {
                        ProductFacetExpressionBuilder.of().variants().attribute().ofText("test-text-foo").is("foo"),
                        "variants.attributes.test-text-foo: \"foo\"" },
                new Object[] {
                        ProductFacetExpressionBuilder.of().variants().attribute().ofText("test").is("foo").is("bar"),
                        "variants.attributes.test: \"foo\", \"bar\"" },
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofDate("test-date"),
                        "variants.attributes.test-date" },
                new Object[] { ProductFacetExpressionBuilder.of()
                        .variants()
                        .attribute()
                        .ofDate("test")
                        .is(LocalDate.parse("2024-01-03")), "variants.attributes.test: \"2024-01-03\"" },
                new Object[] {
                        ProductFacetExpressionBuilder.of()
                                .variants()
                                .attribute()
                                .ofDate("test")
                                .is(LocalDate.parse("2024-01-03"))
                                .is(LocalDate.parse("2024-01-04")),
                        "variants.attributes.test: \"2024-01-03\", \"2024-01-04\"" },
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofTime("test"),
                        "variants.attributes.test" },
                new Object[] { ProductFacetExpressionBuilder.of()
                        .variants()
                        .attribute()
                        .ofTime("test")
                        .is(LocalTime.parse("10:00")), "variants.attributes.test: \"10:00:00\"" },
                new Object[] { ProductFacetExpressionBuilder.of()
                        .variants()
                        .attribute()
                        .ofTime("test")
                        .is(LocalTime.parse("10:00"))
                        .is(LocalTime.parse("11:00")), "variants.attributes.test: \"10:00:00\", \"11:00:00\"" },
                new Object[] {
                        ProductFacetExpressionBuilder.of()
                                .variants()
                                .attribute()
                                .ofDatetime("test")
                                .is(ZonedDateTime.parse("2024-01-03T10:00Z")),
                        "variants.attributes.test: \"2024-01-03T10:00:00.000Z\"" },
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofEnum("test").key(),
                        "variants.attributes.test.key" },
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofEnum("test").label(),
                        "variants.attributes.test.label" },
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofEnum("test").label("en"),
                        "variants.attributes.test.label.en" },
                new Object[] {
                        ProductFacetExpressionBuilder.of().variants().attribute().ofEnum("test").label(Locale.US),
                        "variants.attributes.test.label.en-US" },
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofMoney("test").centAmount(),
                        "variants.attributes.test.centAmount" },
                new Object[] {
                        ProductFacetExpressionBuilder.of().variants().attribute().ofMoney("test").centAmount().is(100L),
                        "variants.attributes.test.centAmount: 100" },
                new Object[] {
                        ProductFacetExpressionBuilder.of()
                                .variants()
                                .attribute()
                                .ofMoney("test")
                                .centAmount()
                                .range(0L, 100L)
                                .range(101L, 200L),
                        "variants.attributes.test.centAmount: range (0 to 100), (101 to 200)" },
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofMoney("test").currencyCode(),
                        "variants.attributes.test.currencyCode" },
                new Object[] { ProductFacetExpressionBuilder.of()
                        .variants()
                        .attribute()
                        .ofMoney("test")
                        .currencyCode()
                        .is("EUR"), "variants.attributes.test.currencyCode: \"EUR\"" },
                new Object[] { ProductFacetExpressionBuilder.of()
                        .variants()
                        .attribute()
                        .ofMoney("test")
                        .currency()
                        .is(DefaultCurrencyUnits.EUR), "variants.attributes.test.currencyCode: \"EUR\"" },
                new Object[] { ProductFacetExpressionBuilder.of()
                        .variants()
                        .attribute()
                        .ofLong("test")
                        .range(0L, 100L)
                        .rangeFrom(100L), "variants.attributes.test: range (0 to 100), (100 to *)" },
                new Object[] {
                        ProductFacetExpressionBuilder.of()
                                .variants()
                                .attribute()
                                .ofLong("test")
                                .range(0L, 100L)
                                .rangeFrom(100L)
                                .alias("range_test")
                                .countingProducts(),
                        "variants.attributes.test: range (0 to 100), (100 to *) as range_test counting products" }, };
    }
}
