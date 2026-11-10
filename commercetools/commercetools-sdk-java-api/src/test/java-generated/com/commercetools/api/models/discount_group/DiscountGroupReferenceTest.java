
package com.commercetools.api.models.discount_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupReferenceBuilder builder) {
        DiscountGroupReference discountGroupReference = builder.buildUnchecked();
        Assertions.assertThat(discountGroupReference).isInstanceOf(DiscountGroupReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", DiscountGroupReference.builder().id("id") },
                new Object[] { "obj", DiscountGroupReference.builder()
                        .obj(new com.commercetools.api.models.discount_group.DiscountGroupImpl()) } };
    }

    @Test
    public void id() {
        DiscountGroupReference value = DiscountGroupReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void obj() {
        DiscountGroupReference value = DiscountGroupReference.of();
        value.setObj(new com.commercetools.api.models.discount_group.DiscountGroupImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.discount_group.DiscountGroupImpl());
    }
}
