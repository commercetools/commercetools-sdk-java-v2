
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
public class CustomerSetTitleActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetTitleActionBuilder builder) {
        CustomerSetTitleAction customerSetTitleAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetTitleAction).isInstanceOf(CustomerSetTitleAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerSetTitleAction.builder().title("title") } };
    }

    @Test
    public void title() {
        CustomerSetTitleAction value = CustomerSetTitleAction.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }
}
