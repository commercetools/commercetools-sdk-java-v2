
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
public class DiscountCodeChangeIsActiveActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeChangeIsActiveActionBuilder builder) {
        DiscountCodeChangeIsActiveAction discountCodeChangeIsActiveAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeChangeIsActiveAction).isInstanceOf(DiscountCodeChangeIsActiveAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeChangeIsActiveAction.builder().isActive(true) } };
    }

    @Test
    public void isActive() {
        DiscountCodeChangeIsActiveAction value = DiscountCodeChangeIsActiveAction.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }
}
