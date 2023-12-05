
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
public class MyOrderFromQuoteDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyOrderFromQuoteDraftBuilder builder) {
        MyOrderFromQuoteDraft myOrderFromQuoteDraft = builder.buildUnchecked();
        Assertions.assertThat(myOrderFromQuoteDraft).isInstanceOf(MyOrderFromQuoteDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyOrderFromQuoteDraft.builder().id("id") },
                new Object[] { MyOrderFromQuoteDraft.builder().version(2L) },
                new Object[] { MyOrderFromQuoteDraft.builder().quoteStateToAccepted(true) } };
    }

    @Test
    public void id() {
        MyOrderFromQuoteDraft value = MyOrderFromQuoteDraft.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        MyOrderFromQuoteDraft value = MyOrderFromQuoteDraft.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void quoteStateToAccepted() {
        MyOrderFromQuoteDraft value = MyOrderFromQuoteDraft.of();
        value.setQuoteStateToAccepted(true);
        Assertions.assertThat(value.getQuoteStateToAccepted()).isEqualTo(true);
    }
}
