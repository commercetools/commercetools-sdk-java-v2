
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
public class SetAnonymousIdChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetAnonymousIdChangeBuilder builder) {
        SetAnonymousIdChange setAnonymousIdChange = builder.buildUnchecked();
        Assertions.assertThat(setAnonymousIdChange).isInstanceOf(SetAnonymousIdChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetAnonymousIdChange.builder().change("change") },
                new Object[] { SetAnonymousIdChange.builder().previousValue("previousValue") },
                new Object[] { SetAnonymousIdChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetAnonymousIdChange value = SetAnonymousIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAnonymousIdChange value = SetAnonymousIdChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetAnonymousIdChange value = SetAnonymousIdChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
