
package com.commercetools.api.models.discount_code;

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
public class DiscountCodeUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeUpdateBuilder builder) {
        DiscountCodeUpdate discountCodeUpdate = builder.buildUnchecked();
        Assertions.assertThat(discountCodeUpdate).isInstanceOf(DiscountCodeUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeUpdate.builder().version(2L) },
                new Object[] { DiscountCodeUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.discount_code.DiscountCodeUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        DiscountCodeUpdate value = DiscountCodeUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        DiscountCodeUpdate value = DiscountCodeUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.discount_code.DiscountCodeUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.discount_code.DiscountCodeUpdateActionImpl()));
    }
}
