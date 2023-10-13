
package com.commercetools.api.models.order_edit;

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
public class OrderEditUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderEditUpdateBuilder builder) {
        OrderEditUpdate orderEditUpdate = builder.buildUnchecked();
        Assertions.assertThat(orderEditUpdate).isInstanceOf(OrderEditUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderEditUpdate.builder().version(2L) },
                new Object[] { OrderEditUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.order_edit.OrderEditUpdateActionImpl())) },
                new Object[] { OrderEditUpdate.builder().dryRun(true) } };
    }

    @Test
    public void version() {
        OrderEditUpdate value = OrderEditUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        OrderEditUpdate value = OrderEditUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.order_edit.OrderEditUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.order_edit.OrderEditUpdateActionImpl()));
    }

    @Test
    public void dryRun() {
        OrderEditUpdate value = OrderEditUpdate.of();
        value.setDryRun(true);
        Assertions.assertThat(value.getDryRun()).isEqualTo(true);
    }
}
