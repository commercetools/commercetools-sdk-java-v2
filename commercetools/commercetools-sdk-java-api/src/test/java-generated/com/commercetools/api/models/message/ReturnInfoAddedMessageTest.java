
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
public class ReturnInfoAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReturnInfoAddedMessageBuilder builder) {
        ReturnInfoAddedMessage returnInfoAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(returnInfoAddedMessage).isInstanceOf(ReturnInfoAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReturnInfoAddedMessage.builder()
                .returnInfo(new com.commercetools.api.models.order.ReturnInfoImpl()) } };
    }

    @Test
    public void returnInfo() {
        ReturnInfoAddedMessage value = ReturnInfoAddedMessage.of();
        value.setReturnInfo(new com.commercetools.api.models.order.ReturnInfoImpl());
        Assertions.assertThat(value.getReturnInfo()).isEqualTo(new com.commercetools.api.models.order.ReturnInfoImpl());
    }
}
