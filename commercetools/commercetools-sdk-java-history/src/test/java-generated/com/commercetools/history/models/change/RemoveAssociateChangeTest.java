
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
public class RemoveAssociateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveAssociateChangeBuilder builder) {
        RemoveAssociateChange removeAssociateChange = builder.buildUnchecked();
        Assertions.assertThat(removeAssociateChange).isInstanceOf(RemoveAssociateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveAssociateChange.builder().change("change") },
                new Object[] { RemoveAssociateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.AssociateImpl()) } };
    }

    @Test
    public void change() {
        RemoveAssociateChange value = RemoveAssociateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveAssociateChange value = RemoveAssociateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AssociateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AssociateImpl());
    }
}
