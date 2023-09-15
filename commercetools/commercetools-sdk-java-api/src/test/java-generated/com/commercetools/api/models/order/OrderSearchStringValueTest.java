
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
public class OrderSearchStringValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchStringValueBuilder builder) {
        OrderSearchStringValue orderSearchStringValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchStringValue).isInstanceOf(OrderSearchStringValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchStringValue.builder().value("value") },
                new Object[] { OrderSearchStringValue.builder().language("language") },
                new Object[] { OrderSearchStringValue.builder().caseInsensitive(true) } };
    }

    @Test
    public void value() {
        OrderSearchStringValue value = OrderSearchStringValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        OrderSearchStringValue value = OrderSearchStringValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void caseInsensitive() {
        OrderSearchStringValue value = OrderSearchStringValue.of();
        value.setCaseInsensitive(true);
        Assertions.assertThat(value.getCaseInsensitive()).isEqualTo(true);
    }
}
