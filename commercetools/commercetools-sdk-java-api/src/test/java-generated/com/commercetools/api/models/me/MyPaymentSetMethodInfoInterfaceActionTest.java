
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
public class MyPaymentSetMethodInfoInterfaceActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyPaymentSetMethodInfoInterfaceActionBuilder builder) {
        MyPaymentSetMethodInfoInterfaceAction myPaymentSetMethodInfoInterfaceAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentSetMethodInfoInterfaceAction)
                .isInstanceOf(MyPaymentSetMethodInfoInterfaceAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyPaymentSetMethodInfoInterfaceAction.builder()._interface("_interface") } };
    }

    @Test
    public void _interface() {
        MyPaymentSetMethodInfoInterfaceAction value = MyPaymentSetMethodInfoInterfaceAction.of();
        value.setInterface("interface");
        Assertions.assertThat(value.getInterface()).isEqualTo("interface");
    }
}
