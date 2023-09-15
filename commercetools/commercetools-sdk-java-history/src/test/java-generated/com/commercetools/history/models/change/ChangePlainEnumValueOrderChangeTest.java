
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
public class ChangePlainEnumValueOrderChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangePlainEnumValueOrderChangeBuilder builder) {
        ChangePlainEnumValueOrderChange changePlainEnumValueOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changePlainEnumValueOrderChange).isInstanceOf(ChangePlainEnumValueOrderChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangePlainEnumValueOrderChange.builder().change("change") },
                new Object[] { ChangePlainEnumValueOrderChange.builder()
                        .previousValue(Collections
                                .singletonList(new com.commercetools.history.models.change_value.EnumValueImpl())) },
                new Object[] { ChangePlainEnumValueOrderChange.builder()
                        .nextValue(Collections
                                .singletonList(new com.commercetools.history.models.change_value.EnumValueImpl())) },
                new Object[] { ChangePlainEnumValueOrderChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangePlainEnumValueOrderChange value = ChangePlainEnumValueOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangePlainEnumValueOrderChange value = ChangePlainEnumValueOrderChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangePlainEnumValueOrderChange value = ChangePlainEnumValueOrderChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
    }

    @Test
    public void attributeName() {
        ChangePlainEnumValueOrderChange value = ChangePlainEnumValueOrderChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
