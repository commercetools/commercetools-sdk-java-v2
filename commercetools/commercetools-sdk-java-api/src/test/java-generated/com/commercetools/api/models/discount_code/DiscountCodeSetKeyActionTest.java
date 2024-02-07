
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
public class DiscountCodeSetKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeSetKeyActionBuilder builder) {
        DiscountCodeSetKeyAction discountCodeSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetKeyAction).isInstanceOf(DiscountCodeSetKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        DiscountCodeSetKeyAction value = DiscountCodeSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
