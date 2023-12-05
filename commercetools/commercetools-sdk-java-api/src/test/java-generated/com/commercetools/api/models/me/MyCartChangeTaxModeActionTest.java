
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
public class MyCartChangeTaxModeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartChangeTaxModeActionBuilder builder) {
        MyCartChangeTaxModeAction myCartChangeTaxModeAction = builder.buildUnchecked();
        Assertions.assertThat(myCartChangeTaxModeAction).isInstanceOf(MyCartChangeTaxModeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCartChangeTaxModeAction.builder()
                .taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void taxMode() {
        MyCartChangeTaxModeAction value = MyCartChangeTaxModeAction.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }
}
