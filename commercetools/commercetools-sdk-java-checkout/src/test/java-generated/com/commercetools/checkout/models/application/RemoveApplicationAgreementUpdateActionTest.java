
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveApplicationAgreementUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveApplicationAgreementUpdateActionBuilder builder) {
        RemoveApplicationAgreementUpdateAction removeApplicationAgreementUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(removeApplicationAgreementUpdateAction)
                .isInstanceOf(RemoveApplicationAgreementUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "agreementId",
                RemoveApplicationAgreementUpdateAction.builder().agreementId("agreementId") } };
    }

    @Test
    public void agreementId() {
        RemoveApplicationAgreementUpdateAction value = RemoveApplicationAgreementUpdateAction.of();
        value.setAgreementId("agreementId");
        Assertions.assertThat(value.getAgreementId()).isEqualTo("agreementId");
    }
}
