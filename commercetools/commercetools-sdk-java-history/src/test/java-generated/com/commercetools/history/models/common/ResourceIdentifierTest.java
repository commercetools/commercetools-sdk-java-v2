
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ResourceIdentifierBuilder builder) {
        ResourceIdentifier resourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(resourceIdentifier).isInstanceOf(ResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ResourceIdentifier.builder().id("id") },
                new Object[] { "key", ResourceIdentifier.builder().key("key") },
                new Object[] { "typeId", ResourceIdentifier.builder()
                        .typeId(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role")) } };
    }

    @Test
    public void id() {
        ResourceIdentifier value = ResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ResourceIdentifier value = ResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void typeId() {
        ResourceIdentifier value = ResourceIdentifier.of();
        value.setTypeId(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role"));
    }
}
