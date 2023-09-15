
package com.commercetools.api.models.message;

import java.util.Collections;

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
public class ReturnInfoSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReturnInfoSetMessageBuilder builder) {
        ReturnInfoSetMessage returnInfoSetMessage = builder.buildUnchecked();
        Assertions.assertThat(returnInfoSetMessage).isInstanceOf(ReturnInfoSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReturnInfoSetMessage.builder()
                .returnInfo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl())) } };
    }

    @Test
    public void returnInfo() {
        ReturnInfoSetMessage value = ReturnInfoSetMessage.of();
        value.setReturnInfo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl()));
        Assertions.assertThat(value.getReturnInfo())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl()));
    }
}
