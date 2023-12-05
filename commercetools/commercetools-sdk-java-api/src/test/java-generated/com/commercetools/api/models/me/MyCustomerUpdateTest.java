
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
public class MyCustomerUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerUpdateBuilder builder) {
        MyCustomerUpdate myCustomerUpdate = builder.buildUnchecked();
        Assertions.assertThat(myCustomerUpdate).isInstanceOf(MyCustomerUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerUpdate.builder().version(2L) },
                new Object[] { MyCustomerUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.me.MyCustomerUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyCustomerUpdate value = MyCustomerUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyCustomerUpdate value = MyCustomerUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.me.MyCustomerUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.me.MyCustomerUpdateActionImpl()));
    }
}
