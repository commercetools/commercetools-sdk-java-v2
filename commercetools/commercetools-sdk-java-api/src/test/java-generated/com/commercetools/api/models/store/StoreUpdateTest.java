
package com.commercetools.api.models.store;

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
public class StoreUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreUpdateBuilder builder) {
        StoreUpdate storeUpdate = builder.buildUnchecked();
        Assertions.assertThat(storeUpdate).isInstanceOf(StoreUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StoreUpdate.builder().version(2L) }, new Object[] { StoreUpdate.builder()
                .actions(Collections.singletonList(new com.commercetools.api.models.store.StoreUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        StoreUpdate value = StoreUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        StoreUpdate value = StoreUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.store.StoreUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreUpdateActionImpl()));
    }
}
