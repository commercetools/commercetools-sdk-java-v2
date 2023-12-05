
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
public class MyCustomerSetCompanyNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerSetCompanyNameActionBuilder builder) {
        MyCustomerSetCompanyNameAction myCustomerSetCompanyNameAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetCompanyNameAction).isInstanceOf(MyCustomerSetCompanyNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerSetCompanyNameAction.builder().companyName("companyName") } };
    }

    @Test
    public void companyName() {
        MyCustomerSetCompanyNameAction value = MyCustomerSetCompanyNameAction.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }
}
