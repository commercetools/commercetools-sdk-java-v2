
package com.commercetools.history.models.change;

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
public class ChangeInputHintChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeInputHintChangeBuilder builder) {
        ChangeInputHintChange changeInputHintChange = builder.buildUnchecked();
        Assertions.assertThat(changeInputHintChange).isInstanceOf(ChangeInputHintChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeInputHintChange.builder().change("change") },
                new Object[] { ChangeInputHintChange.builder()
                        .previousValue(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine")) },
                new Object[] { ChangeInputHintChange.builder()
                        .nextValue(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine")) },
                new Object[] { ChangeInputHintChange.builder().fieldName("fieldName") },
                new Object[] { ChangeInputHintChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeInputHintChange value = ChangeInputHintChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeInputHintChange value = ChangeInputHintChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
    }

    @Test
    public void nextValue() {
        ChangeInputHintChange value = ChangeInputHintChange.of();
        value.setNextValue(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.TextInputHint.findEnum("SingleLine"));
    }

    @Test
    public void fieldName() {
        ChangeInputHintChange value = ChangeInputHintChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void attributeName() {
        ChangeInputHintChange value = ChangeInputHintChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
