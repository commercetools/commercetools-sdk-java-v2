
package com.commercetools.api.models.warning;

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
public class ImageProcessingOngoingWarningTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImageProcessingOngoingWarningBuilder builder) {
        ImageProcessingOngoingWarning imageProcessingOngoingWarning = builder.buildUnchecked();
        Assertions.assertThat(imageProcessingOngoingWarning).isInstanceOf(ImageProcessingOngoingWarning.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImageProcessingOngoingWarning.builder().message("message") } };
    }

    @Test
    public void message() {
        ImageProcessingOngoingWarning value = ImageProcessingOngoingWarning.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
