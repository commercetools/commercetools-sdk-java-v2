
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
public class StoreReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreReferenceBuilder builder) {
        StoreReference storeReference = builder.buildUnchecked();
        Assertions.assertThat(storeReference).isInstanceOf(StoreReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreReference.builder().obj(new com.commercetools.api.models.store.StoreImpl()) },
                new Object[] { StoreReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        StoreReference value = StoreReference.of();
        value.setObj(new com.commercetools.api.models.store.StoreImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.store.StoreImpl());
    }

    @Test
    public void id() {
        StoreReference value = StoreReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
