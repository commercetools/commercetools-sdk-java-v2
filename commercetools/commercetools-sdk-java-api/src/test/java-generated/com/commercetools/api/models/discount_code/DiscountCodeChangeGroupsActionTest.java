
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
public class DiscountCodeChangeGroupsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeChangeGroupsActionBuilder builder) {
        DiscountCodeChangeGroupsAction discountCodeChangeGroupsAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeChangeGroupsAction).isInstanceOf(DiscountCodeChangeGroupsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountCodeChangeGroupsAction.builder().groups(Collections.singletonList("groups")) } };
    }

    @Test
    public void groups() {
        DiscountCodeChangeGroupsAction value = DiscountCodeChangeGroupsAction.of();
        value.setGroups(Collections.singletonList("groups"));
        Assertions.assertThat(value.getGroups()).isEqualTo(Collections.singletonList("groups"));
    }
}
