
package com.commercetools.api.models.standalone_price;

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
public class StandalonePriceUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceUpdateBuilder builder) {
        StandalonePriceUpdate standalonePriceUpdate = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceUpdate).isInstanceOf(StandalonePriceUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceUpdate.builder().version(2L) },
                new Object[] { StandalonePriceUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        StandalonePriceUpdate value = StandalonePriceUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        StandalonePriceUpdate value = StandalonePriceUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionImpl()));
    }
}
