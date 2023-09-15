
package com.commercetools.api.models.customer;

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
public class CustomerSetDateOfBirthActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetDateOfBirthActionBuilder builder) {
        CustomerSetDateOfBirthAction customerSetDateOfBirthAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetDateOfBirthAction).isInstanceOf(CustomerSetDateOfBirthAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerSetDateOfBirthAction.builder().dateOfBirth(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void dateOfBirth() {
        CustomerSetDateOfBirthAction value = CustomerSetDateOfBirthAction.of();
        value.setDateOfBirth(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getDateOfBirth()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
