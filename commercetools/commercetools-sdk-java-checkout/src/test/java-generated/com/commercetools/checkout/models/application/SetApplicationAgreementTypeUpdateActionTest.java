
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetApplicationAgreementTypeUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetApplicationAgreementTypeUpdateActionBuilder builder) {
        SetApplicationAgreementTypeUpdateAction setApplicationAgreementTypeUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setApplicationAgreementTypeUpdateAction)
                .isInstanceOf(SetApplicationAgreementTypeUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "agreementId",
                        SetApplicationAgreementTypeUpdateAction.builder().agreementId("agreementId") },
                new Object[] { "type",
                        SetApplicationAgreementTypeUpdateAction.builder()
                                .type(com.commercetools.checkout.models.application.ApplicationAgreementType
                                        .findEnum("Text")) } };
    }

    @Test
    public void agreementId() {
        SetApplicationAgreementTypeUpdateAction value = SetApplicationAgreementTypeUpdateAction.of();
        value.setAgreementId("agreementId");
        Assertions.assertThat(value.getAgreementId()).isEqualTo("agreementId");
    }

    @Test
    public void type() {
        SetApplicationAgreementTypeUpdateAction value = SetApplicationAgreementTypeUpdateAction.of();
        value.setType(com.commercetools.checkout.models.application.ApplicationAgreementType.findEnum("Text"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationAgreementType.findEnum("Text"));
    }
}
