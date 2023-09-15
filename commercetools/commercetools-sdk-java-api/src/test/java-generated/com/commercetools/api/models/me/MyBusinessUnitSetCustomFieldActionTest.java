
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
public class MyBusinessUnitSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyBusinessUnitSetCustomFieldActionBuilder builder) {
        MyBusinessUnitSetCustomFieldAction myBusinessUnitSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetCustomFieldAction)
                .isInstanceOf(MyBusinessUnitSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyBusinessUnitSetCustomFieldAction.builder().name("name") },
                new Object[] { MyBusinessUnitSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyBusinessUnitSetCustomFieldAction value = MyBusinessUnitSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyBusinessUnitSetCustomFieldAction value = MyBusinessUnitSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
