
package com.commercetools.api.models.zone;

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
public class ZoneSetDescriptionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ZoneSetDescriptionActionBuilder builder) {
        ZoneSetDescriptionAction zoneSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(zoneSetDescriptionAction).isInstanceOf(ZoneSetDescriptionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ZoneSetDescriptionAction.builder().description("description") } };
    }

    @Test
    public void description() {
        ZoneSetDescriptionAction value = ZoneSetDescriptionAction.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }
}
