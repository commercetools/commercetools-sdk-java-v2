
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
public class OrderEditDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderEditDraftBuilder builder) {
        OrderEditDraft orderEditDraft = builder.buildUnchecked();
        Assertions.assertThat(orderEditDraft).isInstanceOf(OrderEditDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderEditDraft.builder().key("key") },
                new Object[] { OrderEditDraft.builder()
                        .resource(new com.commercetools.api.models.order.OrderReferenceImpl()) },
                new Object[] { OrderEditDraft.builder()
                        .stagedActions(Collections
                                .singletonList(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl())) },
                new Object[] { OrderEditDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { OrderEditDraft.builder().comment("comment") },
                new Object[] { OrderEditDraft.builder().dryRun(true) } };
    }

    @Test
    public void key() {
        OrderEditDraft value = OrderEditDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void resource() {
        OrderEditDraft value = OrderEditDraft.of();
        value.setResource(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getResource())
                .isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }

    @Test
    public void stagedActions() {
        OrderEditDraft value = OrderEditDraft.of();
        value.setStagedActions(
            Collections.singletonList(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl()));
        Assertions.assertThat(value.getStagedActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.order.StagedOrderUpdateActionImpl()));
    }

    @Test
    public void custom() {
        OrderEditDraft value = OrderEditDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void comment() {
        OrderEditDraft value = OrderEditDraft.of();
        value.setComment("comment");
        Assertions.assertThat(value.getComment()).isEqualTo("comment");
    }

    @Test
    public void dryRun() {
        OrderEditDraft value = OrderEditDraft.of();
        value.setDryRun(true);
        Assertions.assertThat(value.getDryRun()).isEqualTo(true);
    }
}
