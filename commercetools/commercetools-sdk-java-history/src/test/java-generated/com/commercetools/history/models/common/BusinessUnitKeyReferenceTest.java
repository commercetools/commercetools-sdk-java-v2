
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitKeyReferenceBuilder builder) {
        BusinessUnitKeyReference businessUnitKeyReference = builder.buildUnchecked();
        Assertions.assertThat(businessUnitKeyReference).isInstanceOf(BusinessUnitKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", BusinessUnitKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        BusinessUnitKeyReference value = BusinessUnitKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
