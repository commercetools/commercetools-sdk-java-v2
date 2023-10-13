
package com.commercetools.api.models.customer;

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
public class CustomerCreatePasswordResetTokenTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCreatePasswordResetTokenBuilder builder) {
        CustomerCreatePasswordResetToken customerCreatePasswordResetToken = builder.buildUnchecked();
        Assertions.assertThat(customerCreatePasswordResetToken).isInstanceOf(CustomerCreatePasswordResetToken.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerCreatePasswordResetToken.builder().email("email") },
                new Object[] { CustomerCreatePasswordResetToken.builder().ttlMinutes(1L) } };
    }

    @Test
    public void email() {
        CustomerCreatePasswordResetToken value = CustomerCreatePasswordResetToken.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void ttlMinutes() {
        CustomerCreatePasswordResetToken value = CustomerCreatePasswordResetToken.of();
        value.setTtlMinutes(1L);
        Assertions.assertThat(value.getTtlMinutes()).isEqualTo(1L);
    }
}
