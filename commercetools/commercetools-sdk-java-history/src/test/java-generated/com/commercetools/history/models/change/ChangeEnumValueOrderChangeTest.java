
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
public class ChangeEnumValueOrderChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeEnumValueOrderChangeBuilder builder) {
        ChangeEnumValueOrderChange changeEnumValueOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeEnumValueOrderChange).isInstanceOf(ChangeEnumValueOrderChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeEnumValueOrderChange.builder().change("change") },
                new Object[] { ChangeEnumValueOrderChange.builder()
                        .previousValue(Collections
                                .singletonList(new com.commercetools.history.models.change_value.EnumValueImpl())) },
                new Object[] { ChangeEnumValueOrderChange.builder()
                        .nextValue(Collections
                                .singletonList(new com.commercetools.history.models.change_value.EnumValueImpl())) },
                new Object[] { ChangeEnumValueOrderChange.builder().fieldName("fieldName") } };
    }

    @Test
    public void change() {
        ChangeEnumValueOrderChange value = ChangeEnumValueOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeEnumValueOrderChange value = ChangeEnumValueOrderChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangeEnumValueOrderChange value = ChangeEnumValueOrderChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
    }

    @Test
    public void fieldName() {
        ChangeEnumValueOrderChange value = ChangeEnumValueOrderChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }
}
