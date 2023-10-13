
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
public class EnumKeyAlreadyExistsErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(EnumKeyAlreadyExistsErrorBuilder builder) {
        EnumKeyAlreadyExistsError enumKeyAlreadyExistsError = builder.buildUnchecked();
        Assertions.assertThat(enumKeyAlreadyExistsError).isInstanceOf(EnumKeyAlreadyExistsError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { EnumKeyAlreadyExistsError.builder().message("message") },
                new Object[] { EnumKeyAlreadyExistsError.builder().conflictingEnumKey("conflictingEnumKey") },
                new Object[] {
                        EnumKeyAlreadyExistsError.builder().conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void message() {
        EnumKeyAlreadyExistsError value = EnumKeyAlreadyExistsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingEnumKey() {
        EnumKeyAlreadyExistsError value = EnumKeyAlreadyExistsError.of();
        value.setConflictingEnumKey("conflictingEnumKey");
        Assertions.assertThat(value.getConflictingEnumKey()).isEqualTo("conflictingEnumKey");
    }

    @Test
    public void conflictingAttributeName() {
        EnumKeyAlreadyExistsError value = EnumKeyAlreadyExistsError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
