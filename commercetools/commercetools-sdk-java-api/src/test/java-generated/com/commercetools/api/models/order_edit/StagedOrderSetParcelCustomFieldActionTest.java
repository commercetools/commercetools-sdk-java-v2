
package com.commercetools.api.models.order_edit;

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
public class StagedOrderSetParcelCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetParcelCustomFieldActionBuilder builder) {
        StagedOrderSetParcelCustomFieldAction stagedOrderSetParcelCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetParcelCustomFieldAction)
                .isInstanceOf(StagedOrderSetParcelCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetParcelCustomFieldAction.builder().parcelId("parcelId") },
                new Object[] { StagedOrderSetParcelCustomFieldAction.builder().parcelKey("parcelKey") },
                new Object[] { StagedOrderSetParcelCustomFieldAction.builder().name("name") },
                new Object[] { StagedOrderSetParcelCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void parcelId() {
        StagedOrderSetParcelCustomFieldAction value = StagedOrderSetParcelCustomFieldAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        StagedOrderSetParcelCustomFieldAction value = StagedOrderSetParcelCustomFieldAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void name() {
        StagedOrderSetParcelCustomFieldAction value = StagedOrderSetParcelCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetParcelCustomFieldAction value = StagedOrderSetParcelCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
