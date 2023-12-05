
package com.commercetools.history.models.change;

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
public class ChangeLocalizedEnumValueOrderChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeLocalizedEnumValueOrderChangeBuilder builder) {
        ChangeLocalizedEnumValueOrderChange changeLocalizedEnumValueOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeLocalizedEnumValueOrderChange)
                .isInstanceOf(ChangeLocalizedEnumValueOrderChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeLocalizedEnumValueOrderChange.builder().change("change") },
                new Object[] { ChangeLocalizedEnumValueOrderChange.builder()
                        .previousValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.LocalizedEnumValueImpl())) },
                new Object[] { ChangeLocalizedEnumValueOrderChange.builder()
                        .nextValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.LocalizedEnumValueImpl())) },
                new Object[] { ChangeLocalizedEnumValueOrderChange.builder().fieldName("fieldName") },
                new Object[] { ChangeLocalizedEnumValueOrderChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeLocalizedEnumValueOrderChange value = ChangeLocalizedEnumValueOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeLocalizedEnumValueOrderChange value = ChangeLocalizedEnumValueOrderChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.LocalizedEnumValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.change_value.LocalizedEnumValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangeLocalizedEnumValueOrderChange value = ChangeLocalizedEnumValueOrderChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.LocalizedEnumValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.change_value.LocalizedEnumValueImpl()));
    }

    @Test
    public void fieldName() {
        ChangeLocalizedEnumValueOrderChange value = ChangeLocalizedEnumValueOrderChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void attributeName() {
        ChangeLocalizedEnumValueOrderChange value = ChangeLocalizedEnumValueOrderChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
