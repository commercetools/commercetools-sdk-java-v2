
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetReturnInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetReturnInfoActionBuilder builder) {
        StagedOrderSetReturnInfoAction stagedOrderSetReturnInfoAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetReturnInfoAction).isInstanceOf(StagedOrderSetReturnInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "items", StagedOrderSetReturnInfoAction.builder()
                .items(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoDraftImpl())) } };
    }

    @Test
    public void items() {
        StagedOrderSetReturnInfoAction value = StagedOrderSetReturnInfoAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoDraftImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoDraftImpl()));
    }
}
