
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
public class InvalidItemShippingDetailsErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InvalidItemShippingDetailsErrorBuilder builder) {
        InvalidItemShippingDetailsError invalidItemShippingDetailsError = builder.buildUnchecked();
        Assertions.assertThat(invalidItemShippingDetailsError).isInstanceOf(InvalidItemShippingDetailsError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InvalidItemShippingDetailsError.builder().message("message") },
                new Object[] { InvalidItemShippingDetailsError.builder().subject("subject") },
                new Object[] { InvalidItemShippingDetailsError.builder().itemId("itemId") } };
    }

    @Test
    public void message() {
        InvalidItemShippingDetailsError value = InvalidItemShippingDetailsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void subject() {
        InvalidItemShippingDetailsError value = InvalidItemShippingDetailsError.of();
        value.setSubject("subject");
        Assertions.assertThat(value.getSubject()).isEqualTo("subject");
    }

    @Test
    public void itemId() {
        InvalidItemShippingDetailsError value = InvalidItemShippingDetailsError.of();
        value.setItemId("itemId");
        Assertions.assertThat(value.getItemId()).isEqualTo("itemId");
    }
}
