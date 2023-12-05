
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
public class StagedOrderAddDiscountCodeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderAddDiscountCodeActionBuilder builder) {
        StagedOrderAddDiscountCodeAction stagedOrderAddDiscountCodeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddDiscountCodeAction).isInstanceOf(StagedOrderAddDiscountCodeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderAddDiscountCodeAction.builder().code("code") } };
    }

    @Test
    public void code() {
        StagedOrderAddDiscountCodeAction value = StagedOrderAddDiscountCodeAction.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }
}
