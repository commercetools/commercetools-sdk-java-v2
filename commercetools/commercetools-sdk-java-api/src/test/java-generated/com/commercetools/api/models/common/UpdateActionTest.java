
package com.commercetools.api.models.common;

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
public class UpdateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(UpdateActionBuilder builder) {
        UpdateAction updateAction = builder.buildUnchecked();
        Assertions.assertThat(updateAction).isInstanceOf(UpdateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { UpdateAction.builder().action("action") } };
    }

    @Test
    public void action() {
        UpdateAction value = UpdateAction.of();
        value.setAction("action");
        Assertions.assertThat(value.getAction()).isEqualTo("action");
    }
}
