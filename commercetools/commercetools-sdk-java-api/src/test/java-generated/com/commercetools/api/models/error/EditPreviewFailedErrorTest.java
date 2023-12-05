
package com.commercetools.api.models.error;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class EditPreviewFailedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(EditPreviewFailedErrorBuilder builder) {
        EditPreviewFailedError editPreviewFailedError = builder.buildUnchecked();
        Assertions.assertThat(editPreviewFailedError).isInstanceOf(EditPreviewFailedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { EditPreviewFailedError.builder().message("message") },
                new Object[] { EditPreviewFailedError.builder()
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
