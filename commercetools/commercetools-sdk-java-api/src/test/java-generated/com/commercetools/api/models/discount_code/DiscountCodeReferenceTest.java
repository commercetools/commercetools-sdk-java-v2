
package com.commercetools.api.models.discount_code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeReferenceBuilder builder) {
        DiscountCodeReference discountCodeReference = builder.buildUnchecked();
        Assertions.assertThat(discountCodeReference).isInstanceOf(DiscountCodeReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        DiscountCodeReference.builder()
                                .obj(new com.commercetools.api.models.discount_code.DiscountCodeImpl()) },
                new Object[] { "id", DiscountCodeReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        DiscountCodeReference value = DiscountCodeReference.of();
        value.setObj(new com.commercetools.api.models.discount_code.DiscountCodeImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeImpl());
    }

    @Test
    public void id() {
        DiscountCodeReference value = DiscountCodeReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
