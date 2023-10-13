
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
public class ZoneResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ZoneResourceIdentifierBuilder builder) {
        ZoneResourceIdentifier zoneResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(zoneResourceIdentifier).isInstanceOf(ZoneResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ZoneResourceIdentifier.builder().id("id") },
                new Object[] { ZoneResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ZoneResourceIdentifier value = ZoneResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ZoneResourceIdentifier value = ZoneResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
