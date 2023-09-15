
package com.commercetools.history.models.change_value;

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
public class CustomShippingMethodChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomShippingMethodChangeValueBuilder builder) {
        CustomShippingMethodChangeValue customShippingMethodChangeValue = builder.buildUnchecked();
        Assertions.assertThat(customShippingMethodChangeValue).isInstanceOf(CustomShippingMethodChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomShippingMethodChangeValue.builder().name("name") } };
    }

    @Test
    public void name() {
        CustomShippingMethodChangeValue value = CustomShippingMethodChangeValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
