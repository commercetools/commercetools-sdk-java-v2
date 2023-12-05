
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
public class EnumKeyDoesNotExistErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(EnumKeyDoesNotExistErrorBuilder builder) {
        EnumKeyDoesNotExistError enumKeyDoesNotExistError = builder.buildUnchecked();
        Assertions.assertThat(enumKeyDoesNotExistError).isInstanceOf(EnumKeyDoesNotExistError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { EnumKeyDoesNotExistError.builder().message("message") },
                new Object[] { EnumKeyDoesNotExistError.builder().conflictingEnumKey("conflictingEnumKey") },
                new Object[] {
                        EnumKeyDoesNotExistError.builder().conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void message() {
        EnumKeyDoesNotExistError value = EnumKeyDoesNotExistError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingEnumKey() {
        EnumKeyDoesNotExistError value = EnumKeyDoesNotExistError.of();
        value.setConflictingEnumKey("conflictingEnumKey");
        Assertions.assertThat(value.getConflictingEnumKey()).isEqualTo("conflictingEnumKey");
    }

    @Test
    public void conflictingAttributeName() {
        EnumKeyDoesNotExistError value = EnumKeyDoesNotExistError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
