
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
public class DiscountCodeSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeSetCustomFieldActionBuilder builder) {
        DiscountCodeSetCustomFieldAction discountCodeSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetCustomFieldAction).isInstanceOf(DiscountCodeSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeSetCustomFieldAction.builder().name("name") },
                new Object[] { DiscountCodeSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        DiscountCodeSetCustomFieldAction value = DiscountCodeSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        DiscountCodeSetCustomFieldAction value = DiscountCodeSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
