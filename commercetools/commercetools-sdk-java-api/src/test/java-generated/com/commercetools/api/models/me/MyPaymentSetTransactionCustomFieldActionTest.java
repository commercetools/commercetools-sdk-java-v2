
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
public class MyPaymentSetTransactionCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyPaymentSetTransactionCustomFieldActionBuilder builder) {
        MyPaymentSetTransactionCustomFieldAction myPaymentSetTransactionCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentSetTransactionCustomFieldAction)
                .isInstanceOf(MyPaymentSetTransactionCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyPaymentSetTransactionCustomFieldAction.builder().name("name") },
                new Object[] { MyPaymentSetTransactionCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyPaymentSetTransactionCustomFieldAction value = MyPaymentSetTransactionCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyPaymentSetTransactionCustomFieldAction value = MyPaymentSetTransactionCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
