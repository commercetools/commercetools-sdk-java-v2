
package com.commercetools.api.models.product_type;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeDraftBuilder builder) {
        ProductTypeDraft productTypeDraft = builder.buildUnchecked();
        Assertions.assertThat(productTypeDraft).isInstanceOf(ProductTypeDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductTypeDraft.builder().key("key") },
                new Object[] { "name", ProductTypeDraft.builder().name("name") },
                new Object[] { "description", ProductTypeDraft.builder().description("description") },
                new Object[] { "attributes",
                        ProductTypeDraft.builder()
                                .attributes(Collections.singletonList(
                                    new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl())) } };
    }

    @Test
    public void key() {
        ProductTypeDraft value = ProductTypeDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ProductTypeDraft value = ProductTypeDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        ProductTypeDraft value = ProductTypeDraft.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void attributes() {
        ProductTypeDraft value = ProductTypeDraft.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl()));
    }
}
