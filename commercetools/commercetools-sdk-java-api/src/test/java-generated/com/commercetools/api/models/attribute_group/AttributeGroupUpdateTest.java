
package com.commercetools.api.models.attribute_group;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeGroupUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeGroupUpdateBuilder builder) {
        AttributeGroupUpdate attributeGroupUpdate = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupUpdate).isInstanceOf(AttributeGroupUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", AttributeGroupUpdate.builder().version(2L) },
                new Object[] { "actions", AttributeGroupUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        AttributeGroupUpdate value = AttributeGroupUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        AttributeGroupUpdate value = AttributeGroupUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionImpl()));
    }
}
