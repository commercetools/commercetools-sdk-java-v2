
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
public class DiscountCodeSetMaxApplicationsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeSetMaxApplicationsActionBuilder builder) {
        DiscountCodeSetMaxApplicationsAction discountCodeSetMaxApplicationsAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetMaxApplicationsAction)
                .isInstanceOf(DiscountCodeSetMaxApplicationsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeSetMaxApplicationsAction.builder().maxApplications(9L) } };
    }

    @Test
    public void maxApplications() {
        DiscountCodeSetMaxApplicationsAction value = DiscountCodeSetMaxApplicationsAction.of();
        value.setMaxApplications(9L);
        Assertions.assertThat(value.getMaxApplications()).isEqualTo(9L);
    }
}
