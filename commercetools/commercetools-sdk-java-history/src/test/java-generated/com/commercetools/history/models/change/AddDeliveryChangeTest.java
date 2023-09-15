
package com.commercetools.history.models.change;

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
public class AddDeliveryChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddDeliveryChangeBuilder builder) {
        AddDeliveryChange addDeliveryChange = builder.buildUnchecked();
        Assertions.assertThat(addDeliveryChange).isInstanceOf(AddDeliveryChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddDeliveryChange.builder().change("change") },
                new Object[] { AddDeliveryChange.builder()
                        .previousValue(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl()) },
                new Object[] { AddDeliveryChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl()) } };
    }

    @Test
    public void change() {
        AddDeliveryChange value = AddDeliveryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddDeliveryChange value = AddDeliveryChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl());
    }

    @Test
    public void nextValue() {
        AddDeliveryChange value = AddDeliveryChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl());
    }
}
