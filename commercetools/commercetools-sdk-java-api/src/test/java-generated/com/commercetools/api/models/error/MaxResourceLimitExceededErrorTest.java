
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
public class MaxResourceLimitExceededErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MaxResourceLimitExceededErrorBuilder builder) {
        MaxResourceLimitExceededError maxResourceLimitExceededError = builder.buildUnchecked();
        Assertions.assertThat(maxResourceLimitExceededError).isInstanceOf(MaxResourceLimitExceededError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MaxResourceLimitExceededError.builder().message("message") },
                new Object[] { MaxResourceLimitExceededError.builder()
                        .exceededResource(
                            com.commercetools.api.models.common.ReferenceTypeId.findEnum("associate-role")) } };
    }

    @Test
    public void message() {
        MaxResourceLimitExceededError value = MaxResourceLimitExceededError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void exceededResource() {
        MaxResourceLimitExceededError value = MaxResourceLimitExceededError.of();
        value.setExceededResource(com.commercetools.api.models.common.ReferenceTypeId.findEnum("associate-role"));
        Assertions.assertThat(value.getExceededResource())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("associate-role"));
    }
}
