
package com.commercetools.importapi.models.errors;

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
public class ConcurrentModificationErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ConcurrentModificationErrorBuilder builder) {
        ConcurrentModificationError concurrentModificationError = builder.buildUnchecked();
        Assertions.assertThat(concurrentModificationError).isInstanceOf(ConcurrentModificationError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ConcurrentModificationError.builder().specifiedVersion(5L) },
                new Object[] { ConcurrentModificationError.builder().currentVersion(4L) },
                new Object[] { ConcurrentModificationError.builder().conflictedResource("conflictedResource") } };
    }

    @Test
    public void specifiedVersion() {
        ConcurrentModificationError value = ConcurrentModificationError.of();
        value.setSpecifiedVersion(5L);
        Assertions.assertThat(value.getSpecifiedVersion()).isEqualTo(5L);
    }

    @Test
    public void currentVersion() {
        ConcurrentModificationError value = ConcurrentModificationError.of();
        value.setCurrentVersion(4L);
        Assertions.assertThat(value.getCurrentVersion()).isEqualTo(4L);
    }

    @Test
    public void conflictedResource() {
        ConcurrentModificationError value = ConcurrentModificationError.of();
        value.setConflictedResource("conflictedResource");
        Assertions.assertThat(value.getConflictedResource()).isEqualTo("conflictedResource");
    }
}
