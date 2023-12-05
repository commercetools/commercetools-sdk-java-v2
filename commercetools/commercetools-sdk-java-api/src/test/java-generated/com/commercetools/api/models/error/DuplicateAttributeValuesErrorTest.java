
package com.commercetools.api.models.error;

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
public class DuplicateAttributeValuesErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DuplicateAttributeValuesErrorBuilder builder) {
        DuplicateAttributeValuesError duplicateAttributeValuesError = builder.buildUnchecked();
        Assertions.assertThat(duplicateAttributeValuesError).isInstanceOf(DuplicateAttributeValuesError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DuplicateAttributeValuesError.builder().message("message") },
                new Object[] { DuplicateAttributeValuesError.builder()
                        .attributes(
                            Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl())) } };
    }

    @Test
    public void message() {
        DuplicateAttributeValuesError value = DuplicateAttributeValuesError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void attributes() {
        DuplicateAttributeValuesError value = DuplicateAttributeValuesError.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }
}
