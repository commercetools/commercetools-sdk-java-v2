
package com.commercetools.history.models.common;

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
public class DiscountCodeInfoTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeInfoBuilder builder) {
        DiscountCodeInfo discountCodeInfo = builder.buildUnchecked();
        Assertions.assertThat(discountCodeInfo).isInstanceOf(DiscountCodeInfo.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountCodeInfo.builder()
                        .discountCode(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { DiscountCodeInfo.builder()
                        .state(com.commercetools.history.models.common.DiscountCodeState.findEnum("NotActive")) } };
    }

    @Test
    public void discountCode() {
        DiscountCodeInfo value = DiscountCodeInfo.of();
        value.setDiscountCode(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void state() {
        DiscountCodeInfo value = DiscountCodeInfo.of();
        value.setState(com.commercetools.history.models.common.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.history.models.common.DiscountCodeState.findEnum("NotActive"));
    }
}
