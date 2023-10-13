
package com.commercetools.importapi.models.customfields;

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
public class LocalizedStringSetFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LocalizedStringSetFieldBuilder builder) {
        LocalizedStringSetField localizedStringSetField = builder.buildUnchecked();
        Assertions.assertThat(localizedStringSetField).isInstanceOf(LocalizedStringSetField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { LocalizedStringSetField.builder()
                .value(
                    Collections.singletonList(new com.commercetools.importapi.models.common.LocalizedStringImpl())) } };
    }

    @Test
    public void value() {
        LocalizedStringSetField value = LocalizedStringSetField.of();
        value.setValue(Collections.singletonList(new com.commercetools.importapi.models.common.LocalizedStringImpl()));
        Assertions.assertThat(value.getValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.common.LocalizedStringImpl()));
    }
}
