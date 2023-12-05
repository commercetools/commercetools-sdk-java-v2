
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
public class SetMetaTitleChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetMetaTitleChangeBuilder builder) {
        SetMetaTitleChange setMetaTitleChange = builder.buildUnchecked();
        Assertions.assertThat(setMetaTitleChange).isInstanceOf(SetMetaTitleChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetMetaTitleChange.builder().change("change") },
                new Object[] { SetMetaTitleChange.builder()
                        .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetMetaTitleChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void change() {
        SetMetaTitleChange value = SetMetaTitleChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMetaTitleChange value = SetMetaTitleChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        SetMetaTitleChange value = SetMetaTitleChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
