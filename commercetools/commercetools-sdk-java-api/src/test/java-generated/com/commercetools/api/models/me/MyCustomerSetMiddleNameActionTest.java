
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
public class MyCustomerSetMiddleNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerSetMiddleNameActionBuilder builder) {
        MyCustomerSetMiddleNameAction myCustomerSetMiddleNameAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetMiddleNameAction).isInstanceOf(MyCustomerSetMiddleNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerSetMiddleNameAction.builder().middleName("middleName") } };
    }

    @Test
    public void middleName() {
        MyCustomerSetMiddleNameAction value = MyCustomerSetMiddleNameAction.of();
        value.setMiddleName("middleName");
        Assertions.assertThat(value.getMiddleName()).isEqualTo("middleName");
    }
}
