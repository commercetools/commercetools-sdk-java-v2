
package com.commercetools.api.models.me;

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
public class MyCartSetLineItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartSetLineItemCustomFieldActionBuilder builder) {
        MyCartSetLineItemCustomFieldAction myCartSetLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetLineItemCustomFieldAction)
                .isInstanceOf(MyCartSetLineItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCartSetLineItemCustomFieldAction.builder().lineItemId("lineItemId") },
                new Object[] { MyCartSetLineItemCustomFieldAction.builder().lineItemKey("lineItemKey") },
                new Object[] { MyCartSetLineItemCustomFieldAction.builder().name("name") },
                new Object[] { MyCartSetLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void lineItemId() {
        MyCartSetLineItemCustomFieldAction value = MyCartSetLineItemCustomFieldAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartSetLineItemCustomFieldAction value = MyCartSetLineItemCustomFieldAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void name() {
        MyCartSetLineItemCustomFieldAction value = MyCartSetLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyCartSetLineItemCustomFieldAction value = MyCartSetLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
