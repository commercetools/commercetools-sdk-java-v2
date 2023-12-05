
package com.commercetools.importapi.models.types;

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
public class CustomFieldLocalizedEnumTypeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomFieldLocalizedEnumTypeBuilder builder) {
        CustomFieldLocalizedEnumType customFieldLocalizedEnumType = builder.buildUnchecked();
        Assertions.assertThat(customFieldLocalizedEnumType).isInstanceOf(CustomFieldLocalizedEnumType.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomFieldLocalizedEnumType.builder()
                .values(Collections.singletonList(
                    new com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValueImpl())) } };
    }

    @Test
    public void values() {
        CustomFieldLocalizedEnumType value = CustomFieldLocalizedEnumType.of();
        value.setValues(Collections
                .singletonList(new com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.types.CustomFieldLocalizedEnumValueImpl()));
    }
}
