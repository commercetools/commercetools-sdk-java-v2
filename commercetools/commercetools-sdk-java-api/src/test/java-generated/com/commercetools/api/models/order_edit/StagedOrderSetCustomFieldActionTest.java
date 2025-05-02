
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetCustomFieldActionBuilder builder) {
        StagedOrderSetCustomFieldAction stagedOrderSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomFieldAction).isInstanceOf(StagedOrderSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", StagedOrderSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        StagedOrderSetCustomFieldAction value = StagedOrderSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetCustomFieldAction value = StagedOrderSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
