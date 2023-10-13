
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
public class TypeAddLocalizedEnumValueActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeAddLocalizedEnumValueActionBuilder builder) {
        TypeAddLocalizedEnumValueAction typeAddLocalizedEnumValueAction = builder.buildUnchecked();
        Assertions.assertThat(typeAddLocalizedEnumValueAction).isInstanceOf(TypeAddLocalizedEnumValueAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeAddLocalizedEnumValueAction.builder().fieldName("fieldName") },
                new Object[] { TypeAddLocalizedEnumValueAction.builder()
                        .value(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl()) } };
    }

    @Test
    public void fieldName() {
        TypeAddLocalizedEnumValueAction value = TypeAddLocalizedEnumValueAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void value() {
        TypeAddLocalizedEnumValueAction value = TypeAddLocalizedEnumValueAction.of();
        value.setValue(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl());
    }
}
