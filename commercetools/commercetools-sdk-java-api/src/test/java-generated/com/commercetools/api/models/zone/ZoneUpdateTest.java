
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
public class ZoneUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ZoneUpdateBuilder builder) {
        ZoneUpdate zoneUpdate = builder.buildUnchecked();
        Assertions.assertThat(zoneUpdate).isInstanceOf(ZoneUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ZoneUpdate.builder().version(2L) }, new Object[] { ZoneUpdate.builder()
                .actions(Collections.singletonList(new com.commercetools.api.models.zone.ZoneUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ZoneUpdate value = ZoneUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ZoneUpdate value = ZoneUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.zone.ZoneUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.zone.ZoneUpdateActionImpl()));
    }
}
