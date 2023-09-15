
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
public class MyBusinessUnitSetContactEmailActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyBusinessUnitSetContactEmailActionBuilder builder) {
        MyBusinessUnitSetContactEmailAction myBusinessUnitSetContactEmailAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetContactEmailAction)
                .isInstanceOf(MyBusinessUnitSetContactEmailAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyBusinessUnitSetContactEmailAction.builder().contactEmail("contactEmail") } };
    }

    @Test
    public void contactEmail() {
        MyBusinessUnitSetContactEmailAction value = MyBusinessUnitSetContactEmailAction.of();
        value.setContactEmail("contactEmail");
        Assertions.assertThat(value.getContactEmail()).isEqualTo("contactEmail");
    }
}
