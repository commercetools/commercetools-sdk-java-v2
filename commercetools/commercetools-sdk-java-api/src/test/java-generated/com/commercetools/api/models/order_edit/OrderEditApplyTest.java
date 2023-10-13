
package com.commercetools.api.models.order_edit;

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
public class OrderEditApplyTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderEditApplyBuilder builder) {
        OrderEditApply orderEditApply = builder.buildUnchecked();
        Assertions.assertThat(orderEditApply).isInstanceOf(OrderEditApply.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderEditApply.builder().editVersion(7L) },
                new Object[] { OrderEditApply.builder().resourceVersion(9L) } };
    }

    @Test
    public void editVersion() {
        OrderEditApply value = OrderEditApply.of();
        value.setEditVersion(7L);
        Assertions.assertThat(value.getEditVersion()).isEqualTo(7L);
    }

    @Test
    public void resourceVersion() {
        OrderEditApply value = OrderEditApply.of();
        value.setResourceVersion(9L);
        Assertions.assertThat(value.getResourceVersion()).isEqualTo(9L);
    }
}
