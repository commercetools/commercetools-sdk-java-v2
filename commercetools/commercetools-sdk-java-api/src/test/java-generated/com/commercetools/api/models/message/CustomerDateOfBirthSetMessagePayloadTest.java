
package com.commercetools.api.models.message;

import java.time.LocalDate;

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
public class CustomerDateOfBirthSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerDateOfBirthSetMessagePayloadBuilder builder) {
        CustomerDateOfBirthSetMessagePayload customerDateOfBirthSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerDateOfBirthSetMessagePayload)
                .isInstanceOf(CustomerDateOfBirthSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                CustomerDateOfBirthSetMessagePayload.builder().dateOfBirth(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void dateOfBirth() {
        CustomerDateOfBirthSetMessagePayload value = CustomerDateOfBirthSetMessagePayload.of();
        value.setDateOfBirth(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getDateOfBirth()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
