
package com.commercetools.api.models.type;

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
public class TypeAddEnumValueActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeAddEnumValueActionBuilder builder) {
        TypeAddEnumValueAction typeAddEnumValueAction = builder.buildUnchecked();
        Assertions.assertThat(typeAddEnumValueAction).isInstanceOf(TypeAddEnumValueAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeAddEnumValueAction.builder().fieldName("fieldName") },
                new Object[] { TypeAddEnumValueAction.builder()
                        .value(new com.commercetools.api.models.type.CustomFieldEnumValueImpl()) } };
    }

    @Test
    public void fieldName() {
        TypeAddEnumValueAction value = TypeAddEnumValueAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void value() {
        TypeAddEnumValueAction value = TypeAddEnumValueAction.of();
        value.setValue(new com.commercetools.api.models.type.CustomFieldEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldEnumValueImpl());
    }
}
