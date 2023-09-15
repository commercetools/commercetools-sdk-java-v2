
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
public class CustomFieldEnumTypeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomFieldEnumTypeBuilder builder) {
        CustomFieldEnumType customFieldEnumType = builder.buildUnchecked();
        Assertions.assertThat(customFieldEnumType).isInstanceOf(CustomFieldEnumType.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomFieldEnumType.builder()
                .values(
                    Collections.singletonList(new com.commercetools.api.models.type.CustomFieldEnumValueImpl())) } };
    }

    @Test
    public void values() {
        CustomFieldEnumType value = CustomFieldEnumType.of();
        value.setValues(Collections.singletonList(new com.commercetools.api.models.type.CustomFieldEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.type.CustomFieldEnumValueImpl()));
    }
}
