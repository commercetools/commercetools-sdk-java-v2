
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetParcelCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetParcelCustomFieldActionBuilder builder) {
        StagedOrderSetParcelCustomFieldAction stagedOrderSetParcelCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetParcelCustomFieldAction)
                .isInstanceOf(StagedOrderSetParcelCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", StagedOrderSetParcelCustomFieldAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", StagedOrderSetParcelCustomFieldAction.builder().parcelKey("parcelKey") },
                new Object[] { "name", StagedOrderSetParcelCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetParcelCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void parcelId() {
        StagedOrderSetParcelCustomFieldAction value = StagedOrderSetParcelCustomFieldAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        StagedOrderSetParcelCustomFieldAction value = StagedOrderSetParcelCustomFieldAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void name() {
        StagedOrderSetParcelCustomFieldAction value = StagedOrderSetParcelCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetParcelCustomFieldAction value = StagedOrderSetParcelCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
