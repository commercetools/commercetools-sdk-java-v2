
package com.commercetools.api.models.order_edit;

import java.time.ZonedDateTime;
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
public class StagedOrderAddReturnInfoActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderAddReturnInfoActionBuilder builder) {
        StagedOrderAddReturnInfoAction stagedOrderAddReturnInfoAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddReturnInfoAction).isInstanceOf(StagedOrderAddReturnInfoAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderAddReturnInfoAction.builder().returnTrackingId("returnTrackingId") },
                new Object[] {
                        StagedOrderAddReturnInfoAction.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl())) },
                new Object[] { StagedOrderAddReturnInfoAction.builder()
                        .returnDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void returnTrackingId() {
        StagedOrderAddReturnInfoAction value = StagedOrderAddReturnInfoAction.of();
        value.setReturnTrackingId("returnTrackingId");
        Assertions.assertThat(value.getReturnTrackingId()).isEqualTo("returnTrackingId");
    }

    @Test
    public void items() {
        StagedOrderAddReturnInfoAction value = StagedOrderAddReturnInfoAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl()));
    }

    @Test
    public void returnDate() {
        StagedOrderAddReturnInfoAction value = StagedOrderAddReturnInfoAction.of();
        value.setReturnDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getReturnDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
