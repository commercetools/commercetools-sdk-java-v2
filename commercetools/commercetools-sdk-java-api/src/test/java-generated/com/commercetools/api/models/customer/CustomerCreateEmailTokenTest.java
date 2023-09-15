
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
public class CustomerCreateEmailTokenTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCreateEmailTokenBuilder builder) {
        CustomerCreateEmailToken customerCreateEmailToken = builder.buildUnchecked();
        Assertions.assertThat(customerCreateEmailToken).isInstanceOf(CustomerCreateEmailToken.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerCreateEmailToken.builder().id("id") },
                new Object[] { CustomerCreateEmailToken.builder().version(2L) },
                new Object[] { CustomerCreateEmailToken.builder().ttlMinutes(1L) } };
    }

    @Test
    public void id() {
        CustomerCreateEmailToken value = CustomerCreateEmailToken.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        CustomerCreateEmailToken value = CustomerCreateEmailToken.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void ttlMinutes() {
        CustomerCreateEmailToken value = CustomerCreateEmailToken.of();
        value.setTtlMinutes(1L);
        Assertions.assertThat(value.getTtlMinutes()).isEqualTo(1L);
    }
}
