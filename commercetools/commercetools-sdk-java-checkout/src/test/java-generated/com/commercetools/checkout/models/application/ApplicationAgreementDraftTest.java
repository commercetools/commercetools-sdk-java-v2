
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicationAgreementDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicationAgreementDraftBuilder builder) {
        ApplicationAgreementDraft applicationAgreementDraft = builder.buildUnchecked();
        Assertions.assertThat(applicationAgreementDraft).isInstanceOf(ApplicationAgreementDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ApplicationAgreementDraft.builder().name("name") },
                new Object[] { "type",
                        ApplicationAgreementDraft.builder()
                                .type(com.commercetools.checkout.models.application.ApplicationAgreementType
                                        .findEnum("Text")) },
                new Object[] { "status",
                        ApplicationAgreementDraft.builder()
                                .status(com.commercetools.checkout.models.application.ApplicationAgreementStatus
                                        .findEnum("Active")) },
                new Object[] { "text", ApplicationAgreementDraft.builder()
                        .text(new com.commercetools.checkout.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        ApplicationAgreementDraft value = ApplicationAgreementDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void type() {
        ApplicationAgreementDraft value = ApplicationAgreementDraft.of();
        value.setType(com.commercetools.checkout.models.application.ApplicationAgreementType.findEnum("Text"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationAgreementType.findEnum("Text"));
    }

    @Test
    public void status() {
        ApplicationAgreementDraft value = ApplicationAgreementDraft.of();
        value.setStatus(com.commercetools.checkout.models.application.ApplicationAgreementStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationAgreementStatus.findEnum("Active"));
    }

    @Test
    public void text() {
        ApplicationAgreementDraft value = ApplicationAgreementDraft.of();
        value.setText(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getText())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }
}
