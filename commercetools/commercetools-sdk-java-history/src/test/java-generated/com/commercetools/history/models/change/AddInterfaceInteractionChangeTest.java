
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
public class AddInterfaceInteractionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddInterfaceInteractionChangeBuilder builder) {
        AddInterfaceInteractionChange addInterfaceInteractionChange = builder.buildUnchecked();
        Assertions.assertThat(addInterfaceInteractionChange).isInstanceOf(AddInterfaceInteractionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddInterfaceInteractionChange.builder().change("change") },
                new Object[] { AddInterfaceInteractionChange.builder()
                        .nextValue(
                            new com.commercetools.history.models.change_value.CustomFieldExpandedValueImpl()) } };
    }

    @Test
    public void change() {
        AddInterfaceInteractionChange value = AddInterfaceInteractionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddInterfaceInteractionChange value = AddInterfaceInteractionChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.CustomFieldExpandedValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.CustomFieldExpandedValueImpl());
    }
}
