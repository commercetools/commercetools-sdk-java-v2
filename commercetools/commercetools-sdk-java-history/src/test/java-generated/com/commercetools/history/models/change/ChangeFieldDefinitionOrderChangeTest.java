
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
public class ChangeFieldDefinitionOrderChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeFieldDefinitionOrderChangeBuilder builder) {
        ChangeFieldDefinitionOrderChange changeFieldDefinitionOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeFieldDefinitionOrderChange).isInstanceOf(ChangeFieldDefinitionOrderChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeFieldDefinitionOrderChange.builder().change("change") },
                new Object[] { ChangeFieldDefinitionOrderChange.builder()
                        .previousValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl())) },
                new Object[] { ChangeFieldDefinitionOrderChange.builder()
                        .nextValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl())) } };
    }

    @Test
    public void change() {
        ChangeFieldDefinitionOrderChange value = ChangeFieldDefinitionOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeFieldDefinitionOrderChange value = ChangeFieldDefinitionOrderChange.of();
        value.setPreviousValue(Collections
                .singletonList(new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangeFieldDefinitionOrderChange value = ChangeFieldDefinitionOrderChange.of();
        value.setNextValue(Collections
                .singletonList(new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl()));
    }
}
