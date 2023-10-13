
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
public class CustomerEmailVerifyTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerEmailVerifyBuilder builder) {
        CustomerEmailVerify customerEmailVerify = builder.buildUnchecked();
        Assertions.assertThat(customerEmailVerify).isInstanceOf(CustomerEmailVerify.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerEmailVerify.builder().version(2L) },
                new Object[] { CustomerEmailVerify.builder().tokenValue("tokenValue") } };
    }

    @Test
    public void version() {
        CustomerEmailVerify value = CustomerEmailVerify.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void tokenValue() {
        CustomerEmailVerify value = CustomerEmailVerify.of();
        value.setTokenValue("tokenValue");
        Assertions.assertThat(value.getTokenValue()).isEqualTo("tokenValue");
    }
}
