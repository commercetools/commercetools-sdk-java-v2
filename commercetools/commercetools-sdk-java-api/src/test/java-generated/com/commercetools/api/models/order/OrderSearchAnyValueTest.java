
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
public class OrderSearchAnyValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchAnyValueBuilder builder) {
        OrderSearchAnyValue orderSearchAnyValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchAnyValue).isInstanceOf(OrderSearchAnyValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchAnyValue.builder().value("value") },
                new Object[] { OrderSearchAnyValue.builder().language("language") },
                new Object[] { OrderSearchAnyValue.builder().caseInsensitive(true) } };
    }

    @Test
    public void value() {
        OrderSearchAnyValue value = OrderSearchAnyValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        OrderSearchAnyValue value = OrderSearchAnyValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void caseInsensitive() {
        OrderSearchAnyValue value = OrderSearchAnyValue.of();
        value.setCaseInsensitive(true);
        Assertions.assertThat(value.getCaseInsensitive()).isEqualTo(true);
    }
}
