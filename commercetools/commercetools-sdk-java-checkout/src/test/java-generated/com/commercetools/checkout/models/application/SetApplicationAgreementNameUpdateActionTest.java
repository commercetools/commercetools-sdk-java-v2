
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetApplicationAgreementNameUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetApplicationAgreementNameUpdateActionBuilder builder) {
        SetApplicationAgreementNameUpdateAction setApplicationAgreementNameUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setApplicationAgreementNameUpdateAction)
                .isInstanceOf(SetApplicationAgreementNameUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "agreementId",
                        SetApplicationAgreementNameUpdateAction.builder().agreementId("agreementId") },
                new Object[] { "name", SetApplicationAgreementNameUpdateAction.builder().name("name") } };
    }

    @Test
    public void agreementId() {
        SetApplicationAgreementNameUpdateAction value = SetApplicationAgreementNameUpdateAction.of();
        value.setAgreementId("agreementId");
        Assertions.assertThat(value.getAgreementId()).isEqualTo("agreementId");
    }

    @Test
    public void name() {
        SetApplicationAgreementNameUpdateAction value = SetApplicationAgreementNameUpdateAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
