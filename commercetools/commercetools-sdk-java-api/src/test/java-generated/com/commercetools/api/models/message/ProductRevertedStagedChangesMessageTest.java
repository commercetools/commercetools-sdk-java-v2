
package com.commercetools.api.models.message;

import java.util.Collections;

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
public class ProductRevertedStagedChangesMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductRevertedStagedChangesMessageBuilder builder) {
        ProductRevertedStagedChangesMessage productRevertedStagedChangesMessage = builder.buildUnchecked();
        Assertions.assertThat(productRevertedStagedChangesMessage)
                .isInstanceOf(ProductRevertedStagedChangesMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductRevertedStagedChangesMessage.builder()
                .removedImageUrls(Collections.singletonList("removedImageUrls")) } };
    }

    @Test
    public void removedImageUrls() {
        ProductRevertedStagedChangesMessage value = ProductRevertedStagedChangesMessage.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }
}
