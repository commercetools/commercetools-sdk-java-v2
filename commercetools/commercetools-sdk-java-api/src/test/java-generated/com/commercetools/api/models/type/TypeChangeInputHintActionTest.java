
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
public class TypeChangeInputHintActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeChangeInputHintActionBuilder builder) {
        TypeChangeInputHintAction typeChangeInputHintAction = builder.buildUnchecked();
        Assertions.assertThat(typeChangeInputHintAction).isInstanceOf(TypeChangeInputHintAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeChangeInputHintAction.builder().fieldName("fieldName") },
                new Object[] { TypeChangeInputHintAction.builder()
                        .inputHint(com.commercetools.api.models.type.TypeTextInputHint.findEnum("SingleLine")) } };
    }

    @Test
    public void fieldName() {
        TypeChangeInputHintAction value = TypeChangeInputHintAction.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void inputHint() {
        TypeChangeInputHintAction value = TypeChangeInputHintAction.of();
        value.setInputHint(com.commercetools.api.models.type.TypeTextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getInputHint())
                .isEqualTo(com.commercetools.api.models.type.TypeTextInputHint.findEnum("SingleLine"));
    }
}
