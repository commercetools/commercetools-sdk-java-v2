
package com.commercetools.history.models.common;

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
public class ReturnInfoTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReturnInfoBuilder builder) {
        ReturnInfo returnInfo = builder.buildUnchecked();
        Assertions.assertThat(returnInfo).isInstanceOf(ReturnInfo.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        ReturnInfo.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReturnItemImpl())) },
                new Object[] { ReturnInfo.builder().returnTrackingId("returnTrackingId") },
                new Object[] { ReturnInfo.builder().returnDate("returnDate") } };
    }

    @Test
    public void items() {
        ReturnInfo value = ReturnInfo.of();
        value.setItems(Collections.singletonList(new com.commercetools.history.models.common.ReturnItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReturnItemImpl()));
    }

    @Test
    public void returnTrackingId() {
        ReturnInfo value = ReturnInfo.of();
        value.setReturnTrackingId("returnTrackingId");
        Assertions.assertThat(value.getReturnTrackingId()).isEqualTo("returnTrackingId");
    }

    @Test
    public void returnDate() {
        ReturnInfo value = ReturnInfo.of();
        value.setReturnDate("returnDate");
        Assertions.assertThat(value.getReturnDate()).isEqualTo("returnDate");
    }
}
