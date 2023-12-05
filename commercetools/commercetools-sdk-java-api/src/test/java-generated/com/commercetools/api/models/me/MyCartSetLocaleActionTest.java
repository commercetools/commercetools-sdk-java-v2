
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
public class MyCartSetLocaleActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartSetLocaleActionBuilder builder) {
        MyCartSetLocaleAction myCartSetLocaleAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetLocaleAction).isInstanceOf(MyCartSetLocaleAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCartSetLocaleAction.builder().locale("locale") } };
    }

    @Test
    public void locale() {
        MyCartSetLocaleAction value = MyCartSetLocaleAction.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }
}
