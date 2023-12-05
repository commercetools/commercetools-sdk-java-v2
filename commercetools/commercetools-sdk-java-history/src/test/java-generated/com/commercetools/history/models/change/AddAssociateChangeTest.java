
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
public class AddAssociateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddAssociateChangeBuilder builder) {
        AddAssociateChange addAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(addAssociateChange).isInstanceOf(AddAssociateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddAssociateChange.builder().change("change") }, new Object[] {
                AddAssociateChange.builder().nextValue(new com.commercetools.history.models.common.AssociateImpl()) } };
    }

    @Test
    public void change() {
        AddAssociateChange value = AddAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddAssociateChange value = AddAssociateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AssociateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AssociateImpl());
    }
}
