
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
public class OrderSearchFullTextValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchFullTextValueBuilder builder) {
        OrderSearchFullTextValue orderSearchFullTextValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchFullTextValue).isInstanceOf(OrderSearchFullTextValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchFullTextValue.builder().value("value") },
                new Object[] { OrderSearchFullTextValue.builder().language("language") },
                new Object[] { OrderSearchFullTextValue.builder()
                        .mustMatch(com.commercetools.api.models.order.OrderSearchMatchType.findEnum("any")) } };
    }

    @Test
    public void value() {
        OrderSearchFullTextValue value = OrderSearchFullTextValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        OrderSearchFullTextValue value = OrderSearchFullTextValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void mustMatch() {
        OrderSearchFullTextValue value = OrderSearchFullTextValue.of();
        value.setMustMatch(com.commercetools.api.models.order.OrderSearchMatchType.findEnum("any"));
        Assertions.assertThat(value.getMustMatch())
                .isEqualTo(com.commercetools.api.models.order.OrderSearchMatchType.findEnum("any"));
    }
}
