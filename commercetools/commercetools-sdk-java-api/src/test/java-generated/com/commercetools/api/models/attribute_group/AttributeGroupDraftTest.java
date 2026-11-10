
package com.commercetools.api.models.attribute_group;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributeGroupDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributeGroupDraftBuilder builder) {
        AttributeGroupDraft attributeGroupDraft = builder.buildUnchecked();
        Assertions.assertThat(attributeGroupDraft).isInstanceOf(AttributeGroupDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        AttributeGroupDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        AttributeGroupDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "attributes",
                        AttributeGroupDraft.builder()
                                .attributes(Collections.singletonList(
                                    new com.commercetools.api.models.attribute_group.AttributeReferenceImpl())) },
                new Object[] { "key", AttributeGroupDraft.builder().key("key") } };
    }

    @Test
    public void name() {
        AttributeGroupDraft value = AttributeGroupDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        AttributeGroupDraft value = AttributeGroupDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void attributes() {
        AttributeGroupDraft value = AttributeGroupDraft.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.attribute_group.AttributeReferenceImpl()));
    }

    @Test
    public void key() {
        AttributeGroupDraft value = AttributeGroupDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
