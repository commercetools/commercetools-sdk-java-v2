
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyOrderFromCartDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyOrderFromCartDraftBuilder builder) {
        MyOrderFromCartDraft myOrderFromCartDraft = builder.buildUnchecked();
        Assertions.assertThat(myOrderFromCartDraft).isInstanceOf(MyOrderFromCartDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", MyOrderFromCartDraft.builder().id("id") },
                new Object[] { "version", MyOrderFromCartDraft.builder().version(2L) } };
    }

    @Test
    public void id() {
        MyOrderFromCartDraft value = MyOrderFromCartDraft.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        MyOrderFromCartDraft value = MyOrderFromCartDraft.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
