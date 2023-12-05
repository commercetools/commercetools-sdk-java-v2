
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
public class MyQuoteUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyQuoteUpdateBuilder builder) {
        MyQuoteUpdate myQuoteUpdate = builder.buildUnchecked();
        Assertions.assertThat(myQuoteUpdate).isInstanceOf(MyQuoteUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyQuoteUpdate.builder().version(2L) }, new Object[] { MyQuoteUpdate
                .builder()
                .actions(Collections.singletonList(new com.commercetools.api.models.me.MyQuoteUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyQuoteUpdate value = MyQuoteUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyQuoteUpdate value = MyQuoteUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.me.MyQuoteUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.me.MyQuoteUpdateActionImpl()));
    }
}
