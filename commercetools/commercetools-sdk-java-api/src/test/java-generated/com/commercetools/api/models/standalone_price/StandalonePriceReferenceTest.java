
package com.commercetools.api.models.standalone_price;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceReferenceBuilder builder) {
        StandalonePriceReference standalonePriceReference = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceReference).isInstanceOf(StandalonePriceReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "obj", StandalonePriceReference.builder()
                .obj(new com.commercetools.api.models.standalone_price.StandalonePriceImpl()) } };
    }

    @Test
    public void obj() {
        StandalonePriceReference value = StandalonePriceReference.of();
        value.setObj(new com.commercetools.api.models.standalone_price.StandalonePriceImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceImpl());
    }
}
