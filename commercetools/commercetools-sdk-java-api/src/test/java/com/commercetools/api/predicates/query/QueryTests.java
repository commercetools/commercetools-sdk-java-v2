
package com.commercetools.api.predicates.query;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Arrays;

import com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl;
import com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl;
import com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl;
import com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl;
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
                new Object[] { CartQueryBuilderDsl.of().key().isNotDefined(), "key is not defined", }, };
    }
}
