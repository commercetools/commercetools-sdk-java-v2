
package com.commercetools.api.models.error;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ReferenceExistsErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReferenceExistsErrorBuilder builder) {
        ReferenceExistsError referenceExistsError = builder.buildUnchecked();
        Assertions.assertThat(referenceExistsError).isInstanceOf(ReferenceExistsError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReferenceExistsError.builder().message("message") },
                new Object[] { ReferenceExistsError.builder()
                        .referencedBy(
                            com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow")) } };
    }

    @Test
    public void message() {
        ReferenceExistsError value = ReferenceExistsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void referencedBy() {
        ReferenceExistsError value = ReferenceExistsError.of();
        value.setReferencedBy(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getReferencedBy())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
    }
}
