
package com.commercetools.importapi.models.order_patches;

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
public class RemoveDeliveryDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveDeliveryDraftBuilder builder) {
        RemoveDeliveryDraft removeDeliveryDraft = builder.buildUnchecked();
        Assertions.assertThat(removeDeliveryDraft).isInstanceOf(RemoveDeliveryDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveDeliveryDraft.builder().id("id") } };
    }

    @Test
    public void id() {
        RemoveDeliveryDraft value = RemoveDeliveryDraft.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
