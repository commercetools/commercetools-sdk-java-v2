
package com.commercetools.ml.models.image_search_config;

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
public class ChangeStatusUpdateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeStatusUpdateActionBuilder builder) {
        ChangeStatusUpdateAction changeStatusUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(changeStatusUpdateAction).isInstanceOf(ChangeStatusUpdateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeStatusUpdateAction.builder()
                .status(com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus.findEnum("on")) } };
    }

    @Test
    public void status() {
        ChangeStatusUpdateAction value = ChangeStatusUpdateAction.of();
        value.setStatus(com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus.findEnum("on"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus.findEnum("on"));
    }
}
