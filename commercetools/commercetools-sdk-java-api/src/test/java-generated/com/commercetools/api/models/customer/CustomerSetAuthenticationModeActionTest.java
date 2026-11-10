
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetAuthenticationModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetAuthenticationModeActionBuilder builder) {
        CustomerSetAuthenticationModeAction customerSetAuthenticationModeAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetAuthenticationModeAction)
                .isInstanceOf(CustomerSetAuthenticationModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "authMode", CustomerSetAuthenticationModeAction.builder()
                        .authMode(com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password")) },
                new Object[] { "password", CustomerSetAuthenticationModeAction.builder().password("password") } };
    }

    @Test
    public void authMode() {
        CustomerSetAuthenticationModeAction value = CustomerSetAuthenticationModeAction.of();
        value.setAuthMode(com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password"));
        Assertions.assertThat(value.getAuthMode())
                .isEqualTo(com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password"));
    }

    @Test
    public void password() {
        CustomerSetAuthenticationModeAction value = CustomerSetAuthenticationModeAction.of();
        value.setPassword("password");
        Assertions.assertThat(value.getPassword()).isEqualTo("password");
    }
}
