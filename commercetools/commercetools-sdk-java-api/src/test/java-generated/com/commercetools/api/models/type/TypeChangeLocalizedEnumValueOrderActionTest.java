
package com.commercetools.api.models.type;

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
public class TypeChangeLocalizedEnumValueOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeChangeLocalizedEnumValueOrderActionBuilder builder) {
        TypeChangeLocalizedEnumValueOrderAction typeChangeLocalizedEnumValueOrderAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeLocalizedEnumValueOrderAction)
                .isInstanceOf(TypeChangeLocalizedEnumValueOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { TypeChangeLocalizedEnumValueOrderAction.builder().fieldName("fieldName") },
                new Object[] {
                        TypeChangeLocalizedEnumValueOrderAction.builder().keys(Collections.singletonList("keys")) } };
    }

    @Test
    public void fieldName() {
        TypeChangeLocalizedEnumValueOrderAction value = TypeChangeLocalizedEnumValueOrderAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void keys() {
        TypeChangeLocalizedEnumValueOrderAction value = TypeChangeLocalizedEnumValueOrderAction.of();
        value.setKeys(Collections.singletonList("keys"));
        Assertions.assertThat(value.getKeys()).isEqualTo(Collections.singletonList("keys"));
    }
}
