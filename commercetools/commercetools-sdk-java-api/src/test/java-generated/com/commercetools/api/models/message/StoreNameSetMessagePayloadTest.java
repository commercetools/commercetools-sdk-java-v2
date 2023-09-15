
package com.commercetools.api.models.message;

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
public class StoreNameSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreNameSetMessagePayloadBuilder builder) {
        StoreNameSetMessagePayload storeNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeNameSetMessagePayload).isInstanceOf(StoreNameSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreNameSetMessagePayload.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { StoreNameSetMessagePayload.builder()
                        .nameAllLocales(Collections
                                .singletonList(new com.commercetools.api.models.common.LocalizedStringImpl())) } };
    }

    @Test
    public void name() {
        StoreNameSetMessagePayload value = StoreNameSetMessagePayload.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void nameAllLocales() {
        StoreNameSetMessagePayload value = StoreNameSetMessagePayload.of();
        value.setNameAllLocales(
            Collections.singletonList(new com.commercetools.api.models.common.LocalizedStringImpl()));
        Assertions.assertThat(value.getNameAllLocales())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.LocalizedStringImpl()));
    }
}
