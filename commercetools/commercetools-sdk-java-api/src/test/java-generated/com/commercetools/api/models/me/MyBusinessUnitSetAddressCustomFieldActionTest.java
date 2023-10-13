
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
public class MyBusinessUnitSetAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyBusinessUnitSetAddressCustomFieldActionBuilder builder) {
        MyBusinessUnitSetAddressCustomFieldAction myBusinessUnitSetAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetAddressCustomFieldAction)
                .isInstanceOf(MyBusinessUnitSetAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyBusinessUnitSetAddressCustomFieldAction.builder().addressId("addressId") },
                new Object[] { MyBusinessUnitSetAddressCustomFieldAction.builder().name("name") },
                new Object[] { MyBusinessUnitSetAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitSetAddressCustomFieldAction value = MyBusinessUnitSetAddressCustomFieldAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void name() {
        MyBusinessUnitSetAddressCustomFieldAction value = MyBusinessUnitSetAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyBusinessUnitSetAddressCustomFieldAction value = MyBusinessUnitSetAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
