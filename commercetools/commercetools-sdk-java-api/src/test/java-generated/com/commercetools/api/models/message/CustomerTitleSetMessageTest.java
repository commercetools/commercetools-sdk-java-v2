
package com.commercetools.api.models.message;

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
public class CustomerTitleSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerTitleSetMessageBuilder builder) {
        CustomerTitleSetMessage customerTitleSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerTitleSetMessage).isInstanceOf(CustomerTitleSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerTitleSetMessage.builder().title("title") } };
    }

    @Test
    public void title() {
        CustomerTitleSetMessage value = CustomerTitleSetMessage.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }
}
