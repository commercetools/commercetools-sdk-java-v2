
package com.commercetools.api.models.attribute_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeGroupReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeGroupReferenceBuilder builder) {
        AttributeGroupReference attributeGroupReference = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupReference).isInstanceOf(AttributeGroupReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        AttributeGroupReference.builder()
                                .obj(new com.commercetools.api.models.attribute_group.AttributeGroupImpl()) },
                new Object[] { "id", AttributeGroupReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        AttributeGroupReference value = AttributeGroupReference.of();
        value.setObj(new com.commercetools.api.models.attribute_group.AttributeGroupImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.attribute_group.AttributeGroupImpl());
    }

    @Test
    public void id() {
        AttributeGroupReference value = AttributeGroupReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
