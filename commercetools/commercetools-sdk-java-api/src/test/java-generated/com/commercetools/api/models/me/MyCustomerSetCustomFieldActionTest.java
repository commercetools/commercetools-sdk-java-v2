
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
public class MyCustomerSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerSetCustomFieldActionBuilder builder) {
        MyCustomerSetCustomFieldAction myCustomerSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetCustomFieldAction).isInstanceOf(MyCustomerSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerSetCustomFieldAction.builder().name("name") },
                new Object[] { MyCustomerSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyCustomerSetCustomFieldAction value = MyCustomerSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyCustomerSetCustomFieldAction value = MyCustomerSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
