
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
public class AddReturnInfoChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddReturnInfoChangeBuilder builder) {
        AddReturnInfoChange addReturnInfoChange = builder.buildUnchecked();
        Assertions.assertThat(addReturnInfoChange).isInstanceOf(AddReturnInfoChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddReturnInfoChange.builder().change("change") },
                new Object[] { AddReturnInfoChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReturnInfoImpl()) } };
    }

    @Test
    public void change() {
        AddReturnInfoChange value = AddReturnInfoChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddReturnInfoChange value = AddReturnInfoChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReturnInfoImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReturnInfoImpl());
    }
}
