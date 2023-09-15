
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
public class DuplicateFieldWithConflictingResourceErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DuplicateFieldWithConflictingResourceErrorBuilder builder) {
        DuplicateFieldWithConflictingResourceError duplicateFieldWithConflictingResourceError = builder
                .buildUnchecked();
        Assertions.assertThat(duplicateFieldWithConflictingResourceError)
                .isInstanceOf(DuplicateFieldWithConflictingResourceError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DuplicateFieldWithConflictingResourceError.builder().message("message") },
                new Object[] { DuplicateFieldWithConflictingResourceError.builder().field("field") },
                new Object[] { DuplicateFieldWithConflictingResourceError.builder().duplicateValue("duplicateValue") },
                new Object[] { DuplicateFieldWithConflictingResourceError.builder()
                        .conflictingResource(new com.commercetools.api.models.common.ReferenceImpl()) } };
    }

    @Test
    public void message() {
        DuplicateFieldWithConflictingResourceError value = DuplicateFieldWithConflictingResourceError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void field() {
        DuplicateFieldWithConflictingResourceError value = DuplicateFieldWithConflictingResourceError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void duplicateValue() {
        DuplicateFieldWithConflictingResourceError value = DuplicateFieldWithConflictingResourceError.of();
        value.setDuplicateValue("duplicateValue");
        Assertions.assertThat(value.getDuplicateValue()).isEqualTo("duplicateValue");
    }

    @Test
    public void conflictingResource() {
        DuplicateFieldWithConflictingResourceError value = DuplicateFieldWithConflictingResourceError.of();
        value.setConflictingResource(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getConflictingResource())
                .isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }
}
