
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportResponseBuilder builder) {
        ImportResponse importResponse = builder.buildUnchecked();
        Assertions.assertThat(importResponse).isInstanceOf(ImportResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "operationStatus",
                ImportResponse.builder()
                        .operationStatus(Collections.singletonList(
                            new com.commercetools.importapi.models.importoperations.ImportOperationStatusImpl())) } };
    }

    @Test
    public void operationStatus() {
        ImportResponse value = ImportResponse.of();
        value.setOperationStatus(Collections
                .singletonList(new com.commercetools.importapi.models.importoperations.ImportOperationStatusImpl()));
        Assertions.assertThat(value.getOperationStatus())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.importoperations.ImportOperationStatusImpl()));
    }
}
