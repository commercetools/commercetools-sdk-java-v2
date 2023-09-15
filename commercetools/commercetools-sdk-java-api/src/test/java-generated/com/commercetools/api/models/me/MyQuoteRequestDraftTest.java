
package com.commercetools.api.models.me;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class MyQuoteRequestDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyQuoteRequestDraftBuilder builder) {
        MyQuoteRequestDraft myQuoteRequestDraft = builder.buildUnchecked();
        Assertions.assertThat(myQuoteRequestDraft).isInstanceOf(MyQuoteRequestDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyQuoteRequestDraft.builder().cartId("cartId") },
                new Object[] { MyQuoteRequestDraft.builder().cartVersion(7L) },
                new Object[] { MyQuoteRequestDraft.builder().comment("comment") } };
    }

    @Test
    public void cartId() {
        MyQuoteRequestDraft value = MyQuoteRequestDraft.of();
        value.setCartId("cartId");
        Assertions.assertThat(value.getCartId()).isEqualTo("cartId");
    }

    @Test
    public void cartVersion() {
        MyQuoteRequestDraft value = MyQuoteRequestDraft.of();
        value.setCartVersion(7L);
        Assertions.assertThat(value.getCartVersion()).isEqualTo(7L);
    }

    @Test
    public void comment() {
        MyQuoteRequestDraft value = MyQuoteRequestDraft.of();
        value.setComment("comment");
        Assertions.assertThat(value.getComment()).isEqualTo("comment");
    }
}
