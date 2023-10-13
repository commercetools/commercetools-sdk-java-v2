
package com.commercetools.api.models.order;

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
public class OrderSetReturnInfoActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetReturnInfoActionBuilder builder) {
        OrderSetReturnInfoAction orderSetReturnInfoAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetReturnInfoAction).isInstanceOf(OrderSetReturnInfoAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetReturnInfoAction.builder()
                .items(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoDraftImpl())) } };
    }

    @Test
    public void items() {
        OrderSetReturnInfoAction value = OrderSetReturnInfoAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoDraftImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoDraftImpl()));
    }
}
