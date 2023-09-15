
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
public class MyCustomerSetLastNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerSetLastNameActionBuilder builder) {
        MyCustomerSetLastNameAction myCustomerSetLastNameAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetLastNameAction).isInstanceOf(MyCustomerSetLastNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerSetLastNameAction.builder().lastName("lastName") } };
    }

    @Test
    public void lastName() {
        MyCustomerSetLastNameAction value = MyCustomerSetLastNameAction.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }
}
