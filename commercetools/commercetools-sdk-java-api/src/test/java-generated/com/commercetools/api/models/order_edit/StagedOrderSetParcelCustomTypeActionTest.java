
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetParcelCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetParcelCustomTypeActionBuilder builder) {
        StagedOrderSetParcelCustomTypeAction stagedOrderSetParcelCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetParcelCustomTypeAction)
                .isInstanceOf(StagedOrderSetParcelCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", StagedOrderSetParcelCustomTypeAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", StagedOrderSetParcelCustomTypeAction.builder().parcelKey("parcelKey") },
                new Object[] { "type",
                        StagedOrderSetParcelCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", StagedOrderSetParcelCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void parcelId() {
        StagedOrderSetParcelCustomTypeAction value = StagedOrderSetParcelCustomTypeAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        StagedOrderSetParcelCustomTypeAction value = StagedOrderSetParcelCustomTypeAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void type() {
        StagedOrderSetParcelCustomTypeAction value = StagedOrderSetParcelCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetParcelCustomTypeAction value = StagedOrderSetParcelCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
