
package com.commercetools.api.models.me;

import java.util.Collections;

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
public class MyQuoteRequestUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyQuoteRequestUpdateBuilder builder) {
        MyQuoteRequestUpdate myQuoteRequestUpdate = builder.buildUnchecked();
        Assertions.assertThat(myQuoteRequestUpdate).isInstanceOf(MyQuoteRequestUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyQuoteRequestUpdate.builder().version(2L) },
                new Object[] { MyQuoteRequestUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.me.MyQuoteRequestUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyQuoteRequestUpdate value = MyQuoteRequestUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyQuoteRequestUpdate value = MyQuoteRequestUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.me.MyQuoteRequestUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.me.MyQuoteRequestUpdateActionImpl()));
    }
}
