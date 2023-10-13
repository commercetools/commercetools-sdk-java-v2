
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
public class ZoneReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ZoneReferenceBuilder builder) {
        ZoneReference zoneReference = builder.buildUnchecked();
        Assertions.assertThat(zoneReference).isInstanceOf(ZoneReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ZoneReference.builder().obj(new com.commercetools.api.models.zone.ZoneImpl()) },
                new Object[] { ZoneReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ZoneReference value = ZoneReference.of();
        value.setObj(new com.commercetools.api.models.zone.ZoneImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.zone.ZoneImpl());
    }

    @Test
    public void id() {
        ZoneReference value = ZoneReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
