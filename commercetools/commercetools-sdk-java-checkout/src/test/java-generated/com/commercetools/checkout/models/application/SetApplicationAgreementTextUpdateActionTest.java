
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetApplicationAgreementTextUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetApplicationAgreementTextUpdateActionBuilder builder) {
        SetApplicationAgreementTextUpdateAction setApplicationAgreementTextUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setApplicationAgreementTextUpdateAction)
                .isInstanceOf(SetApplicationAgreementTextUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "agreementId",
                        SetApplicationAgreementTextUpdateAction.builder().agreementId("agreementId") },
                new Object[] { "text", SetApplicationAgreementTextUpdateAction.builder()
                        .text(new com.commercetools.checkout.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void agreementId() {
        SetApplicationAgreementTextUpdateAction value = SetApplicationAgreementTextUpdateAction.of();
        value.setAgreementId("agreementId");
        Assertions.assertThat(value.getAgreementId()).isEqualTo("agreementId");
    }

    @Test
    public void text() {
        SetApplicationAgreementTextUpdateAction value = SetApplicationAgreementTextUpdateAction.of();
        value.setText(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getText())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }
}
