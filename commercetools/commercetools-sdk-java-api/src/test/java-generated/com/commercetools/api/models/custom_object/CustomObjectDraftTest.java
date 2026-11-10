
package com.commercetools.api.models.custom_object;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomObjectDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomObjectDraftBuilder builder) {
        CustomObjectDraft customObjectDraft = builder.buildUnchecked();
        Assertions.assertThat(customObjectDraft).isInstanceOf(CustomObjectDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "container", CustomObjectDraft.builder().container("container") },
                new Object[] { "key", CustomObjectDraft.builder().key("key") },
                new Object[] { "value", CustomObjectDraft.builder().value("value") },
                new Object[] { "version", CustomObjectDraft.builder().version(2L) } };
    }

    @Test
    public void container() {
        CustomObjectDraft value = CustomObjectDraft.of();
        value.setContainer("container");
        Assertions.assertThat(value.getContainer()).isEqualTo("container");
    }

    @Test
    public void key() {
        CustomObjectDraft value = CustomObjectDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void value() {
        CustomObjectDraft value = CustomObjectDraft.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void version() {
        CustomObjectDraft value = CustomObjectDraft.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
