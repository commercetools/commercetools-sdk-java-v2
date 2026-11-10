
package com.commercetools.importapi.models.order_patches;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveParcelFromDeliveryDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveParcelFromDeliveryDraftBuilder builder) {
        RemoveParcelFromDeliveryDraft removeParcelFromDeliveryDraft = builder.buildUnchecked();
        Assertions.assertThat(removeParcelFromDeliveryDraft).isInstanceOf(RemoveParcelFromDeliveryDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", RemoveParcelFromDeliveryDraft.builder().parcelId("parcelId") } };
    }

    @Test
    public void parcelId() {
        RemoveParcelFromDeliveryDraft value = RemoveParcelFromDeliveryDraft.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }
}
