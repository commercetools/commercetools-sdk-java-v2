
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicationAgreementTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicationAgreementBuilder builder) {
        ApplicationAgreement applicationAgreement = builder.buildUnchecked();
        Assertions.assertThat(applicationAgreement).isInstanceOf(ApplicationAgreement.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ApplicationAgreement.builder().id("id") },
                new Object[] { "name", ApplicationAgreement.builder().name("name") },
                new Object[] { "type",
                        ApplicationAgreement.builder()
                                .type(com.commercetools.checkout.models.application.ApplicationAgreementType
                                        .findEnum("Text")) },
                new Object[] { "status",
                        ApplicationAgreement.builder()
                                .status(com.commercetools.checkout.models.application.ApplicationAgreementStatus
                                        .findEnum("Active")) },
                new Object[] { "text", ApplicationAgreement.builder()
                        .text(new com.commercetools.checkout.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void id() {
        ApplicationAgreement value = ApplicationAgreement.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        ApplicationAgreement value = ApplicationAgreement.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void type() {
        ApplicationAgreement value = ApplicationAgreement.of();
        value.setType(com.commercetools.checkout.models.application.ApplicationAgreementType.findEnum("Text"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationAgreementType.findEnum("Text"));
    }

    @Test
    public void status() {
        ApplicationAgreement value = ApplicationAgreement.of();
        value.setStatus(com.commercetools.checkout.models.application.ApplicationAgreementStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationAgreementStatus.findEnum("Active"));
    }

    @Test
    public void text() {
        ApplicationAgreement value = ApplicationAgreement.of();
        value.setText(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getText())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }
}
