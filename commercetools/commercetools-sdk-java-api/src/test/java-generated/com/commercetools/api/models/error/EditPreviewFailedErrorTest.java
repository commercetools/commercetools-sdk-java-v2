
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EditPreviewFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EditPreviewFailedErrorBuilder builder) {
        EditPreviewFailedError editPreviewFailedError = builder.buildUnchecked();
        Assertions.assertThat(editPreviewFailedError).isInstanceOf(EditPreviewFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", EditPreviewFailedError.builder().message("message") },
                new Object[] { "result", EditPreviewFailedError.builder()
                        .result(new com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl()) } };
    }

    @Test
    public void message() {
        EditPreviewFailedError value = EditPreviewFailedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void result() {
        EditPreviewFailedError value = EditPreviewFailedError.of();
        value.setResult(new com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl());
        Assertions.assertThat(value.getResult())
                .isEqualTo(new com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl());
    }
}
