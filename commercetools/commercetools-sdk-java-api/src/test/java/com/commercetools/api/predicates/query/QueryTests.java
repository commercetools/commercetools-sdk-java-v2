
package com.commercetools.api.predicates.query;

import com.commercetools.api.predicates.query.cart.CartQueryPredicate;
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
        return new Object[][] { new Object[] { CartQueryPredicate.of().id().is("abc"), "id = \"abc\"", },
                new Object[] { CartQueryPredicate.of().id().is("abc").not(), "not(id = \"abc\")", },
                new Object[] { CartQueryPredicate.of().id().is("abc").and(p -> p.id().is("def")),
                        "id = \"abc\" and id = \"def\"", },
                new Object[] { CartQueryPredicate.of().id().is("abc").or(p -> p.id().is("def")),
                        "id = \"abc\" or id = \"def\"", },
                new Object[] {
                        CartQueryPredicate.of().id().is("abc").and(p -> p.id().is("def")).or(p -> p.id().is("ghi")),
                        "id = \"abc\" and id = \"def\" or id = \"ghi\"", },
                new Object[] {
                        CartQueryPredicate.of()
                                .lineItems(p -> p.id().is("abc"))
                                .and(p -> p.id().is("def"))
                                .or(p -> p.id().is("ghi")),
                        "lineItems(id = \"abc\") and id = \"def\" or id = \"ghi\"", }, };
    }

}
