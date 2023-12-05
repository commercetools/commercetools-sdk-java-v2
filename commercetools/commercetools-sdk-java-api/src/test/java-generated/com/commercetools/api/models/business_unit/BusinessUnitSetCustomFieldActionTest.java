
package com.commercetools.api.models.business_unit;

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
public class BusinessUnitSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitSetCustomFieldActionBuilder builder) {
        BusinessUnitSetCustomFieldAction businessUnitSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetCustomFieldAction).isInstanceOf(BusinessUnitSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitSetCustomFieldAction.builder().name("name") },
                new Object[] { BusinessUnitSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        BusinessUnitSetCustomFieldAction value = BusinessUnitSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitSetCustomFieldAction value = BusinessUnitSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
