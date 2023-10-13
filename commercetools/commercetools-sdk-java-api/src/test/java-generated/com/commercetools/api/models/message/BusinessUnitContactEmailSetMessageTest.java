
package com.commercetools.api.models.message;

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
public class BusinessUnitContactEmailSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitContactEmailSetMessageBuilder builder) {
        BusinessUnitContactEmailSetMessage businessUnitContactEmailSetMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitContactEmailSetMessage)
                .isInstanceOf(BusinessUnitContactEmailSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitContactEmailSetMessage.builder().contactEmail("contactEmail") } };
    }

    @Test
    public void contactEmail() {
        BusinessUnitContactEmailSetMessage value = BusinessUnitContactEmailSetMessage.of();
        value.setContactEmail("contactEmail");
        Assertions.assertThat(value.getContactEmail()).isEqualTo("contactEmail");
    }
}
