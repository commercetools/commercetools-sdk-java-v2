
package com.commercetools.api.search;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Locale;

import com.commercetools.api.models.Identifiable;
import com.commercetools.api.models.common.DefaultCurrencyUnits;
import com.commercetools.api.search.products.*;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class SearchTests {

    @TestTemplate
    @UseDataProvider("filterExpressions")
    public void filterRender(FilterExpression searchExpression, String expectedPredicate) {
        Assertions.assertThat(searchExpression.render()).isEqualTo(expectedPredicate);
    }

    @TestTemplate
    @UseDataProvider("facetExpressions")
    public void facetRender(FilterExpression searchExpression, String expectedPredicate) {
        Assertions.assertThat(searchExpression.render()).isEqualTo(expectedPredicate);
    }

    @DataProvider
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

    @DataProvider
    public static Object[][] facetExpressions() {
        return new Object[][] {
                new Object[] { ProductFacetExpressionBuilder.of().categories().id().alias("cat"),
                        "categories.id as cat" },
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
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofText("test"),
                        "variants.attributes.test" },
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofText("test").is("foo"),
                        "variants.attributes.test: \"foo\"" },
                new Object[] {
                        ProductFacetExpressionBuilder.of().variants().attribute().ofText("test").is("foo").is("bar"),
                        "variants.attributes.test: \"foo\", \"bar\"" },
                new Object[] { ProductFacetExpressionBuilder.of().variants().attribute().ofDate("test"),
                        "variants.attributes.test" },
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
                        "variants.attributes.test: \"2024-01-03T10:00:00.000Z\"" }, };
    }
}
