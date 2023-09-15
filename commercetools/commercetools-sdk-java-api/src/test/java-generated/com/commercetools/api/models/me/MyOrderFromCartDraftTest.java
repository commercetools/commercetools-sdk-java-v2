
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
public class MyOrderFromCartDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyOrderFromCartDraftBuilder builder) {
        MyOrderFromCartDraft myOrderFromCartDraft = builder.buildUnchecked();
        Assertions.assertThat(myOrderFromCartDraft).isInstanceOf(MyOrderFromCartDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyOrderFromCartDraft.builder().id("id") },
                new Object[] { MyOrderFromCartDraft.builder().version(2L) } };
    }

    @Test
    public void id() {
        MyOrderFromCartDraft value = MyOrderFromCartDraft.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        MyOrderFromCartDraft value = MyOrderFromCartDraft.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
