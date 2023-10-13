
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
public class ReferencedResourceNotFoundErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReferencedResourceNotFoundErrorBuilder builder) {
        ReferencedResourceNotFoundError referencedResourceNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(referencedResourceNotFoundError).isInstanceOf(ReferencedResourceNotFoundError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReferencedResourceNotFoundError.builder().message("message") },
                new Object[] { ReferencedResourceNotFoundError.builder()
                        .typeId(com.commercetools.api.models.common.ReferenceTypeId.findEnum("associate-role")) },
                new Object[] { ReferencedResourceNotFoundError.builder().id("id") },
                new Object[] { ReferencedResourceNotFoundError.builder().key("key") } };
    }

    @Test
    public void message() {
        ReferencedResourceNotFoundError value = ReferencedResourceNotFoundError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void typeId() {
        ReferencedResourceNotFoundError value = ReferencedResourceNotFoundError.of();
        value.setTypeId(com.commercetools.api.models.common.ReferenceTypeId.findEnum("associate-role"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("associate-role"));
    }

    @Test
    public void id() {
        ReferencedResourceNotFoundError value = ReferencedResourceNotFoundError.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ReferencedResourceNotFoundError value = ReferencedResourceNotFoundError.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
