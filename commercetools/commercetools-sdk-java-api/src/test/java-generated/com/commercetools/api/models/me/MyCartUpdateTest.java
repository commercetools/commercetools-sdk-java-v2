
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
public class MyCartUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartUpdateBuilder builder) {
        MyCartUpdate myCartUpdate = builder.buildUnchecked();
        Assertions.assertThat(myCartUpdate).isInstanceOf(MyCartUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCartUpdate.builder().version(2L) }, new Object[] { MyCartUpdate
                .builder()
                .actions(Collections.singletonList(new com.commercetools.api.models.me.MyCartUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyCartUpdate value = MyCartUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyCartUpdate value = MyCartUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.me.MyCartUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.me.MyCartUpdateActionImpl()));
    }
}
