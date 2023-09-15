
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
public class TypeChangeLocalizedEnumValueLabelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeChangeLocalizedEnumValueLabelActionBuilder builder) {
        TypeChangeLocalizedEnumValueLabelAction typeChangeLocalizedEnumValueLabelAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeLocalizedEnumValueLabelAction)
                .isInstanceOf(TypeChangeLocalizedEnumValueLabelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { TypeChangeLocalizedEnumValueLabelAction.builder().fieldName("fieldName") },
                new Object[] { TypeChangeLocalizedEnumValueLabelAction.builder()
                        .value(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl()) } };
    }

    @Test
    public void fieldName() {
        TypeChangeLocalizedEnumValueLabelAction value = TypeChangeLocalizedEnumValueLabelAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void value() {
        TypeChangeLocalizedEnumValueLabelAction value = TypeChangeLocalizedEnumValueLabelAction.of();
        value.setValue(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl());
    }
}
