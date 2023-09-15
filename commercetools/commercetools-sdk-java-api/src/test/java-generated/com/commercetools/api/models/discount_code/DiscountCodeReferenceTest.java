
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
public class DiscountCodeReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeReferenceBuilder builder) {
        DiscountCodeReference discountCodeReference = builder.buildUnchecked();
        Assertions.assertThat(discountCodeReference).isInstanceOf(DiscountCodeReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountCodeReference.builder()
                        .obj(new com.commercetools.api.models.discount_code.DiscountCodeImpl()) },
                new Object[] { DiscountCodeReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        DiscountCodeReference value = DiscountCodeReference.of();
        value.setObj(new com.commercetools.api.models.discount_code.DiscountCodeImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeImpl());
    }

    @Test
    public void id() {
        DiscountCodeReference value = DiscountCodeReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
