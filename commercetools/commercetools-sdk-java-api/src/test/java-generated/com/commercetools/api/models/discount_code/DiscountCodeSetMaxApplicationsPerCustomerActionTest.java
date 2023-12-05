
package com.commercetools.api.models.discount_code;

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
public class DiscountCodeSetMaxApplicationsPerCustomerActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeSetMaxApplicationsPerCustomerActionBuilder builder) {
        DiscountCodeSetMaxApplicationsPerCustomerAction discountCodeSetMaxApplicationsPerCustomerAction = builder
                .buildUnchecked();
        Assertions.assertThat(discountCodeSetMaxApplicationsPerCustomerAction)
                .isInstanceOf(DiscountCodeSetMaxApplicationsPerCustomerAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                DiscountCodeSetMaxApplicationsPerCustomerAction.builder().maxApplicationsPerCustomer(5L) } };
    }

    @Test
    public void maxApplicationsPerCustomer() {
        DiscountCodeSetMaxApplicationsPerCustomerAction value = DiscountCodeSetMaxApplicationsPerCustomerAction.of();
        value.setMaxApplicationsPerCustomer(5L);
        Assertions.assertThat(value.getMaxApplicationsPerCustomer()).isEqualTo(5L);
    }
}
