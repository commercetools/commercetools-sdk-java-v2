
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
public class MyPaymentSetMethodInfoNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyPaymentSetMethodInfoNameActionBuilder builder) {
        MyPaymentSetMethodInfoNameAction myPaymentSetMethodInfoNameAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentSetMethodInfoNameAction).isInstanceOf(MyPaymentSetMethodInfoNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyPaymentSetMethodInfoNameAction.builder()
                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        MyPaymentSetMethodInfoNameAction value = MyPaymentSetMethodInfoNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
