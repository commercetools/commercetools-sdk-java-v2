
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetApplicationAgreementStatusUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetApplicationAgreementStatusUpdateActionBuilder builder) {
        SetApplicationAgreementStatusUpdateAction setApplicationAgreementStatusUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setApplicationAgreementStatusUpdateAction)
                .isInstanceOf(SetApplicationAgreementStatusUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "agreementId",
                        SetApplicationAgreementStatusUpdateAction.builder().agreementId("agreementId") },
                new Object[] { "status",
                        SetApplicationAgreementStatusUpdateAction.builder()
                                .status(com.commercetools.checkout.models.application.ApplicationAgreementStatus
                                        .findEnum("Active")) } };
    }

    @Test
    public void agreementId() {
        SetApplicationAgreementStatusUpdateAction value = SetApplicationAgreementStatusUpdateAction.of();
        value.setAgreementId("agreementId");
        Assertions.assertThat(value.getAgreementId()).isEqualTo("agreementId");
    }

    @Test
    public void status() {
        SetApplicationAgreementStatusUpdateAction value = SetApplicationAgreementStatusUpdateAction.of();
        value.setStatus(com.commercetools.checkout.models.application.ApplicationAgreementStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationAgreementStatus.findEnum("Active"));
    }
}
