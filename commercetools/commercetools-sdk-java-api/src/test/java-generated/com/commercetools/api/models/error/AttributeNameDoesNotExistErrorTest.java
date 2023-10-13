
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
public class AttributeNameDoesNotExistErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeNameDoesNotExistErrorBuilder builder) {
        AttributeNameDoesNotExistError attributeNameDoesNotExistError = builder.buildUnchecked();
        Assertions.assertThat(attributeNameDoesNotExistError).isInstanceOf(AttributeNameDoesNotExistError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeNameDoesNotExistError.builder().message("message") },
                new Object[] {
                        AttributeNameDoesNotExistError.builder().invalidAttributeName("invalidAttributeName") } };
    }

    @Test
    public void message() {
        AttributeNameDoesNotExistError value = AttributeNameDoesNotExistError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void invalidAttributeName() {
        AttributeNameDoesNotExistError value = AttributeNameDoesNotExistError.of();
        value.setInvalidAttributeName("invalidAttributeName");
        Assertions.assertThat(value.getInvalidAttributeName()).isEqualTo("invalidAttributeName");
    }
}
