
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
public class TypeChangeLabelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeChangeLabelActionBuilder builder) {
        TypeChangeLabelAction typeChangeLabelAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeLabelAction).isInstanceOf(TypeChangeLabelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeChangeLabelAction.builder().fieldName("fieldName") },
                new Object[] { TypeChangeLabelAction.builder()
                        .label(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void fieldName() {
        TypeChangeLabelAction value = TypeChangeLabelAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void label() {
        TypeChangeLabelAction value = TypeChangeLabelAction.of();
        value.setLabel(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
