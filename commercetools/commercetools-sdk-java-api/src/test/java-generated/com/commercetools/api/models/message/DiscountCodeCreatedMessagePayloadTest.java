
package com.commercetools.api.models.message;

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
public class DiscountCodeCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeCreatedMessagePayloadBuilder builder) {
        DiscountCodeCreatedMessagePayload discountCodeCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(discountCodeCreatedMessagePayload).isInstanceOf(DiscountCodeCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeCreatedMessagePayload.builder()
                .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeImpl()) } };
    }

    @Test
    public void discountCode() {
        DiscountCodeCreatedMessagePayload value = DiscountCodeCreatedMessagePayload.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeImpl());
    }
}
