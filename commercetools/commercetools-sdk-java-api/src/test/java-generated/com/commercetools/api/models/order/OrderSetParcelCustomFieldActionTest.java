
package com.commercetools.api.models.order;

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
public class OrderSetParcelCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetParcelCustomFieldActionBuilder builder) {
        OrderSetParcelCustomFieldAction orderSetParcelCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetParcelCustomFieldAction).isInstanceOf(OrderSetParcelCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetParcelCustomFieldAction.builder().parcelId("parcelId") },
                new Object[] { OrderSetParcelCustomFieldAction.builder().parcelKey("parcelKey") },
                new Object[] { OrderSetParcelCustomFieldAction.builder().name("name") },
                new Object[] { OrderSetParcelCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void parcelId() {
        OrderSetParcelCustomFieldAction value = OrderSetParcelCustomFieldAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        OrderSetParcelCustomFieldAction value = OrderSetParcelCustomFieldAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void name() {
        OrderSetParcelCustomFieldAction value = OrderSetParcelCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetParcelCustomFieldAction value = OrderSetParcelCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
