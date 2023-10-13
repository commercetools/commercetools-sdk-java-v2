
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
public class ChangeAttributeOrderByNameChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeAttributeOrderByNameChangeBuilder builder) {
        ChangeAttributeOrderByNameChange changeAttributeOrderByNameChange = builder.buildUnchecked();
        Assertions.assertThat(changeAttributeOrderByNameChange).isInstanceOf(ChangeAttributeOrderByNameChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeAttributeOrderByNameChange.builder().change("change") },
                new Object[] { ChangeAttributeOrderByNameChange.builder()
                        .previousValue(Collections.singletonList("previousValue")) },
                new Object[] { ChangeAttributeOrderByNameChange.builder()
                        .nextValue(Collections.singletonList("nextValue")) } };
    }

    @Test
    public void change() {
        ChangeAttributeOrderByNameChange value = ChangeAttributeOrderByNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAttributeOrderByNameChange value = ChangeAttributeOrderByNameChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        ChangeAttributeOrderByNameChange value = ChangeAttributeOrderByNameChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }
}
