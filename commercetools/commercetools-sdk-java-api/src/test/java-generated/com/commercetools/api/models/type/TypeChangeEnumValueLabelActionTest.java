
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
public class TypeChangeEnumValueLabelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeChangeEnumValueLabelActionBuilder builder) {
        TypeChangeEnumValueLabelAction typeChangeEnumValueLabelAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeEnumValueLabelAction).isInstanceOf(TypeChangeEnumValueLabelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeChangeEnumValueLabelAction.builder().fieldName("fieldName") },
                new Object[] { TypeChangeEnumValueLabelAction.builder()
                        .value(new com.commercetools.api.models.type.CustomFieldEnumValueImpl()) } };
    }

    @Test
    public void fieldName() {
        TypeChangeEnumValueLabelAction value = TypeChangeEnumValueLabelAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void value() {
        TypeChangeEnumValueLabelAction value = TypeChangeEnumValueLabelAction.of();
        value.setValue(new com.commercetools.api.models.type.CustomFieldEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldEnumValueImpl());
    }
}
