
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddApplicationAgreementUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddApplicationAgreementUpdateActionBuilder builder) {
        AddApplicationAgreementUpdateAction addApplicationAgreementUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(addApplicationAgreementUpdateAction)
                .isInstanceOf(AddApplicationAgreementUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "agreement", AddApplicationAgreementUpdateAction.builder()
                .agreement(new com.commercetools.checkout.models.application.ApplicationAgreementDraftImpl()) } };
    }

    @Test
    public void agreement() {
        AddApplicationAgreementUpdateAction value = AddApplicationAgreementUpdateAction.of();
        value.setAgreement(new com.commercetools.checkout.models.application.ApplicationAgreementDraftImpl());
        Assertions.assertThat(value.getAgreement())
                .isEqualTo(new com.commercetools.checkout.models.application.ApplicationAgreementDraftImpl());
    }
}
