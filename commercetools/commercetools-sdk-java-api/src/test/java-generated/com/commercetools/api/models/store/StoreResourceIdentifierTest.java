
package com.commercetools.api.models.store;

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
public class StoreResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreResourceIdentifierBuilder builder) {
        StoreResourceIdentifier storeResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(storeResourceIdentifier).isInstanceOf(StoreResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StoreResourceIdentifier.builder().id("id") },
                new Object[] { StoreResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        StoreResourceIdentifier value = StoreResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        StoreResourceIdentifier value = StoreResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
