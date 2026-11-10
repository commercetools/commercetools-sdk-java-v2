
package com.commercetools.api.models.extension;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionTriggerTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionTriggerBuilder builder) {
        ExtensionTrigger extensionTrigger = builder.buildUnchecked();
        Assertions.assertThat(extensionTrigger).isInstanceOf(ExtensionTrigger.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceTypeId",
                        ExtensionTrigger.builder()
                                .resourceTypeId(
                                    com.commercetools.api.models.extension.ExtensionResourceTypeId.findEnum("cart")) },
                new Object[] { "actions",
                        ExtensionTrigger.builder()
                                .actions(Collections.singletonList(
                                    com.commercetools.api.models.extension.ExtensionAction.findEnum("Create"))) },
                new Object[] { "condition", ExtensionTrigger.builder().condition("condition") } };
    }

    @Test
    public void resourceTypeId() {
        ExtensionTrigger value = ExtensionTrigger.of();
        value.setResourceTypeId(com.commercetools.api.models.extension.ExtensionResourceTypeId.findEnum("cart"));
        Assertions.assertThat(value.getResourceTypeId())
                .isEqualTo(com.commercetools.api.models.extension.ExtensionResourceTypeId.findEnum("cart"));
    }

    @Test
    public void actions() {
        ExtensionTrigger value = ExtensionTrigger.of();
        value.setActions(
            Collections.singletonList(com.commercetools.api.models.extension.ExtensionAction.findEnum("Create")));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(com.commercetools.api.models.extension.ExtensionAction.findEnum("Create")));
    }

    @Test
    public void condition() {
        ExtensionTrigger value = ExtensionTrigger.of();
        value.setCondition("condition");
        Assertions.assertThat(value.getCondition()).isEqualTo("condition");
    }
}
