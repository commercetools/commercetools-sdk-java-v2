
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitResourceIdentifierBuilder builder) {
        BusinessUnitResourceIdentifier businessUnitResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(businessUnitResourceIdentifier).isInstanceOf(BusinessUnitResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", BusinessUnitResourceIdentifier.builder().id("id") },
                new Object[] { "key", BusinessUnitResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        BusinessUnitResourceIdentifier value = BusinessUnitResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        BusinessUnitResourceIdentifier value = BusinessUnitResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
