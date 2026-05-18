
package com.commercetools.checkout.models.application;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetApplicationAgreementsUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetApplicationAgreementsUpdateActionBuilder builder) {
        SetApplicationAgreementsUpdateAction setApplicationAgreementsUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setApplicationAgreementsUpdateAction)
                .isInstanceOf(SetApplicationAgreementsUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "agreements",
                SetApplicationAgreementsUpdateAction.builder()
                        .agreements(Collections.singletonList(
                            new com.commercetools.checkout.models.application.ApplicationAgreementDraftImpl())) } };
    }

    @Test
    public void agreements() {
        SetApplicationAgreementsUpdateAction value = SetApplicationAgreementsUpdateAction.of();
        value.setAgreements(Collections
                .singletonList(new com.commercetools.checkout.models.application.ApplicationAgreementDraftImpl()));
        Assertions.assertThat(value.getAgreements())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.application.ApplicationAgreementDraftImpl()));
    }
}
