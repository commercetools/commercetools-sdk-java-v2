
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
public class MyPaymentUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyPaymentUpdateBuilder builder) {
        MyPaymentUpdate myPaymentUpdate = builder.buildUnchecked();
        Assertions.assertThat(myPaymentUpdate).isInstanceOf(MyPaymentUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyPaymentUpdate.builder().version(2L) },
                new Object[] { MyPaymentUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.me.MyPaymentUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyPaymentUpdate value = MyPaymentUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyPaymentUpdate value = MyPaymentUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.me.MyPaymentUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.me.MyPaymentUpdateActionImpl()));
    }
}
