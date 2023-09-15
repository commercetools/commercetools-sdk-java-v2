
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
public class DuplicateAttributeValueErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DuplicateAttributeValueErrorBuilder builder) {
        DuplicateAttributeValueError duplicateAttributeValueError = builder.buildUnchecked();
        Assertions.assertThat(duplicateAttributeValueError).isInstanceOf(DuplicateAttributeValueError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DuplicateAttributeValueError.builder().message("message") },
                new Object[] { DuplicateAttributeValueError.builder()
                        .attribute(new com.commercetools.api.models.product.AttributeImpl()) } };
    }

    @Test
    public void message() {
        DuplicateAttributeValueError value = DuplicateAttributeValueError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void attribute() {
        DuplicateAttributeValueError value = DuplicateAttributeValueError.of();
        value.setAttribute(new com.commercetools.api.models.product.AttributeImpl());
        Assertions.assertThat(value.getAttribute()).isEqualTo(new com.commercetools.api.models.product.AttributeImpl());
    }
}
