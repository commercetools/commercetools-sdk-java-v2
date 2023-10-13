
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
public class ReturnInfoAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReturnInfoAddedMessagePayloadBuilder builder) {
        ReturnInfoAddedMessagePayload returnInfoAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(returnInfoAddedMessagePayload).isInstanceOf(ReturnInfoAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReturnInfoAddedMessagePayload.builder()
                .returnInfo(new com.commercetools.api.models.order.ReturnInfoImpl()) } };
    }

    @Test
    public void returnInfo() {
        ReturnInfoAddedMessagePayload value = ReturnInfoAddedMessagePayload.of();
        value.setReturnInfo(new com.commercetools.api.models.order.ReturnInfoImpl());
        Assertions.assertThat(value.getReturnInfo()).isEqualTo(new com.commercetools.api.models.order.ReturnInfoImpl());
    }
}
