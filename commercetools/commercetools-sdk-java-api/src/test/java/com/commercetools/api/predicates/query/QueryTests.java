
package com.commercetools.api.predicates.query;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl;
import com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl;
import com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl;
import com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl;
import com.commercetools.api.predicates.query.message.MessageQueryBuilderDsl;
import com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl;
import com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl;
import com.commercetools.api.predicates.query.state.StateQueryBuilderDsl;
import com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl;
import com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class QueryTests {

    @TestTemplate
    @UseDataProvider("predicates")
    public void predicateRender(QueryPredicate t, String expectedPredicate) {
        Assertions.assertThat(t.render()).isEqualTo(expectedPredicate);
    }

    @DataProvider
    public static Object[][] predicates() {
        return new Object[][] { new Object[] { CartQueryBuilderDsl.of().id().is("abc"), "id = \"abc\"", },
                new Object[] { CartQueryBuilderDsl.of().id().is("abc").not(), "not(id = \"abc\")", },
                new Object[] { CartQueryBuilderDsl.of().id().is("abc").and(p -> p.id().is("def")),
                        "id = \"abc\" and id = \"def\"", },
                new Object[] { CartQueryBuilderDsl.of().id().is("abc").or(p -> p.id().is("def")),
                        "id = \"abc\" or id = \"def\"", },
                new Object[] {
                        CartQueryBuilderDsl.of().id().is("abc").and(p -> p.id().is("def")).or(p -> p.id().is("ghi")),
                        "id = \"abc\" and id = \"def\" or id = \"ghi\"", },
                new Object[] {
                        CartQueryBuilderDsl.of().id().is("abc").and(p -> p.id().is("def").or(p.id().is("ghi")).group()),
                        "id = \"abc\" and (id = \"def\" or id = \"ghi\")", },
                new Object[] {
                        CartQueryBuilderDsl.of()
                                .lineItems(p -> p.id().is("abc"))
                                .and(p -> p.id().is("def"))
                                .or(p -> p.id().is("ghi")),
                        "lineItems(id = \"abc\") and id = \"def\" or id = \"ghi\"", },
                new Object[] {
                        CartQueryBuilderDsl.of()
                                .lineItems(p -> p.totalPrice(t -> t.currencyCode().is("EUR")))
                                .and(p -> p.id().is("def"))
                                .or(p -> p.id().is("ghi")),
                        "lineItems(totalPrice(currencyCode = \"EUR\")) and id = \"def\" or id = \"ghi\"", },
                new Object[] { CartQueryBuilderDsl.of().createdAt().is(ZonedDateTime.parse("2018-10-12T14:00:00.000Z")),
                        "createdAt = \"2018-10-12T14:00:00.000Z\"", },
                new Object[] { CartQueryBuilderDsl.of().key().isNot("foo"), "key != \"foo\"", },

                new Object[] { CartQueryBuilderDsl.of().version().isLessThan(10L), "version < 10", },
                new Object[] { CartQueryBuilderDsl.of().version().isGreaterThan(10L), "version > 10", },
                new Object[] { CartQueryBuilderDsl.of().version().isLessThanOrEqual(10L), "version <= 10", },
                new Object[] { CartQueryBuilderDsl.of().version().isGreaterThanOrEqual(10L), "version >= 10", },
                new Object[] { CartQueryBuilderDsl.of().version().isNot(10L), "version <> 10", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isNot(10.0), "amount <> 10.0", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().is(10.0), "amount = 10.0", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isLessThan(10.0), "amount < 10.0", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isGreaterThan(10.0), "amount > 10.0", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isLessThanOrEqual(10.0), "amount <= 10.0", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isGreaterThanOrEqual(10.0), "amount >= 10.0", },
                new Object[] { CustomerQueryBuilderDsl.of().dateOfBirth().is(LocalDate.parse("2018-10-12")),
                        "dateOfBirth = \"2018-10-12\"", },
                new Object[] { CustomerQueryBuilderDsl.of().dateOfBirth().isNot(LocalDate.parse("2018-10-12")),
                        "dateOfBirth != \"2018-10-12\"", },
                new Object[] { CustomerQueryBuilderDsl.of().dateOfBirth().isLessThan(LocalDate.parse("2018-10-12")),
                        "dateOfBirth < \"2018-10-12\"", },
                new Object[] { CustomerQueryBuilderDsl.of().dateOfBirth().isGreaterThan(LocalDate.parse("2018-10-12")),
                        "dateOfBirth > \"2018-10-12\"", },
                new Object[] {
                        CustomerQueryBuilderDsl.of().dateOfBirth().isLessThanOrEqual(LocalDate.parse("2018-10-12")),
                        "dateOfBirth <= \"2018-10-12\"", },
                new Object[] {
                        CustomerQueryBuilderDsl.of().dateOfBirth().isGreaterThanOrEqual(LocalDate.parse("2018-10-12")),
                        "dateOfBirth >= \"2018-10-12\"", },
                new Object[] { CartQueryBuilderDsl.of().key().isIn(Arrays.asList("foo", "bar")),
                        "key in (\"foo\", \"bar\")", },
                new Object[] { CartQueryBuilderDsl.of().version().isIn(Arrays.asList(1L, 2L)), "version in (1, 2)", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isIn(Arrays.asList(10.0, 20.0)),
                        "amount in (10.0, 20.0)", },
                new Object[] {
                        CustomerQueryBuilderDsl.of()
                                .dateOfBirth()
                                .isIn(Arrays.asList(LocalDate.parse("2018-10-12"), LocalDate.parse("2018-10-13"))),
                        "dateOfBirth in (\"2018-10-12\", \"2018-10-13\")", },
                new Object[] { ChannelQueryBuilderDsl.of().geoLocation().withinCircle(13.37770, 52.51627, 1000L),
                        "geoLocation within circle(13.3777, 52.51627, 1000)", },
                new Object[] { CartQueryBuilderDsl.of().key().isDefined(), "key is defined", },
                new Object[] { CartQueryBuilderDsl.of().key().isNotDefined(), "key is not defined", },
                new Object[] { CartQueryBuilderDsl.of().lineItems().isEmpty(), "lineItems is empty", },
                new Object[] { StateQueryBuilderDsl.of().roles().isEmpty(), "roles is empty", },
                new Object[] {
                        TypeQueryBuilderDsl.of()
                                .resourceTypeIds()
                                .containsAny(Collections.singletonList(ProductResourceIdentifier.PRODUCT)),
                        "resourceTypeIds contains any(\"product\")", },
                new Object[] {
                        TypeQueryBuilderDsl.of()
                                .resourceTypeIds()
                                .containsAll(Collections.singletonList(ProductResourceIdentifier.PRODUCT)),
                        "resourceTypeIds contains all(\"product\")", },
                new Object[] {
                        ProductQueryBuilderDsl.of()
                                .masterData(m -> m.current(c -> c.slug(l -> l.with(Locale.ENGLISH).is("super-product"))
                                        .and(t -> t.name(l -> l.with(Locale.ENGLISH).is("Super Product"))))),
                        "masterData(current(slug(en = \"super-product\") and name(en = \"Super Product\")))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(a -> a.name().is("attribute-name")).not()),
                        "variants(not(attributes(name = \"attribute-name\")))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(
                                    a -> a.name().is("attribute-name").and(av -> av.value().is("attribute-value")))),
                        "variants(attributes(name = \"attribute-name\" and value = \"attribute-value\"))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(a -> a.name()
                                        .is("attribute-name")
                                        .and(av -> av.value()
                                                .isIn(Arrays.asList("attribute-value-1", "attribute-value-2"))))),
                        "variants(attributes(name = \"attribute-name\" and value in (\"attribute-value-1\", \"attribute-value-2\")))", },
                new Object[] { ProductProjectionQueryBuilderDsl.of()
                        .variants(v -> v.attributes(
                            a -> a.name().is("attribute-name").and(av -> av.plainEnum(e -> e.key().is("test"))))),
                        "variants(attributes(name = \"attribute-name\" and value(key = \"test\")))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(a -> a.name()
                                        .is("attribute-name")
                                        .and(av -> av
                                                .localizedEnum(e -> e.label(l -> l.with(Locale.ENGLISH).is("test")))))),
                        "variants(attributes(name = \"attribute-name\" and value(label(en = \"test\"))))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(a -> a.name()
                                        .is("attribute-name")
                                        .and(av -> av.money(
                                            m -> m.centAmount().is(1000L).and(mc -> mc.currencyCode().is("EUR")))))),
                        "variants(attributes(name = \"attribute-name\" and value(centAmount = 1000 and currencyCode = \"EUR\")))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(a -> a.name()
                                        .is("attribute-name")
                                        .and(av -> av
                                                .reference(m -> m.typeId().is(ReferenceTypeId.CART.getJsonName()))))),
                        "variants(attributes(name = \"attribute-name\" and value(typeId = \"cart\")))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(
                                    a -> a.name().is("attribute-name").and(av -> av.longNumber().is(999L)))),
                        "variants(attributes(name = \"attribute-name\" and value = 999))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(
                                    a -> a.name().is("attribute-name").and(av -> av.doubleNumber().is(999.0)))),
                        "variants(attributes(name = \"attribute-name\" and value = 999.0))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(
                                    a -> a.name().is("attribute-name").and(a.value().is("attribute-value")))),
                        "variants(attributes(name = \"attribute-name\" and value = \"attribute-value\"))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(a -> a.name()
                                        .is("attribute-name")
                                        .and(a.value().isIn(Arrays.asList("attribute-value-1", "attribute-value-2"))))),
                        "variants(attributes(name = \"attribute-name\" and value in (\"attribute-value-1\", \"attribute-value-2\")))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(
                                    a -> a.name().is("attribute-name").and(a.plainEnum(e -> e.key().is("test"))))),
                        "variants(attributes(name = \"attribute-name\" and value(key = \"test\")))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(a -> a.name()
                                        .is("attribute-name")
                                        .and(a.localizedEnum(e -> e.label(l -> l.with(Locale.ENGLISH).is("test")))))),
                        "variants(attributes(name = \"attribute-name\" and value(label(en = \"test\"))))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(a -> a.name()
                                        .is("attribute-name")
                                        .and(a.money(
                                            m -> m.centAmount().is(1000L).and(mc -> mc.currencyCode().is("EUR")))))),
                        "variants(attributes(name = \"attribute-name\" and value(centAmount = 1000 and currencyCode = \"EUR\")))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(a -> a.name()
                                        .is("attribute-name")
                                        .and(a.reference(m -> m.typeId().is(ReferenceTypeId.CART.getJsonName()))))),
                        "variants(attributes(name = \"attribute-name\" and value(typeId = \"cart\")))", },
                new Object[] { ProductProjectionQueryBuilderDsl.of()
                        .variants(v -> v.attributes(a -> a.name().is("attribute-name").and(a.longNumber().is(999L)))),
                        "variants(attributes(name = \"attribute-name\" and value = 999))", },
                new Object[] {
                        ProductProjectionQueryBuilderDsl.of()
                                .variants(v -> v.attributes(
                                    a -> a.name().is("attribute-name").and(a.doubleNumber().is(999.0)))),
                        "variants(attributes(name = \"attribute-name\" and value = 999.0))", },
                new Object[] {
                        CartDiscountQueryBuilderDsl.of()
                                .value(v -> v.asAbsolute(a -> a.money(c -> c.currencyCode().is("EUR")))),
                        "value(money(currencyCode = \"EUR\"))", },
                new Object[] {
                        CartDiscountQueryBuilderDsl.of()
                                .value(v -> v.asGiftLineItem(a -> a.product(p -> p.id().is("abc")))),
                        "value(product(id = \"abc\"))", },
                new Object[] {
                        MessageQueryBuilderDsl.of()
                                .asCustomerCreated(message -> message.customer(c -> c.key().is("foo"))),
                        "customer(key = \"foo\")", },
                new Object[] {
                        CartQueryBuilderDsl.of()
                                .lineItems(l -> l
                                        .price(p -> p.value(t -> t.asHighPrecision(h -> h.preciseAmount().is(400L))))),
                        "lineItems(price(value(preciseAmount = 400)))", },
                new Object[] { CartQueryBuilderDsl.of().totalPrice(l -> l.currencyCode().is("EUR")),
                        "totalPrice(currencyCode = \"EUR\")", },
                new Object[] { CartQueryBuilderDsl.of().id().is("ab\"c"), "id = \"ab\\\"c\"", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isVar("foo"), "amount = :foo", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isLessThanVar("foo"), "amount < :foo", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isGreaterThanVar("foo"), "amount > :foo", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isLessThanOrEqualVar("foo"), "amount <= :foo", },
                new Object[] { TaxRateQueryBuilderDsl.of().amount().isGreaterThanOrEqualVar("foo"), "amount >= :foo", },
                new Object[] { CartQueryBuilderDsl.of().key().isInVar("foo"), "key in :foo" },
                new Object[] { TypeQueryBuilderDsl.of().resourceTypeIds().containsAnyVar("foo"),
                        "resourceTypeIds contains any :foo", },
                new Object[] { TypeQueryBuilderDsl.of().resourceTypeIds().containsAllVar("foo"),
                        "resourceTypeIds contains all :foo", },

        };
    }
}
