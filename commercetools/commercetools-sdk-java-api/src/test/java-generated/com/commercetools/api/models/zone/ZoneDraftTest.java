
package com.commercetools.api.models.zone;

import java.util.Collections;

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
public class ZoneDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ZoneDraftBuilder builder) {
        ZoneDraft zoneDraft = builder.buildUnchecked();
        Assertions.assertThat(zoneDraft).isInstanceOf(ZoneDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ZoneDraft.builder().key("key") },
                new Object[] { ZoneDraft.builder().name("name") },
                new Object[] { ZoneDraft.builder().description("description") }, new Object[] { ZoneDraft.builder()
                        .locations(Collections.singletonList(new com.commercetools.api.models.zone.LocationImpl())) } };
    }

    @Test
    public void key() {
        ZoneDraft value = ZoneDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ZoneDraft value = ZoneDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        ZoneDraft value = ZoneDraft.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void locations() {
        ZoneDraft value = ZoneDraft.of();
        value.setLocations(Collections.singletonList(new com.commercetools.api.models.zone.LocationImpl()));
        Assertions.assertThat(value.getLocations())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.zone.LocationImpl()));
    }
}
