
package com.commercetools.importapi.models.order_patches;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveDeliveryDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveDeliveryDraftBuilder builder) {
        RemoveDeliveryDraft removeDeliveryDraft = builder.buildUnchecked();
        Assertions.assertThat(removeDeliveryDraft).isInstanceOf(RemoveDeliveryDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RemoveDeliveryDraft.builder().id("id") } };
    }

    @Test
    public void id() {
        RemoveDeliveryDraft value = RemoveDeliveryDraft.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
