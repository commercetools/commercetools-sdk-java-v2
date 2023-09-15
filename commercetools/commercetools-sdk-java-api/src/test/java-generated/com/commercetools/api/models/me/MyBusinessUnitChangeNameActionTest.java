
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
public class MyBusinessUnitChangeNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyBusinessUnitChangeNameActionBuilder builder) {
        MyBusinessUnitChangeNameAction myBusinessUnitChangeNameAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitChangeNameAction).isInstanceOf(MyBusinessUnitChangeNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyBusinessUnitChangeNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        MyBusinessUnitChangeNameAction value = MyBusinessUnitChangeNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
