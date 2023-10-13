
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
public class StoreSetLanguagesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreSetLanguagesActionBuilder builder) {
        StoreSetLanguagesAction storeSetLanguagesAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetLanguagesAction).isInstanceOf(StoreSetLanguagesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreSetLanguagesAction.builder().languages(Collections.singletonList("languages")) } };
    }

    @Test
    public void languages() {
        StoreSetLanguagesAction value = StoreSetLanguagesAction.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }
}
