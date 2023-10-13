
package com.commercetools.api.models.customer;

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
public class MyCustomerEmailVerifyTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerEmailVerifyBuilder builder) {
        MyCustomerEmailVerify myCustomerEmailVerify = builder.buildUnchecked();
        Assertions.assertThat(myCustomerEmailVerify).isInstanceOf(MyCustomerEmailVerify.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerEmailVerify.builder().tokenValue("tokenValue") } };
    }

    @Test
    public void tokenValue() {
        MyCustomerEmailVerify value = MyCustomerEmailVerify.of();
        value.setTokenValue("tokenValue");
        Assertions.assertThat(value.getTokenValue()).isEqualTo("tokenValue");
    }
}
